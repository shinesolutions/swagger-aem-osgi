package org.openapitools.model;

import org.openapitools.model.ComAdobeCqDamS7imagingImplIsImageServerComponentProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo   {
  
  private @Valid String pid = null;
  private @Valid String title = null;
  private @Valid String description = null;
  private @Valid ComAdobeCqDamS7imagingImplIsImageServerComponentProperties properties = null;

  /**
   **/
  public ComAdobeCqDamS7imagingImplIsImageServerComponentInfo pid(String pid) {
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
  public ComAdobeCqDamS7imagingImplIsImageServerComponentInfo title(String title) {
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
  public ComAdobeCqDamS7imagingImplIsImageServerComponentInfo description(String description) {
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
  public ComAdobeCqDamS7imagingImplIsImageServerComponentInfo properties(ComAdobeCqDamS7imagingImplIsImageServerComponentProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqDamS7imagingImplIsImageServerComponentProperties properties) {
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
    ComAdobeCqDamS7imagingImplIsImageServerComponentInfo comAdobeCqDamS7imagingImplIsImageServerComponentInfo = (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo) o;
    return Objects.equals(pid, comAdobeCqDamS7imagingImplIsImageServerComponentInfo.pid) &&
        Objects.equals(title, comAdobeCqDamS7imagingImplIsImageServerComponentInfo.title) &&
        Objects.equals(description, comAdobeCqDamS7imagingImplIsImageServerComponentInfo.description) &&
        Objects.equals(properties, comAdobeCqDamS7imagingImplIsImageServerComponentInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo {\n");
    
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

