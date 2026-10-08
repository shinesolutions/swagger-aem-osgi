package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties   {
  
  private ConfigNodePropertyString poolName;
  private ConfigNodePropertyArray allowedPoolNames;
  private ConfigNodePropertyBoolean schedulerUseleaderforsingle;
  private ConfigNodePropertyArray metricsFilters;
  private ConfigNodePropertyInteger slowThresholdMillis;

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties () {

  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties (ConfigNodePropertyString poolName, ConfigNodePropertyArray allowedPoolNames, ConfigNodePropertyBoolean schedulerUseleaderforsingle, ConfigNodePropertyArray metricsFilters, ConfigNodePropertyInteger slowThresholdMillis) {
    this.poolName = poolName;
    this.allowedPoolNames = allowedPoolNames;
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
    this.metricsFilters = metricsFilters;
    this.slowThresholdMillis = slowThresholdMillis;
  }

    
  @JsonProperty("poolName")
  public ConfigNodePropertyString getPoolName() {
    return poolName;
  }
  public void setPoolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
  }

    
  @JsonProperty("allowedPoolNames")
  public ConfigNodePropertyArray getAllowedPoolNames() {
    return allowedPoolNames;
  }
  public void setAllowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
  }

    
  @JsonProperty("scheduler.useleaderforsingle")
  public ConfigNodePropertyBoolean getSchedulerUseleaderforsingle() {
    return schedulerUseleaderforsingle;
  }
  public void setSchedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
  }

    
  @JsonProperty("metrics.filters")
  public ConfigNodePropertyArray getMetricsFilters() {
    return metricsFilters;
  }
  public void setMetricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
