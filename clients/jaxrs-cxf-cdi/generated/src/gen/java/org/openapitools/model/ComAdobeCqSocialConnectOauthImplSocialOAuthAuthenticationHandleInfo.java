package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo   {
  
  private String pid = null;

  private String title = null;

  private String description = null;

  private ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties properties = null;


  /**
   **/
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
   **/
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
   **/
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
   **/
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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

