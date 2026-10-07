package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties   {

    private ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.
     *
     * @param cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
     */
    public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties(
        ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
    ) {
        this.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
    }



    /**
     * Get cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
     * @return cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
     */
    public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled() {
        return cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
    }

    public void setCqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled) {
        this.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties {\n");
        
        sb.append("    cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled: ").append(toIndentedString(cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled)).append("\n");
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

