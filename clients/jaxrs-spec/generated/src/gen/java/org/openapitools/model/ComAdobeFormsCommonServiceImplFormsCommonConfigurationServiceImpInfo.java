package org.openapitools.model;

import org.openapitools.model.ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo   {
  
  private @Valid String pid = null;
  private @Valid String title = null;
  private @Valid String description = null;
  private @Valid ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties properties = null;

  /**
   **/
  public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo pid(String pid) {
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
  public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo title(String title) {
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
  public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo description(String description) {
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
  public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo properties(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties properties) {
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
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo = (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo) o;
    return Objects.equals(pid, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.pid) &&
        Objects.equals(title, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.title) &&
        Objects.equals(description, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.description) &&
        Objects.equals(properties, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo {\n");
    
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

