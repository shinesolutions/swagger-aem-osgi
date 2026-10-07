package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties   {
  @JsonProperty("context.path")
  private ConfigNodePropertyString contextPath;

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties contextPath(ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(contextPath, comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.contextPath);
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

