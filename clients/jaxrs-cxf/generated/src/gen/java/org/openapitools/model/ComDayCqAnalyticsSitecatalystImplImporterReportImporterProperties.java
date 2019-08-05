package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
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

public class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger reportFetchAttempts = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger reportFetchDelay = null;
 /**
   * Get reportFetchAttempts
   * @return reportFetchAttempts
  **/
  @JsonProperty("report.fetch.attempts")
  public ConfigNodePropertyInteger getReportFetchAttempts() {
    return reportFetchAttempts;
  }

  public void setReportFetchAttempts(ConfigNodePropertyInteger reportFetchAttempts) {
    this.reportFetchAttempts = reportFetchAttempts;
  }

  public ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties reportFetchAttempts(ConfigNodePropertyInteger reportFetchAttempts) {
    this.reportFetchAttempts = reportFetchAttempts;
    return this;
  }

 /**
   * Get reportFetchDelay
   * @return reportFetchDelay
  **/
  @JsonProperty("report.fetch.delay")
  public ConfigNodePropertyInteger getReportFetchDelay() {
    return reportFetchDelay;
  }

  public void setReportFetchDelay(ConfigNodePropertyInteger reportFetchDelay) {
    this.reportFetchDelay = reportFetchDelay;
  }

  public ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties reportFetchDelay(ConfigNodePropertyInteger reportFetchDelay) {
    this.reportFetchDelay = reportFetchDelay;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

