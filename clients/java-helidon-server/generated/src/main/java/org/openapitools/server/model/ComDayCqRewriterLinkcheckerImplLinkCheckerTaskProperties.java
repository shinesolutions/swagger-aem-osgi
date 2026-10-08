package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties   {

    private ConfigNodePropertyInteger schedulerPeriod;
    private ConfigNodePropertyBoolean schedulerConcurrent;
    private ConfigNodePropertyInteger goodLinkTestInterval;
    private ConfigNodePropertyInteger badLinkTestInterval;
    private ConfigNodePropertyInteger linkUnusedInterval;
    private ConfigNodePropertyInteger connectionTimeout;

    /**
     * Default constructor.
     */
    public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.
     *
     * @param schedulerPeriod schedulerPeriod
     * @param schedulerConcurrent schedulerConcurrent
     * @param goodLinkTestInterval goodLinkTestInterval
     * @param badLinkTestInterval badLinkTestInterval
     * @param linkUnusedInterval linkUnusedInterval
     * @param connectionTimeout connectionTimeout
     */
    public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(
        ConfigNodePropertyInteger schedulerPeriod, 
        ConfigNodePropertyBoolean schedulerConcurrent, 
        ConfigNodePropertyInteger goodLinkTestInterval, 
        ConfigNodePropertyInteger badLinkTestInterval, 
        ConfigNodePropertyInteger linkUnusedInterval, 
        ConfigNodePropertyInteger connectionTimeout
    ) {
        this.schedulerPeriod = schedulerPeriod;
        this.schedulerConcurrent = schedulerConcurrent;
        this.goodLinkTestInterval = goodLinkTestInterval;
        this.badLinkTestInterval = badLinkTestInterval;
        this.linkUnusedInterval = linkUnusedInterval;
        this.connectionTimeout = connectionTimeout;
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
     * Get goodLinkTestInterval
     * @return goodLinkTestInterval
     */
    public ConfigNodePropertyInteger getGoodLinkTestInterval() {
        return goodLinkTestInterval;
    }

    public void setGoodLinkTestInterval(ConfigNodePropertyInteger goodLinkTestInterval) {
        this.goodLinkTestInterval = goodLinkTestInterval;
    }

    /**
     * Get badLinkTestInterval
     * @return badLinkTestInterval
     */
    public ConfigNodePropertyInteger getBadLinkTestInterval() {
        return badLinkTestInterval;
    }

    public void setBadLinkTestInterval(ConfigNodePropertyInteger badLinkTestInterval) {
        this.badLinkTestInterval = badLinkTestInterval;
    }

    /**
     * Get linkUnusedInterval
     * @return linkUnusedInterval
     */
    public ConfigNodePropertyInteger getLinkUnusedInterval() {
        return linkUnusedInterval;
    }

    public void setLinkUnusedInterval(ConfigNodePropertyInteger linkUnusedInterval) {
        this.linkUnusedInterval = linkUnusedInterval;
    }

    /**
     * Get connectionTimeout
     * @return connectionTimeout
     */
    public ConfigNodePropertyInteger getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {\n");
        
        sb.append("    schedulerPeriod: ").append(toIndentedString(schedulerPeriod)).append("\n");
        sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
        sb.append("    goodLinkTestInterval: ").append(toIndentedString(goodLinkTestInterval)).append("\n");
        sb.append("    badLinkTestInterval: ").append(toIndentedString(badLinkTestInterval)).append("\n");
        sb.append("    linkUnusedInterval: ").append(toIndentedString(linkUnusedInterval)).append("\n");
        sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
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

