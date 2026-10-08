package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties   {
  @JsonProperty("scheduler.period")
  @Valid

  private ConfigNodePropertyInteger schedulerPeriod;

  @JsonProperty("scheduler.concurrent")
  @Valid

  private ConfigNodePropertyBoolean schedulerConcurrent;

  @JsonProperty("service.bad_link_tolerance_interval")
  @Valid

  private ConfigNodePropertyInteger serviceBadLinkToleranceInterval;

  @JsonProperty("service.check_override_patterns")
  @Valid

  private ConfigNodePropertyArray serviceCheckOverridePatterns;

  @JsonProperty("service.cache_broken_internal_links")
  @Valid

  private ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks;

  @JsonProperty("service.special_link_prefix")
  @Valid

  private ConfigNodePropertyArray serviceSpecialLinkPrefix;

  @JsonProperty("service.special_link_patterns")
  @Valid

  private ConfigNodePropertyArray serviceSpecialLinkPatterns;

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

   /**
   * Get schedulerPeriod
   * @return schedulerPeriod
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

