package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ApiErrorDetail;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * API error information
 */

@Schema(name = "ApiError", description = "API error information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-24T20:03:58.507019547Z[Etc/UTC]", comments = "Generator version: 7.18.0-SNAPSHOT")
public class ApiError {

  private String code;

  private String message;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @Valid
  private List<@Valid ApiErrorDetail> details = new ArrayList<>();

  public ApiError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiError(String code, String message, OffsetDateTime timestamp) {
    this.code = code;
    this.message = message;
    this.timestamp = timestamp;
  }

  public ApiError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Error code
   * @return code
   */
  @NotNull 
  @Schema(name = "code", example = "case-folder.msg.err.not-found", description = "Error code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ApiError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Detailed error message
   * @return message
   */
  @NotNull 
  @Schema(name = "message", example = "Case folder not found", description = "Detailed error message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApiError timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp of the error
   * @return timestamp
   */
  @NotNull @Valid 
  @Schema(name = "timestamp", description = "Timestamp of the error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ApiError details(List<@Valid ApiErrorDetail> details) {
    this.details = details;
    return this;
  }

  public ApiError addDetailsItem(ApiErrorDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Validation errors, if any
   * @return details
   */
  @Valid 
  @Schema(name = "details", description = "Validation errors, if any", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public List<@Valid ApiErrorDetail> getDetails() {
    return details;
  }

  public void setDetails(List<@Valid ApiErrorDetail> details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.code, apiError.code) &&
        Objects.equals(this.message, apiError.message) &&
        Objects.equals(this.timestamp, apiError.timestamp) &&
        Objects.equals(this.details, apiError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, timestamp, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

