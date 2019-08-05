package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqStatisticsImplStatisticsServiceImplProperties   {
  
  private ConfigNodePropertyInteger schedulerPeriod = null;
  private ConfigNodePropertyBoolean schedulerConcurrent = null;
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyString workspace = null;
  private ConfigNodePropertyString keywordsPath = null;
  private ConfigNodePropertyBoolean asyncEntries = null;

  public ComDayCqStatisticsImplStatisticsServiceImplProperties () {

  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties (ConfigNodePropertyInteger schedulerPeriod, ConfigNodePropertyBoolean schedulerConcurrent, ConfigNodePropertyString path, ConfigNodePropertyString workspace, ConfigNodePropertyString keywordsPath, ConfigNodePropertyBoolean asyncEntries) {
    this.schedulerPeriod = schedulerPeriod;
    this.schedulerConcurrent = schedulerConcurrent;
    this.path = path;
    this.workspace = workspace;
    this.keywordsPath = keywordsPath;
    this.asyncEntries = asyncEntries;
  }

    
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }
  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

    
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }
  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

    
  @JsonProperty("workspace")
  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }
  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

    
  @JsonProperty("keywordsPath")
  public ConfigNodePropertyString getKeywordsPath() {
    return keywordsPath;
  }
  public void setKeywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
  }

    
  @JsonProperty("asyncEntries")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
