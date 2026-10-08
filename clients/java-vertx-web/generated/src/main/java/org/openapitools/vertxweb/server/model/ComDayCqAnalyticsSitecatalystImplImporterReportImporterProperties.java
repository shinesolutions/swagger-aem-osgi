package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties   {
  
  private ConfigNodePropertyInteger reportFetchAttempts;
  private ConfigNodePropertyInteger reportFetchDelay;

  public ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties () {

  }

  public ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties (ConfigNodePropertyInteger reportFetchAttempts, ConfigNodePropertyInteger reportFetchDelay) {
    this.reportFetchAttempts = reportFetchAttempts;
    this.reportFetchDelay = reportFetchDelay;
  }

    
  @JsonProperty("report.fetch.attempts")
  public ConfigNodePropertyInteger getReportFetchAttempts() {
    return reportFetchAttempts;
  }
  public void setReportFetchAttempts(ConfigNodePropertyInteger reportFetchAttempts) {
    this.reportFetchAttempts = reportFetchAttempts;
  }

    
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
