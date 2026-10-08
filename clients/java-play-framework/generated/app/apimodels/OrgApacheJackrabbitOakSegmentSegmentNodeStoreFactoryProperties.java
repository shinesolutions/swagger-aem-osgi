package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties   {
  @JsonProperty("repository.home")
  @Valid

  private ConfigNodePropertyString repositoryHome;

  @JsonProperty("tarmk.mode")
  @Valid

  private ConfigNodePropertyString tarmkMode;

  @JsonProperty("tarmk.size")
  @Valid

  private ConfigNodePropertyInteger tarmkSize;

  @JsonProperty("segmentCache.size")
  @Valid

  private ConfigNodePropertyInteger segmentCacheSize;

  @JsonProperty("stringCache.size")
  @Valid

  private ConfigNodePropertyInteger stringCacheSize;

  @JsonProperty("templateCache.size")
  @Valid

  private ConfigNodePropertyInteger templateCacheSize;

  @JsonProperty("stringDeduplicationCache.size")
  @Valid

  private ConfigNodePropertyInteger stringDeduplicationCacheSize;

  @JsonProperty("templateDeduplicationCache.size")
  @Valid

  private ConfigNodePropertyInteger templateDeduplicationCacheSize;

  @JsonProperty("nodeDeduplicationCache.size")
  @Valid

  private ConfigNodePropertyInteger nodeDeduplicationCacheSize;

  @JsonProperty("pauseCompaction")
  @Valid

  private ConfigNodePropertyBoolean pauseCompaction;

  @JsonProperty("compaction.retryCount")
  @Valid

  private ConfigNodePropertyInteger compactionRetryCount;

  @JsonProperty("compaction.force.timeout")
  @Valid

  private ConfigNodePropertyInteger compactionForceTimeout;

  @JsonProperty("compaction.sizeDeltaEstimation")
  @Valid

  private ConfigNodePropertyInteger compactionSizeDeltaEstimation;

  @JsonProperty("compaction.disableEstimation")
  @Valid

  private ConfigNodePropertyBoolean compactionDisableEstimation;

  @JsonProperty("compaction.retainedGenerations")
  @Valid

  private ConfigNodePropertyInteger compactionRetainedGenerations;

  @JsonProperty("compaction.memoryThreshold")
  @Valid

  private ConfigNodePropertyInteger compactionMemoryThreshold;

  @JsonProperty("compaction.progressLog")
  @Valid

  private ConfigNodePropertyInteger compactionProgressLog;

  @JsonProperty("standby")
  @Valid

  private ConfigNodePropertyBoolean standby;

  @JsonProperty("customBlobStore")
  @Valid

  private ConfigNodePropertyBoolean customBlobStore;

  @JsonProperty("customSegmentStore")
  @Valid

  private ConfigNodePropertyBoolean customSegmentStore;

  @JsonProperty("splitPersistence")
  @Valid

  private ConfigNodePropertyBoolean splitPersistence;

  @JsonProperty("repository.backup.dir")
  @Valid

  private ConfigNodePropertyString repositoryBackupDir;

  @JsonProperty("blobGcMaxAgeInSecs")
  @Valid

  private ConfigNodePropertyInteger blobGcMaxAgeInSecs;

  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  @Valid

  private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs;

  @JsonProperty("role")
  @Valid

  private ConfigNodePropertyString role;

  @JsonProperty("registerDescriptors")
  @Valid

  private ConfigNodePropertyBoolean registerDescriptors;

  @JsonProperty("dispatchChanges")
  @Valid

  private ConfigNodePropertyBoolean dispatchChanges;

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties repositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
    return this;
  }

   /**
   * Get repositoryHome
   * @return repositoryHome
  **/
  public ConfigNodePropertyString getRepositoryHome() {
    return repositoryHome;
  }

  public void setRepositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties tarmkMode(ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
    return this;
  }

   /**
   * Get tarmkMode
   * @return tarmkMode
  **/
  public ConfigNodePropertyString getTarmkMode() {
    return tarmkMode;
  }

  public void setTarmkMode(ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties tarmkSize(ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
    return this;
  }

   /**
   * Get tarmkSize
   * @return tarmkSize
  **/
  public ConfigNodePropertyInteger getTarmkSize() {
    return tarmkSize;
  }

  public void setTarmkSize(ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties segmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
    return this;
  }

   /**
   * Get segmentCacheSize
   * @return segmentCacheSize
  **/
  public ConfigNodePropertyInteger getSegmentCacheSize() {
    return segmentCacheSize;
  }

  public void setSegmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties stringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
    return this;
  }

   /**
   * Get stringCacheSize
   * @return stringCacheSize
  **/
  public ConfigNodePropertyInteger getStringCacheSize() {
    return stringCacheSize;
  }

  public void setStringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties templateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
    return this;
  }

   /**
   * Get templateCacheSize
   * @return templateCacheSize
  **/
  public ConfigNodePropertyInteger getTemplateCacheSize() {
    return templateCacheSize;
  }

  public void setTemplateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties stringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
    return this;
  }

   /**
   * Get stringDeduplicationCacheSize
   * @return stringDeduplicationCacheSize
  **/
  public ConfigNodePropertyInteger getStringDeduplicationCacheSize() {
    return stringDeduplicationCacheSize;
  }

  public void setStringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties templateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
    return this;
  }

   /**
   * Get templateDeduplicationCacheSize
   * @return templateDeduplicationCacheSize
  **/
  public ConfigNodePropertyInteger getTemplateDeduplicationCacheSize() {
    return templateDeduplicationCacheSize;
  }

  public void setTemplateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties nodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
    return this;
  }

   /**
   * Get nodeDeduplicationCacheSize
   * @return nodeDeduplicationCacheSize
  **/
  public ConfigNodePropertyInteger getNodeDeduplicationCacheSize() {
    return nodeDeduplicationCacheSize;
  }

  public void setNodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties pauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
    return this;
  }

   /**
   * Get pauseCompaction
   * @return pauseCompaction
  **/
  public ConfigNodePropertyBoolean getPauseCompaction() {
    return pauseCompaction;
  }

  public void setPauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
    return this;
  }

   /**
   * Get compactionRetryCount
   * @return compactionRetryCount
  **/
  public ConfigNodePropertyInteger getCompactionRetryCount() {
    return compactionRetryCount;
  }

  public void setCompactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
    return this;
  }

   /**
   * Get compactionForceTimeout
   * @return compactionForceTimeout
  **/
  public ConfigNodePropertyInteger getCompactionForceTimeout() {
    return compactionForceTimeout;
  }

  public void setCompactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
    return this;
  }

   /**
   * Get compactionSizeDeltaEstimation
   * @return compactionSizeDeltaEstimation
  **/
  public ConfigNodePropertyInteger getCompactionSizeDeltaEstimation() {
    return compactionSizeDeltaEstimation;
  }

  public void setCompactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
    return this;
  }

   /**
   * Get compactionDisableEstimation
   * @return compactionDisableEstimation
  **/
  public ConfigNodePropertyBoolean getCompactionDisableEstimation() {
    return compactionDisableEstimation;
  }

  public void setCompactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
    return this;
  }

   /**
   * Get compactionRetainedGenerations
   * @return compactionRetainedGenerations
  **/
  public ConfigNodePropertyInteger getCompactionRetainedGenerations() {
    return compactionRetainedGenerations;
  }

  public void setCompactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
    return this;
  }

   /**
   * Get compactionMemoryThreshold
   * @return compactionMemoryThreshold
  **/
  public ConfigNodePropertyInteger getCompactionMemoryThreshold() {
    return compactionMemoryThreshold;
  }

  public void setCompactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
    return this;
  }

   /**
   * Get compactionProgressLog
   * @return compactionProgressLog
  **/
  public ConfigNodePropertyInteger getCompactionProgressLog() {
    return compactionProgressLog;
  }

  public void setCompactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties standby(ConfigNodePropertyBoolean standby) {
    this.standby = standby;
    return this;
  }

   /**
   * Get standby
   * @return standby
  **/
  public ConfigNodePropertyBoolean getStandby() {
    return standby;
  }

  public void setStandby(ConfigNodePropertyBoolean standby) {
    this.standby = standby;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties customBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
    return this;
  }

   /**
   * Get customBlobStore
   * @return customBlobStore
  **/
  public ConfigNodePropertyBoolean getCustomBlobStore() {
    return customBlobStore;
  }

  public void setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties customSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
    return this;
  }

   /**
   * Get customSegmentStore
   * @return customSegmentStore
  **/
  public ConfigNodePropertyBoolean getCustomSegmentStore() {
    return customSegmentStore;
  }

  public void setCustomSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties splitPersistence(ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
    return this;
  }

   /**
   * Get splitPersistence
   * @return splitPersistence
  **/
  public ConfigNodePropertyBoolean getSplitPersistence() {
    return splitPersistence;
  }

  public void setSplitPersistence(ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties repositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
    return this;
  }

   /**
   * Get repositoryBackupDir
   * @return repositoryBackupDir
  **/
  public ConfigNodePropertyString getRepositoryBackupDir() {
    return repositoryBackupDir;
  }

  public void setRepositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties blobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
    return this;
  }

   /**
   * Get blobGcMaxAgeInSecs
   * @return blobGcMaxAgeInSecs
  **/
  public ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() {
    return blobGcMaxAgeInSecs;
  }

  public void setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties blobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
    return this;
  }

   /**
   * Get blobTrackSnapshotIntervalInSecs
   * @return blobTrackSnapshotIntervalInSecs
  **/
  public ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() {
    return blobTrackSnapshotIntervalInSecs;
  }

  public void setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties role(ConfigNodePropertyString role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  public ConfigNodePropertyString getRole() {
    return role;
  }

  public void setRole(ConfigNodePropertyString role) {
    this.role = role;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties registerDescriptors(ConfigNodePropertyBoolean registerDescriptors) {
    this.registerDescriptors = registerDescriptors;
    return this;
  }

   /**
   * Get registerDescriptors
   * @return registerDescriptors
  **/
  public ConfigNodePropertyBoolean getRegisterDescriptors() {
    return registerDescriptors;
  }

  public void setRegisterDescriptors(ConfigNodePropertyBoolean registerDescriptors) {
    this.registerDescriptors = registerDescriptors;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties dispatchChanges(ConfigNodePropertyBoolean dispatchChanges) {
    this.dispatchChanges = dispatchChanges;
    return this;
  }

   /**
   * Get dispatchChanges
   * @return dispatchChanges
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

