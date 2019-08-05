package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamCoreImplReportsReportPurgeServiceProperties   {
  
  private ConfigNodePropertyString schedulerExpression = null;
  private ConfigNodePropertyInteger maxSavedReports = null;
  private ConfigNodePropertyInteger timeDuration = null;
  private ConfigNodePropertyBoolean enableReportPurge = null;

  /**
   **/
  
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

