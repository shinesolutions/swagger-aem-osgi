package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmFoundationFormsImplFormChooserServletProperties   {

    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyString slingServletResourceTypes;
    private ConfigNodePropertyString slingServletSelectors;
    private ConfigNodePropertyArray slingServletMethods;
    private ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire;

    /**
     * Default constructor.
     */
    public ComDayCqWcmFoundationFormsImplFormChooserServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmFoundationFormsImplFormChooserServletProperties.
     *
     * @param serviceName serviceName
     * @param slingServletResourceTypes slingServletResourceTypes
     * @param slingServletSelectors slingServletSelectors
     * @param slingServletMethods slingServletMethods
     * @param formsFormchooserservletAdvansesearchRequire formsFormchooserservletAdvansesearchRequire
     */
    public ComDayCqWcmFoundationFormsImplFormChooserServletProperties(
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyString slingServletResourceTypes, 
        ConfigNodePropertyString slingServletSelectors, 
        ConfigNodePropertyArray slingServletMethods, 
        ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire
    ) {
        this.serviceName = serviceName;
        this.slingServletResourceTypes = slingServletResourceTypes;
        this.slingServletSelectors = slingServletSelectors;
        this.slingServletMethods = slingServletMethods;
        this.formsFormchooserservletAdvansesearchRequire = formsFormchooserservletAdvansesearchRequire;
    }



    /**
     * Get serviceName
     * @return serviceName
     */
    public ConfigNodePropertyString getServiceName() {
        return serviceName;
    }

    public void setServiceName(ConfigNodePropertyString serviceName) {
        this.serviceName = serviceName;
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
     * Get slingServletMethods
     * @return slingServletMethods
     */
    public ConfigNodePropertyArray getSlingServletMethods() {
        return slingServletMethods;
    }

    public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
        this.slingServletMethods = slingServletMethods;
    }

    /**
     * Get formsFormchooserservletAdvansesearchRequire
     * @return formsFormchooserservletAdvansesearchRequire
     */
    public ConfigNodePropertyBoolean getFormsFormchooserservletAdvansesearchRequire() {
        return formsFormchooserservletAdvansesearchRequire;
    }

    public void setFormsFormchooserservletAdvansesearchRequire(ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire) {
        this.formsFormchooserservletAdvansesearchRequire = formsFormchooserservletAdvansesearchRequire;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmFoundationFormsImplFormChooserServletProperties {\n");
        
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
        sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
        sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
        sb.append("    formsFormchooserservletAdvansesearchRequire: ").append(toIndentedString(formsFormchooserservletAdvansesearchRequire)).append("\n");
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

