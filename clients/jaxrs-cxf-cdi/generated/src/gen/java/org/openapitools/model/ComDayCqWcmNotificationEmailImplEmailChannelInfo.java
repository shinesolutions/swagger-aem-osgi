package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ComDayCqWcmNotificationEmailImplEmailChannelProperties;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqWcmNotificationEmailImplEmailChannelInfo   {
  
  private String pid = null;

  private String title = null;

  private String description = null;

  private ComDayCqWcmNotificationEmailImplEmailChannelProperties properties = null;


  /**
   **/
  public ComDayCqWcmNotificationEmailImplEmailChannelInfo pid(String pid) {
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
  public ComDayCqWcmNotificationEmailImplEmailChannelInfo title(String title) {
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
  public ComDayCqWcmNotificationEmailImplEmailChannelInfo description(String description) {
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
  public ComDayCqWcmNotificationEmailImplEmailChannelInfo properties(ComDayCqWcmNotificationEmailImplEmailChannelProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComDayCqWcmNotificationEmailImplEmailChannelProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqWcmNotificationEmailImplEmailChannelProperties properties) {
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
    ComDayCqWcmNotificationEmailImplEmailChannelInfo comDayCqWcmNotificationEmailImplEmailChannelInfo = (ComDayCqWcmNotificationEmailImplEmailChannelInfo) o;
    return Objects.equals(pid, comDayCqWcmNotificationEmailImplEmailChannelInfo.pid) &&
        Objects.equals(title, comDayCqWcmNotificationEmailImplEmailChannelInfo.title) &&
        Objects.equals(description, comDayCqWcmNotificationEmailImplEmailChannelInfo.description) &&
        Objects.equals(properties, comDayCqWcmNotificationEmailImplEmailChannelInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmNotificationEmailImplEmailChannelInfo {\n");
    
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

