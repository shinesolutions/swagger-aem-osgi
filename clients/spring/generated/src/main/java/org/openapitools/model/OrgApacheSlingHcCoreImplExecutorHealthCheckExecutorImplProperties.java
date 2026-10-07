package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties
 */

@JsonTypeName("orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger timeoutInMs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger resultCacheTtlInMs;

  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties timeoutInMs(@Nullable ConfigNodePropertyInteger timeoutInMs) {
    this.timeoutInMs = timeoutInMs;
    return this;
  }

  /**
   * Get timeoutInMs
   * @return timeoutInMs
   */
  @Valid 
  @Schema(name = "timeoutInMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeoutInMs")
  public @Nullable ConfigNodePropertyInteger getTimeoutInMs() {
    return timeoutInMs;
  }

  @JsonProperty("timeoutInMs")
  public void setTimeoutInMs(@Nullable ConfigNodePropertyInteger timeoutInMs) {
    this.timeoutInMs = timeoutInMs;
  }

  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties longRunningFutureThresholdForCriticalMs(@Nullable ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs) {
    this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
    return this;
  }

  /**
   * Get longRunningFutureThresholdForCriticalMs
   * @return longRunningFutureThresholdForCriticalMs
   */
  @Valid 
  @Schema(name = "longRunningFutureThresholdForCriticalMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longRunningFutureThresholdForCriticalMs")
  public @Nullable ConfigNodePropertyInteger getLongRunningFutureThresholdForCriticalMs() {
    return longRunningFutureThresholdForCriticalMs;
  }

  @JsonProperty("longRunningFutureThresholdForCriticalMs")
  public void setLongRunningFutureThresholdForCriticalMs(@Nullable ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs) {
    this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
  }

  public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties resultCacheTtlInMs(@Nullable ConfigNodePropertyInteger resultCacheTtlInMs) {
    this.resultCacheTtlInMs = resultCacheTtlInMs;
    return this;
  }

  /**
   * Get resultCacheTtlInMs
   * @return resultCacheTtlInMs
   */
  @Valid 
  @Schema(name = "resultCacheTtlInMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resultCacheTtlInMs")
  public @Nullable ConfigNodePropertyInteger getResultCacheTtlInMs() {
    return resultCacheTtlInMs;
  }

  @JsonProperty("resultCacheTtlInMs")
  public void setResultCacheTtlInMs(@Nullable ConfigNodePropertyInteger resultCacheTtlInMs) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

