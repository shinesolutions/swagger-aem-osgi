package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties   {
  
  private ConfigNodePropertyString eventFilter = null;
  private ConfigNodePropertyInteger minThreadPoolSize = null;
  private ConfigNodePropertyInteger maxThreadPoolSize = null;
  private ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate = null;
  private ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList = null;

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties () {

  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties (ConfigNodePropertyString eventFilter, ConfigNodePropertyInteger minThreadPoolSize, ConfigNodePropertyInteger maxThreadPoolSize, ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate, ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.eventFilter = eventFilter;
    this.minThreadPoolSize = minThreadPoolSize;
    this.maxThreadPoolSize = maxThreadPoolSize;
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
  }

    
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

    
  @JsonProperty("minThreadPoolSize")
  public ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }
  public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

    
  @JsonProperty("maxThreadPoolSize")
  public ConfigNodePropertyInteger getMaxThreadPoolSize() {
    return maxThreadPoolSize;
  }
  public void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
  }

    
  @JsonProperty("cq.wcm.workflow.terminate.on.activate")
  public ConfigNodePropertyBoolean getCqWcmWorkflowTerminateOnActivate() {
    return cqWcmWorkflowTerminateOnActivate;
  }
  public void setCqWcmWorkflowTerminateOnActivate(ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
  }

    
  @JsonProperty("cq.wcm.worklfow.terminate.exclusion.list")
  public ConfigNodePropertyArray getCqWcmWorklfowTerminateExclusionList() {
    return cqWcmWorklfowTerminateExclusionList;
  }
  public void setCqWcmWorklfowTerminateExclusionList(ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
