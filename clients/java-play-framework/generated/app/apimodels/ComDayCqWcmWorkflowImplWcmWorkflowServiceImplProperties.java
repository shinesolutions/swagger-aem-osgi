package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties   {
  @JsonProperty("event.filter")
  private ConfigNodePropertyString eventFilter = null;

  @JsonProperty("minThreadPoolSize")
  private ConfigNodePropertyInteger minThreadPoolSize = null;

  @JsonProperty("maxThreadPoolSize")
  private ConfigNodePropertyInteger maxThreadPoolSize = null;

  @JsonProperty("cq.wcm.workflow.terminate.on.activate")
  private ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate = null;

  @JsonProperty("cq.wcm.worklfow.terminate.exclusion.list")
  private ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList = null;

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

   /**
   * Get eventFilter
   * @return eventFilter
  **/
  @Valid
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties minThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
    return this;
  }

   /**
   * Get minThreadPoolSize
   * @return minThreadPoolSize
  **/
  @Valid
  public ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }

  public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties maxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
    return this;
  }

   /**
   * Get maxThreadPoolSize
   * @return maxThreadPoolSize
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxThreadPoolSize() {
    return maxThreadPoolSize;
  }

  public void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties cqWcmWorkflowTerminateOnActivate(ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
    return this;
  }

   /**
   * Get cqWcmWorkflowTerminateOnActivate
   * @return cqWcmWorkflowTerminateOnActivate
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqWcmWorkflowTerminateOnActivate() {
    return cqWcmWorkflowTerminateOnActivate;
  }

  public void setCqWcmWorkflowTerminateOnActivate(ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties cqWcmWorklfowTerminateExclusionList(ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
    return this;
  }

   /**
   * Get cqWcmWorklfowTerminateExclusionList
   * @return cqWcmWorklfowTerminateExclusionList
  **/
  @Valid
  public ConfigNodePropertyArray getCqWcmWorklfowTerminateExclusionList() {
    return cqWcmWorklfowTerminateExclusionList;
  }

  public void setCqWcmWorklfowTerminateExclusionList(ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties = (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties) o;
    return Objects.equals(eventFilter, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.eventFilter) &&
        Objects.equals(minThreadPoolSize, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.minThreadPoolSize) &&
        Objects.equals(maxThreadPoolSize, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.maxThreadPoolSize) &&
        Objects.equals(cqWcmWorkflowTerminateOnActivate, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.cqWcmWorkflowTerminateOnActivate) &&
        Objects.equals(cqWcmWorklfowTerminateExclusionList, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.cqWcmWorklfowTerminateExclusionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, minThreadPoolSize, maxThreadPoolSize, cqWcmWorkflowTerminateOnActivate, cqWcmWorklfowTerminateExclusionList);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {\n");
    
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    minThreadPoolSize: ").append(toIndentedString(minThreadPoolSize)).append("\n");
    sb.append("    maxThreadPoolSize: ").append(toIndentedString(maxThreadPoolSize)).append("\n");
    sb.append("    cqWcmWorkflowTerminateOnActivate: ").append(toIndentedString(cqWcmWorkflowTerminateOnActivate)).append("\n");
    sb.append("    cqWcmWorklfowTerminateExclusionList: ").append(toIndentedString(cqWcmWorklfowTerminateExclusionList)).append("\n");
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

