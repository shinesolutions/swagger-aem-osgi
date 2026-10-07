package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeGraniteAuthOauthAccesstokenProviderProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeGraniteAuthOauthAccesstokenProviderInfo   {
  
  private String pid;

  private String title;

  private String description;

  private ComAdobeGraniteAuthOauthAccesstokenProviderProperties properties;

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderInfo pid(String pid) {
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
  public ComAdobeGraniteAuthOauthAccesstokenProviderInfo title(String title) {
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
  public ComAdobeGraniteAuthOauthAccesstokenProviderInfo description(String description) {
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
  public ComAdobeGraniteAuthOauthAccesstokenProviderInfo properties(ComAdobeGraniteAuthOauthAccesstokenProviderProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeGraniteAuthOauthAccesstokenProviderProperties properties) {
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
    ComAdobeGraniteAuthOauthAccesstokenProviderInfo comAdobeGraniteAuthOauthAccesstokenProviderInfo = (ComAdobeGraniteAuthOauthAccesstokenProviderInfo) o;
    return Objects.equals(this.pid, comAdobeGraniteAuthOauthAccesstokenProviderInfo.pid) &&
        Objects.equals(this.title, comAdobeGraniteAuthOauthAccesstokenProviderInfo.title) &&
        Objects.equals(this.description, comAdobeGraniteAuthOauthAccesstokenProviderInfo.description) &&
        Objects.equals(this.properties, comAdobeGraniteAuthOauthAccesstokenProviderInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthAccesstokenProviderInfo {\n");
    
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

