package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties   {
  @JsonProperty("reportingservices.proxy.whitelist")
  private ConfigNodePropertyArray reportingservicesProxyWhitelist = null;

  public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties reportingservicesProxyWhitelist(ConfigNodePropertyArray reportingservicesProxyWhitelist) {
    this.reportingservicesProxyWhitelist = reportingservicesProxyWhitelist;
    return this;
  }

   /**
   * Get reportingservicesProxyWhitelist
   * @return reportingservicesProxyWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getReportingservicesProxyWhitelist() {
    return reportingservicesProxyWhitelist;
  }

  public void setReportingservicesProxyWhitelist(ConfigNodePropertyArray reportingservicesProxyWhitelist) {
    this.reportingservicesProxyWhitelist = reportingservicesProxyWhitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

