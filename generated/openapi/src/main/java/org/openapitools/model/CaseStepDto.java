package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CaseStepDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-24T20:03:58.507019547Z[Etc/UTC]", comments = "Generator version: 7.18.0-SNAPSHOT")
public class CaseStepDto {

  private String id;

  private String caseFolderId;

  /**
   * Step type
   */
  public enum StepTypeEnum {
    INITIAL_REVIEW("INITIAL_REVIEW"),
    
    DETAILED_ANALYSIS("DETAILED_ANALYSIS"),
    
    FINAL_DECISION("FINAL_DECISION");

    private final String value;

    StepTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StepTypeEnum fromValue(String value) {
      for (StepTypeEnum b : StepTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StepTypeEnum stepType;

  /**
   * Step status
   */
  public enum StatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    COMPLETED("COMPLETED"),
    
    CANCELLED("CANCELLED"),
    
    ERROR("ERROR");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private String assignedTo;

  private String owner;

  public CaseStepDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CaseStepDto(String id, String caseFolderId, StepTypeEnum stepType, StatusEnum status, String assignedTo, String owner) {
    this.id = id;
    this.caseFolderId = caseFolderId;
    this.stepType = stepType;
    this.status = status;
    this.assignedTo = assignedTo;
    this.owner = owner;
  }

  public CaseStepDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Case step identifier
   * @return id
   */
  @NotNull 
  @Schema(name = "id", example = "12345", description = "Case step identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CaseStepDto caseFolderId(String caseFolderId) {
    this.caseFolderId = caseFolderId;
    return this;
  }

  /**
   * Case folder identifier
   * @return caseFolderId
   */
  @NotNull 
  @Schema(name = "caseFolderId", example = "67890", description = "Case folder identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("caseFolderId")
  public String getCaseFolderId() {
    return caseFolderId;
  }

  public void setCaseFolderId(String caseFolderId) {
    this.caseFolderId = caseFolderId;
  }

  public CaseStepDto stepType(StepTypeEnum stepType) {
    this.stepType = stepType;
    return this;
  }

  /**
   * Step type
   * @return stepType
   */
  @NotNull 
  @Schema(name = "stepType", example = "INITIAL_REVIEW", description = "Step type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stepType")
  public StepTypeEnum getStepType() {
    return stepType;
  }

  public void setStepType(StepTypeEnum stepType) {
    this.stepType = stepType;
  }

  public CaseStepDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Step status
   * @return status
   */
  @NotNull 
  @Schema(name = "status", example = "IN_PROGRESS", description = "Step status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CaseStepDto assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * Assigned to
   * @return assignedTo
   */
  @NotNull 
  @Schema(name = "assignedTo", example = "user123", description = "Assigned to", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedTo")
  public String getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }

  public CaseStepDto owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Owner
   * @return owner
   */
  @NotNull 
  @Schema(name = "owner", example = "owner123", description = "Owner", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseStepDto caseStepDto = (CaseStepDto) o;
    return Objects.equals(this.id, caseStepDto.id) &&
        Objects.equals(this.caseFolderId, caseStepDto.caseFolderId) &&
        Objects.equals(this.stepType, caseStepDto.stepType) &&
        Objects.equals(this.status, caseStepDto.status) &&
        Objects.equals(this.assignedTo, caseStepDto.assignedTo) &&
        Objects.equals(this.owner, caseStepDto.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseFolderId, stepType, status, assignedTo, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseStepDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseFolderId: ").append(toIndentedString(caseFolderId)).append("\n");
    sb.append("    stepType: ").append(toIndentedString(stepType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

