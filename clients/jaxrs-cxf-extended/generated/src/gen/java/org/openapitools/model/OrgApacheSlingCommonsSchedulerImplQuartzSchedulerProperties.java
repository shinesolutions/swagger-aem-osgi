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


public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString poolName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray allowedPoolNames;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean schedulerUseleaderforsingle;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray metricsFilters;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger slowThresholdMillis;
 /**
  * Get poolName
  * @return poolName
  */
  @JsonProperty("poolName")
  public ConfigNodePropertyString getPoolName() {
    return poolName;
  }

  /**
   * Sets the <code>poolName</code> property.
   */
 public void setPoolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
  }

  /**
   * Sets the <code>poolName</code> property.
   */
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties poolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
    return this;
  }

 /**
  * Get allowedPoolNames
  * @return allowedPoolNames
  */
  @JsonProperty("allowedPoolNames")
  public ConfigNodePropertyArray getAllowedPoolNames() {
    return allowedPoolNames;
  }

  /**
   * Sets the <code>allowedPoolNames</code> property.
   */
 public void setAllowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
  }

  /**
   * Sets the <code>allowedPoolNames</code> property.
   */
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties allowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
    return this;
  }

 /**
  * Get schedulerUseleaderforsingle
  * @return schedulerUseleaderforsingle
  */
  @JsonProperty("scheduler.useleaderforsingle")
  public ConfigNodePropertyBoolean getSchedulerUseleaderforsingle() {
    return schedulerUseleaderforsingle;
  }

  /**
   * Sets the <code>schedulerUseleaderforsingle</code> property.
   */
 public void setSchedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
  }

  /**
   * Sets the <code>schedulerUseleaderforsingle</code> property.
   */
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties schedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
    return this;
  }

 /**
  * Get metricsFilters
  * @return metricsFilters
  */
  @JsonProperty("metrics.filters")
  public ConfigNodePropertyArray getMetricsFilters() {
    return metricsFilters;
  }

  /**
   * Sets the <code>metricsFilters</code> property.
   */
 public void setMetricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  /**
   * Sets the <code>metricsFilters</code> property.
   */
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties metricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
    return this;
  }

 /**
  * Get slowThresholdMillis
  * @return slowThresholdMillis
  */
  @JsonProperty("slowThresholdMillis")
  public ConfigNodePropertyInteger getSlowThresholdMillis() {
    return slowThresholdMillis;
  }

  /**
   * Sets the <code>slowThresholdMillis</code> property.
   */
 public void setSlowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis) {
    this.slowThresholdMillis = slowThresholdMillis;
  }

  /**
   * Sets the <code>slowThresholdMillis</code> property.
   */
  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties slowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis) {
    this.slowThresholdMillis = slowThresholdMillis;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

