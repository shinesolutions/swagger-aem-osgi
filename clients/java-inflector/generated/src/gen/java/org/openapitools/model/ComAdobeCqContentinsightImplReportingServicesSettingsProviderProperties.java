package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties   {
  @JsonProperty("reportingservices.url")
  private ConfigNodePropertyString reportingservicesUrl;

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

