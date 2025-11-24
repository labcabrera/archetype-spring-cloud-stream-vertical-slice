package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Case folder information
 */

@Schema(name = "CaseFolderDto", description = "Case folder information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-24T20:03:58.507019547Z[Etc/UTC]", comments = "Generator version: 7.18.0-SNAPSHOT")
public class CaseFolderDto {

  private String id;

  /**
   * Status
   */
  public enum StatusEnum {
    PARTIALLY_CREATED("PARTIALLY_CREATED"),
    
    ACTIVE("ACTIVE"),
    
    CLOSED("CLOSED"),
    
    DELETED("DELETED");

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

  private String name;

  private String firstSurname;

  private @Nullable String lastSurname;

  private IdCardDto idCard;

  private String owner;

  public CaseFolderDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CaseFolderDto(String id, StatusEnum status, String name, String firstSurname, IdCardDto idCard, String owner) {
    this.id = id;
    this.status = status;
    this.name = name;
    this.firstSurname = firstSurname;
    this.idCard = idCard;
    this.owner = owner;
  }

  public CaseFolderDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the case folder
   * @return id
   */
  @NotNull 
  @Schema(name = "id", example = "550e8400-e29b-41d4-a716-446655440000", description = "Unique identifier of the case folder", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CaseFolderDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status
   * @return status
   */
  @NotNull 
  @Schema(name = "status", example = "ACTIVE", description = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CaseFolderDto name(String name) {
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

  public CaseFolderDto firstSurname(String firstSurname) {
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

  public CaseFolderDto lastSurname(@Nullable String lastSurname) {
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

  public CaseFolderDto idCard(IdCardDto idCard) {
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

  public CaseFolderDto owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Entity owner
   * @return owner
   */
  @NotNull 
  @Schema(name = "owner", example = "john.doe", description = "Entity owner", requiredMode = Schema.RequiredMode.REQUIRED)
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
    CaseFolderDto caseFolderDto = (CaseFolderDto) o;
    return Objects.equals(this.id, caseFolderDto.id) &&
        Objects.equals(this.status, caseFolderDto.status) &&
        Objects.equals(this.name, caseFolderDto.name) &&
        Objects.equals(this.firstSurname, caseFolderDto.firstSurname) &&
        Objects.equals(this.lastSurname, caseFolderDto.lastSurname) &&
        Objects.equals(this.idCard, caseFolderDto.idCard) &&
        Objects.equals(this.owner, caseFolderDto.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, name, firstSurname, lastSurname, idCard, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseFolderDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstSurname: ").append(toIndentedString(firstSurname)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
    sb.append("    idCard: ").append(toIndentedString(idCard)).append("\n");
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

