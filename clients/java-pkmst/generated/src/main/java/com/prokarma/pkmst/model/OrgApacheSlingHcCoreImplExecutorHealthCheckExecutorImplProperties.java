package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties   {
  @JsonProperty("timeoutInMs")
  private ConfigNodePropertyInteger timeoutInMs;

  @JsonProperty("longRunningFutureThresholdForCriticalMs")
  private ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs;

  @JsonProperty("resultCacheTtlInMs")
  private ConfigNodePropertyInteger resultCacheTtlInMs;

  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties timeoutInMs(ConfigNodePropertyInteger timeoutInMs) {
    this.timeoutInMs = timeoutInMs;
    return this;
  }

  /**
   * Get timeoutInMs
   * @return timeoutInMs
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getTimeoutInMs() {
    return timeoutInMs;
  }

  public void setTimeoutInMs(ConfigNodePropertyInteger timeoutInMs) {
    this.timeoutInMs = timeoutInMs;
  }

  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties longRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs) {
    this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
    return this;
  }

  /**
   * Get longRunningFutureThresholdForCriticalMs
   * @return longRunningFutureThresholdForCriticalMs
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getLongRunningFutureThresholdForCriticalMs() {
    return longRunningFutureThresholdForCriticalMs;
  }

  public void setLongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs) {
    this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
  }

  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties resultCacheTtlInMs(ConfigNodePropertyInteger resultCacheTtlInMs) {
    this.resultCacheTtlInMs = resultCacheTtlInMs;
    return this;
  }

  /**
   * Get resultCacheTtlInMs
   * @return resultCacheTtlInMs
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

