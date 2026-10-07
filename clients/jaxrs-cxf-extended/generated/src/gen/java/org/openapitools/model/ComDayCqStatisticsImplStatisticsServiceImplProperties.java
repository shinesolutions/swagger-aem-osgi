package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqStatisticsImplStatisticsServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger schedulerPeriod;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean schedulerConcurrent;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString path;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString workspace;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString keywordsPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean asyncEntries;
 /**
  * Get schedulerPeriod
  * @return schedulerPeriod
  */
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  /**
   * Sets the <code>schedulerPeriod</code> property.
   */
 public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  /**
   * Sets the <code>schedulerPeriod</code> property.
   */
  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

 /**
  * Get schedulerConcurrent
  * @return schedulerConcurrent
  */
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  /**
   * Sets the <code>schedulerConcurrent</code> property.
   */
 public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  /**
   * Sets the <code>schedulerConcurrent</code> property.
   */
  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

 /**
  * Get path
  * @return path
  */
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  /**
   * Sets the <code>path</code> property.
   */
 public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   * Sets the <code>path</code> property.
   */
  public ComDayCqStatisticsImplStatisticsServiceImplProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
  * Get workspace
  * @return workspace
  */
  @JsonProperty("workspace")
  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }

  /**
   * Sets the <code>workspace</code> property.
   */
 public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

  /**
   * Sets the <code>workspace</code> property.
   */
  public ComDayCqStatisticsImplStatisticsServiceImplProperties workspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
    return this;
  }

 /**
  * Get keywordsPath
  * @return keywordsPath
  */
  @JsonProperty("keywordsPath")
  public ConfigNodePropertyString getKeywordsPath() {
    return keywordsPath;
  }

  /**
   * Sets the <code>keywordsPath</code> property.
   */
 public void setKeywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
  }

  /**
   * Sets the <code>keywordsPath</code> property.
   */
  public ComDayCqStatisticsImplStatisticsServiceImplProperties keywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
    return this;
  }

 /**
  * Get asyncEntries
  * @return asyncEntries
  */
  @JsonProperty("asyncEntries")
  public ConfigNodePropertyBoolean getAsyncEntries() {
    return asyncEntries;
  }

  /**
   * Sets the <code>asyncEntries</code> property.
   */
 public void setAsyncEntries(ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
  }

  /**
   * Sets the <code>asyncEntries</code> property.
   */
  public ComDayCqStatisticsImplStatisticsServiceImplProperties asyncEntries(ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
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
    ComDayCqStatisticsImplStatisticsServiceImplProperties comDayCqStatisticsImplStatisticsServiceImplProperties = (ComDayCqStatisticsImplStatisticsServiceImplProperties) o;
    return Objects.equals(this.schedulerPeriod, comDayCqStatisticsImplStatisticsServiceImplProperties.schedulerPeriod) &&
        Objects.equals(this.schedulerConcurrent, comDayCqStatisticsImplStatisticsServiceImplProperties.schedulerConcurrent) &&
        Objects.equals(this.path, comDayCqStatisticsImplStatisticsServiceImplProperties.path) &&
        Objects.equals(this.workspace, comDayCqStatisticsImplStatisticsServiceImplProperties.workspace) &&
        Objects.equals(this.keywordsPath, comDayCqStatisticsImplStatisticsServiceImplProperties.keywordsPath) &&
        Objects.equals(this.asyncEntries, comDayCqStatisticsImplStatisticsServiceImplProperties.asyncEntries);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

