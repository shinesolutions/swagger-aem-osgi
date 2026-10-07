package org.openapitools.model;

import org.openapitools.model.ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo  {
  
  @ApiModelProperty(value = "")

  private String pid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties properties;
 /**
   * Get pid
   * @return pid
  **/
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties getProperties() {
    return properties;
  }

  public void setProperties(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties properties) {
    this.properties = properties;
  }

  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo properties(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties properties) {
    this.properties = properties;
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
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo = (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo) o;
    return Objects.equals(this.pid, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo.pid) &&
        Objects.equals(this.title, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo.title) &&
        Objects.equals(this.description, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo.description) &&
        Objects.equals(this.properties, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

