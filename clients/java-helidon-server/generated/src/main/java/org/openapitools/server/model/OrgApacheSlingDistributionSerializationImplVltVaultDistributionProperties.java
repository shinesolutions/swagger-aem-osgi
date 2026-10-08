package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyDropDown type;
    private ConfigNodePropertyString importMode;
    private ConfigNodePropertyString aclHandling;
    private ConfigNodePropertyString packageRoots;
    private ConfigNodePropertyArray packageFilters;
    private ConfigNodePropertyArray propertyFilters;
    private ConfigNodePropertyString tempFsFolder;
    private ConfigNodePropertyBoolean useBinaryReferences;
    private ConfigNodePropertyInteger autoSaveThreshold;
    private ConfigNodePropertyInteger cleanupDelay;
    private ConfigNodePropertyInteger fileThreshold;
    private ConfigNodePropertyDropDown MEGA_BYTES;
    private ConfigNodePropertyBoolean useOffHeapMemory;
    private ConfigNodePropertyDropDown digestAlgorithm;
    private ConfigNodePropertyInteger monitoringQueueSize;
    private ConfigNodePropertyArray pathsMapping;
    private ConfigNodePropertyBoolean strictImport;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.
     *
     * @param name name
     * @param type type
     * @param importMode importMode
     * @param aclHandling aclHandling
     * @param packageRoots packageRoots
     * @param packageFilters packageFilters
     * @param propertyFilters propertyFilters
     * @param tempFsFolder tempFsFolder
     * @param useBinaryReferences useBinaryReferences
     * @param autoSaveThreshold autoSaveThreshold
     * @param cleanupDelay cleanupDelay
     * @param fileThreshold fileThreshold
     * @param MEGA_BYTES MEGA_BYTES
     * @param useOffHeapMemory useOffHeapMemory
     * @param digestAlgorithm digestAlgorithm
     * @param monitoringQueueSize monitoringQueueSize
     * @param pathsMapping pathsMapping
     * @param strictImport strictImport
     */
    public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyDropDown type, 
        ConfigNodePropertyString importMode, 
        ConfigNodePropertyString aclHandling, 
        ConfigNodePropertyString packageRoots, 
        ConfigNodePropertyArray packageFilters, 
        ConfigNodePropertyArray propertyFilters, 
        ConfigNodePropertyString tempFsFolder, 
        ConfigNodePropertyBoolean useBinaryReferences, 
        ConfigNodePropertyInteger autoSaveThreshold, 
        ConfigNodePropertyInteger cleanupDelay, 
        ConfigNodePropertyInteger fileThreshold, 
        ConfigNodePropertyDropDown MEGA_BYTES, 
        ConfigNodePropertyBoolean useOffHeapMemory, 
        ConfigNodePropertyDropDown digestAlgorithm, 
        ConfigNodePropertyInteger monitoringQueueSize, 
        ConfigNodePropertyArray pathsMapping, 
        ConfigNodePropertyBoolean strictImport
    ) {
        this.name = name;
        this.type = type;
        this.importMode = importMode;
        this.aclHandling = aclHandling;
        this.packageRoots = packageRoots;
        this.packageFilters = packageFilters;
        this.propertyFilters = propertyFilters;
        this.tempFsFolder = tempFsFolder;
        this.useBinaryReferences = useBinaryReferences;
        this.autoSaveThreshold = autoSaveThreshold;
        this.cleanupDelay = cleanupDelay;
        this.fileThreshold = fileThreshold;
        this.MEGA_BYTES = MEGA_BYTES;
        this.useOffHeapMemory = useOffHeapMemory;
        this.digestAlgorithm = digestAlgorithm;
        this.monitoringQueueSize = monitoringQueueSize;
        this.pathsMapping = pathsMapping;
        this.strictImport = strictImport;
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
     * Get importMode
     * @return importMode
     */
    public ConfigNodePropertyString getImportMode() {
        return importMode;
    }

    public void setImportMode(ConfigNodePropertyString importMode) {
        this.importMode = importMode;
    }

    /**
     * Get aclHandling
     * @return aclHandling
     */
    public ConfigNodePropertyString getAclHandling() {
        return aclHandling;
    }

    public void setAclHandling(ConfigNodePropertyString aclHandling) {
        this.aclHandling = aclHandling;
    }

    /**
     * Get packageRoots
     * @return packageRoots
     */
    public ConfigNodePropertyString getPackageRoots() {
        return packageRoots;
    }

    public void setPackageRoots(ConfigNodePropertyString packageRoots) {
        this.packageRoots = packageRoots;
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
     * Get useBinaryReferences
     * @return useBinaryReferences
     */
    public ConfigNodePropertyBoolean getUseBinaryReferences() {
        return useBinaryReferences;
    }

    public void setUseBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
        this.useBinaryReferences = useBinaryReferences;
    }

    /**
     * Get autoSaveThreshold
     * @return autoSaveThreshold
     */
    public ConfigNodePropertyInteger getAutoSaveThreshold() {
        return autoSaveThreshold;
    }

    public void setAutoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
        this.autoSaveThreshold = autoSaveThreshold;
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
     * Get MEGA_BYTES
     * @return MEGA_BYTES
     */
    public ConfigNodePropertyDropDown getMEGABYTES() {
        return MEGA_BYTES;
    }

    public void setMEGABYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
        this.MEGA_BYTES = MEGA_BYTES;
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
     * Get pathsMapping
     * @return pathsMapping
     */
    public ConfigNodePropertyArray getPathsMapping() {
        return pathsMapping;
    }

    public void setPathsMapping(ConfigNodePropertyArray pathsMapping) {
        this.pathsMapping = pathsMapping;
    }

    /**
     * Get strictImport
     * @return strictImport
     */
    public ConfigNodePropertyBoolean getStrictImport() {
        return strictImport;
    }

    public void setStrictImport(ConfigNodePropertyBoolean strictImport) {
        this.strictImport = strictImport;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    importMode: ").append(toIndentedString(importMode)).append("\n");
        sb.append("    aclHandling: ").append(toIndentedString(aclHandling)).append("\n");
        sb.append("    packageRoots: ").append(toIndentedString(packageRoots)).append("\n");
        sb.append("    packageFilters: ").append(toIndentedString(packageFilters)).append("\n");
        sb.append("    propertyFilters: ").append(toIndentedString(propertyFilters)).append("\n");
        sb.append("    tempFsFolder: ").append(toIndentedString(tempFsFolder)).append("\n");
        sb.append("    useBinaryReferences: ").append(toIndentedString(useBinaryReferences)).append("\n");
        sb.append("    autoSaveThreshold: ").append(toIndentedString(autoSaveThreshold)).append("\n");
        sb.append("    cleanupDelay: ").append(toIndentedString(cleanupDelay)).append("\n");
        sb.append("    fileThreshold: ").append(toIndentedString(fileThreshold)).append("\n");
        sb.append("    MEGA_BYTES: ").append(toIndentedString(MEGA_BYTES)).append("\n");
        sb.append("    useOffHeapMemory: ").append(toIndentedString(useOffHeapMemory)).append("\n");
        sb.append("    digestAlgorithm: ").append(toIndentedString(digestAlgorithm)).append("\n");
        sb.append("    monitoringQueueSize: ").append(toIndentedString(monitoringQueueSize)).append("\n");
        sb.append("    pathsMapping: ").append(toIndentedString(pathsMapping)).append("\n");
        sb.append("    strictImport: ").append(toIndentedString(strictImport)).append("\n");
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

