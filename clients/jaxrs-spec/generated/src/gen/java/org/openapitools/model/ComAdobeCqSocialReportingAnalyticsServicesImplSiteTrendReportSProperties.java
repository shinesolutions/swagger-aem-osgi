package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties   {
  
  private @Valid ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping = null;
  private @Valid ConfigNodePropertyInteger priority = null;

  /**
   **/
  public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties cqSocialConsoleAnalyticsSitesMapping(ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping) {
    this.cqSocialConsoleAnalyticsSitesMapping = cqSocialConsoleAnalyticsSitesMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.social.console.analytics.sites.mapping")
  public ConfigNodePropertyArray getCqSocialConsoleAnalyticsSitesMapping() {
    return cqSocialConsoleAnalyticsSitesMapping;
  }
  public void setCqSocialConsoleAnalyticsSitesMapping(ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping) {
    this.cqSocialConsoleAnalyticsSitesMapping = cqSocialConsoleAnalyticsSitesMapping;
  }

  /**
   **/
  public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }
  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties = (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties) o;
    return Objects.equals(cqSocialConsoleAnalyticsSitesMapping, comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.cqSocialConsoleAnalyticsSitesMapping) &&
        Objects.equals(priority, comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqSocialConsoleAnalyticsSitesMapping, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties {\n");
    
    sb.append("    cqSocialConsoleAnalyticsSitesMapping: ").append(toIndentedString(cqSocialConsoleAnalyticsSitesMapping)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

