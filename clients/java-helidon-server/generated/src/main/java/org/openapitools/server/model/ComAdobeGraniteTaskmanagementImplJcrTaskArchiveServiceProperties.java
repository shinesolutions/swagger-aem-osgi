package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties   {

    private ConfigNodePropertyBoolean archivingEnabled;
    private ConfigNodePropertyString schedulerExpression;
    private ConfigNodePropertyInteger archiveSinceDaysCompleted;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.
     *
     * @param archivingEnabled archivingEnabled
     * @param schedulerExpression schedulerExpression
     * @param archiveSinceDaysCompleted archiveSinceDaysCompleted
     */
    public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(
        ConfigNodePropertyBoolean archivingEnabled, 
        ConfigNodePropertyString schedulerExpression, 
        ConfigNodePropertyInteger archiveSinceDaysCompleted
    ) {
        this.archivingEnabled = archivingEnabled;
        this.schedulerExpression = schedulerExpression;
        this.archiveSinceDaysCompleted = archiveSinceDaysCompleted;
    }



    /**
     * Get archivingEnabled
     * @return archivingEnabled
     */
    public ConfigNodePropertyBoolean getArchivingEnabled() {
        return archivingEnabled;
    }

    public void setArchivingEnabled(ConfigNodePropertyBoolean archivingEnabled) {
        this.archivingEnabled = archivingEnabled;
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
     * Get archiveSinceDaysCompleted
     * @return archiveSinceDaysCompleted
     */
    public ConfigNodePropertyInteger getArchiveSinceDaysCompleted() {
        return archiveSinceDaysCompleted;
    }

    public void setArchiveSinceDaysCompleted(ConfigNodePropertyInteger archiveSinceDaysCompleted) {
        this.archiveSinceDaysCompleted = archiveSinceDaysCompleted;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties {\n");
        
        sb.append("    archivingEnabled: ").append(toIndentedString(archivingEnabled)).append("\n");
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
        sb.append("    archiveSinceDaysCompleted: ").append(toIndentedString(archiveSinceDaysCompleted)).append("\n");
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

