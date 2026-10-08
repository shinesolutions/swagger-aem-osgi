package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger schedulerPeriod;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean schedulerConcurrent;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger serviceBadLinkToleranceInterval;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray serviceCheckOverridePatterns;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray serviceSpecialLinkPrefix;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray serviceSpecialLinkPatterns;
 /**
  * Get schedulerPeriod
  * @return schedulerPeriod
  */
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  /**
   * Sets the <code>schedulerPeriod</code> property.
   */
 public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  /**
   * Sets the <code>schedulerPeriod</code> property.
   */
  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

 /**
  * Get schedulerConcurrent
  * @return schedulerConcurrent
  */
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  /**
   * Sets the <code>schedulerConcurrent</code> property.
   */
 public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  /**
   * Sets the <code>schedulerConcurrent</code> property.
   */
  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

 /**
  * Get serviceBadLinkToleranceInterval
  * @return serviceBadLinkToleranceInterval
  */
  @JsonProperty("service.bad_link_tolerance_interval")
  public ConfigNodePropertyInteger getServiceBadLinkToleranceInterval() {
    return serviceBadLinkToleranceInterval;
  }

  /**
   * Sets the <code>serviceBadLinkToleranceInterval</code> property.
   */
 public void setServiceBadLinkToleranceInterval(ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
  }

  /**
   * Sets the <code>serviceBadLinkToleranceInterval</code> property.
   */
  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceBadLinkToleranceInterval(ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
    return this;
  }

 /**
  * Get serviceCheckOverridePatterns
  * @return serviceCheckOverridePatterns
  */
  @JsonProperty("service.check_override_patterns")
  public ConfigNodePropertyArray getServiceCheckOverridePatterns() {
    return serviceCheckOverridePatterns;
  }

  /**
   * Sets the <code>serviceCheckOverridePatterns</code> property.
   */
 public void setServiceCheckOverridePatterns(ConfigNodePropertyArray serviceCheckOverridePatterns) {
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
  }

  /**
   * Sets the <code>serviceCheckOverridePatterns</code> property.
   */
  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceCheckOverridePatterns(ConfigNodePropertyArray serviceCheckOverridePatterns) {
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
    return this;
  }

 /**
  * Get serviceCacheBrokenInternalLinks
  * @return serviceCacheBrokenInternalLinks
  */
  @JsonProperty("service.cache_broken_internal_links")
  public ConfigNodePropertyBoolean getServiceCacheBrokenInternalLinks() {
    return serviceCacheBrokenInternalLinks;
  }

  /**
   * Sets the <code>serviceCacheBrokenInternalLinks</code> property.
   */
 public void setServiceCacheBrokenInternalLinks(ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
  }

  /**
   * Sets the <code>serviceCacheBrokenInternalLinks</code> property.
   */
  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceCacheBrokenInternalLinks(ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
    return this;
  }

 /**
  * Get serviceSpecialLinkPrefix
  * @return serviceSpecialLinkPrefix
  */
  @JsonProperty("service.special_link_prefix")
  public ConfigNodePropertyArray getServiceSpecialLinkPrefix() {
    return serviceSpecialLinkPrefix;
  }

  /**
   * Sets the <code>serviceSpecialLinkPrefix</code> property.
   */
 public void setServiceSpecialLinkPrefix(ConfigNodePropertyArray serviceSpecialLinkPrefix) {
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
  }

  /**
   * Sets the <code>serviceSpecialLinkPrefix</code> property.
   */
  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceSpecialLinkPrefix(ConfigNodePropertyArray serviceSpecialLinkPrefix) {
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
    return this;
  }

 /**
  * Get serviceSpecialLinkPatterns
  * @return serviceSpecialLinkPatterns
  */
  @JsonProperty("service.special_link_patterns")
  public ConfigNodePropertyArray getServiceSpecialLinkPatterns() {
    return serviceSpecialLinkPatterns;
  }

  /**
   * Sets the <code>serviceSpecialLinkPatterns</code> property.
   */
 public void setServiceSpecialLinkPatterns(ConfigNodePropertyArray serviceSpecialLinkPatterns) {
    this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
  }

  /**
   * Sets the <code>serviceSpecialLinkPatterns</code> property.
   */
  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceSpecialLinkPatterns(ConfigNodePropertyArray serviceSpecialLinkPatterns) {
    this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

