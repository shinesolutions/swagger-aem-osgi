package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties   {
  
  private ConfigNodePropertyInteger timeoutInMs = null;
  private ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs = null;
  private ConfigNodePropertyInteger resultCacheTtlInMs = null;

  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties () {

  }

  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties (ConfigNodePropertyInteger timeoutInMs, ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs, ConfigNodePropertyInteger resultCacheTtlInMs) {
    this.timeoutInMs = timeoutInMs;
    this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
    this.resultCacheTtlInMs = resultCacheTtlInMs;
  }

    
  @JsonProperty("timeoutInMs")
  public ConfigNodePropertyInteger getTimeoutInMs() {
    return timeoutInMs;
  }
  public void setTimeoutInMs(ConfigNodePropertyInteger timeoutInMs) {
    this.timeoutInMs = timeoutInMs;
  }

    
  @JsonProperty("longRunningFutureThresholdForCriticalMs")
  public ConfigNodePropertyInteger getLongRunningFutureThresholdForCriticalMs() {
    return longRunningFutureThresholdForCriticalMs;
  }
  public void setLongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs) {
    this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
  }

    
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
