package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletResourceCollectionServletProperties   {

    private ConfigNodePropertyArray slingServletResourceTypes;
    private ConfigNodePropertyString slingServletMethods;
    private ConfigNodePropertyString slingServletSelectors;
    private ConfigNodePropertyString downloadConfig;
    private ConfigNodePropertyString viewSelector;
    private ConfigNodePropertyBoolean sendEmail;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletResourceCollectionServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletResourceCollectionServletProperties.
     *
     * @param slingServletResourceTypes slingServletResourceTypes
     * @param slingServletMethods slingServletMethods
     * @param slingServletSelectors slingServletSelectors
     * @param downloadConfig downloadConfig
     * @param viewSelector viewSelector
     * @param sendEmail sendEmail
     */
    public ComDayCqDamCoreImplServletResourceCollectionServletProperties(
        ConfigNodePropertyArray slingServletResourceTypes, 
        ConfigNodePropertyString slingServletMethods, 
        ConfigNodePropertyString slingServletSelectors, 
        ConfigNodePropertyString downloadConfig, 
        ConfigNodePropertyString viewSelector, 
        ConfigNodePropertyBoolean sendEmail
    ) {
        this.slingServletResourceTypes = slingServletResourceTypes;
        this.slingServletMethods = slingServletMethods;
        this.slingServletSelectors = slingServletSelectors;
        this.downloadConfig = downloadConfig;
        this.viewSelector = viewSelector;
        this.sendEmail = sendEmail;
    }



    /**
     * Get slingServletResourceTypes
     * @return slingServletResourceTypes
     */
    public ConfigNodePropertyArray getSlingServletResourceTypes() {
        return slingServletResourceTypes;
    }

    public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
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
     * Get downloadConfig
     * @return downloadConfig
     */
    public ConfigNodePropertyString getDownloadConfig() {
        return downloadConfig;
    }

    public void setDownloadConfig(ConfigNodePropertyString downloadConfig) {
        this.downloadConfig = downloadConfig;
    }

    /**
     * Get viewSelector
     * @return viewSelector
     */
    public ConfigNodePropertyString getViewSelector() {
        return viewSelector;
    }

    public void setViewSelector(ConfigNodePropertyString viewSelector) {
        this.viewSelector = viewSelector;
    }

    /**
     * Get sendEmail
     * @return sendEmail
     */
    public ConfigNodePropertyBoolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletResourceCollectionServletProperties {\n");
        
        sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
        sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
        sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
        sb.append("    downloadConfig: ").append(toIndentedString(downloadConfig)).append("\n");
        sb.append("    viewSelector: ").append(toIndentedString(viewSelector)).append("\n");
        sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
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

