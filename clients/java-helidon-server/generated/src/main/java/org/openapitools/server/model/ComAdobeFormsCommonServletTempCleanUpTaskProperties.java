package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeFormsCommonServletTempCleanUpTaskProperties   {

    private ConfigNodePropertyString schedulerExpression;
    private ConfigNodePropertyString durationForTemporaryStorage;
    private ConfigNodePropertyString durationForAnonymousStorage;

    /**
     * Default constructor.
     */
    public ComAdobeFormsCommonServletTempCleanUpTaskProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeFormsCommonServletTempCleanUpTaskProperties.
     *
     * @param schedulerExpression schedulerExpression
     * @param durationForTemporaryStorage durationForTemporaryStorage
     * @param durationForAnonymousStorage durationForAnonymousStorage
     */
    public ComAdobeFormsCommonServletTempCleanUpTaskProperties(
        ConfigNodePropertyString schedulerExpression, 
        ConfigNodePropertyString durationForTemporaryStorage, 
        ConfigNodePropertyString durationForAnonymousStorage
    ) {
        this.schedulerExpression = schedulerExpression;
        this.durationForTemporaryStorage = durationForTemporaryStorage;
        this.durationForAnonymousStorage = durationForAnonymousStorage;
    }



    /**
     * Get schedulerExpression
     * @return schedulerExpression
     */
    public ConfigNodePropertyString getSchedulerExpression() {
        return schedulerExpression;
    }

    public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
        this.schedulerExpression = schedulerExpression;
    }

    /**
     * Get durationForTemporaryStorage
     * @return durationForTemporaryStorage
     */
    public ConfigNodePropertyString getDurationForTemporaryStorage() {
        return durationForTemporaryStorage;
    }

    public void setDurationForTemporaryStorage(ConfigNodePropertyString durationForTemporaryStorage) {
        this.durationForTemporaryStorage = durationForTemporaryStorage;
    }

    /**
     * Get durationForAnonymousStorage
     * @return durationForAnonymousStorage
     */
    public ConfigNodePropertyString getDurationForAnonymousStorage() {
        return durationForAnonymousStorage;
    }

    public void setDurationForAnonymousStorage(ConfigNodePropertyString durationForAnonymousStorage) {
        this.durationForAnonymousStorage = durationForAnonymousStorage;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeFormsCommonServletTempCleanUpTaskProperties {\n");
        
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
        sb.append("    durationForTemporaryStorage: ").append(toIndentedString(durationForTemporaryStorage)).append("\n");
        sb.append("    durationForAnonymousStorage: ").append(toIndentedString(durationForAnonymousStorage)).append("\n");
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

