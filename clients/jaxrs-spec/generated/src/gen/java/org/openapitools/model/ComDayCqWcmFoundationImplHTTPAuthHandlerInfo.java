package org.openapitools.model;

import org.openapitools.model.ComDayCqWcmFoundationImplHTTPAuthHandlerProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmFoundationImplHTTPAuthHandlerInfo   {
  
  private @Valid String pid = null;
  private @Valid String title = null;
  private @Valid String description = null;
  private @Valid ComDayCqWcmFoundationImplHTTPAuthHandlerProperties properties = null;

  /**
   **/
  public ComDayCqWcmFoundationImplHTTPAuthHandlerInfo pid(String pid) {
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
  public ComDayCqWcmFoundationImplHTTPAuthHandlerInfo title(String title) {
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
  public ComDayCqWcmFoundationImplHTTPAuthHandlerInfo description(String description) {
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
  public ComDayCqWcmFoundationImplHTTPAuthHandlerInfo properties(ComDayCqWcmFoundationImplHTTPAuthHandlerProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqWcmFoundationImplHTTPAuthHandlerProperties properties) {
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
    ComDayCqWcmFoundationImplHTTPAuthHandlerInfo comDayCqWcmFoundationImplHTTPAuthHandlerInfo = (ComDayCqWcmFoundationImplHTTPAuthHandlerInfo) o;
    return Objects.equals(pid, comDayCqWcmFoundationImplHTTPAuthHandlerInfo.pid) &&
        Objects.equals(title, comDayCqWcmFoundationImplHTTPAuthHandlerInfo.title) &&
        Objects.equals(description, comDayCqWcmFoundationImplHTTPAuthHandlerInfo.description) &&
        Objects.equals(properties, comDayCqWcmFoundationImplHTTPAuthHandlerInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplHTTPAuthHandlerInfo {\n");
    
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

