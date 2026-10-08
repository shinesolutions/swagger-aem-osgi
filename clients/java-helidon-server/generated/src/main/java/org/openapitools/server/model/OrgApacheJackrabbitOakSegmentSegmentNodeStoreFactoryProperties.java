package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties   {

    private ConfigNodePropertyString repositoryHome;
    private ConfigNodePropertyString tarmkMode;
    private ConfigNodePropertyInteger tarmkSize;
    private ConfigNodePropertyInteger segmentCacheSize;
    private ConfigNodePropertyInteger stringCacheSize;
    private ConfigNodePropertyInteger templateCacheSize;
    private ConfigNodePropertyInteger stringDeduplicationCacheSize;
    private ConfigNodePropertyInteger templateDeduplicationCacheSize;
    private ConfigNodePropertyInteger nodeDeduplicationCacheSize;
    private ConfigNodePropertyBoolean pauseCompaction;
    private ConfigNodePropertyInteger compactionRetryCount;
    private ConfigNodePropertyInteger compactionForceTimeout;
    private ConfigNodePropertyInteger compactionSizeDeltaEstimation;
    private ConfigNodePropertyBoolean compactionDisableEstimation;
    private ConfigNodePropertyInteger compactionRetainedGenerations;
    private ConfigNodePropertyInteger compactionMemoryThreshold;
    private ConfigNodePropertyInteger compactionProgressLog;
    private ConfigNodePropertyBoolean standby;
    private ConfigNodePropertyBoolean customBlobStore;
    private ConfigNodePropertyBoolean customSegmentStore;
    private ConfigNodePropertyBoolean splitPersistence;
    private ConfigNodePropertyString repositoryBackupDir;
    private ConfigNodePropertyInteger blobGcMaxAgeInSecs;
    private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs;
    private ConfigNodePropertyString role;
    private ConfigNodePropertyBoolean registerDescriptors;
    private ConfigNodePropertyBoolean dispatchChanges;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.
     *
     * @param repositoryHome repositoryHome
     * @param tarmkMode tarmkMode
     * @param tarmkSize tarmkSize
     * @param segmentCacheSize segmentCacheSize
     * @param stringCacheSize stringCacheSize
     * @param templateCacheSize templateCacheSize
     * @param stringDeduplicationCacheSize stringDeduplicationCacheSize
     * @param templateDeduplicationCacheSize templateDeduplicationCacheSize
     * @param nodeDeduplicationCacheSize nodeDeduplicationCacheSize
     * @param pauseCompaction pauseCompaction
     * @param compactionRetryCount compactionRetryCount
     * @param compactionForceTimeout compactionForceTimeout
     * @param compactionSizeDeltaEstimation compactionSizeDeltaEstimation
     * @param compactionDisableEstimation compactionDisableEstimation
     * @param compactionRetainedGenerations compactionRetainedGenerations
     * @param compactionMemoryThreshold compactionMemoryThreshold
     * @param compactionProgressLog compactionProgressLog
     * @param standby standby
     * @param customBlobStore customBlobStore
     * @param customSegmentStore customSegmentStore
     * @param splitPersistence splitPersistence
     * @param repositoryBackupDir repositoryBackupDir
     * @param blobGcMaxAgeInSecs blobGcMaxAgeInSecs
     * @param blobTrackSnapshotIntervalInSecs blobTrackSnapshotIntervalInSecs
     * @param role role
     * @param registerDescriptors registerDescriptors
     * @param dispatchChanges dispatchChanges
     */
    public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties(
        ConfigNodePropertyString repositoryHome, 
        ConfigNodePropertyString tarmkMode, 
        ConfigNodePropertyInteger tarmkSize, 
        ConfigNodePropertyInteger segmentCacheSize, 
        ConfigNodePropertyInteger stringCacheSize, 
        ConfigNodePropertyInteger templateCacheSize, 
        ConfigNodePropertyInteger stringDeduplicationCacheSize, 
        ConfigNodePropertyInteger templateDeduplicationCacheSize, 
        ConfigNodePropertyInteger nodeDeduplicationCacheSize, 
        ConfigNodePropertyBoolean pauseCompaction, 
        ConfigNodePropertyInteger compactionRetryCount, 
        ConfigNodePropertyInteger compactionForceTimeout, 
        ConfigNodePropertyInteger compactionSizeDeltaEstimation, 
        ConfigNodePropertyBoolean compactionDisableEstimation, 
        ConfigNodePropertyInteger compactionRetainedGenerations, 
        ConfigNodePropertyInteger compactionMemoryThreshold, 
        ConfigNodePropertyInteger compactionProgressLog, 
        ConfigNodePropertyBoolean standby, 
        ConfigNodePropertyBoolean customBlobStore, 
        ConfigNodePropertyBoolean customSegmentStore, 
        ConfigNodePropertyBoolean splitPersistence, 
        ConfigNodePropertyString repositoryBackupDir, 
        ConfigNodePropertyInteger blobGcMaxAgeInSecs, 
        ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs, 
        ConfigNodePropertyString role, 
        ConfigNodePropertyBoolean registerDescriptors, 
        ConfigNodePropertyBoolean dispatchChanges
    ) {
        this.repositoryHome = repositoryHome;
        this.tarmkMode = tarmkMode;
        this.tarmkSize = tarmkSize;
        this.segmentCacheSize = segmentCacheSize;
        this.stringCacheSize = stringCacheSize;
        this.templateCacheSize = templateCacheSize;
        this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
        this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
        this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
        this.pauseCompaction = pauseCompaction;
        this.compactionRetryCount = compactionRetryCount;
        this.compactionForceTimeout = compactionForceTimeout;
        this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
        this.compactionDisableEstimation = compactionDisableEstimation;
        this.compactionRetainedGenerations = compactionRetainedGenerations;
        this.compactionMemoryThreshold = compactionMemoryThreshold;
        this.compactionProgressLog = compactionProgressLog;
        this.standby = standby;
        this.customBlobStore = customBlobStore;
        this.customSegmentStore = customSegmentStore;
        this.splitPersistence = splitPersistence;
        this.repositoryBackupDir = repositoryBackupDir;
        this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
        this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
        this.role = role;
        this.registerDescriptors = registerDescriptors;
        this.dispatchChanges = dispatchChanges;
    }



    /**
     * Get repositoryHome
     * @return repositoryHome
     */
    public ConfigNodePropertyString getRepositoryHome() {
        return repositoryHome;
    }

    public void setRepositoryHome(ConfigNodePropertyString repositoryHome) {
        this.repositoryHome = repositoryHome;
    }

    /**
     * Get tarmkMode
     * @return tarmkMode
     */
    public ConfigNodePropertyString getTarmkMode() {
        return tarmkMode;
    }

    public void setTarmkMode(ConfigNodePropertyString tarmkMode) {
        this.tarmkMode = tarmkMode;
    }

    /**
     * Get tarmkSize
     * @return tarmkSize
     */
    public ConfigNodePropertyInteger getTarmkSize() {
        return tarmkSize;
    }

    public void setTarmkSize(ConfigNodePropertyInteger tarmkSize) {
        this.tarmkSize = tarmkSize;
    }

    /**
     * Get segmentCacheSize
     * @return segmentCacheSize
     */
    public ConfigNodePropertyInteger getSegmentCacheSize() {
        return segmentCacheSize;
    }

    public void setSegmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
        this.segmentCacheSize = segmentCacheSize;
    }

    /**
     * Get stringCacheSize
     * @return stringCacheSize
     */
    public ConfigNodePropertyInteger getStringCacheSize() {
        return stringCacheSize;
    }

    public void setStringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
        this.stringCacheSize = stringCacheSize;
    }

    /**
     * Get templateCacheSize
     * @return templateCacheSize
     */
    public ConfigNodePropertyInteger getTemplateCacheSize() {
        return templateCacheSize;
    }

    public void setTemplateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
        this.templateCacheSize = templateCacheSize;
    }

    /**
     * Get stringDeduplicationCacheSize
     * @return stringDeduplicationCacheSize
     */
    public ConfigNodePropertyInteger getStringDeduplicationCacheSize() {
        return stringDeduplicationCacheSize;
    }

    public void setStringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
        this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
    }

    /**
     * Get templateDeduplicationCacheSize
     * @return templateDeduplicationCacheSize
     */
    public ConfigNodePropertyInteger getTemplateDeduplicationCacheSize() {
        return templateDeduplicationCacheSize;
    }

    public void setTemplateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
        this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
    }

    /**
     * Get nodeDeduplicationCacheSize
     * @return nodeDeduplicationCacheSize
     */
    public ConfigNodePropertyInteger getNodeDeduplicationCacheSize() {
        return nodeDeduplicationCacheSize;
    }

    public void setNodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
        this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
    }

    /**
     * Get pauseCompaction
     * @return pauseCompaction
     */
    public ConfigNodePropertyBoolean getPauseCompaction() {
        return pauseCompaction;
    }

    public void setPauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
        this.pauseCompaction = pauseCompaction;
    }

    /**
     * Get compactionRetryCount
     * @return compactionRetryCount
     */
    public ConfigNodePropertyInteger getCompactionRetryCount() {
        return compactionRetryCount;
    }

    public void setCompactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
        this.compactionRetryCount = compactionRetryCount;
    }

    /**
     * Get compactionForceTimeout
     * @return compactionForceTimeout
     */
    public ConfigNodePropertyInteger getCompactionForceTimeout() {
        return compactionForceTimeout;
    }

    public void setCompactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
        this.compactionForceTimeout = compactionForceTimeout;
    }

    /**
     * Get compactionSizeDeltaEstimation
     * @return compactionSizeDeltaEstimation
     */
    public ConfigNodePropertyInteger getCompactionSizeDeltaEstimation() {
        return compactionSizeDeltaEstimation;
    }

    public void setCompactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
        this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
    }

    /**
     * Get compactionDisableEstimation
     * @return compactionDisableEstimation
     */
    public ConfigNodePropertyBoolean getCompactionDisableEstimation() {
        return compactionDisableEstimation;
    }

    public void setCompactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
        this.compactionDisableEstimation = compactionDisableEstimation;
    }

    /**
     * Get compactionRetainedGenerations
     * @return compactionRetainedGenerations
     */
    public ConfigNodePropertyInteger getCompactionRetainedGenerations() {
        return compactionRetainedGenerations;
    }

    public void setCompactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
        this.compactionRetainedGenerations = compactionRetainedGenerations;
    }

    /**
     * Get compactionMemoryThreshold
     * @return compactionMemoryThreshold
     */
    public ConfigNodePropertyInteger getCompactionMemoryThreshold() {
        return compactionMemoryThreshold;
    }

    public void setCompactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
        this.compactionMemoryThreshold = compactionMemoryThreshold;
    }

    /**
     * Get compactionProgressLog
     * @return compactionProgressLog
     */
    public ConfigNodePropertyInteger getCompactionProgressLog() {
        return compactionProgressLog;
    }

    public void setCompactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
        this.compactionProgressLog = compactionProgressLog;
    }

    /**
     * Get standby
     * @return standby
     */
    public ConfigNodePropertyBoolean getStandby() {
        return standby;
    }

    public void setStandby(ConfigNodePropertyBoolean standby) {
        this.standby = standby;
    }

    /**
     * Get customBlobStore
     * @return customBlobStore
     */
    public ConfigNodePropertyBoolean getCustomBlobStore() {
        return customBlobStore;
    }

    public void setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore) {
        this.customBlobStore = customBlobStore;
    }

    /**
     * Get customSegmentStore
     * @return customSegmentStore
     */
    public ConfigNodePropertyBoolean getCustomSegmentStore() {
        return customSegmentStore;
    }

    public void setCustomSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
        this.customSegmentStore = customSegmentStore;
    }

    /**
     * Get splitPersistence
     * @return splitPersistence
     */
    public ConfigNodePropertyBoolean getSplitPersistence() {
        return splitPersistence;
    }

    public void setSplitPersistence(ConfigNodePropertyBoolean splitPersistence) {
        this.splitPersistence = splitPersistence;
    }

    /**
     * Get repositoryBackupDir
     * @return repositoryBackupDir
     */
    public ConfigNodePropertyString getRepositoryBackupDir() {
        return repositoryBackupDir;
    }

    public void setRepositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
        this.repositoryBackupDir = repositoryBackupDir;
    }

    /**
     * Get blobGcMaxAgeInSecs
     * @return blobGcMaxAgeInSecs
     */
    public ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() {
        return blobGcMaxAgeInSecs;
    }

    public void setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
        this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
    }

    /**
     * Get blobTrackSnapshotIntervalInSecs
     * @return blobTrackSnapshotIntervalInSecs
     */
    public ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() {
        return blobTrackSnapshotIntervalInSecs;
    }

    public void setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
        this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
    }

    /**
     * Get role
     * @return role
     */
    public ConfigNodePropertyString getRole() {
        return role;
    }

    public void setRole(ConfigNodePropertyString role) {
        this.role = role;
    }

    /**
     * Get registerDescriptors
     * @return registerDescriptors
     */
    public ConfigNodePropertyBoolean getRegisterDescriptors() {
        return registerDescriptors;
    }

    public void setRegisterDescriptors(ConfigNodePropertyBoolean registerDescriptors) {
        this.registerDescriptors = registerDescriptors;
    }

    /**
     * Get dispatchChanges
     * @return dispatchChanges
     */
    public ConfigNodePropertyBoolean getDispatchChanges() {
        return dispatchChanges;
    }

    public void setDispatchChanges(ConfigNodePropertyBoolean dispatchChanges) {
        this.dispatchChanges = dispatchChanges;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties {\n");
        
        sb.append("    repositoryHome: ").append(toIndentedString(repositoryHome)).append("\n");
        sb.append("    tarmkMode: ").append(toIndentedString(tarmkMode)).append("\n");
        sb.append("    tarmkSize: ").append(toIndentedString(tarmkSize)).append("\n");
        sb.append("    segmentCacheSize: ").append(toIndentedString(segmentCacheSize)).append("\n");
        sb.append("    stringCacheSize: ").append(toIndentedString(stringCacheSize)).append("\n");
        sb.append("    templateCacheSize: ").append(toIndentedString(templateCacheSize)).append("\n");
        sb.append("    stringDeduplicationCacheSize: ").append(toIndentedString(stringDeduplicationCacheSize)).append("\n");
        sb.append("    templateDeduplicationCacheSize: ").append(toIndentedString(templateDeduplicationCacheSize)).append("\n");
        sb.append("    nodeDeduplicationCacheSize: ").append(toIndentedString(nodeDeduplicationCacheSize)).append("\n");
        sb.append("    pauseCompaction: ").append(toIndentedString(pauseCompaction)).append("\n");
        sb.append("    compactionRetryCount: ").append(toIndentedString(compactionRetryCount)).append("\n");
        sb.append("    compactionForceTimeout: ").append(toIndentedString(compactionForceTimeout)).append("\n");
        sb.append("    compactionSizeDeltaEstimation: ").append(toIndentedString(compactionSizeDeltaEstimation)).append("\n");
        sb.append("    compactionDisableEstimation: ").append(toIndentedString(compactionDisableEstimation)).append("\n");
        sb.append("    compactionRetainedGenerations: ").append(toIndentedString(compactionRetainedGenerations)).append("\n");
        sb.append("    compactionMemoryThreshold: ").append(toIndentedString(compactionMemoryThreshold)).append("\n");
        sb.append("    compactionProgressLog: ").append(toIndentedString(compactionProgressLog)).append("\n");
        sb.append("    standby: ").append(toIndentedString(standby)).append("\n");
        sb.append("    customBlobStore: ").append(toIndentedString(customBlobStore)).append("\n");
        sb.append("    customSegmentStore: ").append(toIndentedString(customSegmentStore)).append("\n");
        sb.append("    splitPersistence: ").append(toIndentedString(splitPersistence)).append("\n");
        sb.append("    repositoryBackupDir: ").append(toIndentedString(repositoryBackupDir)).append("\n");
        sb.append("    blobGcMaxAgeInSecs: ").append(toIndentedString(blobGcMaxAgeInSecs)).append("\n");
        sb.append("    blobTrackSnapshotIntervalInSecs: ").append(toIndentedString(blobTrackSnapshotIntervalInSecs)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    registerDescriptors: ").append(toIndentedString(registerDescriptors)).append("\n");
        sb.append("    dispatchChanges: ").append(toIndentedString(dispatchChanges)).append("\n");
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

