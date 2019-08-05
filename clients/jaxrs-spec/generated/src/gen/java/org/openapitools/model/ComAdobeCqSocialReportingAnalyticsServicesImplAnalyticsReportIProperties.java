package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties   {
  
  private @Valid ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval = null;
  private @Valid ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize = null;

  /**
   **/
  public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties cqSocialReportingAnalyticsPollingImporterInterval(ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval) {
    this.cqSocialReportingAnalyticsPollingImporterInterval = cqSocialReportingAnalyticsPollingImporterInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.social.reporting.analytics.polling.importer.interval")
  public ConfigNodePropertyInteger getCqSocialReportingAnalyticsPollingImporterInterval() {
    return cqSocialReportingAnalyticsPollingImporterInterval;
  }
  public void setCqSocialReportingAnalyticsPollingImporterInterval(ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval) {
    this.cqSocialReportingAnalyticsPollingImporterInterval = cqSocialReportingAnalyticsPollingImporterInterval;
  }

  /**
   **/
  public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties cqSocialReportingAnalyticsPollingImporterPageSize(ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize) {
    this.cqSocialReportingAnalyticsPollingImporterPageSize = cqSocialReportingAnalyticsPollingImporterPageSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.social.reporting.analytics.polling.importer.pageSize")
  public ConfigNodePropertyInteger getCqSocialReportingAnalyticsPollingImporterPageSize() {
    return cqSocialReportingAnalyticsPollingImporterPageSize;
  }
  public void setCqSocialReportingAnalyticsPollingImporterPageSize(ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize) {
    this.cqSocialReportingAnalyticsPollingImporterPageSize = cqSocialReportingAnalyticsPollingImporterPageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties = (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties) o;
    return Objects.equals(cqSocialReportingAnalyticsPollingImporterInterval, comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.cqSocialReportingAnalyticsPollingImporterInterval) &&
        Objects.equals(cqSocialReportingAnalyticsPollingImporterPageSize, comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.cqSocialReportingAnalyticsPollingImporterPageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqSocialReportingAnalyticsPollingImporterInterval, cqSocialReportingAnalyticsPollingImporterPageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties {\n");
    
    sb.append("    cqSocialReportingAnalyticsPollingImporterInterval: ").append(toIndentedString(cqSocialReportingAnalyticsPollingImporterInterval)).append("\n");
    sb.append("    cqSocialReportingAnalyticsPollingImporterPageSize: ").append(toIndentedString(cqSocialReportingAnalyticsPollingImporterPageSize)).append("\n");
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

