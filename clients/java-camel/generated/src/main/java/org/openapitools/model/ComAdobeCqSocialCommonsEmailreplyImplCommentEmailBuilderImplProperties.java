package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties {

  private ConfigNodePropertyString contextPath;

  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties contextPath(ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  /**
   * Get contextPath
   * @return contextPath
   */
  @Valid 
  @Schema(name = "context.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context.path")
  public ConfigNodePropertyString getContextPath() {
    return contextPath;
  }

  public void setContextPath(ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties = (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties) o;
    return Objects.equals(this.contextPath, comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.contextPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties {\n");
    sb.append("    contextPath: ").append(toIndentedString(contextPath)).append("\n");
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

