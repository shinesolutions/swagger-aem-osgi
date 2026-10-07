/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo   {
  
  private String pid;
  private String title;
  private String description;
  private ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties properties;

  /**
   */
  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   */
  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   */
  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   */
  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo properties(ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo = (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo) o;
    return Objects.equals(pid, comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo.pid) &&
        Objects.equals(title, comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo.title) &&
        Objects.equals(description, comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo.description) &&
        Objects.equals(properties, comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

