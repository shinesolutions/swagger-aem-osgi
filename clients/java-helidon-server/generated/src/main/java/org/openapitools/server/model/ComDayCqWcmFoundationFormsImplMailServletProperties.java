package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmFoundationFormsImplMailServletProperties   {

    private ConfigNodePropertyString slingServletResourceTypes;
    private ConfigNodePropertyString slingServletSelectors;
    private ConfigNodePropertyArray resourceWhitelist;
    private ConfigNodePropertyString resourceBlacklist;

    /**
     * Default constructor.
     */
    public ComDayCqWcmFoundationFormsImplMailServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmFoundationFormsImplMailServletProperties.
     *
     * @param slingServletResourceTypes slingServletResourceTypes
     * @param slingServletSelectors slingServletSelectors
     * @param resourceWhitelist resourceWhitelist
     * @param resourceBlacklist resourceBlacklist
     */
    public ComDayCqWcmFoundationFormsImplMailServletProperties(
        ConfigNodePropertyString slingServletResourceTypes, 
        ConfigNodePropertyString slingServletSelectors, 
        ConfigNodePropertyArray resourceWhitelist, 
        ConfigNodePropertyString resourceBlacklist
    ) {
        this.slingServletResourceTypes = slingServletResourceTypes;
        this.slingServletSelectors = slingServletSelectors;
        this.resourceWhitelist = resourceWhitelist;
        this.resourceBlacklist = resourceBlacklist;
    }



    /**
     * Get slingServletResourceTypes
     * @return slingServletResourceTypes
     */
    public ConfigNodePropertyString getSlingServletResourceTypes() {
        return slingServletResourceTypes;
    }

    public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
        this.slingServletResourceTypes = slingServletResourceTypes;
    }

    /**
     * Get slingServletSelectors
     * @return slingServletSelectors
     */
    public ConfigNodePropertyString getSlingServletSelectors() {
        return slingServletSelectors;
    }

    public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
        this.slingServletSelectors = slingServletSelectors;
    }

    /**
     * Get resourceWhitelist
     * @return resourceWhitelist
     */
    public ConfigNodePropertyArray getResourceWhitelist() {
        return resourceWhitelist;
    }

    public void setResourceWhitelist(ConfigNodePropertyArray resourceWhitelist) {
        this.resourceWhitelist = resourceWhitelist;
    }

    /**
     * Get resourceBlacklist
     * @return resourceBlacklist
     */
    public ConfigNodePropertyString getResourceBlacklist() {
        return resourceBlacklist;
    }

    public void setResourceBlacklist(ConfigNodePropertyString resourceBlacklist) {
        this.resourceBlacklist = resourceBlacklist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmFoundationFormsImplMailServletProperties {\n");
        
        sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
        sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
        sb.append("    resourceWhitelist: ").append(toIndentedString(resourceWhitelist)).append("\n");
        sb.append("    resourceBlacklist: ").append(toIndentedString(resourceBlacklist)).append("\n");
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

