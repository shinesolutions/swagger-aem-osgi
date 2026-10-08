package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo  {
  
  @ApiModelProperty(value = "")
  private String pid;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties properties;
 /**
  * Get pid
  * @return pid
  */
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  /**
   * Sets the <code>pid</code> property.
   */
 public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   * Sets the <code>pid</code> property.
   */
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get properties
  * @return properties
  */
  @JsonProperty("properties")
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties getProperties() {
    return properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
 public void setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties properties) {
    this.properties = properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo properties(ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties properties) {
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
    ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo = (ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo) o;
    return Objects.equals(this.pid, comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo.pid) &&
        Objects.equals(this.title, comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo.title) &&
        Objects.equals(this.description, comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo.description) &&
        Objects.equals(this.properties, comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo {\n");
    
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

