package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties   {

    private ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter;

    /**
     * Default constructor.
     */
    public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.
     *
     * @param communitiesIntegrationLivefyreSlingEventFilter communitiesIntegrationLivefyreSlingEventFilter
     */
    public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties(
        ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter
    ) {
        this.communitiesIntegrationLivefyreSlingEventFilter = communitiesIntegrationLivefyreSlingEventFilter;
    }



    /**
     * Get communitiesIntegrationLivefyreSlingEventFilter
     * @return communitiesIntegrationLivefyreSlingEventFilter
     */
    public ConfigNodePropertyString getCommunitiesIntegrationLivefyreSlingEventFilter() {
        return communitiesIntegrationLivefyreSlingEventFilter;
    }

    public void setCommunitiesIntegrationLivefyreSlingEventFilter(ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter) {
        this.communitiesIntegrationLivefyreSlingEventFilter = communitiesIntegrationLivefyreSlingEventFilter;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties {\n");
        
        sb.append("    communitiesIntegrationLivefyreSlingEventFilter: ").append(toIndentedString(communitiesIntegrationLivefyreSlingEventFilter)).append("\n");
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

