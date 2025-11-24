package org.labcabrera.sample.archetype.casefolder.interfaces.http.dto;

import org.labcabrera.sample.archetype.shared.interfaces.http.PageResponse;
import org.springframework.data.domain.Page;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Paged response for case folders")
public class CaseFolderPageResponse extends PageResponse<CaseFolderDto> {

    public CaseFolderPageResponse(Page<CaseFolderDto> page) {
        super(page);
    }

}
