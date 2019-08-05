package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties   {
  @JsonProperty("scheduler.period")
  private ConfigNodePropertyInteger schedulerPeriod = null;

  @JsonProperty("scheduler.concurrent")
  private ConfigNodePropertyBoolean schedulerConcurrent = null;

  @JsonProperty("service.bad_link_tolerance_interval")
  private ConfigNodePropertyInteger serviceBadLinkToleranceInterval = null;

  @JsonProperty("service.check_override_patterns")
  private ConfigNodePropertyArray serviceCheckOverridePatterns = null;

  @JsonProperty("service.cache_broken_internal_links")
  private ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks = null;

  @JsonProperty("service.special_link_prefix")
  private ConfigNodePropertyArray serviceSpecialLinkPrefix = null;

  @JsonProperty("service.special_link_patterns")
  private ConfigNodePropertyArray serviceSpecialLinkPatterns = null;

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

   /**
   * Get schedulerPeriod
   * @return schedulerPeriod
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

   /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceBadLinkToleranceInterval(ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
    return this;
  }

   /**
   * Get serviceBadLinkToleranceInterval
   * @return serviceBadLinkToleranceInterval
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getServiceBadLinkToleranceInterval() {
    return serviceBadLinkToleranceInterval;
  }

  public void setServiceBadLinkToleranceInterval(ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceCheckOverridePatterns(ConfigNodePropertyArray serviceCheckOverridePatterns) {
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
    return this;
  }

   /**
   * Get serviceCheckOverridePatterns
   * @return serviceCheckOverridePatterns
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getServiceCheckOverridePatterns() {
    return serviceCheckOverridePatterns;
  }

  public void setServiceCheckOverridePatterns(ConfigNodePropertyArray serviceCheckOverridePatterns) {
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceCacheBrokenInternalLinks(ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
    return this;
  }

   /**
   * Get serviceCacheBrokenInternalLinks
   * @return serviceCacheBrokenInternalLinks
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getServiceCacheBrokenInternalLinks() {
    return serviceCacheBrokenInternalLinks;
  }

  public void setServiceCacheBrokenInternalLinks(ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceSpecialLinkPrefix(ConfigNodePropertyArray serviceSpecialLinkPrefix) {
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
    return this;
  }

   /**
   * Get serviceSpecialLinkPrefix
   * @return serviceSpecialLinkPrefix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getServiceSpecialLinkPrefix() {
    return serviceSpecialLinkPrefix;
  }

  public void setServiceSpecialLinkPrefix(ConfigNodePropertyArray serviceSpecialLinkPrefix) {
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceSpecialLinkPatterns(ConfigNodePropertyArray serviceSpecialLinkPatterns) {
    this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
    return this;
  }

   /**
   * Get serviceSpecialLinkPatterns
   * @return serviceSpecialLinkPatterns
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getServiceSpecialLinkPatterns() {
    return serviceSpecialLinkPatterns;
  }

  public void setServiceSpecialLinkPatterns(ConfigNodePropertyArray serviceSpecialLinkPatterns) {
    this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

