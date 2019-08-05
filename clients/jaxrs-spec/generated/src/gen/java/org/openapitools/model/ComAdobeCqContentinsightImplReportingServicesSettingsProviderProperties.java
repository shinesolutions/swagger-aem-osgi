package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties   {
  
  private @Valid ConfigNodePropertyString reportingservicesUrl = null;

  /**
   **/
  public ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties reportingservicesUrl(ConfigNodePropertyString reportingservicesUrl) {
    this.reportingservicesUrl = reportingservicesUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("reportingservices.url")
  public ConfigNodePropertyString getReportingservicesUrl() {
    return reportingservicesUrl;
  }
  public void setReportingservicesUrl(ConfigNodePropertyString reportingservicesUrl) {
    this.reportingservicesUrl = reportingservicesUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

