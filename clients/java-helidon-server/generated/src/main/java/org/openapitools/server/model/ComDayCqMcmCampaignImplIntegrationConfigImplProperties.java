package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqMcmCampaignImplIntegrationConfigImplProperties   {

    private ConfigNodePropertyArray aemMcmCampaignFormConstraints;
    private ConfigNodePropertyString aemMcmCampaignPublicUrl;
    private ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL;

    /**
     * Default constructor.
     */
    public ComDayCqMcmCampaignImplIntegrationConfigImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqMcmCampaignImplIntegrationConfigImplProperties.
     *
     * @param aemMcmCampaignFormConstraints aemMcmCampaignFormConstraints
     * @param aemMcmCampaignPublicUrl aemMcmCampaignPublicUrl
     * @param aemMcmCampaignRelaxedSSL aemMcmCampaignRelaxedSSL
     */
    public ComDayCqMcmCampaignImplIntegrationConfigImplProperties(
        ConfigNodePropertyArray aemMcmCampaignFormConstraints, 
        ConfigNodePropertyString aemMcmCampaignPublicUrl, 
        ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL
    ) {
        this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
        this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
        this.aemMcmCampaignRelaxedSSL = aemMcmCampaignRelaxedSSL;
    }



    /**
     * Get aemMcmCampaignFormConstraints
     * @return aemMcmCampaignFormConstraints
     */
    public ConfigNodePropertyArray getAemMcmCampaignFormConstraints() {
        return aemMcmCampaignFormConstraints;
    }

    public void setAemMcmCampaignFormConstraints(ConfigNodePropertyArray aemMcmCampaignFormConstraints) {
        this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
    }

    /**
     * Get aemMcmCampaignPublicUrl
     * @return aemMcmCampaignPublicUrl
     */
    public ConfigNodePropertyString getAemMcmCampaignPublicUrl() {
        return aemMcmCampaignPublicUrl;
    }

    public void setAemMcmCampaignPublicUrl(ConfigNodePropertyString aemMcmCampaignPublicUrl) {
        this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
    }

    /**
     * Get aemMcmCampaignRelaxedSSL
     * @return aemMcmCampaignRelaxedSSL
     */
    public ConfigNodePropertyBoolean getAemMcmCampaignRelaxedSSL() {
        return aemMcmCampaignRelaxedSSL;
    }

    public void setAemMcmCampaignRelaxedSSL(ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL) {
        this.aemMcmCampaignRelaxedSSL = aemMcmCampaignRelaxedSSL;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqMcmCampaignImplIntegrationConfigImplProperties {\n");
        
        sb.append("    aemMcmCampaignFormConstraints: ").append(toIndentedString(aemMcmCampaignFormConstraints)).append("\n");
        sb.append("    aemMcmCampaignPublicUrl: ").append(toIndentedString(aemMcmCampaignPublicUrl)).append("\n");
        sb.append("    aemMcmCampaignRelaxedSSL: ").append(toIndentedString(aemMcmCampaignRelaxedSSL)).append("\n");
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

