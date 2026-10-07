package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties   {

    private ConfigNodePropertyDropDown translateLanguage;
    private ConfigNodePropertyDropDown translateDisplay;
    private ConfigNodePropertyBoolean translateAttribution;
    private ConfigNodePropertyDropDown translateCaching;
    private ConfigNodePropertyDropDown translateSmartRendering;
    private ConfigNodePropertyString translateCachingDuration;
    private ConfigNodePropertyString translateSessionSaveInterval;
    private ConfigNodePropertyString translateSessionSaveBatchLimit;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.
     *
     * @param translateLanguage translateLanguage
     * @param translateDisplay translateDisplay
     * @param translateAttribution translateAttribution
     * @param translateCaching translateCaching
     * @param translateSmartRendering translateSmartRendering
     * @param translateCachingDuration translateCachingDuration
     * @param translateSessionSaveInterval translateSessionSaveInterval
     * @param translateSessionSaveBatchLimit translateSessionSaveBatchLimit
     */
    public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(
        ConfigNodePropertyDropDown translateLanguage, 
        ConfigNodePropertyDropDown translateDisplay, 
        ConfigNodePropertyBoolean translateAttribution, 
        ConfigNodePropertyDropDown translateCaching, 
        ConfigNodePropertyDropDown translateSmartRendering, 
        ConfigNodePropertyString translateCachingDuration, 
        ConfigNodePropertyString translateSessionSaveInterval, 
        ConfigNodePropertyString translateSessionSaveBatchLimit
    ) {
        this.translateLanguage = translateLanguage;
        this.translateDisplay = translateDisplay;
        this.translateAttribution = translateAttribution;
        this.translateCaching = translateCaching;
        this.translateSmartRendering = translateSmartRendering;
        this.translateCachingDuration = translateCachingDuration;
        this.translateSessionSaveInterval = translateSessionSaveInterval;
        this.translateSessionSaveBatchLimit = translateSessionSaveBatchLimit;
    }



    /**
     * Get translateLanguage
     * @return translateLanguage
     */
    public ConfigNodePropertyDropDown getTranslateLanguage() {
        return translateLanguage;
    }

    public void setTranslateLanguage(ConfigNodePropertyDropDown translateLanguage) {
        this.translateLanguage = translateLanguage;
    }

    /**
     * Get translateDisplay
     * @return translateDisplay
     */
    public ConfigNodePropertyDropDown getTranslateDisplay() {
        return translateDisplay;
    }

    public void setTranslateDisplay(ConfigNodePropertyDropDown translateDisplay) {
        this.translateDisplay = translateDisplay;
    }

    /**
     * Get translateAttribution
     * @return translateAttribution
     */
    public ConfigNodePropertyBoolean getTranslateAttribution() {
        return translateAttribution;
    }

    public void setTranslateAttribution(ConfigNodePropertyBoolean translateAttribution) {
        this.translateAttribution = translateAttribution;
    }

    /**
     * Get translateCaching
     * @return translateCaching
     */
    public ConfigNodePropertyDropDown getTranslateCaching() {
        return translateCaching;
    }

    public void setTranslateCaching(ConfigNodePropertyDropDown translateCaching) {
        this.translateCaching = translateCaching;
    }

    /**
     * Get translateSmartRendering
     * @return translateSmartRendering
     */
    public ConfigNodePropertyDropDown getTranslateSmartRendering() {
        return translateSmartRendering;
    }

    public void setTranslateSmartRendering(ConfigNodePropertyDropDown translateSmartRendering) {
        this.translateSmartRendering = translateSmartRendering;
    }

    /**
     * Get translateCachingDuration
     * @return translateCachingDuration
     */
    public ConfigNodePropertyString getTranslateCachingDuration() {
        return translateCachingDuration;
    }

    public void setTranslateCachingDuration(ConfigNodePropertyString translateCachingDuration) {
        this.translateCachingDuration = translateCachingDuration;
    }

    /**
     * Get translateSessionSaveInterval
     * @return translateSessionSaveInterval
     */
    public ConfigNodePropertyString getTranslateSessionSaveInterval() {
        return translateSessionSaveInterval;
    }

    public void setTranslateSessionSaveInterval(ConfigNodePropertyString translateSessionSaveInterval) {
        this.translateSessionSaveInterval = translateSessionSaveInterval;
    }

    /**
     * Get translateSessionSaveBatchLimit
     * @return translateSessionSaveBatchLimit
     */
    public ConfigNodePropertyString getTranslateSessionSaveBatchLimit() {
        return translateSessionSaveBatchLimit;
    }

    public void setTranslateSessionSaveBatchLimit(ConfigNodePropertyString translateSessionSaveBatchLimit) {
        this.translateSessionSaveBatchLimit = translateSessionSaveBatchLimit;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {\n");
        
        sb.append("    translateLanguage: ").append(toIndentedString(translateLanguage)).append("\n");
        sb.append("    translateDisplay: ").append(toIndentedString(translateDisplay)).append("\n");
        sb.append("    translateAttribution: ").append(toIndentedString(translateAttribution)).append("\n");
        sb.append("    translateCaching: ").append(toIndentedString(translateCaching)).append("\n");
        sb.append("    translateSmartRendering: ").append(toIndentedString(translateSmartRendering)).append("\n");
        sb.append("    translateCachingDuration: ").append(toIndentedString(translateCachingDuration)).append("\n");
        sb.append("    translateSessionSaveInterval: ").append(toIndentedString(translateSessionSaveInterval)).append("\n");
        sb.append("    translateSessionSaveBatchLimit: ").append(toIndentedString(translateSessionSaveBatchLimit)).append("\n");
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

