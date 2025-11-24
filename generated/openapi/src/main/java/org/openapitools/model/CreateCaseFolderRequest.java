package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.IdCardDto;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data to create a new case folder
 */

@Schema(name = "CreateCaseFolderRequest", description = "Data to create a new case folder")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-24T20:03:58.507019547Z[Etc/UTC]", comments = "Generator version: 7.18.0-SNAPSHOT")
public class CreateCaseFolderRequest {

  private String name;

  private String firstSurname;

  private @Nullable String lastSurname;

  private IdCardDto idCard;

  public CreateCaseFolderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateCaseFolderRequest(String name, String firstSurname, IdCardDto idCard) {
    this.name = name;
    this.firstSurname = firstSurname;
    this.idCard = idCard;
  }

  public CreateCaseFolderRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "John", description = "Name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateCaseFolderRequest firstSurname(String firstSurname) {
    this.firstSurname = firstSurname;
    return this;
  }

  /**
   * First surname
   * @return firstSurname
   */
  @NotNull 
  @Schema(name = "firstSurname", example = "Doe", description = "First surname", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstSurname")
  public String getFirstSurname() {
    return firstSurname;
  }

  public void setFirstSurname(String firstSurname) {
    this.firstSurname = firstSurname;
  }

  public CreateCaseFolderRequest lastSurname(@Nullable String lastSurname) {
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

  public CreateCaseFolderRequest idCard(IdCardDto idCard) {
    this.idCard = idCard;
    return this;
  }

  /**
   * Get idCard
   * @return idCard
   */
  @NotNull @Valid 
  @Schema(name = "idCard", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idCard")
  public IdCardDto getIdCard() {
    return idCard;
  }

  public void setIdCard(IdCardDto idCard) {
    this.idCard = idCard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCaseFolderRequest createCaseFolderRequest = (CreateCaseFolderRequest) o;
    return Objects.equals(this.name, createCaseFolderRequest.name) &&
        Objects.equals(this.firstSurname, createCaseFolderRequest.firstSurname) &&
        Objects.equals(this.lastSurname, createCaseFolderRequest.lastSurname) &&
        Objects.equals(this.idCard, createCaseFolderRequest.idCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firstSurname, lastSurname, idCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCaseFolderRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstSurname: ").append(toIndentedString(firstSurname)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
    sb.append("    idCard: ").append(toIndentedString(idCard)).append("\n");
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

