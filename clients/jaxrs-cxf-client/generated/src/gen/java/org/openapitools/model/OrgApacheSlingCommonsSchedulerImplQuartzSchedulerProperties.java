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

public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString poolName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray allowedPoolNames = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean schedulerUseleaderforsingle = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray metricsFilters = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger slowThresholdMillis = null;
 /**
   * Get poolName
   * @return poolName
  **/
  @JsonProperty("poolName")
  public ConfigNodePropertyString getPoolName() {
    return poolName;
  }

  public void setPoolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties poolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
    return this;
  }

 /**
   * Get allowedPoolNames
   * @return allowedPoolNames
  **/
  @JsonProperty("allowedPoolNames")
  public ConfigNodePropertyArray getAllowedPoolNames() {
    return allowedPoolNames;
  }

  public void setAllowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties allowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
    return this;
  }

 /**
   * Get schedulerUseleaderforsingle
   * @return schedulerUseleaderforsingle
  **/
  @JsonProperty("scheduler.useleaderforsingle")
  public ConfigNodePropertyBoolean getSchedulerUseleaderforsingle() {
    return schedulerUseleaderforsingle;
  }

  public void setSchedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties schedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
    return this;
  }

 /**
   * Get metricsFilters
   * @return metricsFilters
  **/
  @JsonProperty("metrics.filters")
  public ConfigNodePropertyArray getMetricsFilters() {
    return metricsFilters;
  }

  public void setMetricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties metricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
    return this;
  }

 /**
   * Get slowThresholdMillis
   * @return slowThresholdMillis
  **/
  @JsonProperty("slowThresholdMillis")
  public ConfigNodePropertyInteger getSlowThresholdMillis() {
    return slowThresholdMillis;
  }

  public void setSlowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis) {
    this.slowThresholdMillis = slowThresholdMillis;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties slowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis) {
    this.slowThresholdMillis = slowThresholdMillis;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

