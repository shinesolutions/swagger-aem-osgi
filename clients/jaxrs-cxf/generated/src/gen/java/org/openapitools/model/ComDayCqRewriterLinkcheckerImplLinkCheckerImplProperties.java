package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger schedulerPeriod = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean schedulerConcurrent = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger serviceBadLinkToleranceInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray serviceCheckOverridePatterns = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray serviceSpecialLinkPrefix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray serviceSpecialLinkPatterns = null;
 /**
   * Get schedulerPeriod
   * @return schedulerPeriod
  **/
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

 /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
  **/
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

 /**
   * Get serviceBadLinkToleranceInterval
   * @return serviceBadLinkToleranceInterval
  **/
  @JsonProperty("service.bad_link_tolerance_interval")
  public ConfigNodePropertyInteger getServiceBadLinkToleranceInterval() {
    return serviceBadLinkToleranceInterval;
  }

  public void setServiceBadLinkToleranceInterval(ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceBadLinkToleranceInterval(ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
    return this;
  }

 /**
   * Get serviceCheckOverridePatterns
   * @return serviceCheckOverridePatterns
  **/
  @JsonProperty("service.check_override_patterns")
  public ConfigNodePropertyArray getServiceCheckOverridePatterns() {
    return serviceCheckOverridePatterns;
  }

  public void setServiceCheckOverridePatterns(ConfigNodePropertyArray serviceCheckOverridePatterns) {
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceCheckOverridePatterns(ConfigNodePropertyArray serviceCheckOverridePatterns) {
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
    return this;
  }

 /**
   * Get serviceCacheBrokenInternalLinks
   * @return serviceCacheBrokenInternalLinks
  **/
  @JsonProperty("service.cache_broken_internal_links")
  public ConfigNodePropertyBoolean getServiceCacheBrokenInternalLinks() {
    return serviceCacheBrokenInternalLinks;
  }

  public void setServiceCacheBrokenInternalLinks(ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceCacheBrokenInternalLinks(ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
    return this;
  }

 /**
   * Get serviceSpecialLinkPrefix
   * @return serviceSpecialLinkPrefix
  **/
  @JsonProperty("service.special_link_prefix")
  public ConfigNodePropertyArray getServiceSpecialLinkPrefix() {
    return serviceSpecialLinkPrefix;
  }

  public void setServiceSpecialLinkPrefix(ConfigNodePropertyArray serviceSpecialLinkPrefix) {
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceSpecialLinkPrefix(ConfigNodePropertyArray serviceSpecialLinkPrefix) {
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
    return this;
  }

 /**
   * Get serviceSpecialLinkPatterns
   * @return serviceSpecialLinkPatterns
  **/
  @JsonProperty("service.special_link_patterns")
  public ConfigNodePropertyArray getServiceSpecialLinkPatterns() {
    return serviceSpecialLinkPatterns;
  }

  public void setServiceSpecialLinkPatterns(ConfigNodePropertyArray serviceSpecialLinkPatterns) {
    this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties serviceSpecialLinkPatterns(ConfigNodePropertyArray serviceSpecialLinkPatterns) {
    this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

