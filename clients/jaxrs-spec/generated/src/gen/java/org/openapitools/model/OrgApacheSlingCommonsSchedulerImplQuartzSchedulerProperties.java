package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties   {
  private ConfigNodePropertyString poolName;
  private ConfigNodePropertyArray allowedPoolNames;
  private ConfigNodePropertyBoolean schedulerUseleaderforsingle;
  private ConfigNodePropertyArray metricsFilters;
  private ConfigNodePropertyInteger slowThresholdMillis;

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties() {
  }

  /**
   **/
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties poolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("poolName")
  @Valid public ConfigNodePropertyString getPoolName() {
    return poolName;
  }

  @JsonProperty("poolName")
  public void setPoolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
  }

  /**
   **/
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties allowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedPoolNames")
  @Valid public ConfigNodePropertyArray getAllowedPoolNames() {
    return allowedPoolNames;
  }

  @JsonProperty("allowedPoolNames")
  public void setAllowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
  }

  /**
   **/
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties schedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.useleaderforsingle")
  @Valid public ConfigNodePropertyBoolean getSchedulerUseleaderforsingle() {
    return schedulerUseleaderforsingle;
  }

  @JsonProperty("scheduler.useleaderforsingle")
  public void setSchedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
  }

  /**
   **/
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties metricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("metrics.filters")
  @Valid public ConfigNodePropertyArray getMetricsFilters() {
    return metricsFilters;
  }

  @JsonProperty("metrics.filters")
  public void setMetricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  /**
   **/
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties slowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis) {
    this.slowThresholdMillis = slowThresholdMillis;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("slowThresholdMillis")
  @Valid public ConfigNodePropertyInteger getSlowThresholdMillis() {
    return slowThresholdMillis;
  }

  @JsonProperty("slowThresholdMillis")
  public void setSlowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
