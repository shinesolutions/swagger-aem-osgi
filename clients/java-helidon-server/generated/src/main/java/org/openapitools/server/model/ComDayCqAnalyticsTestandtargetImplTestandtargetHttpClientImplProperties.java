package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties   {

    private ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl;
    private ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout;
    private ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout;
    private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace;
    private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith;

    /**
     * Default constructor.
     */
    public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.
     *
     * @param cqAnalyticsTestandtargetApiUrl cqAnalyticsTestandtargetApiUrl
     * @param cqAnalyticsTestandtargetTimeout cqAnalyticsTestandtargetTimeout
     * @param cqAnalyticsTestandtargetSockettimeout cqAnalyticsTestandtargetSockettimeout
     * @param cqAnalyticsTestandtargetRecommendationsUrlReplace cqAnalyticsTestandtargetRecommendationsUrlReplace
     * @param cqAnalyticsTestandtargetRecommendationsUrlReplacewith cqAnalyticsTestandtargetRecommendationsUrlReplacewith
     */
    public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(
        ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl, 
        ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout, 
        ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout, 
        ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace, 
        ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith
    ) {
        this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
        this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
        this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
        this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
        this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith = cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
    }



    /**
     * Get cqAnalyticsTestandtargetApiUrl
     * @return cqAnalyticsTestandtargetApiUrl
     */
    public ConfigNodePropertyString getCqAnalyticsTestandtargetApiUrl() {
        return cqAnalyticsTestandtargetApiUrl;
    }

    public void setCqAnalyticsTestandtargetApiUrl(ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
        this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
    }

    /**
     * Get cqAnalyticsTestandtargetTimeout
     * @return cqAnalyticsTestandtargetTimeout
     */
    public ConfigNodePropertyInteger getCqAnalyticsTestandtargetTimeout() {
        return cqAnalyticsTestandtargetTimeout;
    }

    public void setCqAnalyticsTestandtargetTimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout) {
        this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
    }

    /**
     * Get cqAnalyticsTestandtargetSockettimeout
     * @return cqAnalyticsTestandtargetSockettimeout
     */
    public ConfigNodePropertyInteger getCqAnalyticsTestandtargetSockettimeout() {
        return cqAnalyticsTestandtargetSockettimeout;
    }

    public void setCqAnalyticsTestandtargetSockettimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout) {
        this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
    }

    /**
     * Get cqAnalyticsTestandtargetRecommendationsUrlReplace
     * @return cqAnalyticsTestandtargetRecommendationsUrlReplace
     */
    public ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplace() {
        return cqAnalyticsTestandtargetRecommendationsUrlReplace;
    }

    public void setCqAnalyticsTestandtargetRecommendationsUrlReplace(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace) {
        this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
    }

    /**
     * Get cqAnalyticsTestandtargetRecommendationsUrlReplacewith
     * @return cqAnalyticsTestandtargetRecommendationsUrlReplacewith
     */
    public ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplacewith() {
        return cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
    }

    public void setCqAnalyticsTestandtargetRecommendationsUrlReplacewith(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith) {
        this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith = cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {\n");
        
        sb.append("    cqAnalyticsTestandtargetApiUrl: ").append(toIndentedString(cqAnalyticsTestandtargetApiUrl)).append("\n");
        sb.append("    cqAnalyticsTestandtargetTimeout: ").append(toIndentedString(cqAnalyticsTestandtargetTimeout)).append("\n");
        sb.append("    cqAnalyticsTestandtargetSockettimeout: ").append(toIndentedString(cqAnalyticsTestandtargetSockettimeout)).append("\n");
        sb.append("    cqAnalyticsTestandtargetRecommendationsUrlReplace: ").append(toIndentedString(cqAnalyticsTestandtargetRecommendationsUrlReplace)).append("\n");
        sb.append("    cqAnalyticsTestandtargetRecommendationsUrlReplacewith: ").append(toIndentedString(cqAnalyticsTestandtargetRecommendationsUrlReplacewith)).append("\n");
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

