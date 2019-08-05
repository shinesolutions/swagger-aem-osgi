package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString repositoryHome = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString tarmkMode = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger tarmkSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger segmentCacheSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger stringCacheSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger templateCacheSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger stringDeduplicationCacheSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger templateDeduplicationCacheSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger nodeDeduplicationCacheSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean pauseCompaction = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger compactionRetryCount = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger compactionForceTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger compactionSizeDeltaEstimation = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean compactionDisableEstimation = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger compactionRetainedGenerations = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger compactionMemoryThreshold = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger compactionProgressLog = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean standby = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean customBlobStore = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean customSegmentStore = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean splitPersistence = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString repositoryBackupDir = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger blobGcMaxAgeInSecs = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString role = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean registerDescriptors = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean dispatchChanges = null;
 /**
   * Get repositoryHome
   * @return repositoryHome
  **/
  @JsonProperty("repository.home")
  public ConfigNodePropertyString getRepositoryHome() {
    return repositoryHome;
  }

  public void setRepositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties repositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
    return this;
  }

 /**
   * Get tarmkMode
   * @return tarmkMode
  **/
  @JsonProperty("tarmk.mode")
  public ConfigNodePropertyString getTarmkMode() {
    return tarmkMode;
  }

  public void setTarmkMode(ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties tarmkMode(ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
    return this;
  }

 /**
   * Get tarmkSize
   * @return tarmkSize
  **/
  @JsonProperty("tarmk.size")
  public ConfigNodePropertyInteger getTarmkSize() {
    return tarmkSize;
  }

  public void setTarmkSize(ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties tarmkSize(ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
    return this;
  }

 /**
   * Get segmentCacheSize
   * @return segmentCacheSize
  **/
  @JsonProperty("segmentCache.size")
  public ConfigNodePropertyInteger getSegmentCacheSize() {
    return segmentCacheSize;
  }

  public void setSegmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties segmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
    return this;
  }

 /**
   * Get stringCacheSize
   * @return stringCacheSize
  **/
  @JsonProperty("stringCache.size")
  public ConfigNodePropertyInteger getStringCacheSize() {
    return stringCacheSize;
  }

  public void setStringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties stringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
    return this;
  }

 /**
   * Get templateCacheSize
   * @return templateCacheSize
  **/
  @JsonProperty("templateCache.size")
  public ConfigNodePropertyInteger getTemplateCacheSize() {
    return templateCacheSize;
  }

  public void setTemplateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties templateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
    return this;
  }

 /**
   * Get stringDeduplicationCacheSize
   * @return stringDeduplicationCacheSize
  **/
  @JsonProperty("stringDeduplicationCache.size")
  public ConfigNodePropertyInteger getStringDeduplicationCacheSize() {
    return stringDeduplicationCacheSize;
  }

  public void setStringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties stringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
    return this;
  }

 /**
   * Get templateDeduplicationCacheSize
   * @return templateDeduplicationCacheSize
  **/
  @JsonProperty("templateDeduplicationCache.size")
  public ConfigNodePropertyInteger getTemplateDeduplicationCacheSize() {
    return templateDeduplicationCacheSize;
  }

  public void setTemplateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties templateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
    return this;
  }

 /**
   * Get nodeDeduplicationCacheSize
   * @return nodeDeduplicationCacheSize
  **/
  @JsonProperty("nodeDeduplicationCache.size")
  public ConfigNodePropertyInteger getNodeDeduplicationCacheSize() {
    return nodeDeduplicationCacheSize;
  }

  public void setNodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties nodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
    return this;
  }

 /**
   * Get pauseCompaction
   * @return pauseCompaction
  **/
  @JsonProperty("pauseCompaction")
  public ConfigNodePropertyBoolean getPauseCompaction() {
    return pauseCompaction;
  }

  public void setPauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties pauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
    return this;
  }

 /**
   * Get compactionRetryCount
   * @return compactionRetryCount
  **/
  @JsonProperty("compaction.retryCount")
  public ConfigNodePropertyInteger getCompactionRetryCount() {
    return compactionRetryCount;
  }

  public void setCompactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
    return this;
  }

 /**
   * Get compactionForceTimeout
   * @return compactionForceTimeout
  **/
  @JsonProperty("compaction.force.timeout")
  public ConfigNodePropertyInteger getCompactionForceTimeout() {
    return compactionForceTimeout;
  }

  public void setCompactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
    return this;
  }

 /**
   * Get compactionSizeDeltaEstimation
   * @return compactionSizeDeltaEstimation
  **/
  @JsonProperty("compaction.sizeDeltaEstimation")
  public ConfigNodePropertyInteger getCompactionSizeDeltaEstimation() {
    return compactionSizeDeltaEstimation;
  }

  public void setCompactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
    return this;
  }

 /**
   * Get compactionDisableEstimation
   * @return compactionDisableEstimation
  **/
  @JsonProperty("compaction.disableEstimation")
  public ConfigNodePropertyBoolean getCompactionDisableEstimation() {
    return compactionDisableEstimation;
  }

  public void setCompactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
    return this;
  }

 /**
   * Get compactionRetainedGenerations
   * @return compactionRetainedGenerations
  **/
  @JsonProperty("compaction.retainedGenerations")
  public ConfigNodePropertyInteger getCompactionRetainedGenerations() {
    return compactionRetainedGenerations;
  }

  public void setCompactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
    return this;
  }

 /**
   * Get compactionMemoryThreshold
   * @return compactionMemoryThreshold
  **/
  @JsonProperty("compaction.memoryThreshold")
  public ConfigNodePropertyInteger getCompactionMemoryThreshold() {
    return compactionMemoryThreshold;
  }

  public void setCompactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
    return this;
  }

 /**
   * Get compactionProgressLog
   * @return compactionProgressLog
  **/
  @JsonProperty("compaction.progressLog")
  public ConfigNodePropertyInteger getCompactionProgressLog() {
    return compactionProgressLog;
  }

  public void setCompactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
    return this;
  }

 /**
   * Get standby
   * @return standby
  **/
  @JsonProperty("standby")
  public ConfigNodePropertyBoolean getStandby() {
    return standby;
  }

  public void setStandby(ConfigNodePropertyBoolean standby) {
    this.standby = standby;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties standby(ConfigNodePropertyBoolean standby) {
    this.standby = standby;
    return this;
  }

 /**
   * Get customBlobStore
   * @return customBlobStore
  **/
  @JsonProperty("customBlobStore")
  public ConfigNodePropertyBoolean getCustomBlobStore() {
    return customBlobStore;
  }

  public void setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties customBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
    return this;
  }

 /**
   * Get customSegmentStore
   * @return customSegmentStore
  **/
  @JsonProperty("customSegmentStore")
  public ConfigNodePropertyBoolean getCustomSegmentStore() {
    return customSegmentStore;
  }

  public void setCustomSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties customSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
    return this;
  }

 /**
   * Get splitPersistence
   * @return splitPersistence
  **/
  @JsonProperty("splitPersistence")
  public ConfigNodePropertyBoolean getSplitPersistence() {
    return splitPersistence;
  }

  public void setSplitPersistence(ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties splitPersistence(ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
    return this;
  }

 /**
   * Get repositoryBackupDir
   * @return repositoryBackupDir
  **/
  @JsonProperty("repository.backup.dir")
  public ConfigNodePropertyString getRepositoryBackupDir() {
    return repositoryBackupDir;
  }

  public void setRepositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties repositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
    return this;
  }

 /**
   * Get blobGcMaxAgeInSecs
   * @return blobGcMaxAgeInSecs
  **/
  @JsonProperty("blobGcMaxAgeInSecs")
  public ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() {
    return blobGcMaxAgeInSecs;
  }

  public void setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties blobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
    return this;
  }

 /**
   * Get blobTrackSnapshotIntervalInSecs
   * @return blobTrackSnapshotIntervalInSecs
  **/
  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  public ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() {
    return blobTrackSnapshotIntervalInSecs;
  }

  public void setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties blobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
    return this;
  }

 /**
   * Get role
   * @return role
  **/
  @JsonProperty("role")
  public ConfigNodePropertyString getRole() {
    return role;
  }

  public void setRole(ConfigNodePropertyString role) {
    this.role = role;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties role(ConfigNodePropertyString role) {
    this.role = role;
    return this;
  }

 /**
   * Get registerDescriptors
   * @return registerDescriptors
  **/
  @JsonProperty("registerDescriptors")
  public ConfigNodePropertyBoolean getRegisterDescriptors() {
    return registerDescriptors;
  }

  public void setRegisterDescriptors(ConfigNodePropertyBoolean registerDescriptors) {
    this.registerDescriptors = registerDescriptors;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties registerDescriptors(ConfigNodePropertyBoolean registerDescriptors) {
    this.registerDescriptors = registerDescriptors;
    return this;
  }

 /**
   * Get dispatchChanges
   * @return dispatchChanges
  **/
  @JsonProperty("dispatchChanges")
  public ConfigNodePropertyBoolean getDispatchChanges() {
    return dispatchChanges;
  }

  public void setDispatchChanges(ConfigNodePropertyBoolean dispatchChanges) {
    this.dispatchChanges = dispatchChanges;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties dispatchChanges(ConfigNodePropertyBoolean dispatchChanges) {
    this.dispatchChanges = dispatchChanges;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

