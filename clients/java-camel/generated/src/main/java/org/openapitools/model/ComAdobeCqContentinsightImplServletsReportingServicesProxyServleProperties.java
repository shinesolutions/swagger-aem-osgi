package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties
 */

@JsonTypeName("comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties {

  private ConfigNodePropertyArray reportingservicesProxyWhitelist;

  public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties reportingservicesProxyWhitelist(ConfigNodePropertyArray reportingservicesProxyWhitelist) {
    this.reportingservicesProxyWhitelist = reportingservicesProxyWhitelist;
    return this;
  }

  /**
   * Get reportingservicesProxyWhitelist
   * @return reportingservicesProxyWhitelist
   */
  @Valid 
  @Schema(name = "reportingservices.proxy.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.reportingservicesProxyWhitelist, comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.reportingservicesProxyWhitelist);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

