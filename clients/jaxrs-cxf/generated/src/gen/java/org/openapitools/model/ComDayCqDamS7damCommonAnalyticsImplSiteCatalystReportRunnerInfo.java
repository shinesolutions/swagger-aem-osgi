package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo  {
  
  @ApiModelProperty(value = "")

  private String pid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties properties;
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

  public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo pid(String pid) {
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

  public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo title(String title) {
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

  public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties properties) {
    this.properties = properties;
  }

  public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo properties(ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties properties) {
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
    ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo = (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo) o;
    return Objects.equals(this.pid, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.pid) &&
        Objects.equals(this.title, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.title) &&
        Objects.equals(this.description, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.description) &&
        Objects.equals(this.properties, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo {\n");
    
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

