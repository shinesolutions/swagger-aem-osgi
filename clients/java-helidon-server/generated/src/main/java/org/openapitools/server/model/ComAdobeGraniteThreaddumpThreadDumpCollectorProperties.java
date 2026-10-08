package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties   {

    private ConfigNodePropertyInteger schedulerPeriod;
    private ConfigNodePropertyDropDown schedulerRunOn;
    private ConfigNodePropertyBoolean graniteThreaddumpEnabled;
    private ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile;
    private ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression;
    private ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression;
    private ConfigNodePropertyBoolean graniteThreaddumpEnableJStack;
    private ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays;
    private ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.
     *
     * @param schedulerPeriod schedulerPeriod
     * @param schedulerRunOn schedulerRunOn
     * @param graniteThreaddumpEnabled graniteThreaddumpEnabled
     * @param graniteThreaddumpDumpsPerFile graniteThreaddumpDumpsPerFile
     * @param graniteThreaddumpEnableGzipCompression graniteThreaddumpEnableGzipCompression
     * @param graniteThreaddumpEnableDirectoriesCompression graniteThreaddumpEnableDirectoriesCompression
     * @param graniteThreaddumpEnableJStack graniteThreaddumpEnableJStack
     * @param graniteThreaddumpMaxBackupDays graniteThreaddumpMaxBackupDays
     * @param graniteThreaddumpBackupCleanTrigger graniteThreaddumpBackupCleanTrigger
     */
    public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(
        ConfigNodePropertyInteger schedulerPeriod, 
        ConfigNodePropertyDropDown schedulerRunOn, 
        ConfigNodePropertyBoolean graniteThreaddumpEnabled, 
        ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile, 
        ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression, 
        ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression, 
        ConfigNodePropertyBoolean graniteThreaddumpEnableJStack, 
        ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays, 
        ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger
    ) {
        this.schedulerPeriod = schedulerPeriod;
        this.schedulerRunOn = schedulerRunOn;
        this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
        this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
        this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
        this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
        this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
        this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
        this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
    }



    /**
     * Get schedulerPeriod
     * @return schedulerPeriod
     */
    public ConfigNodePropertyInteger getSchedulerPeriod() {
        return schedulerPeriod;
    }

    public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
        this.schedulerPeriod = schedulerPeriod;
    }

    /**
     * Get schedulerRunOn
     * @return schedulerRunOn
     */
    public ConfigNodePropertyDropDown getSchedulerRunOn() {
        return schedulerRunOn;
    }

    public void setSchedulerRunOn(ConfigNodePropertyDropDown schedulerRunOn) {
        this.schedulerRunOn = schedulerRunOn;
    }

    /**
     * Get graniteThreaddumpEnabled
     * @return graniteThreaddumpEnabled
     */
    public ConfigNodePropertyBoolean getGraniteThreaddumpEnabled() {
        return graniteThreaddumpEnabled;
    }

    public void setGraniteThreaddumpEnabled(ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
        this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
    }

    /**
     * Get graniteThreaddumpDumpsPerFile
     * @return graniteThreaddumpDumpsPerFile
     */
    public ConfigNodePropertyInteger getGraniteThreaddumpDumpsPerFile() {
        return graniteThreaddumpDumpsPerFile;
    }

    public void setGraniteThreaddumpDumpsPerFile(ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
        this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
    }

    /**
     * Get graniteThreaddumpEnableGzipCompression
     * @return graniteThreaddumpEnableGzipCompression
     */
    public ConfigNodePropertyBoolean getGraniteThreaddumpEnableGzipCompression() {
        return graniteThreaddumpEnableGzipCompression;
    }

    public void setGraniteThreaddumpEnableGzipCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
        this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
    }

    /**
     * Get graniteThreaddumpEnableDirectoriesCompression
     * @return graniteThreaddumpEnableDirectoriesCompression
     */
    public ConfigNodePropertyBoolean getGraniteThreaddumpEnableDirectoriesCompression() {
        return graniteThreaddumpEnableDirectoriesCompression;
    }

    public void setGraniteThreaddumpEnableDirectoriesCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
        this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
    }

    /**
     * Get graniteThreaddumpEnableJStack
     * @return graniteThreaddumpEnableJStack
     */
    public ConfigNodePropertyBoolean getGraniteThreaddumpEnableJStack() {
        return graniteThreaddumpEnableJStack;
    }

    public void setGraniteThreaddumpEnableJStack(ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
        this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
    }

    /**
     * Get graniteThreaddumpMaxBackupDays
     * @return graniteThreaddumpMaxBackupDays
     */
    public ConfigNodePropertyInteger getGraniteThreaddumpMaxBackupDays() {
        return graniteThreaddumpMaxBackupDays;
    }

    public void setGraniteThreaddumpMaxBackupDays(ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
        this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
    }

    /**
     * Get graniteThreaddumpBackupCleanTrigger
     * @return graniteThreaddumpBackupCleanTrigger
     */
    public ConfigNodePropertyString getGraniteThreaddumpBackupCleanTrigger() {
        return graniteThreaddumpBackupCleanTrigger;
    }

    public void setGraniteThreaddumpBackupCleanTrigger(ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
        this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {\n");
        
        sb.append("    schedulerPeriod: ").append(toIndentedString(schedulerPeriod)).append("\n");
        sb.append("    schedulerRunOn: ").append(toIndentedString(schedulerRunOn)).append("\n");
        sb.append("    graniteThreaddumpEnabled: ").append(toIndentedString(graniteThreaddumpEnabled)).append("\n");
        sb.append("    graniteThreaddumpDumpsPerFile: ").append(toIndentedString(graniteThreaddumpDumpsPerFile)).append("\n");
        sb.append("    graniteThreaddumpEnableGzipCompression: ").append(toIndentedString(graniteThreaddumpEnableGzipCompression)).append("\n");
        sb.append("    graniteThreaddumpEnableDirectoriesCompression: ").append(toIndentedString(graniteThreaddumpEnableDirectoriesCompression)).append("\n");
        sb.append("    graniteThreaddumpEnableJStack: ").append(toIndentedString(graniteThreaddumpEnableJStack)).append("\n");
        sb.append("    graniteThreaddumpMaxBackupDays: ").append(toIndentedString(graniteThreaddumpMaxBackupDays)).append("\n");
        sb.append("    graniteThreaddumpBackupCleanTrigger: ").append(toIndentedString(graniteThreaddumpBackupCleanTrigger)).append("\n");
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

