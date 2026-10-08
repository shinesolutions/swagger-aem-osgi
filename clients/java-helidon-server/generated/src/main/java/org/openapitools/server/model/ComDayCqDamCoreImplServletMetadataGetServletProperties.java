package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletMetadataGetServletProperties   {

    private ConfigNodePropertyString slingServletResourceTypes;
    private ConfigNodePropertyString slingServletMethods;
    private ConfigNodePropertyString slingServletExtensions;
    private ConfigNodePropertyString slingServletSelectors;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletMetadataGetServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletMetadataGetServletProperties.
     *
     * @param slingServletResourceTypes slingServletResourceTypes
     * @param slingServletMethods slingServletMethods
     * @param slingServletExtensions slingServletExtensions
     * @param slingServletSelectors slingServletSelectors
     */
    public ComDayCqDamCoreImplServletMetadataGetServletProperties(
        ConfigNodePropertyString slingServletResourceTypes, 
        ConfigNodePropertyString slingServletMethods, 
        ConfigNodePropertyString slingServletExtensions, 
        ConfigNodePropertyString slingServletSelectors
    ) {
        this.slingServletResourceTypes = slingServletResourceTypes;
        this.slingServletMethods = slingServletMethods;
        this.slingServletExtensions = slingServletExtensions;
        this.slingServletSelectors = slingServletSelectors;
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
     * Get slingServletMethods
     * @return slingServletMethods
     */
    public ConfigNodePropertyString getSlingServletMethods() {
        return slingServletMethods;
    }

    public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
        this.slingServletMethods = slingServletMethods;
    }

    /**
     * Get slingServletExtensions
     * @return slingServletExtensions
     */
    public ConfigNodePropertyString getSlingServletExtensions() {
        return slingServletExtensions;
    }

    public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
        this.slingServletExtensions = slingServletExtensions;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletMetadataGetServletProperties {\n");
        
        sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
        sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
        sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
        sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
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

