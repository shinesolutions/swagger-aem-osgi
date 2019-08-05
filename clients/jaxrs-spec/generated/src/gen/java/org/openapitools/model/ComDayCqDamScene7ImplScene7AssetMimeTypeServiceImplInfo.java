package org.openapitools.model;

import org.openapitools.model.ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo   {
  
  private @Valid String pid = null;
  private @Valid String title = null;
  private @Valid String description = null;
  private @Valid ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties properties = null;

  /**
   **/
  public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo pid(String pid) {
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
  public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo title(String title) {
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
  public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo description(String description) {
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
  public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo properties(ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties properties) {
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
    ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo = (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo) o;
    return Objects.equals(pid, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo.pid) &&
        Objects.equals(title, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo.title) &&
        Objects.equals(description, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo.description) &&
        Objects.equals(properties, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo {\n");
    
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

