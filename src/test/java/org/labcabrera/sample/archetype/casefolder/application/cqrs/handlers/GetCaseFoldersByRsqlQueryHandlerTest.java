package org.labcabrera.sample.archetype.casefolder.application.cqrs.handlers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.labcabrera.sample.archetype.casefolder.application.cqrs.queries.GetCaseFoldersByRsqlQuery;
import org.labcabrera.sample.archetype.casefolder.application.ports.CaseFolderRepository;
import org.labcabrera.sample.archetype.casefolder.domain.CaseFolder;
import org.labcabrera.sample.archetype.casefolder.domain.IdCard;
import org.labcabrera.sample.archetype.casefolder.domain.IdCardType;
import org.labcabrera.sample.archetype.shared.application.SecurityPort;
import org.labcabrera.sample.archetype.shared.application.SecurityPort.AuthenticatedUser;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@ExtendWith(MockitoExtension.class)
@SuppressWarnings("null")
class GetCaseFoldersByRsqlQueryHandlerTest {

    @Mock
    private CaseFolderRepository caseFolderRepository;

    @Mock
    private SecurityPort securityPort;

    @InjectMocks
    private GetCaseFoldersByRsqlQueryHandler handler;

    private AuthenticatedUser authenticatedUser;
    private CaseFolder caseFolder1;
    private CaseFolder caseFolder2;
    private Pageable pageable;

    @BeforeEach
    void setUp() {
        authenticatedUser = new AuthenticatedUser(
            "user-1",
            "testuser",
            Set.of("case-folder-read"),
            Collections.emptySet());
        caseFolder1 = CaseFolder.create(
            "JOHN",
            "DOE",
            "SMITH",
            new IdCard("12345678A", IdCardType.NIF),
            "testuser");
        caseFolder2 = CaseFolder.create(
            "JANE",
            "SMITH",
            "DOW",
            new IdCard("87654321B", IdCardType.NIF),
            "testuser");
        pageable = PageRequest.of(0, 10);
    }

    @Test
    void testHandle_WithValidRsql_ReturnsFilteredResults() {
        String rsql = "name==JOHN";
        GetCaseFoldersByRsqlQuery query = new GetCaseFoldersByRsqlQuery(rsql, pageable);
        Page<CaseFolder> expectedPage = new PageImpl<>(List.of(caseFolder1), pageable, 1);

        when(securityPort.requireCurrentUser()).thenReturn(authenticatedUser);
        when(caseFolderRepository.findByRsql(eq(rsql), eq(pageable), eq(authenticatedUser)))
            .thenReturn(expectedPage);

        Page<CaseFolder> result = handler.handle(query);

        assertNotNull(result);
        assertEquals(1, result.getTotalElements());
        assertEquals("JOHN", result.getContent().get(0).getName());
        verify(securityPort).requireCurrentUser();
        verify(caseFolderRepository).findByRsql(rsql, pageable, authenticatedUser);
    }

    @Test
    void testHandle_WithEmptyRsql_ReturnsAllResults() {
        String rsql = "";
        GetCaseFoldersByRsqlQuery query = new GetCaseFoldersByRsqlQuery(rsql, pageable);
        Page<CaseFolder> expectedPage = new PageImpl<>(List.of(caseFolder1, caseFolder2), pageable, 2);

        when(securityPort.requireCurrentUser()).thenReturn(authenticatedUser);
        when(caseFolderRepository.findByRsql(eq(rsql), eq(pageable), eq(authenticatedUser)))
            .thenReturn(expectedPage);

        Page<CaseFolder> result = handler.handle(query);

        assertNotNull(result);
        assertEquals(2, result.getTotalElements());
        verify(caseFolderRepository).findByRsql(rsql, pageable, authenticatedUser);
    }

