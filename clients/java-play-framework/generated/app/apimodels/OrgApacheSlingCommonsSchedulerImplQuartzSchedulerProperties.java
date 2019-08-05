package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties   {
  @JsonProperty("poolName")
  private ConfigNodePropertyString poolName = null;

  @JsonProperty("allowedPoolNames")
  private ConfigNodePropertyArray allowedPoolNames = null;

  @JsonProperty("scheduler.useleaderforsingle")
  private ConfigNodePropertyBoolean schedulerUseleaderforsingle = null;

  @JsonProperty("metrics.filters")
  private ConfigNodePropertyArray metricsFilters = null;

  @JsonProperty("slowThresholdMillis")
  private ConfigNodePropertyInteger slowThresholdMillis = null;

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties poolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
    return this;
  }

   /**
   * Get poolName
   * @return poolName
  **/
  @Valid
  public ConfigNodePropertyString getPoolName() {
    return poolName;
  }

  public void setPoolName(ConfigNodePropertyString poolName) {
    this.poolName = poolName;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties allowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
    return this;
  }

   /**
   * Get allowedPoolNames
   * @return allowedPoolNames
  **/
  @Valid
  public ConfigNodePropertyArray getAllowedPoolNames() {
    return allowedPoolNames;
  }

  public void setAllowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
    this.allowedPoolNames = allowedPoolNames;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties schedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
    return this;
  }

   /**
   * Get schedulerUseleaderforsingle
   * @return schedulerUseleaderforsingle
  **/
  @Valid
  public ConfigNodePropertyBoolean getSchedulerUseleaderforsingle() {
    return schedulerUseleaderforsingle;
  }

  public void setSchedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
    this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties metricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
    return this;
  }

   /**
   * Get metricsFilters
   * @return metricsFilters
  **/
  @Valid
  public ConfigNodePropertyArray getMetricsFilters() {
    return metricsFilters;
  }

  public void setMetricsFilters(ConfigNodePropertyArray metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties slowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis) {
    this.slowThresholdMillis = slowThresholdMillis;
    return this;
  }

   /**
   * Get slowThresholdMillis
   * @return slowThresholdMillis
  **/
  @Valid
  public ConfigNodePropertyInteger getSlowThresholdMillis() {
    return slowThresholdMillis;
  }

  public void setSlowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis) {
    this.slowThresholdMillis = slowThresholdMillis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

