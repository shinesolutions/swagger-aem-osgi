package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo  {
  
  @ApiModelProperty(value = "")
  private String pid;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties properties;
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
  public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo pid(String pid) {
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
  public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo title(String title) {
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
  public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get properties
  * @return properties
  */
  @JsonProperty("properties")
  public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties getProperties() {
    return properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
 public void setProperties(ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties properties) {
    this.properties = properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
  public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo properties(ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties properties) {
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
    ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo = (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo) o;
    return Objects.equals(this.pid, comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo.pid) &&
        Objects.equals(this.title, comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo.title) &&
        Objects.equals(this.description, comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo.description) &&
        Objects.equals(this.properties, comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo {\n");
    
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

