package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties   {

    private ConfigNodePropertyString translationFactory;
    private ConfigNodePropertyString defaultConnectorLabel;
    private ConfigNodePropertyString defaultConnectorAttribution;
    private ConfigNodePropertyString defaultConnectorWorkspaceId;
    private ConfigNodePropertyString defaultConnectorSubscriptionKey;
    private ConfigNodePropertyString languageMapLocation;
    private ConfigNodePropertyString categoryMapLocation;
    private ConfigNodePropertyInteger retryAttempts;
    private ConfigNodePropertyInteger timeoutCount;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.
     *
     * @param translationFactory translationFactory
     * @param defaultConnectorLabel defaultConnectorLabel
     * @param defaultConnectorAttribution defaultConnectorAttribution
     * @param defaultConnectorWorkspaceId defaultConnectorWorkspaceId
     * @param defaultConnectorSubscriptionKey defaultConnectorSubscriptionKey
     * @param languageMapLocation languageMapLocation
     * @param categoryMapLocation categoryMapLocation
     * @param retryAttempts retryAttempts
     * @param timeoutCount timeoutCount
     */
    public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(
        ConfigNodePropertyString translationFactory, 
        ConfigNodePropertyString defaultConnectorLabel, 
        ConfigNodePropertyString defaultConnectorAttribution, 
        ConfigNodePropertyString defaultConnectorWorkspaceId, 
        ConfigNodePropertyString defaultConnectorSubscriptionKey, 
        ConfigNodePropertyString languageMapLocation, 
        ConfigNodePropertyString categoryMapLocation, 
        ConfigNodePropertyInteger retryAttempts, 
        ConfigNodePropertyInteger timeoutCount
    ) {
        this.translationFactory = translationFactory;
        this.defaultConnectorLabel = defaultConnectorLabel;
        this.defaultConnectorAttribution = defaultConnectorAttribution;
        this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
        this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
        this.languageMapLocation = languageMapLocation;
        this.categoryMapLocation = categoryMapLocation;
        this.retryAttempts = retryAttempts;
        this.timeoutCount = timeoutCount;
    }



    /**
     * Get translationFactory
     * @return translationFactory
     */
    public ConfigNodePropertyString getTranslationFactory() {
        return translationFactory;
    }

    public void setTranslationFactory(ConfigNodePropertyString translationFactory) {
        this.translationFactory = translationFactory;
    }

    /**
     * Get defaultConnectorLabel
     * @return defaultConnectorLabel
     */
    public ConfigNodePropertyString getDefaultConnectorLabel() {
        return defaultConnectorLabel;
    }

    public void setDefaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel) {
        this.defaultConnectorLabel = defaultConnectorLabel;
    }

    /**
     * Get defaultConnectorAttribution
     * @return defaultConnectorAttribution
     */
    public ConfigNodePropertyString getDefaultConnectorAttribution() {
        return defaultConnectorAttribution;
    }

    public void setDefaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution) {
        this.defaultConnectorAttribution = defaultConnectorAttribution;
    }

    /**
     * Get defaultConnectorWorkspaceId
     * @return defaultConnectorWorkspaceId
     */
    public ConfigNodePropertyString getDefaultConnectorWorkspaceId() {
        return defaultConnectorWorkspaceId;
    }

    public void setDefaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId) {
        this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
    }

    /**
     * Get defaultConnectorSubscriptionKey
     * @return defaultConnectorSubscriptionKey
     */
    public ConfigNodePropertyString getDefaultConnectorSubscriptionKey() {
        return defaultConnectorSubscriptionKey;
    }

    public void setDefaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey) {
        this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
    }

    /**
     * Get languageMapLocation
     * @return languageMapLocation
     */
    public ConfigNodePropertyString getLanguageMapLocation() {
        return languageMapLocation;
    }

    public void setLanguageMapLocation(ConfigNodePropertyString languageMapLocation) {
        this.languageMapLocation = languageMapLocation;
    }

    /**
     * Get categoryMapLocation
     * @return categoryMapLocation
     */
    public ConfigNodePropertyString getCategoryMapLocation() {
        return categoryMapLocation;
    }

    public void setCategoryMapLocation(ConfigNodePropertyString categoryMapLocation) {
        this.categoryMapLocation = categoryMapLocation;
    }

    /**
     * Get retryAttempts
     * @return retryAttempts
     */
    public ConfigNodePropertyInteger getRetryAttempts() {
        return retryAttempts;
    }

    public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    /**
     * Get timeoutCount
     * @return timeoutCount
     */
    public ConfigNodePropertyInteger getTimeoutCount() {
        return timeoutCount;
    }

    public void setTimeoutCount(ConfigNodePropertyInteger timeoutCount) {
        this.timeoutCount = timeoutCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {\n");
        
        sb.append("    translationFactory: ").append(toIndentedString(translationFactory)).append("\n");
        sb.append("    defaultConnectorLabel: ").append(toIndentedString(defaultConnectorLabel)).append("\n");
        sb.append("    defaultConnectorAttribution: ").append(toIndentedString(defaultConnectorAttribution)).append("\n");
        sb.append("    defaultConnectorWorkspaceId: ").append(toIndentedString(defaultConnectorWorkspaceId)).append("\n");
        sb.append("    defaultConnectorSubscriptionKey: ").append(toIndentedString(defaultConnectorSubscriptionKey)).append("\n");
        sb.append("    languageMapLocation: ").append(toIndentedString(languageMapLocation)).append("\n");
        sb.append("    categoryMapLocation: ").append(toIndentedString(categoryMapLocation)).append("\n");
        sb.append("    retryAttempts: ").append(toIndentedString(retryAttempts)).append("\n");
        sb.append("    timeoutCount: ").append(toIndentedString(timeoutCount)).append("\n");
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

