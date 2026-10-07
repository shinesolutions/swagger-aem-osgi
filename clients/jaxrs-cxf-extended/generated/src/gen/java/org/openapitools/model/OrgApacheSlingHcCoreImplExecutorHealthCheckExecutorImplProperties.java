package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger timeoutInMs;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger resultCacheTtlInMs;
 /**
  * Get timeoutInMs
  * @return timeoutInMs
  */
  @JsonProperty("timeoutInMs")
  public ConfigNodePropertyInteger getTimeoutInMs() {
    return timeoutInMs;
  }

  /**
   * Sets the <code>timeoutInMs</code> property.
   */
 public void setTimeoutInMs(ConfigNodePropertyInteger timeoutInMs) {
    this.timeoutInMs = timeoutInMs;
  }

  /**
   * Sets the <code>timeoutInMs</code> property.
   */
  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties timeoutInMs(ConfigNodePropertyInteger timeoutInMs) {
    this.timeoutInMs = timeoutInMs;
    return this;
  }

 /**
  * Get longRunningFutureThresholdForCriticalMs
  * @return longRunningFutureThresholdForCriticalMs
  */
  @JsonProperty("longRunningFutureThresholdForCriticalMs")
  public ConfigNodePropertyInteger getLongRunningFutureThresholdForCriticalMs() {
    return longRunningFutureThresholdForCriticalMs;
  }

  /**
   * Sets the <code>longRunningFutureThresholdForCriticalMs</code> property.
   */
 public void setLongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs) {
    this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
  }

  /**
   * Sets the <code>longRunningFutureThresholdForCriticalMs</code> property.
   */
  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties longRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs) {
    this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
    return this;
  }

 /**
  * Get resultCacheTtlInMs
  * @return resultCacheTtlInMs
  */
  @JsonProperty("resultCacheTtlInMs")
  public ConfigNodePropertyInteger getResultCacheTtlInMs() {
    return resultCacheTtlInMs;
  }

  /**
   * Sets the <code>resultCacheTtlInMs</code> property.
   */
 public void setResultCacheTtlInMs(ConfigNodePropertyInteger resultCacheTtlInMs) {
    this.resultCacheTtlInMs = resultCacheTtlInMs;
  }

  /**
   * Sets the <code>resultCacheTtlInMs</code> property.
   */
  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties resultCacheTtlInMs(ConfigNodePropertyInteger resultCacheTtlInMs) {
    this.resultCacheTtlInMs = resultCacheTtlInMs;
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
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties = (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties) o;
    return Objects.equals(this.timeoutInMs, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.timeoutInMs) &&
        Objects.equals(this.longRunningFutureThresholdForCriticalMs, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.longRunningFutureThresholdForCriticalMs) &&
        Objects.equals(this.resultCacheTtlInMs, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.resultCacheTtlInMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeoutInMs, longRunningFutureThresholdForCriticalMs, resultCacheTtlInMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties {\n");
    
    sb.append("    timeoutInMs: ").append(toIndentedString(timeoutInMs)).append("\n");
    sb.append("    longRunningFutureThresholdForCriticalMs: ").append(toIndentedString(longRunningFutureThresholdForCriticalMs)).append("\n");
    sb.append("    resultCacheTtlInMs: ").append(toIndentedString(resultCacheTtlInMs)).append("\n");
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

