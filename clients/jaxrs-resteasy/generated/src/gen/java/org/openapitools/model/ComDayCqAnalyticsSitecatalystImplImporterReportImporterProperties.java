package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties   {
  
  private ConfigNodePropertyInteger reportFetchAttempts = null;
  private ConfigNodePropertyInteger reportFetchDelay = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("report.fetch.attempts")
  public ConfigNodePropertyInteger getReportFetchAttempts() {
    return reportFetchAttempts;
  }
  public void setReportFetchAttempts(ConfigNodePropertyInteger reportFetchAttempts) {
    this.reportFetchAttempts = reportFetchAttempts;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("report.fetch.delay")
  public ConfigNodePropertyInteger getReportFetchDelay() {
    return reportFetchDelay;
  }
  public void setReportFetchDelay(ConfigNodePropertyInteger reportFetchDelay) {
    this.reportFetchDelay = reportFetchDelay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties comDayCqAnalyticsSitecatalystImplImporterReportImporterProperties = (ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties) o;
    return Objects.equals(reportFetchAttempts, comDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.reportFetchAttempts) &&
        Objects.equals(reportFetchDelay, comDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.reportFetchDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportFetchAttempts, reportFetchDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties {\n");
    
    sb.append("    reportFetchAttempts: ").append(toIndentedString(reportFetchAttempts)).append("\n");
    sb.append("    reportFetchDelay: ").append(toIndentedString(reportFetchDelay)).append("\n");
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

