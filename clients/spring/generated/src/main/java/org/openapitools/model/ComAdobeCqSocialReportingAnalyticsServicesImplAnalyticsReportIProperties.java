package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
 */

@JsonTypeName("comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize;

  public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties cqSocialReportingAnalyticsPollingImporterInterval(@Nullable ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval) {
    this.cqSocialReportingAnalyticsPollingImporterInterval = cqSocialReportingAnalyticsPollingImporterInterval;
    return this;
  }

  /**
   * Get cqSocialReportingAnalyticsPollingImporterInterval
   * @return cqSocialReportingAnalyticsPollingImporterInterval
   */
  @Valid 
  @Schema(name = "cq.social.reporting.analytics.polling.importer.interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.social.reporting.analytics.polling.importer.interval")
  public @Nullable ConfigNodePropertyInteger getCqSocialReportingAnalyticsPollingImporterInterval() {
    return cqSocialReportingAnalyticsPollingImporterInterval;
  }

  @JsonProperty("cq.social.reporting.analytics.polling.importer.interval")
  public void setCqSocialReportingAnalyticsPollingImporterInterval(@Nullable ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval) {
    this.cqSocialReportingAnalyticsPollingImporterInterval = cqSocialReportingAnalyticsPollingImporterInterval;
  }

  public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties cqSocialReportingAnalyticsPollingImporterPageSize(@Nullable ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize) {
    this.cqSocialReportingAnalyticsPollingImporterPageSize = cqSocialReportingAnalyticsPollingImporterPageSize;
    return this;
  }

  /**
   * Get cqSocialReportingAnalyticsPollingImporterPageSize
   * @return cqSocialReportingAnalyticsPollingImporterPageSize
   */
  @Valid 
  @Schema(name = "cq.social.reporting.analytics.polling.importer.pageSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.social.reporting.analytics.polling.importer.pageSize")
  public @Nullable ConfigNodePropertyInteger getCqSocialReportingAnalyticsPollingImporterPageSize() {
    return cqSocialReportingAnalyticsPollingImporterPageSize;
  }

  @JsonProperty("cq.social.reporting.analytics.polling.importer.pageSize")
  public void setCqSocialReportingAnalyticsPollingImporterPageSize(@Nullable ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

