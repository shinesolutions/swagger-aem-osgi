package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties   {
  @JsonProperty("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression = null;

  @JsonProperty("jmx.objectname")
  private ConfigNodePropertyString jmxObjectname = null;

  public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

   /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties jmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
    return this;
  }

   /**
   * Get jmxObjectname
   * @return jmxObjectname
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }

  public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties = (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties) o;
    return Objects.equals(this.schedulerExpression, comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.schedulerExpression) &&
        Objects.equals(this.jmxObjectname, comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.jmxObjectname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, jmxObjectname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties {\n");
    
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
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

