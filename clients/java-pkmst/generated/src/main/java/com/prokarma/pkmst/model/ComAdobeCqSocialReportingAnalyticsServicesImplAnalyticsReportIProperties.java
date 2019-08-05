package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties   {
  @JsonProperty("cq.social.reporting.analytics.polling.importer.interval")
  private ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval = null;

  @JsonProperty("cq.social.reporting.analytics.polling.importer.pageSize")
  private ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize = null;

  public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties cqSocialReportingAnalyticsPollingImporterInterval(ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval) {
    this.cqSocialReportingAnalyticsPollingImporterInterval = cqSocialReportingAnalyticsPollingImporterInterval;
    return this;
  }

   /**
   * Get cqSocialReportingAnalyticsPollingImporterInterval
   * @return cqSocialReportingAnalyticsPollingImporterInterval
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqSocialReportingAnalyticsPollingImporterInterval() {
    return cqSocialReportingAnalyticsPollingImporterInterval;
  }

  public void setCqSocialReportingAnalyticsPollingImporterInterval(ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval) {
    this.cqSocialReportingAnalyticsPollingImporterInterval = cqSocialReportingAnalyticsPollingImporterInterval;
  }

  public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties cqSocialReportingAnalyticsPollingImporterPageSize(ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize) {
    this.cqSocialReportingAnalyticsPollingImporterPageSize = cqSocialReportingAnalyticsPollingImporterPageSize;
    return this;
  }

   /**
   * Get cqSocialReportingAnalyticsPollingImporterPageSize
   * @return cqSocialReportingAnalyticsPollingImporterPageSize
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.cqSocialReportingAnalyticsPollingImporterInterval, comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.cqSocialReportingAnalyticsPollingImporterInterval) &&
        Objects.equals(this.cqSocialReportingAnalyticsPollingImporterPageSize, comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.cqSocialReportingAnalyticsPollingImporterPageSize);
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

