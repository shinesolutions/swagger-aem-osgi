package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqStatisticsImplStatisticsServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqStatisticsImplStatisticsServiceImplProperties   {
  @JsonProperty("scheduler.period")
  private ConfigNodePropertyInteger schedulerPeriod = null;

  @JsonProperty("scheduler.concurrent")
  private ConfigNodePropertyBoolean schedulerConcurrent = null;

  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  @JsonProperty("workspace")
  private ConfigNodePropertyString workspace = null;

  @JsonProperty("keywordsPath")
  private ConfigNodePropertyString keywordsPath = null;

  @JsonProperty("asyncEntries")
  private ConfigNodePropertyBoolean asyncEntries = null;

  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

   /**
   * Get schedulerPeriod
   * @return schedulerPeriod
  **/
  @Valid
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

   /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
  **/
  @Valid
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Valid
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties workspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
    return this;
  }

   /**
   * Get workspace
   * @return workspace
  **/
  @Valid
  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }

  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties keywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
    return this;
  }

   /**
   * Get keywordsPath
   * @return keywordsPath
  **/
  @Valid
  public ConfigNodePropertyString getKeywordsPath() {
    return keywordsPath;
  }

  public void setKeywordsPath(ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties asyncEntries(ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
    return this;
  }

   /**
   * Get asyncEntries
   * @return asyncEntries
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

