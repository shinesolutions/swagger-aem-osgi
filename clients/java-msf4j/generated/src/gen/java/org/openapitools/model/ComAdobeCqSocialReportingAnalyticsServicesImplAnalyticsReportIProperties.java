package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties   {
  @JsonProperty("cq.social.reporting.analytics.polling.importer.interval")
  private ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval;

  @JsonProperty("cq.social.reporting.analytics.polling.importer.pageSize")
  private ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize;

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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

