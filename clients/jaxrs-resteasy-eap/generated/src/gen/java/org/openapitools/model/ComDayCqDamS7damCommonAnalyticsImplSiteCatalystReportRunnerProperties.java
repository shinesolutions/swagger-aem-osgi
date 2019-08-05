package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties   {
  

  private ConfigNodePropertyString schedulerExpression = null;

  private ConfigNodePropertyBoolean schedulerConcurrent = null;

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
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }
  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties = (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties) o;
    return Objects.equals(schedulerExpression, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.schedulerExpression) &&
        Objects.equals(schedulerConcurrent, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.schedulerConcurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, schedulerConcurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties {\n");
    
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
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

