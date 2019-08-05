package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties   {
  

  private ConfigNodePropertyInteger timeoutInMs = null;

  private ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs = null;

  private ConfigNodePropertyInteger resultCacheTtlInMs = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeoutInMs")
  public ConfigNodePropertyInteger getTimeoutInMs() {
    return timeoutInMs;
  }
  public void setTimeoutInMs(ConfigNodePropertyInteger timeoutInMs) {
    this.timeoutInMs = timeoutInMs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longRunningFutureThresholdForCriticalMs")
  public ConfigNodePropertyInteger getLongRunningFutureThresholdForCriticalMs() {
    return longRunningFutureThresholdForCriticalMs;
  }
  public void setLongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs) {
    this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resultCacheTtlInMs")
  public ConfigNodePropertyInteger getResultCacheTtlInMs() {
    return resultCacheTtlInMs;
  }
  public void setResultCacheTtlInMs(ConfigNodePropertyInteger resultCacheTtlInMs) {
    this.resultCacheTtlInMs = resultCacheTtlInMs;
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
    return Objects.equals(timeoutInMs, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.timeoutInMs) &&
        Objects.equals(longRunningFutureThresholdForCriticalMs, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.longRunningFutureThresholdForCriticalMs) &&
        Objects.equals(resultCacheTtlInMs, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.resultCacheTtlInMs);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

