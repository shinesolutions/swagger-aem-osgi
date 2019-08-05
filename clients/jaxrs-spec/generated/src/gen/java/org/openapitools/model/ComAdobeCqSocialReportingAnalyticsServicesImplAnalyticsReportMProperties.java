package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties   {
  
  private @Valid ConfigNodePropertyInteger reportFetchDelay = null;

  /**
   **/
  public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties reportFetchDelay(ConfigNodePropertyInteger reportFetchDelay) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties = (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties) o;
    return Objects.equals(reportFetchDelay, comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.reportFetchDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportFetchDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties {\n");
    
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

