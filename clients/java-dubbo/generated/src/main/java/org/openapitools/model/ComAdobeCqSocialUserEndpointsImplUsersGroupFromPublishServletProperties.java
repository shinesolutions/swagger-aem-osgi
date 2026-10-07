package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sling.servlet.extensions")
  private ConfigNodePropertyString slingServletExtensions;

  @JsonProperty("sling.servlet.paths")
  private ConfigNodePropertyString slingServletPaths;

  @JsonProperty("sling.servlet.methods")
  private ConfigNodePropertyString slingServletMethods;

  /**
   * 
   * @return slingServletExtensions
   */
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }

  /**
   * 
   * @return slingServletPaths
   */
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  /**
   * 
   * @return slingServletMethods
   */
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties = (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties) o;
    return Objects.equals(this.slingServletExtensions, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.slingServletExtensions) &&
        Objects.equals(this.slingServletPaths, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.slingServletPaths) &&
        Objects.equals(this.slingServletMethods, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.slingServletMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletExtensions, slingServletPaths, slingServletMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties {\n");
    
    sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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
