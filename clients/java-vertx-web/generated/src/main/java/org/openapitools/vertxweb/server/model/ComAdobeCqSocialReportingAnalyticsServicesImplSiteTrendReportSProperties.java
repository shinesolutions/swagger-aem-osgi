package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties   {
  
  private ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping;
  private ConfigNodePropertyInteger priority;

  public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties () {

  }

  public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties (ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping, ConfigNodePropertyInteger priority) {
    this.cqSocialConsoleAnalyticsSitesMapping = cqSocialConsoleAnalyticsSitesMapping;
    this.priority = priority;
  }

    
  @JsonProperty("cq.social.console.analytics.sites.mapping")
  public ConfigNodePropertyArray getCqSocialConsoleAnalyticsSitesMapping() {
    return cqSocialConsoleAnalyticsSitesMapping;
  }
  public void setCqSocialConsoleAnalyticsSitesMapping(ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping) {
    this.cqSocialConsoleAnalyticsSitesMapping = cqSocialConsoleAnalyticsSitesMapping;
  }

    
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }
  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
