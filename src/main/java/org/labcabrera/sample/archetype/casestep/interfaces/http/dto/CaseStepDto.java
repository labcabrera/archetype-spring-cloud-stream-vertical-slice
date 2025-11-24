package org.labcabrera.sample.archetype.casestep.interfaces.http.dto;

import org.labcabrera.sample.archetype.casestep.domain.StepStatus;
import org.labcabrera.sample.archetype.casestep.domain.StepType;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

public record CaseStepDto(

    @Schema(description = "Case step identifier", example = "12345", requiredMode = RequiredMode.REQUIRED) String id,

    @Schema(description = "Case folder identifier", example = "67890", requiredMode = RequiredMode.REQUIRED) String caseFolderId,

    @Schema(description = "Step type", example = "INITIAL_REVIEW", requiredMode = RequiredMode.REQUIRED) StepType stepType,

    @Schema(description = "Step status", example = "IN_PROGRESS", requiredMode = RequiredMode.REQUIRED) StepStatus status,

    @Schema(description = "Assigned to", example = "user123", requiredMode = RequiredMode.REQUIRED) String assignedTo,

    @Schema(description = "Owner", example = "owner123", requiredMode = RequiredMode.REQUIRED) String owner) {

}
