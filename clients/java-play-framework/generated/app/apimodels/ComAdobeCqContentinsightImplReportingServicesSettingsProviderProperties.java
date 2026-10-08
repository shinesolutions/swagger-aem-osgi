package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties   {
  @JsonProperty("reportingservices.url")
  @Valid

  private ConfigNodePropertyString reportingservicesUrl;

  public ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties reportingservicesUrl(ConfigNodePropertyString reportingservicesUrl) {
    this.reportingservicesUrl = reportingservicesUrl;
    return this;
  }

   /**
   * Get reportingservicesUrl
   * @return reportingservicesUrl
  **/
  public ConfigNodePropertyString getReportingservicesUrl() {
    return reportingservicesUrl;
  }

  public void setReportingservicesUrl(ConfigNodePropertyString reportingservicesUrl) {
    this.reportingservicesUrl = reportingservicesUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties = (ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties) o;
    return Objects.equals(reportingservicesUrl, comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.reportingservicesUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportingservicesUrl);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties {\n");
    
    sb.append("    reportingservicesUrl: ").append(toIndentedString(reportingservicesUrl)).append("\n");
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

