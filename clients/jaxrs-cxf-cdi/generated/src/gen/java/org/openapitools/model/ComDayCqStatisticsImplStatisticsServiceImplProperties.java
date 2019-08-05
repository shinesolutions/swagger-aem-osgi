package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqStatisticsImplStatisticsServiceImplProperties   {
  
  private ConfigNodePropertyInteger schedulerPeriod = null;

  private ConfigNodePropertyBoolean schedulerConcurrent = null;

  private ConfigNodePropertyString path = null;

  private ConfigNodePropertyString workspace = null;

  private ConfigNodePropertyString keywordsPath = null;

  private ConfigNodePropertyBoolean asyncEntries = null;


  /**
   **/
  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }
  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }


  /**
   **/
  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }
  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }


  /**
   **/
  public ComDayCqStatisticsImplStatisticsServiceImplProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }


  /**
   **/
  public ComDayCqStatisticsImplStatisticsServiceImplProperties workspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("workspace")
  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }
  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }


  /**
   **/
  public ComDayCqStatisticsImplStatisticsServiceImplProperties keywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keywordsPath")
  public ConfigNodePropertyString getKeywordsPath() {
    return keywordsPath;
  }
  public void setKeywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
  }


  /**
   **/
  public ComDayCqStatisticsImplStatisticsServiceImplProperties asyncEntries(ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("asyncEntries")
  public ConfigNodePropertyBoolean getAsyncEntries() {
    return asyncEntries;
  }
  public void setAsyncEntries(ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqStatisticsImplStatisticsServiceImplProperties comDayCqStatisticsImplStatisticsServiceImplProperties = (ComDayCqStatisticsImplStatisticsServiceImplProperties) o;
    return Objects.equals(schedulerPeriod, comDayCqStatisticsImplStatisticsServiceImplProperties.schedulerPeriod) &&
        Objects.equals(schedulerConcurrent, comDayCqStatisticsImplStatisticsServiceImplProperties.schedulerConcurrent) &&
        Objects.equals(path, comDayCqStatisticsImplStatisticsServiceImplProperties.path) &&
        Objects.equals(workspace, comDayCqStatisticsImplStatisticsServiceImplProperties.workspace) &&
        Objects.equals(keywordsPath, comDayCqStatisticsImplStatisticsServiceImplProperties.keywordsPath) &&
        Objects.equals(asyncEntries, comDayCqStatisticsImplStatisticsServiceImplProperties.asyncEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerPeriod, schedulerConcurrent, path, workspace, keywordsPath, asyncEntries);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

