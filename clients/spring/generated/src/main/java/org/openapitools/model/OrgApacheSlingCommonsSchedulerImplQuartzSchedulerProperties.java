package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
 */

@JsonTypeName("orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString poolName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray allowedPoolNames;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean schedulerUseleaderforsingle;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray metricsFilters;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger slowThresholdMillis;

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties poolName(@Nullable ConfigNodePropertyString poolName) {
    this.poolName = poolName;
    return this;
  }

  /**
   * Get poolName
   * @return poolName
   */
  @Valid 
  @Schema(name = "poolName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poolName")
  public @Nullable ConfigNodePropertyString getPoolName() {
    return poolName;
  }

  @JsonProperty("poolName")
  public void setPoolName(@Nullable ConfigNodePropertyString poolName) {
    this.poolName = poolName;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties allowedPoolNames(@Nullable ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
    return this;
  }

  /**
   * Get allowedPoolNames
   * @return allowedPoolNames
   */
  @Valid 
  @Schema(name = "allowedPoolNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedPoolNames")
  public @Nullable ConfigNodePropertyArray getAllowedPoolNames() {
    return allowedPoolNames;
  }

  @JsonProperty("allowedPoolNames")
  public void setAllowedPoolNames(@Nullable ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties schedulerUseleaderforsingle(@Nullable ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
    return this;
  }

  /**
   * Get schedulerUseleaderforsingle
   * @return schedulerUseleaderforsingle
   */
  @Valid 
  @Schema(name = "scheduler.useleaderforsingle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.useleaderforsingle")
  public @Nullable ConfigNodePropertyBoolean getSchedulerUseleaderforsingle() {
    return schedulerUseleaderforsingle;
  }

  @JsonProperty("scheduler.useleaderforsingle")
  public void setSchedulerUseleaderforsingle(@Nullable ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties metricsFilters(@Nullable ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
    return this;
  }

  /**
   * Get metricsFilters
   * @return metricsFilters
   */
  @Valid 
  @Schema(name = "metrics.filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metrics.filters")
  public @Nullable ConfigNodePropertyArray getMetricsFilters() {
    return metricsFilters;
  }

  @JsonProperty("metrics.filters")
  public void setMetricsFilters(@Nullable ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties slowThresholdMillis(@Nullable ConfigNodePropertyInteger slowThresholdMillis) {
    this.slowThresholdMillis = slowThresholdMillis;
    return this;
  }

  /**
   * Get slowThresholdMillis
   * @return slowThresholdMillis
   */
  @Valid 
  @Schema(name = "slowThresholdMillis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slowThresholdMillis")
  public @Nullable ConfigNodePropertyInteger getSlowThresholdMillis() {
    return slowThresholdMillis;
  }

  @JsonProperty("slowThresholdMillis")
  public void setSlowThresholdMillis(@Nullable ConfigNodePropertyInteger slowThresholdMillis) {
    this.slowThresholdMillis = slowThresholdMillis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties = (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties) o;
    return Objects.equals(this.poolName, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.poolName) &&
        Objects.equals(this.allowedPoolNames, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.allowedPoolNames) &&
        Objects.equals(this.schedulerUseleaderforsingle, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.schedulerUseleaderforsingle) &&
        Objects.equals(this.metricsFilters, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.metricsFilters) &&
        Objects.equals(this.slowThresholdMillis, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.slowThresholdMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolName, allowedPoolNames, schedulerUseleaderforsingle, metricsFilters, slowThresholdMillis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {\n");
    sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
    sb.append("    allowedPoolNames: ").append(toIndentedString(allowedPoolNames)).append("\n");
    sb.append("    schedulerUseleaderforsingle: ").append(toIndentedString(schedulerUseleaderforsingle)).append("\n");
    sb.append("    metricsFilters: ").append(toIndentedString(metricsFilters)).append("\n");
    sb.append("    slowThresholdMillis: ").append(toIndentedString(slowThresholdMillis)).append("\n");
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

