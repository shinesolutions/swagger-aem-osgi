package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqStatisticsImplStatisticsServiceImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("scheduler.period")
  private ConfigNodePropertyInteger schedulerPeriod;

  @JsonProperty("scheduler.concurrent")
  private ConfigNodePropertyBoolean schedulerConcurrent;

  @JsonProperty("path")
  private ConfigNodePropertyString path;

  @JsonProperty("workspace")
  private ConfigNodePropertyString workspace;

  @JsonProperty("keywordsPath")
  private ConfigNodePropertyString keywordsPath;

  @JsonProperty("asyncEntries")
  private ConfigNodePropertyBoolean asyncEntries;

  /**
   * 
   * @return schedulerPeriod
   */
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  /**
   * 
   * @return schedulerConcurrent
   */
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  /**
   * 
   * @return path
   */
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   * 
   * @return workspace
   */
  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }

  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

  /**
   * 
   * @return keywordsPath
   */
  public ConfigNodePropertyString getKeywordsPath() {
    return keywordsPath;
  }

  public void setKeywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
  }

  /**
   * 
   * @return asyncEntries
   */
  public ConfigNodePropertyBoolean getAsyncEntries() {
    return asyncEntries;
  }

  public void setAsyncEntries(ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
