package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString eventFilter = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger minThreadPoolSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxThreadPoolSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList = null;
 /**
   * Get eventFilter
   * @return eventFilter
  **/
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

 /**
   * Get minThreadPoolSize
   * @return minThreadPoolSize
  **/
  @JsonProperty("minThreadPoolSize")
  public ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }

  public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties minThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
    return this;
  }

 /**
   * Get maxThreadPoolSize
   * @return maxThreadPoolSize
  **/
  @JsonProperty("maxThreadPoolSize")
  public ConfigNodePropertyInteger getMaxThreadPoolSize() {
    return maxThreadPoolSize;
  }

  public void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties maxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
    return this;
  }

 /**
   * Get cqWcmWorkflowTerminateOnActivate
   * @return cqWcmWorkflowTerminateOnActivate
  **/
  @JsonProperty("cq.wcm.workflow.terminate.on.activate")
  public ConfigNodePropertyBoolean getCqWcmWorkflowTerminateOnActivate() {
    return cqWcmWorkflowTerminateOnActivate;
  }

  public void setCqWcmWorkflowTerminateOnActivate(ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties cqWcmWorkflowTerminateOnActivate(ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
    return this;
  }

 /**
   * Get cqWcmWorklfowTerminateExclusionList
   * @return cqWcmWorklfowTerminateExclusionList
  **/
  @JsonProperty("cq.wcm.worklfow.terminate.exclusion.list")
  public ConfigNodePropertyArray getCqWcmWorklfowTerminateExclusionList() {
    return cqWcmWorklfowTerminateExclusionList;
  }

  public void setCqWcmWorklfowTerminateExclusionList(ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties cqWcmWorklfowTerminateExclusionList(ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

