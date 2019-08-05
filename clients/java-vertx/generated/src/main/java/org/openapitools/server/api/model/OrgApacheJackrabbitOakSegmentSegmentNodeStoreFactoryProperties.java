package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties   {
  
  private ConfigNodePropertyString repositoryHome = null;
  private ConfigNodePropertyString tarmkMode = null;
  private ConfigNodePropertyInteger tarmkSize = null;
  private ConfigNodePropertyInteger segmentCacheSize = null;
  private ConfigNodePropertyInteger stringCacheSize = null;
  private ConfigNodePropertyInteger templateCacheSize = null;
  private ConfigNodePropertyInteger stringDeduplicationCacheSize = null;
  private ConfigNodePropertyInteger templateDeduplicationCacheSize = null;
  private ConfigNodePropertyInteger nodeDeduplicationCacheSize = null;
  private ConfigNodePropertyBoolean pauseCompaction = null;
  private ConfigNodePropertyInteger compactionRetryCount = null;
  private ConfigNodePropertyInteger compactionForceTimeout = null;
  private ConfigNodePropertyInteger compactionSizeDeltaEstimation = null;
  private ConfigNodePropertyBoolean compactionDisableEstimation = null;
  private ConfigNodePropertyInteger compactionRetainedGenerations = null;
  private ConfigNodePropertyInteger compactionMemoryThreshold = null;
  private ConfigNodePropertyInteger compactionProgressLog = null;
  private ConfigNodePropertyBoolean standby = null;
  private ConfigNodePropertyBoolean customBlobStore = null;
  private ConfigNodePropertyBoolean customSegmentStore = null;
  private ConfigNodePropertyBoolean splitPersistence = null;
  private ConfigNodePropertyString repositoryBackupDir = null;
  private ConfigNodePropertyInteger blobGcMaxAgeInSecs = null;
  private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs = null;
  private ConfigNodePropertyString role = null;
  private ConfigNodePropertyBoolean registerDescriptors = null;
  private ConfigNodePropertyBoolean dispatchChanges = null;

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties () {

  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties (ConfigNodePropertyString repositoryHome, ConfigNodePropertyString tarmkMode, ConfigNodePropertyInteger tarmkSize, ConfigNodePropertyInteger segmentCacheSize, ConfigNodePropertyInteger stringCacheSize, ConfigNodePropertyInteger templateCacheSize, ConfigNodePropertyInteger stringDeduplicationCacheSize, ConfigNodePropertyInteger templateDeduplicationCacheSize, ConfigNodePropertyInteger nodeDeduplicationCacheSize, ConfigNodePropertyBoolean pauseCompaction, ConfigNodePropertyInteger compactionRetryCount, ConfigNodePropertyInteger compactionForceTimeout, ConfigNodePropertyInteger compactionSizeDeltaEstimation, ConfigNodePropertyBoolean compactionDisableEstimation, ConfigNodePropertyInteger compactionRetainedGenerations, ConfigNodePropertyInteger compactionMemoryThreshold, ConfigNodePropertyInteger compactionProgressLog, ConfigNodePropertyBoolean standby, ConfigNodePropertyBoolean customBlobStore, ConfigNodePropertyBoolean customSegmentStore, ConfigNodePropertyBoolean splitPersistence, ConfigNodePropertyString repositoryBackupDir, ConfigNodePropertyInteger blobGcMaxAgeInSecs, ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs, ConfigNodePropertyString role, ConfigNodePropertyBoolean registerDescriptors, ConfigNodePropertyBoolean dispatchChanges) {
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

    
  @JsonProperty("repository.home")
  public ConfigNodePropertyString getRepositoryHome() {
    return repositoryHome;
  }
  public void setRepositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
  }

    
  @JsonProperty("tarmk.mode")
  public ConfigNodePropertyString getTarmkMode() {
    return tarmkMode;
  }
  public void setTarmkMode(ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
  }

    
  @JsonProperty("tarmk.size")
  public ConfigNodePropertyInteger getTarmkSize() {
    return tarmkSize;
  }
  public void setTarmkSize(ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
  }

    
  @JsonProperty("segmentCache.size")
  public ConfigNodePropertyInteger getSegmentCacheSize() {
    return segmentCacheSize;
  }
  public void setSegmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
  }

    
  @JsonProperty("stringCache.size")
  public ConfigNodePropertyInteger getStringCacheSize() {
    return stringCacheSize;
  }
  public void setStringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
  }

    
  @JsonProperty("templateCache.size")
  public ConfigNodePropertyInteger getTemplateCacheSize() {
    return templateCacheSize;
  }
  public void setTemplateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
  }

    
  @JsonProperty("stringDeduplicationCache.size")
  public ConfigNodePropertyInteger getStringDeduplicationCacheSize() {
    return stringDeduplicationCacheSize;
  }
  public void setStringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
  }

    
  @JsonProperty("templateDeduplicationCache.size")
  public ConfigNodePropertyInteger getTemplateDeduplicationCacheSize() {
    return templateDeduplicationCacheSize;
  }
  public void setTemplateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
  }

    
  @JsonProperty("nodeDeduplicationCache.size")
  public ConfigNodePropertyInteger getNodeDeduplicationCacheSize() {
    return nodeDeduplicationCacheSize;
  }
  public void setNodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
  }

    
  @JsonProperty("pauseCompaction")
  public ConfigNodePropertyBoolean getPauseCompaction() {
    return pauseCompaction;
  }
  public void setPauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
  }

    
  @JsonProperty("compaction.retryCount")
  public ConfigNodePropertyInteger getCompactionRetryCount() {
    return compactionRetryCount;
  }
  public void setCompactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
  }

    
  @JsonProperty("compaction.force.timeout")
  public ConfigNodePropertyInteger getCompactionForceTimeout() {
    return compactionForceTimeout;
  }
  public void setCompactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
  }

    
  @JsonProperty("compaction.sizeDeltaEstimation")
  public ConfigNodePropertyInteger getCompactionSizeDeltaEstimation() {
    return compactionSizeDeltaEstimation;
  }
  public void setCompactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
  }

    
  @JsonProperty("compaction.disableEstimation")
  public ConfigNodePropertyBoolean getCompactionDisableEstimation() {
    return compactionDisableEstimation;
  }
  public void setCompactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
  }

    
  @JsonProperty("compaction.retainedGenerations")
  public ConfigNodePropertyInteger getCompactionRetainedGenerations() {
    return compactionRetainedGenerations;
  }
  public void setCompactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
  }

    
  @JsonProperty("compaction.memoryThreshold")
  public ConfigNodePropertyInteger getCompactionMemoryThreshold() {
    return compactionMemoryThreshold;
  }
  public void setCompactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
  }

    
  @JsonProperty("compaction.progressLog")
  public ConfigNodePropertyInteger getCompactionProgressLog() {
    return compactionProgressLog;
  }
  public void setCompactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
  }

    
  @JsonProperty("standby")
  public ConfigNodePropertyBoolean getStandby() {
    return standby;
  }
  public void setStandby(ConfigNodePropertyBoolean standby) {
    this.standby = standby;
  }

    
  @JsonProperty("customBlobStore")
  public ConfigNodePropertyBoolean getCustomBlobStore() {
    return customBlobStore;
  }
  public void setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
  }

    
  @JsonProperty("customSegmentStore")
  public ConfigNodePropertyBoolean getCustomSegmentStore() {
    return customSegmentStore;
  }
  public void setCustomSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
  }

    
  @JsonProperty("splitPersistence")
  public ConfigNodePropertyBoolean getSplitPersistence() {
    return splitPersistence;
  }
  public void setSplitPersistence(ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
  }

    
  @JsonProperty("repository.backup.dir")
  public ConfigNodePropertyString getRepositoryBackupDir() {
    return repositoryBackupDir;
  }
  public void setRepositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
  }

    
  @JsonProperty("blobGcMaxAgeInSecs")
  public ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() {
    return blobGcMaxAgeInSecs;
  }
  public void setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
  }

    
  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  public ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() {
    return blobTrackSnapshotIntervalInSecs;
  }
  public void setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
  }

    
  @JsonProperty("role")
  public ConfigNodePropertyString getRole() {
    return role;
  }
  public void setRole(ConfigNodePropertyString role) {
    this.role = role;
  }

    
  @JsonProperty("registerDescriptors")
  public ConfigNodePropertyBoolean getRegisterDescriptors() {
    return registerDescriptors;
  }
  public void setRegisterDescriptors(ConfigNodePropertyBoolean registerDescriptors) {
    this.registerDescriptors = registerDescriptors;
  }

    
  @JsonProperty("dispatchChanges")
  public ConfigNodePropertyBoolean getDispatchChanges() {
    return dispatchChanges;
  }
  public void setDispatchChanges(ConfigNodePropertyBoolean dispatchChanges) {
    this.dispatchChanges = dispatchChanges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties = (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) o;
    return Objects.equals(repositoryHome, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.repositoryHome) &&
        Objects.equals(tarmkMode, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.tarmkMode) &&
        Objects.equals(tarmkSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.tarmkSize) &&
        Objects.equals(segmentCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.segmentCacheSize) &&
        Objects.equals(stringCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.stringCacheSize) &&
        Objects.equals(templateCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.templateCacheSize) &&
        Objects.equals(stringDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.stringDeduplicationCacheSize) &&
        Objects.equals(templateDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.templateDeduplicationCacheSize) &&
        Objects.equals(nodeDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.nodeDeduplicationCacheSize) &&
        Objects.equals(pauseCompaction, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.pauseCompaction) &&
        Objects.equals(compactionRetryCount, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionRetryCount) &&
        Objects.equals(compactionForceTimeout, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionForceTimeout) &&
        Objects.equals(compactionSizeDeltaEstimation, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionSizeDeltaEstimation) &&
        Objects.equals(compactionDisableEstimation, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionDisableEstimation) &&
        Objects.equals(compactionRetainedGenerations, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionRetainedGenerations) &&
        Objects.equals(compactionMemoryThreshold, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionMemoryThreshold) &&
        Objects.equals(compactionProgressLog, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionProgressLog) &&
        Objects.equals(standby, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.standby) &&
        Objects.equals(customBlobStore, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.customBlobStore) &&
        Objects.equals(customSegmentStore, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.customSegmentStore) &&
        Objects.equals(splitPersistence, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.splitPersistence) &&
        Objects.equals(repositoryBackupDir, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.repositoryBackupDir) &&
        Objects.equals(blobGcMaxAgeInSecs, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.blobGcMaxAgeInSecs) &&
        Objects.equals(blobTrackSnapshotIntervalInSecs, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.blobTrackSnapshotIntervalInSecs) &&
        Objects.equals(role, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.role) &&
        Objects.equals(registerDescriptors, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.registerDescriptors) &&
        Objects.equals(dispatchChanges, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.dispatchChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryHome, tarmkMode, tarmkSize, segmentCacheSize, stringCacheSize, templateCacheSize, stringDeduplicationCacheSize, templateDeduplicationCacheSize, nodeDeduplicationCacheSize, pauseCompaction, compactionRetryCount, compactionForceTimeout, compactionSizeDeltaEstimation, compactionDisableEstimation, compactionRetainedGenerations, compactionMemoryThreshold, compactionProgressLog, standby, customBlobStore, customSegmentStore, splitPersistence, repositoryBackupDir, blobGcMaxAgeInSecs, blobTrackSnapshotIntervalInSecs, role, registerDescriptors, dispatchChanges);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
