package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties   {
  @JsonProperty("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression = null;

  @JsonProperty("scheduler.concurrent")
  private ConfigNodePropertyBoolean schedulerConcurrent = null;

  public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

   /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @Valid
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

   /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
  **/
  @Valid
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

