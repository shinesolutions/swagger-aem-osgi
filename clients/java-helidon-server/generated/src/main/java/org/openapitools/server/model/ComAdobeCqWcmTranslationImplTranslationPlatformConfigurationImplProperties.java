package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties   {

    private ConfigNodePropertyString syncTranslationStateSchedulingFormat;
    private ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat;
    private ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes;
    private ConfigNodePropertyDropDown exportFormat;

    /**
     * Default constructor.
     */
    public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.
     *
     * @param syncTranslationStateSchedulingFormat syncTranslationStateSchedulingFormat
     * @param schedulingRepeatTranslationSchedulingFormat schedulingRepeatTranslationSchedulingFormat
     * @param syncTranslationStateLockTimeoutInMinutes syncTranslationStateLockTimeoutInMinutes
     * @param exportFormat exportFormat
     */
    public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(
        ConfigNodePropertyString syncTranslationStateSchedulingFormat, 
        ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat, 
        ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes, 
        ConfigNodePropertyDropDown exportFormat
    ) {
        this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
        this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
        this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
        this.exportFormat = exportFormat;
    }



    /**
     * Get syncTranslationStateSchedulingFormat
     * @return syncTranslationStateSchedulingFormat
     */
    public ConfigNodePropertyString getSyncTranslationStateSchedulingFormat() {
        return syncTranslationStateSchedulingFormat;
    }

    public void setSyncTranslationStateSchedulingFormat(ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
        this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
    }

    /**
     * Get schedulingRepeatTranslationSchedulingFormat
     * @return schedulingRepeatTranslationSchedulingFormat
     */
    public ConfigNodePropertyString getSchedulingRepeatTranslationSchedulingFormat() {
        return schedulingRepeatTranslationSchedulingFormat;
    }

    public void setSchedulingRepeatTranslationSchedulingFormat(ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat) {
        this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
    }

    /**
     * Get syncTranslationStateLockTimeoutInMinutes
     * @return syncTranslationStateLockTimeoutInMinutes
     */
    public ConfigNodePropertyString getSyncTranslationStateLockTimeoutInMinutes() {
        return syncTranslationStateLockTimeoutInMinutes;
    }

    public void setSyncTranslationStateLockTimeoutInMinutes(ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes) {
        this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
    }

    /**
     * Get exportFormat
     * @return exportFormat
     */
    public ConfigNodePropertyDropDown getExportFormat() {
        return exportFormat;
    }

    public void setExportFormat(ConfigNodePropertyDropDown exportFormat) {
        this.exportFormat = exportFormat;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {\n");
        
        sb.append("    syncTranslationStateSchedulingFormat: ").append(toIndentedString(syncTranslationStateSchedulingFormat)).append("\n");
        sb.append("    schedulingRepeatTranslationSchedulingFormat: ").append(toIndentedString(schedulingRepeatTranslationSchedulingFormat)).append("\n");
        sb.append("    syncTranslationStateLockTimeoutInMinutes: ").append(toIndentedString(syncTranslationStateLockTimeoutInMinutes)).append("\n");
        sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
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

