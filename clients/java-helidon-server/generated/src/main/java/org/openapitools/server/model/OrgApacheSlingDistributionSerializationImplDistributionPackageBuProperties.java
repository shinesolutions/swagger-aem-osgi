package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyDropDown type;
    private ConfigNodePropertyString formatTarget;
    private ConfigNodePropertyString tempFsFolder;
    private ConfigNodePropertyInteger fileThreshold;
    private ConfigNodePropertyDropDown memoryUnit;
    private ConfigNodePropertyBoolean useOffHeapMemory;
    private ConfigNodePropertyDropDown digestAlgorithm;
    private ConfigNodePropertyInteger monitoringQueueSize;
    private ConfigNodePropertyInteger cleanupDelay;
    private ConfigNodePropertyArray packageFilters;
    private ConfigNodePropertyArray propertyFilters;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.
     *
     * @param name name
     * @param type type
     * @param formatTarget formatTarget
     * @param tempFsFolder tempFsFolder
     * @param fileThreshold fileThreshold
     * @param memoryUnit memoryUnit
     * @param useOffHeapMemory useOffHeapMemory
     * @param digestAlgorithm digestAlgorithm
     * @param monitoringQueueSize monitoringQueueSize
     * @param cleanupDelay cleanupDelay
     * @param packageFilters packageFilters
     * @param propertyFilters propertyFilters
     */
    public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyDropDown type, 
        ConfigNodePropertyString formatTarget, 
        ConfigNodePropertyString tempFsFolder, 
        ConfigNodePropertyInteger fileThreshold, 
        ConfigNodePropertyDropDown memoryUnit, 
        ConfigNodePropertyBoolean useOffHeapMemory, 
        ConfigNodePropertyDropDown digestAlgorithm, 
        ConfigNodePropertyInteger monitoringQueueSize, 
        ConfigNodePropertyInteger cleanupDelay, 
        ConfigNodePropertyArray packageFilters, 
        ConfigNodePropertyArray propertyFilters
    ) {
        this.name = name;
        this.type = type;
        this.formatTarget = formatTarget;
        this.tempFsFolder = tempFsFolder;
        this.fileThreshold = fileThreshold;
        this.memoryUnit = memoryUnit;
        this.useOffHeapMemory = useOffHeapMemory;
        this.digestAlgorithm = digestAlgorithm;
        this.monitoringQueueSize = monitoringQueueSize;
        this.cleanupDelay = cleanupDelay;
        this.packageFilters = packageFilters;
        this.propertyFilters = propertyFilters;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get type
     * @return type
     */
    public ConfigNodePropertyDropDown getType() {
        return type;
    }

    public void setType(ConfigNodePropertyDropDown type) {
        this.type = type;
    }

    /**
     * Get formatTarget
     * @return formatTarget
     */
    public ConfigNodePropertyString getFormatTarget() {
        return formatTarget;
    }

    public void setFormatTarget(ConfigNodePropertyString formatTarget) {
        this.formatTarget = formatTarget;
    }

    /**
     * Get tempFsFolder
     * @return tempFsFolder
     */
    public ConfigNodePropertyString getTempFsFolder() {
        return tempFsFolder;
    }

    public void setTempFsFolder(ConfigNodePropertyString tempFsFolder) {
        this.tempFsFolder = tempFsFolder;
    }

    /**
     * Get fileThreshold
     * @return fileThreshold
     */
    public ConfigNodePropertyInteger getFileThreshold() {
        return fileThreshold;
    }

    public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
        this.fileThreshold = fileThreshold;
    }

    /**
     * Get memoryUnit
     * @return memoryUnit
     */
    public ConfigNodePropertyDropDown getMemoryUnit() {
        return memoryUnit;
    }

    public void setMemoryUnit(ConfigNodePropertyDropDown memoryUnit) {
        this.memoryUnit = memoryUnit;
    }

    /**
     * Get useOffHeapMemory
     * @return useOffHeapMemory
     */
    public ConfigNodePropertyBoolean getUseOffHeapMemory() {
        return useOffHeapMemory;
    }

    public void setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
        this.useOffHeapMemory = useOffHeapMemory;
    }

    /**
     * Get digestAlgorithm
     * @return digestAlgorithm
     */
    public ConfigNodePropertyDropDown getDigestAlgorithm() {
        return digestAlgorithm;
    }

    public void setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
    }

    /**
     * Get monitoringQueueSize
     * @return monitoringQueueSize
     */
    public ConfigNodePropertyInteger getMonitoringQueueSize() {
        return monitoringQueueSize;
    }

    public void setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
        this.monitoringQueueSize = monitoringQueueSize;
    }

    /**
     * Get cleanupDelay
     * @return cleanupDelay
     */
    public ConfigNodePropertyInteger getCleanupDelay() {
        return cleanupDelay;
    }

    public void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
        this.cleanupDelay = cleanupDelay;
    }

    /**
     * Get packageFilters
     * @return packageFilters
     */
    public ConfigNodePropertyArray getPackageFilters() {
        return packageFilters;
    }

    public void setPackageFilters(ConfigNodePropertyArray packageFilters) {
        this.packageFilters = packageFilters;
    }

    /**
     * Get propertyFilters
     * @return propertyFilters
     */
    public ConfigNodePropertyArray getPropertyFilters() {
        return propertyFilters;
    }

    public void setPropertyFilters(ConfigNodePropertyArray propertyFilters) {
        this.propertyFilters = propertyFilters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    formatTarget: ").append(toIndentedString(formatTarget)).append("\n");
        sb.append("    tempFsFolder: ").append(toIndentedString(tempFsFolder)).append("\n");
        sb.append("    fileThreshold: ").append(toIndentedString(fileThreshold)).append("\n");
        sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
        sb.append("    useOffHeapMemory: ").append(toIndentedString(useOffHeapMemory)).append("\n");
        sb.append("    digestAlgorithm: ").append(toIndentedString(digestAlgorithm)).append("\n");
        sb.append("    monitoringQueueSize: ").append(toIndentedString(monitoringQueueSize)).append("\n");
        sb.append("    cleanupDelay: ").append(toIndentedString(cleanupDelay)).append("\n");
        sb.append("    packageFilters: ").append(toIndentedString(packageFilters)).append("\n");
        sb.append("    propertyFilters: ").append(toIndentedString(propertyFilters)).append("\n");
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

