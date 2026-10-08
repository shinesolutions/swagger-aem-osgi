package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("context.path")
  private ConfigNodePropertyString contextPath;

  /**
   * 
   * @return contextPath
   */
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
