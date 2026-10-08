package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
 */

@JsonTypeName("comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger schedulerPeriod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean schedulerConcurrent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger serviceBadLinkToleranceInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray serviceCheckOverridePatterns;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray serviceSpecialLinkPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray serviceSpecialLinkPatterns;

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties schedulerPeriod(@Nullable ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

  /**
   * Get schedulerPeriod
   * @return schedulerPeriod
   */
  @Valid 
  @Schema(name = "scheduler.period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.period")
  public @Nullable ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  @JsonProperty("scheduler.period")
  public void setSchedulerPeriod(@Nullable ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties schedulerConcurrent(@Nullable ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

  /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
   */
  @Valid 
  @Schema(name = "scheduler.concurrent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.concurrent")
  public @Nullable ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  @JsonProperty("scheduler.concurrent")
  public void setSchedulerConcurrent(@Nullable ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceBadLinkToleranceInterval(@Nullable ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
    return this;
  }

  /**
   * Get serviceBadLinkToleranceInterval
   * @return serviceBadLinkToleranceInterval
   */
  @Valid 
  @Schema(name = "service.bad_link_tolerance_interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.bad_link_tolerance_interval")
  public @Nullable ConfigNodePropertyInteger getServiceBadLinkToleranceInterval() {
    return serviceBadLinkToleranceInterval;
  }

  @JsonProperty("service.bad_link_tolerance_interval")
  public void setServiceBadLinkToleranceInterval(@Nullable ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceCheckOverridePatterns(@Nullable ConfigNodePropertyArray serviceCheckOverridePatterns) {
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
    return this;
  }

  /**
   * Get serviceCheckOverridePatterns
   * @return serviceCheckOverridePatterns
   */
  @Valid 
  @Schema(name = "service.check_override_patterns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.check_override_patterns")
  public @Nullable ConfigNodePropertyArray getServiceCheckOverridePatterns() {
    return serviceCheckOverridePatterns;
  }

  @JsonProperty("service.check_override_patterns")
  public void setServiceCheckOverridePatterns(@Nullable ConfigNodePropertyArray serviceCheckOverridePatterns) {
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceCacheBrokenInternalLinks(@Nullable ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
    return this;
  }

  /**
   * Get serviceCacheBrokenInternalLinks
   * @return serviceCacheBrokenInternalLinks
   */
  @Valid 
  @Schema(name = "service.cache_broken_internal_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.cache_broken_internal_links")
  public @Nullable ConfigNodePropertyBoolean getServiceCacheBrokenInternalLinks() {
    return serviceCacheBrokenInternalLinks;
  }

  @JsonProperty("service.cache_broken_internal_links")
  public void setServiceCacheBrokenInternalLinks(@Nullable ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceSpecialLinkPrefix(@Nullable ConfigNodePropertyArray serviceSpecialLinkPrefix) {
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
    return this;
  }

  /**
   * Get serviceSpecialLinkPrefix
   * @return serviceSpecialLinkPrefix
   */
  @Valid 
  @Schema(name = "service.special_link_prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.special_link_prefix")
  public @Nullable ConfigNodePropertyArray getServiceSpecialLinkPrefix() {
    return serviceSpecialLinkPrefix;
  }

  @JsonProperty("service.special_link_prefix")
  public void setServiceSpecialLinkPrefix(@Nullable ConfigNodePropertyArray serviceSpecialLinkPrefix) {
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceSpecialLinkPatterns(@Nullable ConfigNodePropertyArray serviceSpecialLinkPatterns) {
    this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
    return this;
  }

  /**
   * Get serviceSpecialLinkPatterns
   * @return serviceSpecialLinkPatterns
   */
  @Valid 
  @Schema(name = "service.special_link_patterns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.special_link_patterns")
  public @Nullable ConfigNodePropertyArray getServiceSpecialLinkPatterns() {
    return serviceSpecialLinkPatterns;
  }

  @JsonProperty("service.special_link_patterns")
  public void setServiceSpecialLinkPatterns(@Nullable ConfigNodePropertyArray serviceSpecialLinkPatterns) {
    this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties = (ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties) o;
    return Objects.equals(this.schedulerPeriod, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.schedulerPeriod) &&
        Objects.equals(this.schedulerConcurrent, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.schedulerConcurrent) &&
        Objects.equals(this.serviceBadLinkToleranceInterval, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceBadLinkToleranceInterval) &&
        Objects.equals(this.serviceCheckOverridePatterns, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceCheckOverridePatterns) &&
        Objects.equals(this.serviceCacheBrokenInternalLinks, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceCacheBrokenInternalLinks) &&
        Objects.equals(this.serviceSpecialLinkPrefix, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceSpecialLinkPrefix) &&
        Objects.equals(this.serviceSpecialLinkPatterns, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceSpecialLinkPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerPeriod, schedulerConcurrent, serviceBadLinkToleranceInterval, serviceCheckOverridePatterns, serviceCacheBrokenInternalLinks, serviceSpecialLinkPrefix, serviceSpecialLinkPatterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {\n");
    sb.append("    schedulerPeriod: ").append(toIndentedString(schedulerPeriod)).append("\n");
    sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
    sb.append("    serviceBadLinkToleranceInterval: ").append(toIndentedString(serviceBadLinkToleranceInterval)).append("\n");
    sb.append("    serviceCheckOverridePatterns: ").append(toIndentedString(serviceCheckOverridePatterns)).append("\n");
    sb.append("    serviceCacheBrokenInternalLinks: ").append(toIndentedString(serviceCacheBrokenInternalLinks)).append("\n");
    sb.append("    serviceSpecialLinkPrefix: ").append(toIndentedString(serviceSpecialLinkPrefix)).append("\n");
    sb.append("    serviceSpecialLinkPatterns: ").append(toIndentedString(serviceSpecialLinkPatterns)).append("\n");
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

