package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties   {

    private ConfigNodePropertyInteger schedulerPeriod;
    private ConfigNodePropertyBoolean schedulerConcurrent;
    private ConfigNodePropertyInteger serviceBadLinkToleranceInterval;
    private ConfigNodePropertyArray serviceCheckOverridePatterns;
    private ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks;
    private ConfigNodePropertyArray serviceSpecialLinkPrefix;
    private ConfigNodePropertyArray serviceSpecialLinkPatterns;

    /**
     * Default constructor.
     */
    public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
     *
     * @param schedulerPeriod schedulerPeriod
     * @param schedulerConcurrent schedulerConcurrent
     * @param serviceBadLinkToleranceInterval serviceBadLinkToleranceInterval
     * @param serviceCheckOverridePatterns serviceCheckOverridePatterns
     * @param serviceCacheBrokenInternalLinks serviceCacheBrokenInternalLinks
     * @param serviceSpecialLinkPrefix serviceSpecialLinkPrefix
     * @param serviceSpecialLinkPatterns serviceSpecialLinkPatterns
     */
    public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(
        ConfigNodePropertyInteger schedulerPeriod, 
        ConfigNodePropertyBoolean schedulerConcurrent, 
        ConfigNodePropertyInteger serviceBadLinkToleranceInterval, 
        ConfigNodePropertyArray serviceCheckOverridePatterns, 
        ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks, 
        ConfigNodePropertyArray serviceSpecialLinkPrefix, 
        ConfigNodePropertyArray serviceSpecialLinkPatterns
    ) {
        this.schedulerPeriod = schedulerPeriod;
        this.schedulerConcurrent = schedulerConcurrent;
        this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
        this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
        this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
        this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
        this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
    }



    /**
     * Get schedulerPeriod
     * @return schedulerPeriod
     */
    public ConfigNodePropertyInteger getSchedulerPeriod() {
        return schedulerPeriod;
    }

    public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
        this.schedulerPeriod = schedulerPeriod;
    }

    /**
     * Get schedulerConcurrent
     * @return schedulerConcurrent
     */
    public ConfigNodePropertyBoolean getSchedulerConcurrent() {
        return schedulerConcurrent;
    }

    public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
        this.schedulerConcurrent = schedulerConcurrent;
    }

    /**
     * Get serviceBadLinkToleranceInterval
     * @return serviceBadLinkToleranceInterval
     */
    public ConfigNodePropertyInteger getServiceBadLinkToleranceInterval() {
        return serviceBadLinkToleranceInterval;
    }

    public void setServiceBadLinkToleranceInterval(ConfigNodePropertyInteger serviceBadLinkToleranceInterval) {
        this.serviceBadLinkToleranceInterval = serviceBadLinkToleranceInterval;
    }

    /**
     * Get serviceCheckOverridePatterns
     * @return serviceCheckOverridePatterns
     */
    public ConfigNodePropertyArray getServiceCheckOverridePatterns() {
        return serviceCheckOverridePatterns;
    }

    public void setServiceCheckOverridePatterns(ConfigNodePropertyArray serviceCheckOverridePatterns) {
        this.serviceCheckOverridePatterns = serviceCheckOverridePatterns;
    }

    /**
     * Get serviceCacheBrokenInternalLinks
     * @return serviceCacheBrokenInternalLinks
     */
    public ConfigNodePropertyBoolean getServiceCacheBrokenInternalLinks() {
        return serviceCacheBrokenInternalLinks;
    }

    public void setServiceCacheBrokenInternalLinks(ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks) {
        this.serviceCacheBrokenInternalLinks = serviceCacheBrokenInternalLinks;
    }

    /**
     * Get serviceSpecialLinkPrefix
     * @return serviceSpecialLinkPrefix
     */
    public ConfigNodePropertyArray getServiceSpecialLinkPrefix() {
        return serviceSpecialLinkPrefix;
    }

    public void setServiceSpecialLinkPrefix(ConfigNodePropertyArray serviceSpecialLinkPrefix) {
        this.serviceSpecialLinkPrefix = serviceSpecialLinkPrefix;
    }

    /**
     * Get serviceSpecialLinkPatterns
     * @return serviceSpecialLinkPatterns
     */
    public ConfigNodePropertyArray getServiceSpecialLinkPatterns() {
        return serviceSpecialLinkPatterns;
    }

    public void setServiceSpecialLinkPatterns(ConfigNodePropertyArray serviceSpecialLinkPatterns) {
        this.serviceSpecialLinkPatterns = serviceSpecialLinkPatterns;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

