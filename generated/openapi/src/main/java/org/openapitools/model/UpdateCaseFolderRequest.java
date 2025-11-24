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
 * Data to update an existing case folder
 */

@Schema(name = "UpdateCaseFolderRequest", description = "Data to update an existing case folder")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-24T20:03:58.507019547Z[Etc/UTC]", comments = "Generator version: 7.18.0-SNAPSHOT")
public class UpdateCaseFolderRequest {

  private @Nullable String name;

  private @Nullable String firstSurname;

  private @Nullable String lastSurname;

  public UpdateCaseFolderRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
   */
  
  @Schema(name = "name", example = "John", description = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public UpdateCaseFolderRequest firstSurname(@Nullable String firstSurname) {
    this.firstSurname = firstSurname;
    return this;
  }

  /**
   * First surname
   * @return firstSurname
   */
  
  @Schema(name = "firstSurname", example = "Doe", description = "First surname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstSurname")
  public @Nullable String getFirstSurname() {
    return firstSurname;
  }

  public void setFirstSurname(@Nullable String firstSurname) {
    this.firstSurname = firstSurname;
  }

  public UpdateCaseFolderRequest lastSurname(@Nullable String lastSurname) {
    this.lastSurname = lastSurname;
    return this;
  }

  /**
   * Last surname
   * @return lastSurname
   */
  
  @Schema(name = "lastSurname", example = "Smith", description = "Last surname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastSurname")
  public @Nullable String getLastSurname() {
    return lastSurname;
  }

  public void setLastSurname(@Nullable String lastSurname) {
    this.lastSurname = lastSurname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCaseFolderRequest updateCaseFolderRequest = (UpdateCaseFolderRequest) o;
    return Objects.equals(this.name, updateCaseFolderRequest.name) &&
        Objects.equals(this.firstSurname, updateCaseFolderRequest.firstSurname) &&
        Objects.equals(this.lastSurname, updateCaseFolderRequest.lastSurname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firstSurname, lastSurname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCaseFolderRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstSurname: ").append(toIndentedString(firstSurname)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
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

