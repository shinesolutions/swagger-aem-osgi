package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamCoreImplReportsReportPurgeServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamCoreImplReportsReportPurgeServiceProperties   {
  @JsonProperty("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression = null;

  @JsonProperty("maxSavedReports")
  private ConfigNodePropertyInteger maxSavedReports = null;

  @JsonProperty("timeDuration")
  private ConfigNodePropertyInteger timeDuration = null;

  @JsonProperty("enableReportPurge")
  private ConfigNodePropertyBoolean enableReportPurge = null;

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

  /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties maxSavedReports(ConfigNodePropertyInteger maxSavedReports) {
    this.maxSavedReports = maxSavedReports;
    return this;
  }

  /**
   * Get maxSavedReports
   * @return maxSavedReports
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getMaxSavedReports() {
    return maxSavedReports;
  }

  public void setMaxSavedReports(ConfigNodePropertyInteger maxSavedReports) {
    this.maxSavedReports = maxSavedReports;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties timeDuration(ConfigNodePropertyInteger timeDuration) {
    this.timeDuration = timeDuration;
    return this;
  }

  /**
   * Get timeDuration
   * @return timeDuration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getTimeDuration() {
    return timeDuration;
  }

  public void setTimeDuration(ConfigNodePropertyInteger timeDuration) {
    this.timeDuration = timeDuration;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties enableReportPurge(ConfigNodePropertyBoolean enableReportPurge) {
    this.enableReportPurge = enableReportPurge;
    return this;
  }

  /**
   * Get enableReportPurge
   * @return enableReportPurge
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.schedulerExpression, comDayCqDamCoreImplReportsReportPurgeServiceProperties.schedulerExpression) &&
        Objects.equals(this.maxSavedReports, comDayCqDamCoreImplReportsReportPurgeServiceProperties.maxSavedReports) &&
        Objects.equals(this.timeDuration, comDayCqDamCoreImplReportsReportPurgeServiceProperties.timeDuration) &&
        Objects.equals(this.enableReportPurge, comDayCqDamCoreImplReportsReportPurgeServiceProperties.enableReportPurge);
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

