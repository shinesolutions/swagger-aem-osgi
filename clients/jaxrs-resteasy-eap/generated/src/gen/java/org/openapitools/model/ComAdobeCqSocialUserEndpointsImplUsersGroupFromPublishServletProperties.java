package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties   {
  

  private ConfigNodePropertyString slingServletExtensions = null;

  private ConfigNodePropertyString slingServletPaths = null;

  private ConfigNodePropertyString slingServletMethods = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.extensions")
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }
  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.paths")
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }
  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.methods")
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
    return Objects.equals(slingServletExtensions, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.slingServletExtensions) &&
        Objects.equals(slingServletPaths, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.slingServletPaths) &&
        Objects.equals(slingServletMethods, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.slingServletMethods);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

