package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties   {
  
  private ConfigNodePropertyArray reportingservicesProxyWhitelist = null;

  public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties () {

  }

  public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties (ConfigNodePropertyArray reportingservicesProxyWhitelist) {
    this.reportingservicesProxyWhitelist = reportingservicesProxyWhitelist;
  }

    
  @JsonProperty("reportingservices.proxy.whitelist")
  public ConfigNodePropertyArray getReportingservicesProxyWhitelist() {
    return reportingservicesProxyWhitelist;
  }
  public void setReportingservicesProxyWhitelist(ConfigNodePropertyArray reportingservicesProxyWhitelist) {
    this.reportingservicesProxyWhitelist = reportingservicesProxyWhitelist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties = (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties) o;
    return Objects.equals(reportingservicesProxyWhitelist, comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.reportingservicesProxyWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportingservicesProxyWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties {\n");
    
    sb.append("    reportingservicesProxyWhitelist: ").append(toIndentedString(reportingservicesProxyWhitelist)).append("\n");
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
