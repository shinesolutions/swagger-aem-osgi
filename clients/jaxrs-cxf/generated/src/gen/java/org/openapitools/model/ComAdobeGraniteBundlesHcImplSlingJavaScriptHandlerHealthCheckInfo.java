package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo  {
  
  @ApiModelProperty(value = "")

  private String pid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties properties;
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

  public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo pid(String pid) {
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

  public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo title(String title) {
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

  public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties getProperties() {
    return properties;
  }

  public void setProperties(ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties properties) {
    this.properties = properties;
  }

  public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo properties(ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties properties) {
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
    ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo = (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo) o;
    return Objects.equals(this.pid, comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.pid) &&
        Objects.equals(this.title, comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.title) &&
        Objects.equals(this.description, comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.description) &&
        Objects.equals(this.properties, comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo {\n");
    
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

