package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString slingServletExtensions;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString slingServletPaths;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString slingServletMethods;
 /**
   * Get slingServletExtensions
   * @return slingServletExtensions
  **/
  @JsonProperty("sling.servlet.extensions")
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }

  public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
    return this;
  }

 /**
   * Get slingServletPaths
   * @return slingServletPaths
  **/
  @JsonProperty("sling.servlet.paths")
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

 /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

