package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties   {
  

  private ConfigNodePropertyString poolName = null;

  private ConfigNodePropertyArray allowedPoolNames = null;

  private ConfigNodePropertyBoolean schedulerUseleaderforsingle = null;

  private ConfigNodePropertyArray metricsFilters = null;

  private ConfigNodePropertyInteger slowThresholdMillis = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("poolName")
  public ConfigNodePropertyString getPoolName() {
    return poolName;
  }
  public void setPoolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedPoolNames")
  public ConfigNodePropertyArray getAllowedPoolNames() {
    return allowedPoolNames;
  }
  public void setAllowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.useleaderforsingle")
  public ConfigNodePropertyBoolean getSchedulerUseleaderforsingle() {
    return schedulerUseleaderforsingle;
  }
  public void setSchedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metrics.filters")
  public ConfigNodePropertyArray getMetricsFilters() {
    return metricsFilters;
  }
  public void setMetricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("slowThresholdMillis")
  public ConfigNodePropertyInteger getSlowThresholdMillis() {
    return slowThresholdMillis;
  }
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
    return Objects.equals(poolName, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.poolName) &&
        Objects.equals(allowedPoolNames, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.allowedPoolNames) &&
        Objects.equals(schedulerUseleaderforsingle, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.schedulerUseleaderforsingle) &&
        Objects.equals(metricsFilters, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.metricsFilters) &&
        Objects.equals(slowThresholdMillis, orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.slowThresholdMillis);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

