package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties   {
  @JsonProperty("report.fetch.delay")
  @Valid

  private ConfigNodePropertyInteger reportFetchDelay;

  public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties reportFetchDelay(ConfigNodePropertyInteger reportFetchDelay) {
    this.reportFetchDelay = reportFetchDelay;
    return this;
  }

   /**
   * Get reportFetchDelay
   * @return reportFetchDelay
  **/
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
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties = (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties) o;
    return Objects.equals(reportFetchDelay, comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.reportFetchDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportFetchDelay);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