    @Test
    void testHandle_WithLikeOperator_ReturnsMatchingResults() {
        String rsql = "name=re=JO";
        GetCaseFoldersByRsqlQuery query = new GetCaseFoldersByRsqlQuery(rsql, pageable);
        Page<CaseFolder> expectedPage = new PageImpl<>(List.of(caseFolder1), pageable, 1);

        when(securityPort.requireCurrentUser()).thenReturn(authenticatedUser);
        when(caseFolderRepository.findByRsql(eq(rsql), eq(pageable), eq(authenticatedUser)))
            .thenReturn(expectedPage);

        Page<CaseFolder> result = handler.handle(query);

        assertNotNull(result);
        assertEquals(1, result.getTotalElements());
        verify(caseFolderRepository).findByRsql(rsql, pageable, authenticatedUser);
    }

    @Test
    void testHandle_WithComplexRsql_ReturnsFilteredResults() {
        String rsql = "name==JOHN;firstSurname==DOE";
        GetCaseFoldersByRsqlQuery query = new GetCaseFoldersByRsqlQuery(rsql, pageable);
        Page<CaseFolder> expectedPage = new PageImpl<>(List.of(caseFolder1), pageable, 1);

        when(securityPort.requireCurrentUser()).thenReturn(authenticatedUser);
        when(caseFolderRepository.findByRsql(eq(rsql), eq(pageable), eq(authenticatedUser)))
            .thenReturn(expectedPage);

        Page<CaseFolder> result = handler.handle(query);

        assertNotNull(result);
        assertEquals(1, result.getTotalElements());
        assertEquals("JOHN", result.getContent().get(0).getName());
        assertEquals("DOE", result.getContent().get(0).getFirstSurname());
        verify(caseFolderRepository).findByRsql(rsql, pageable, authenticatedUser);
    }

    @Test
    void testHandle_WithOrOperator_ReturnsMatchingResults() {
        String rsql = "name==JOHN,name==JANE";
        GetCaseFoldersByRsqlQuery query = new GetCaseFoldersByRsqlQuery(rsql, pageable);
        Page<CaseFolder> expectedPage = new PageImpl<>(List.of(caseFolder1, caseFolder2), pageable, 2);

        when(securityPort.requireCurrentUser()).thenReturn(authenticatedUser);
        when(caseFolderRepository.findByRsql(eq(rsql), eq(pageable), eq(authenticatedUser)))
            .thenReturn(expectedPage);

        Page<CaseFolder> result = handler.handle(query);

        assertNotNull(result);
        assertEquals(2, result.getTotalElements());
        verify(caseFolderRepository).findByRsql(rsql, pageable, authenticatedUser);
    }

    @Test
    void testHandle_WithNestedProperty_ReturnsFilteredResults() {
        String rsql = "idCard.idCardNumber==12345678A";
        GetCaseFoldersByRsqlQuery query = new GetCaseFoldersByRsqlQuery(rsql, pageable);
        Page<CaseFolder> expectedPage = new PageImpl<>(List.of(caseFolder1), pageable, 1);

        when(securityPort.requireCurrentUser()).thenReturn(authenticatedUser);
        when(caseFolderRepository.findByRsql(eq(rsql), eq(pageable), eq(authenticatedUser)))
            .thenReturn(expectedPage);

        Page<CaseFolder> result = handler.handle(query);

        assertNotNull(result);
        assertEquals(1, result.getTotalElements());
        verify(caseFolderRepository).findByRsql(rsql, pageable, authenticatedUser);
    }

    @Test
    void testHandle_WithInOperator_ReturnsFilteredResults() {
        String rsql = "name=in=(JOHN,JANE)";
        GetCaseFoldersByRsqlQuery query = new GetCaseFoldersByRsqlQuery(rsql, pageable);
        Page<CaseFolder> expectedPage = new PageImpl<>(List.of(caseFolder1, caseFolder2), pageable, 2);

        when(securityPort.requireCurrentUser()).thenReturn(authenticatedUser);
        when(caseFolderRepository.findByRsql(eq(rsql), eq(pageable), eq(authenticatedUser)))
            .thenReturn(expectedPage);

        Page<CaseFolder> result = handler.handle(query);

        assertNotNull(result);
        assertEquals(2, result.getTotalElements());
        verify(caseFolderRepository).findByRsql(rsql, pageable, authenticatedUser);
    }
}
