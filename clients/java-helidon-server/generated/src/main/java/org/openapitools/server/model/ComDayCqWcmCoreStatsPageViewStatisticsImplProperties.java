package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties   {

    private ConfigNodePropertyString pageviewstatisticsTrackingurl;
    private ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.
     *
     * @param pageviewstatisticsTrackingurl pageviewstatisticsTrackingurl
     * @param pageviewstatisticsTrackingscriptEnabled pageviewstatisticsTrackingscriptEnabled
     */
    public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(
        ConfigNodePropertyString pageviewstatisticsTrackingurl, 
        ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled
    ) {
        this.pageviewstatisticsTrackingurl = pageviewstatisticsTrackingurl;
        this.pageviewstatisticsTrackingscriptEnabled = pageviewstatisticsTrackingscriptEnabled;
    }



    /**
     * Get pageviewstatisticsTrackingurl
     * @return pageviewstatisticsTrackingurl
     */
    public ConfigNodePropertyString getPageviewstatisticsTrackingurl() {
        return pageviewstatisticsTrackingurl;
    }

    public void setPageviewstatisticsTrackingurl(ConfigNodePropertyString pageviewstatisticsTrackingurl) {
        this.pageviewstatisticsTrackingurl = pageviewstatisticsTrackingurl;
    }

    /**
     * Get pageviewstatisticsTrackingscriptEnabled
     * @return pageviewstatisticsTrackingscriptEnabled
     */
    public ConfigNodePropertyString getPageviewstatisticsTrackingscriptEnabled() {
        return pageviewstatisticsTrackingscriptEnabled;
    }

    public void setPageviewstatisticsTrackingscriptEnabled(ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled) {
        this.pageviewstatisticsTrackingscriptEnabled = pageviewstatisticsTrackingscriptEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties {\n");
        
        sb.append("    pageviewstatisticsTrackingurl: ").append(toIndentedString(pageviewstatisticsTrackingurl)).append("\n");
        sb.append("    pageviewstatisticsTrackingscriptEnabled: ").append(toIndentedString(pageviewstatisticsTrackingscriptEnabled)).append("\n");
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

