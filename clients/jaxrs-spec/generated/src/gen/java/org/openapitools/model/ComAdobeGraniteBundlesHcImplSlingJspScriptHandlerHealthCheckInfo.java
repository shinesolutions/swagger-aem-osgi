package org.openapitools.model;

import org.openapitools.model.ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo   {
  
  private @Valid String pid = null;
  private @Valid String title = null;
  private @Valid String description = null;
  private @Valid ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties properties = null;

  /**
   **/
  public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo pid(String pid) {
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
  public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo title(String title) {
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
  public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo description(String description) {
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
  public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo properties(ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties properties) {
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
    ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo = (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo) o;
    return Objects.equals(pid, comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.pid) &&
        Objects.equals(title, comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.title) &&
        Objects.equals(description, comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.description) &&
        Objects.equals(properties, comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo {\n");
    
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

