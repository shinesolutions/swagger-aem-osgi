package org.openapitools.model;

import org.openapitools.model.ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo  {
  
  @ApiModelProperty(value = "")

  private String pid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties properties;
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

  public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo pid(String pid) {
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

  public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo title(String title) {
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

  public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties properties) {
    this.properties = properties;
  }

  public ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo properties(ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties properties) {
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
    ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo comDayCqDamS7damCommonS7damDamChangeEventListenerInfo = (ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo) o;
    return Objects.equals(this.pid, comDayCqDamS7damCommonS7damDamChangeEventListenerInfo.pid) &&
        Objects.equals(this.title, comDayCqDamS7damCommonS7damDamChangeEventListenerInfo.title) &&
        Objects.equals(this.description, comDayCqDamS7damCommonS7damDamChangeEventListenerInfo.description) &&
        Objects.equals(this.properties, comDayCqDamS7damCommonS7damDamChangeEventListenerInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo {\n");
    
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

