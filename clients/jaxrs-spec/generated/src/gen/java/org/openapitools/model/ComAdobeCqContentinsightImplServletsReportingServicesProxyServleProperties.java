package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties   {
  private ConfigNodePropertyArray reportingservicesProxyWhitelist;

  public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties() {
  }

  /**
   **/
  public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties reportingservicesProxyWhitelist(ConfigNodePropertyArray reportingservicesProxyWhitelist) {
    this.reportingservicesProxyWhitelist = reportingservicesProxyWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("reportingservices.proxy.whitelist")
  @Valid public ConfigNodePropertyArray getReportingservicesProxyWhitelist() {
    return reportingservicesProxyWhitelist;
  }

  @JsonProperty("reportingservices.proxy.whitelist")
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
