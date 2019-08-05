package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties   {
  @JsonProperty("repository.home")
  private ConfigNodePropertyString repositoryHome = null;

  @JsonProperty("tarmk.mode")
  private ConfigNodePropertyString tarmkMode = null;

  @JsonProperty("tarmk.size")
  private ConfigNodePropertyInteger tarmkSize = null;

  @JsonProperty("segmentCache.size")
  private ConfigNodePropertyInteger segmentCacheSize = null;

  @JsonProperty("stringCache.size")
  private ConfigNodePropertyInteger stringCacheSize = null;

  @JsonProperty("templateCache.size")
  private ConfigNodePropertyInteger templateCacheSize = null;

  @JsonProperty("stringDeduplicationCache.size")
  private ConfigNodePropertyInteger stringDeduplicationCacheSize = null;

  @JsonProperty("templateDeduplicationCache.size")
  private ConfigNodePropertyInteger templateDeduplicationCacheSize = null;

  @JsonProperty("nodeDeduplicationCache.size")
  private ConfigNodePropertyInteger nodeDeduplicationCacheSize = null;

  @JsonProperty("pauseCompaction")
  private ConfigNodePropertyBoolean pauseCompaction = null;

  @JsonProperty("compaction.retryCount")
  private ConfigNodePropertyInteger compactionRetryCount = null;

  @JsonProperty("compaction.force.timeout")
  private ConfigNodePropertyInteger compactionForceTimeout = null;

  @JsonProperty("compaction.sizeDeltaEstimation")
  private ConfigNodePropertyInteger compactionSizeDeltaEstimation = null;

  @JsonProperty("compaction.disableEstimation")
  private ConfigNodePropertyBoolean compactionDisableEstimation = null;

  @JsonProperty("compaction.retainedGenerations")
  private ConfigNodePropertyInteger compactionRetainedGenerations = null;

  @JsonProperty("compaction.memoryThreshold")
  private ConfigNodePropertyInteger compactionMemoryThreshold = null;

  @JsonProperty("compaction.progressLog")
  private ConfigNodePropertyInteger compactionProgressLog = null;

  @JsonProperty("standby")
  private ConfigNodePropertyBoolean standby = null;

  @JsonProperty("customBlobStore")
  private ConfigNodePropertyBoolean customBlobStore = null;

  @JsonProperty("customSegmentStore")
  private ConfigNodePropertyBoolean customSegmentStore = null;

  @JsonProperty("splitPersistence")
  private ConfigNodePropertyBoolean splitPersistence = null;

  @JsonProperty("repository.backup.dir")
  private ConfigNodePropertyString repositoryBackupDir = null;

  @JsonProperty("blobGcMaxAgeInSecs")
  private ConfigNodePropertyInteger blobGcMaxAgeInSecs = null;

  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs = null;

  @JsonProperty("role")
  private ConfigNodePropertyString role = null;

  @JsonProperty("registerDescriptors")
  private ConfigNodePropertyBoolean registerDescriptors = null;

  @JsonProperty("dispatchChanges")
  private ConfigNodePropertyBoolean dispatchChanges = null;

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties repositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
    return this;
  }

   /**
   * Get repositoryHome
   * @return repositoryHome
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDispatchChanges() {
    return dispatchChanges;
  }

  public void setDispatchChanges(ConfigNodePropertyBoolean dispatchChanges) {
    this.dispatchChanges = dispatchChanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties = (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) o;
    return Objects.equals(this.repositoryHome, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.repositoryHome) &&
        Objects.equals(this.tarmkMode, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.tarmkMode) &&
        Objects.equals(this.tarmkSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.tarmkSize) &&
        Objects.equals(this.segmentCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.segmentCacheSize) &&
        Objects.equals(this.stringCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.stringCacheSize) &&
        Objects.equals(this.templateCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.templateCacheSize) &&
        Objects.equals(this.stringDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.stringDeduplicationCacheSize) &&
        Objects.equals(this.templateDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.templateDeduplicationCacheSize) &&
        Objects.equals(this.nodeDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.nodeDeduplicationCacheSize) &&
        Objects.equals(this.pauseCompaction, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.pauseCompaction) &&
        Objects.equals(this.compactionRetryCount, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionRetryCount) &&
        Objects.equals(this.compactionForceTimeout, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionForceTimeout) &&
        Objects.equals(this.compactionSizeDeltaEstimation, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionSizeDeltaEstimation) &&
        Objects.equals(this.compactionDisableEstimation, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionDisableEstimation) &&
        Objects.equals(this.compactionRetainedGenerations, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionRetainedGenerations) &&
        Objects.equals(this.compactionMemoryThreshold, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionMemoryThreshold) &&
        Objects.equals(this.compactionProgressLog, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.compactionProgressLog) &&
        Objects.equals(this.standby, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.standby) &&
        Objects.equals(this.customBlobStore, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.customBlobStore) &&
        Objects.equals(this.customSegmentStore, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.customSegmentStore) &&
        Objects.equals(this.splitPersistence, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.splitPersistence) &&
        Objects.equals(this.repositoryBackupDir, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.repositoryBackupDir) &&
        Objects.equals(this.blobGcMaxAgeInSecs, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.blobGcMaxAgeInSecs) &&
        Objects.equals(this.blobTrackSnapshotIntervalInSecs, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.blobTrackSnapshotIntervalInSecs) &&
        Objects.equals(this.role, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.role) &&
        Objects.equals(this.registerDescriptors, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.registerDescriptors) &&
        Objects.equals(this.dispatchChanges, orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.dispatchChanges);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

