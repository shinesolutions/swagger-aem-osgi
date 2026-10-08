package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamInddImplServletSnippetCreationServletProperties
 */

@JsonTypeName("comDayCqDamInddImplServletSnippetCreationServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamInddImplServletSnippetCreationServletProperties {

  private ConfigNodePropertyInteger snippetcreationMaxcollections;

  public ComDayCqDamInddImplServletSnippetCreationServletProperties snippetcreationMaxcollections(ConfigNodePropertyInteger snippetcreationMaxcollections) {
    this.snippetcreationMaxcollections = snippetcreationMaxcollections;
    return this;
  }

  /**
   * Get snippetcreationMaxcollections
   * @return snippetcreationMaxcollections
   */
  @Valid 
  @Schema(name = "snippetcreation.maxcollections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snippetcreation.maxcollections")
  public ConfigNodePropertyInteger getSnippetcreationMaxcollections() {
    return snippetcreationMaxcollections;
  }

  public void setSnippetcreationMaxcollections(ConfigNodePropertyInteger snippetcreationMaxcollections) {
    this.snippetcreationMaxcollections = snippetcreationMaxcollections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamInddImplServletSnippetCreationServletProperties comDayCqDamInddImplServletSnippetCreationServletProperties = (ComDayCqDamInddImplServletSnippetCreationServletProperties) o;
    return Objects.equals(this.snippetcreationMaxcollections, comDayCqDamInddImplServletSnippetCreationServletProperties.snippetcreationMaxcollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snippetcreationMaxcollections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamInddImplServletSnippetCreationServletProperties {\n");
    sb.append("    snippetcreationMaxcollections: ").append(toIndentedString(snippetcreationMaxcollections)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

