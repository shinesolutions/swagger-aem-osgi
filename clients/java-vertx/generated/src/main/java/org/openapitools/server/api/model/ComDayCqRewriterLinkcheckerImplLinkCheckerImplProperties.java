package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties   {
  
  private ConfigNodePropertyInteger schedulerPeriod = null;
  private ConfigNodePropertyBoolean schedulerConcurrent = null;
  private ConfigNodePropertyInteger serviceBadLinkToleranceInterval = null;
  private ConfigNodePropertyArray serviceCheckOverridePatterns = null;
  private ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks = null;
  private ConfigNodePropertyArray serviceSpecialLinkPrefix = null;
  private ConfigNodePropertyArray serviceSpecialLinkPatterns = null;

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties () {

  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties (ConfigNodePropertyInteger schedulerPeriod, ConfigNodePropertyBoolean schedulerConcurrent, ConfigNodePropertyInteger serviceBadLinkToleranceInterval, ConfigNodePropertyArray serviceCheckOverridePatterns, ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks, ConfigNodePropertyArray serviceSpecialLinkPrefix, ConfigNodePropertyArray serviceSpecialLinkPatterns) {
    this.schedulerPeriod = schedulerPeriod;
    this.schedulerConcurrent = schedulerConcurrent;
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
    this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
  }

    
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }
  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

    
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }
  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

    
  @JsonProperty("service.bad_link_tolerance_interval")
  public ConfigNodePropertyInteger getServiceBadLinkToleranceInterval() {
    return serviceBadLinkToleranceInterval;
  }
  public void setServiceBadLinkToleranceInterval(ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
    this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
  }

    
  @JsonProperty("service.check_override_patterns")
  public ConfigNodePropertyArray getServiceCheckOverridePatterns() {
    return serviceCheckOverridePatterns;
  }
  public void setServiceCheckOverridePatterns(ConfigNodePropertyArray serviceCheckOverridePatterns) {
    this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
  }

    
  @JsonProperty("service.cache_broken_internal_links")
  public ConfigNodePropertyBoolean getServiceCacheBrokenInternalLinks() {
    return serviceCacheBrokenInternalLinks;
  }
  public void setServiceCacheBrokenInternalLinks(ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
    this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
  }

    
  @JsonProperty("service.special_link_prefix")
  public ConfigNodePropertyArray getServiceSpecialLinkPrefix() {
    return serviceSpecialLinkPrefix;
  }
  public void setServiceSpecialLinkPrefix(ConfigNodePropertyArray serviceSpecialLinkPrefix) {
    this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
  }

    
  @JsonProperty("service.special_link_patterns")
  public ConfigNodePropertyArray getServiceSpecialLinkPatterns() {
    return serviceSpecialLinkPatterns;
  }
  public void setServiceSpecialLinkPatterns(ConfigNodePropertyArray serviceSpecialLinkPatterns) {
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
    return Objects.equals(schedulerPeriod, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.schedulerPeriod) &&
        Objects.equals(schedulerConcurrent, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.schedulerConcurrent) &&
        Objects.equals(serviceBadLinkToleranceInterval, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceBadLinkToleranceInterval) &&
        Objects.equals(serviceCheckOverridePatterns, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceCheckOverridePatterns) &&
        Objects.equals(serviceCacheBrokenInternalLinks, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceCacheBrokenInternalLinks) &&
        Objects.equals(serviceSpecialLinkPrefix, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceSpecialLinkPrefix) &&
        Objects.equals(serviceSpecialLinkPatterns, comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.serviceSpecialLinkPatterns);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
