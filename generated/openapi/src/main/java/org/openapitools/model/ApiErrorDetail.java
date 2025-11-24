package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * API error detail
 */

@Schema(name = "ApiErrorDetail", description = "API error detail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-24T20:03:58.507019547Z[Etc/UTC]", comments = "Generator version: 7.18.0-SNAPSHOT")
public class ApiErrorDetail {

  private String key;

  private String message;

  public ApiErrorDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiErrorDetail(String key, String message) {
    this.key = key;
    this.message = message;
  }

  public ApiErrorDetail key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Error key
   * @return key
   */
  @NotNull 
  @Schema(name = "key", example = "name", description = "Error key", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApiErrorDetail message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message
   * @return message
   */
  @NotNull 
  @Schema(name = "message", example = "Field is required", description = "Error message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiErrorDetail apiErrorDetail = (ApiErrorDetail) o;
    return Objects.equals(this.key, apiErrorDetail.key) &&
        Objects.equals(this.message, apiErrorDetail.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorDetail {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

