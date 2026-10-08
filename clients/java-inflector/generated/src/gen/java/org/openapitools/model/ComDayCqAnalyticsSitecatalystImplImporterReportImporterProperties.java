package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties   {
  @JsonProperty("report.fetch.attempts")
  private ConfigNodePropertyInteger reportFetchAttempts;

  @JsonProperty("report.fetch.delay")
  private ConfigNodePropertyInteger reportFetchDelay;

  /**
   **/
  public ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties reportFetchAttempts(ConfigNodePropertyInteger reportFetchAttempts) {
    this.reportFetchAttempts = reportFetchAttempts;
    return this;
  }

  
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
  public ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties reportFetchDelay(ConfigNodePropertyInteger reportFetchDelay) {
    this.reportFetchDelay = reportFetchDelay;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("report.fetch.delay")
  public ConfigNodePropertyInteger getReportFetchDelay() {
    return reportFetchDelay;
  }
  public void setReportFetchDelay(ConfigNodePropertyInteger reportFetchDelay) {
    this.reportFetchDelay = reportFetchDelay;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

