package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqStatisticsImplStatisticsServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger schedulerPeriod = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean schedulerConcurrent = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString path = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString workspace = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString keywordsPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean asyncEntries = null;
 /**
   * Get schedulerPeriod
   * @return schedulerPeriod
  **/
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

 /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
  **/
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get workspace
   * @return workspace
  **/
  @JsonProperty("workspace")
  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }

  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties workspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
    return this;
  }

 /**
   * Get keywordsPath
   * @return keywordsPath
  **/
  @JsonProperty("keywordsPath")
  public ConfigNodePropertyString getKeywordsPath() {
    return keywordsPath;
  }

  public void setKeywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties keywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
    return this;
  }

 /**
   * Get asyncEntries
   * @return asyncEntries
  **/
  @JsonProperty("asyncEntries")
  public ConfigNodePropertyBoolean getAsyncEntries() {
    return asyncEntries;
  }

  public void setAsyncEntries(ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties asyncEntries(ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqStatisticsImplStatisticsServiceImplProperties {\n");
    
    sb.append("    schedulerPeriod: ").append(toIndentedString(schedulerPeriod)).append("\n");
    sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    keywordsPath: ").append(toIndentedString(keywordsPath)).append("\n");
    sb.append("    asyncEntries: ").append(toIndentedString(asyncEntries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

