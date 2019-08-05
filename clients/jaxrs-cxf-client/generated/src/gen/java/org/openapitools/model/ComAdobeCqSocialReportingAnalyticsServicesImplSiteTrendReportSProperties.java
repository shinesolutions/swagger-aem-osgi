package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger priority = null;
 /**
   * Get cqSocialConsoleAnalyticsSitesMapping
   * @return cqSocialConsoleAnalyticsSitesMapping
  **/
  @JsonProperty("cq.social.console.analytics.sites.mapping")
  public ConfigNodePropertyArray getCqSocialConsoleAnalyticsSitesMapping() {
    return cqSocialConsoleAnalyticsSitesMapping;
  }

  public void setCqSocialConsoleAnalyticsSitesMapping(ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping) {
    this.cqSocialConsoleAnalyticsSitesMapping = cqSocialConsoleAnalyticsSitesMapping;
  }

  public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties cqSocialConsoleAnalyticsSitesMapping(ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping) {
    this.cqSocialConsoleAnalyticsSitesMapping = cqSocialConsoleAnalyticsSitesMapping;
    return this;
  }

 /**
   * Get priority
   * @return priority
  **/
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }

  public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

