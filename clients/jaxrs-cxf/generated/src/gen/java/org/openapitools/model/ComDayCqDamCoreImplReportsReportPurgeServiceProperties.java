package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreImplReportsReportPurgeServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString schedulerExpression = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxSavedReports = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger timeDuration = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableReportPurge = null;
 /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

 /**
   * Get maxSavedReports
   * @return maxSavedReports
  **/
  @JsonProperty("maxSavedReports")
  public ConfigNodePropertyInteger getMaxSavedReports() {
    return maxSavedReports;
  }

  public void setMaxSavedReports(ConfigNodePropertyInteger maxSavedReports) {
    this.maxSavedReports = maxSavedReports;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties maxSavedReports(ConfigNodePropertyInteger maxSavedReports) {
    this.maxSavedReports = maxSavedReports;
    return this;
  }

 /**
   * Get timeDuration
   * @return timeDuration
  **/
  @JsonProperty("timeDuration")
  public ConfigNodePropertyInteger getTimeDuration() {
    return timeDuration;
  }

  public void setTimeDuration(ConfigNodePropertyInteger timeDuration) {
    this.timeDuration = timeDuration;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties timeDuration(ConfigNodePropertyInteger timeDuration) {
    this.timeDuration = timeDuration;
    return this;
  }

 /**
   * Get enableReportPurge
   * @return enableReportPurge
  **/
  @JsonProperty("enableReportPurge")
  public ConfigNodePropertyBoolean getEnableReportPurge() {
    return enableReportPurge;
  }

  public void setEnableReportPurge(ConfigNodePropertyBoolean enableReportPurge) {
    this.enableReportPurge = enableReportPurge;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties enableReportPurge(ConfigNodePropertyBoolean enableReportPurge) {
    this.enableReportPurge = enableReportPurge;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {\n");
    
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    maxSavedReports: ").append(toIndentedString(maxSavedReports)).append("\n");
    sb.append("    timeDuration: ").append(toIndentedString(timeDuration)).append("\n");
    sb.append("    enableReportPurge: ").append(toIndentedString(enableReportPurge)).append("\n");
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

