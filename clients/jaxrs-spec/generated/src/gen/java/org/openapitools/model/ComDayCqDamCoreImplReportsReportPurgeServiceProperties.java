package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplReportsReportPurgeServiceProperties   {
  
  private @Valid ConfigNodePropertyString schedulerExpression = null;
  private @Valid ConfigNodePropertyInteger maxSavedReports = null;
  private @Valid ConfigNodePropertyInteger timeDuration = null;
  private @Valid ConfigNodePropertyBoolean enableReportPurge = null;

  /**
   **/
  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   **/
  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties maxSavedReports(ConfigNodePropertyInteger maxSavedReports) {
    this.maxSavedReports = maxSavedReports;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxSavedReports")
  public ConfigNodePropertyInteger getMaxSavedReports() {
    return maxSavedReports;
  }
  public void setMaxSavedReports(ConfigNodePropertyInteger maxSavedReports) {
    this.maxSavedReports = maxSavedReports;
  }

  /**
   **/
  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties timeDuration(ConfigNodePropertyInteger timeDuration) {
    this.timeDuration = timeDuration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timeDuration")
  public ConfigNodePropertyInteger getTimeDuration() {
    return timeDuration;
  }
  public void setTimeDuration(ConfigNodePropertyInteger timeDuration) {
    this.timeDuration = timeDuration;
  }

  /**
   **/
  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties enableReportPurge(ConfigNodePropertyBoolean enableReportPurge) {
    this.enableReportPurge = enableReportPurge;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableReportPurge")
  public ConfigNodePropertyBoolean getEnableReportPurge() {
    return enableReportPurge;
  }
  public void setEnableReportPurge(ConfigNodePropertyBoolean enableReportPurge) {
    this.enableReportPurge = enableReportPurge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplReportsReportPurgeServiceProperties comDayCqDamCoreImplReportsReportPurgeServiceProperties = (ComDayCqDamCoreImplReportsReportPurgeServiceProperties) o;
    return Objects.equals(schedulerExpression, comDayCqDamCoreImplReportsReportPurgeServiceProperties.schedulerExpression) &&
        Objects.equals(maxSavedReports, comDayCqDamCoreImplReportsReportPurgeServiceProperties.maxSavedReports) &&
        Objects.equals(timeDuration, comDayCqDamCoreImplReportsReportPurgeServiceProperties.timeDuration) &&
        Objects.equals(enableReportPurge, comDayCqDamCoreImplReportsReportPurgeServiceProperties.enableReportPurge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, maxSavedReports, timeDuration, enableReportPurge);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

