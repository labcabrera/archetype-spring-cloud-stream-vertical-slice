package org.labcabrera.sample.archetype.casestep.interfaces.http.dto;

import org.labcabrera.sample.archetype.casestep.domain.StepStatus;
import org.labcabrera.sample.archetype.casestep.domain.StepType;

public record CaseStepDto(

    String id,

    String caseFolderId,

    StepType stepType,

    StepStatus status,

    String assignedTo,

    String owner) {

}
