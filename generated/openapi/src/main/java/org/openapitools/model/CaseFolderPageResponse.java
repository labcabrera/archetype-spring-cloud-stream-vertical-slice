package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CaseFolderDto;
import org.openapitools.model.Pagination;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Paged response for case folders
 */

@Schema(name = "CaseFolderPageResponse", description = "Paged response for case folders")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-24T20:03:58.507019547Z[Etc/UTC]", comments = "Generator version: 7.18.0-SNAPSHOT")
public class CaseFolderPageResponse {

  @Valid
  private List<@Valid CaseFolderDto> content = new ArrayList<>();

  private Pagination pagination;

  public CaseFolderPageResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CaseFolderPageResponse(List<@Valid CaseFolderDto> content, Pagination pagination) {
    this.content = content;
    this.pagination = pagination;
  }

  public CaseFolderPageResponse content(List<@Valid CaseFolderDto> content) {
    this.content = content;
    return this;
  }

  public CaseFolderPageResponse addContentItem(CaseFolderDto contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * List of items in the current page
   * @return content
   */
  @NotNull @Valid 
  @Schema(name = "content", description = "List of items in the current page", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public List<@Valid CaseFolderDto> getContent() {
    return content;
  }

  public void setContent(List<@Valid CaseFolderDto> content) {
    this.content = content;
  }

  public CaseFolderPageResponse pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
   */
  @NotNull @Valid 
  @Schema(name = "pagination", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pagination")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseFolderPageResponse caseFolderPageResponse = (CaseFolderPageResponse) o;
    return Objects.equals(this.content, caseFolderPageResponse.content) &&
        Objects.equals(this.pagination, caseFolderPageResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseFolderPageResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

