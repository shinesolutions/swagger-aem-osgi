package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString eventFilter;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minThreadPoolSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxThreadPoolSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList;
 /**
  * Get eventFilter
  * @return eventFilter
  */
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  /**
   * Sets the <code>eventFilter</code> property.
   */
 public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   * Sets the <code>eventFilter</code> property.
   */
  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

 /**
  * Get minThreadPoolSize
  * @return minThreadPoolSize
  */
  @JsonProperty("minThreadPoolSize")
  public ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }

  /**
   * Sets the <code>minThreadPoolSize</code> property.
   */
 public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

  /**
   * Sets the <code>minThreadPoolSize</code> property.
   */
  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties minThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
    return this;
  }

 /**
  * Get maxThreadPoolSize
  * @return maxThreadPoolSize
  */
  @JsonProperty("maxThreadPoolSize")
  public ConfigNodePropertyInteger getMaxThreadPoolSize() {
    return maxThreadPoolSize;
  }

  /**
   * Sets the <code>maxThreadPoolSize</code> property.
   */
 public void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
  }

  /**
   * Sets the <code>maxThreadPoolSize</code> property.
   */
  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties maxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
    return this;
  }

 /**
  * Get cqWcmWorkflowTerminateOnActivate
  * @return cqWcmWorkflowTerminateOnActivate
  */
  @JsonProperty("cq.wcm.workflow.terminate.on.activate")
  public ConfigNodePropertyBoolean getCqWcmWorkflowTerminateOnActivate() {
    return cqWcmWorkflowTerminateOnActivate;
  }

  /**
   * Sets the <code>cqWcmWorkflowTerminateOnActivate</code> property.
   */
 public void setCqWcmWorkflowTerminateOnActivate(ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
  }

  /**
   * Sets the <code>cqWcmWorkflowTerminateOnActivate</code> property.
   */
  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties cqWcmWorkflowTerminateOnActivate(ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
    return this;
  }

 /**
  * Get cqWcmWorklfowTerminateExclusionList
  * @return cqWcmWorklfowTerminateExclusionList
  */
  @JsonProperty("cq.wcm.worklfow.terminate.exclusion.list")
  public ConfigNodePropertyArray getCqWcmWorklfowTerminateExclusionList() {
    return cqWcmWorklfowTerminateExclusionList;
  }

  /**
   * Sets the <code>cqWcmWorklfowTerminateExclusionList</code> property.
   */
 public void setCqWcmWorklfowTerminateExclusionList(ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
  }

  /**
   * Sets the <code>cqWcmWorklfowTerminateExclusionList</code> property.
   */
  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties cqWcmWorklfowTerminateExclusionList(ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
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
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties = (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties) o;
    return Objects.equals(this.eventFilter, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.eventFilter) &&
        Objects.equals(this.minThreadPoolSize, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.minThreadPoolSize) &&
        Objects.equals(this.maxThreadPoolSize, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.maxThreadPoolSize) &&
        Objects.equals(this.cqWcmWorkflowTerminateOnActivate, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.cqWcmWorkflowTerminateOnActivate) &&
        Objects.equals(this.cqWcmWorklfowTerminateExclusionList, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.cqWcmWorklfowTerminateExclusionList);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

