package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties   {
  
  private @Valid ConfigNodePropertyString repositoryHome = null;
  private @Valid ConfigNodePropertyString tarmkMode = null;
  private @Valid ConfigNodePropertyInteger tarmkSize = null;
  private @Valid ConfigNodePropertyInteger segmentCacheSize = null;
  private @Valid ConfigNodePropertyInteger stringCacheSize = null;
  private @Valid ConfigNodePropertyInteger templateCacheSize = null;
  private @Valid ConfigNodePropertyInteger stringDeduplicationCacheSize = null;
  private @Valid ConfigNodePropertyInteger templateDeduplicationCacheSize = null;
  private @Valid ConfigNodePropertyInteger nodeDeduplicationCacheSize = null;
  private @Valid ConfigNodePropertyBoolean pauseCompaction = null;
  private @Valid ConfigNodePropertyInteger compactionRetryCount = null;
  private @Valid ConfigNodePropertyInteger compactionForceTimeout = null;
  private @Valid ConfigNodePropertyInteger compactionSizeDeltaEstimation = null;
  private @Valid ConfigNodePropertyBoolean compactionDisableEstimation = null;
  private @Valid ConfigNodePropertyInteger compactionRetainedGenerations = null;
  private @Valid ConfigNodePropertyInteger compactionMemoryThreshold = null;
  private @Valid ConfigNodePropertyInteger compactionProgressLog = null;
  private @Valid ConfigNodePropertyBoolean standby = null;
  private @Valid ConfigNodePropertyBoolean customBlobStore = null;
  private @Valid ConfigNodePropertyBoolean customSegmentStore = null;
  private @Valid ConfigNodePropertyBoolean splitPersistence = null;
  private @Valid ConfigNodePropertyString repositoryBackupDir = null;
  private @Valid ConfigNodePropertyInteger blobGcMaxAgeInSecs = null;
  private @Valid ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs = null;

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties repositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repository.home")
  public ConfigNodePropertyString getRepositoryHome() {
    return repositoryHome;
  }
  public void setRepositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties tarmkMode(ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tarmk.mode")
  public ConfigNodePropertyString getTarmkMode() {
    return tarmkMode;
  }
  public void setTarmkMode(ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties tarmkSize(ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tarmk.size")
  public ConfigNodePropertyInteger getTarmkSize() {
    return tarmkSize;
  }
  public void setTarmkSize(ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties segmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("segmentCache.size")
  public ConfigNodePropertyInteger getSegmentCacheSize() {
    return segmentCacheSize;
  }
  public void setSegmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties stringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stringCache.size")
  public ConfigNodePropertyInteger getStringCacheSize() {
    return stringCacheSize;
  }
  public void setStringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties templateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("templateCache.size")
  public ConfigNodePropertyInteger getTemplateCacheSize() {
    return templateCacheSize;
  }
  public void setTemplateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties stringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stringDeduplicationCache.size")
  public ConfigNodePropertyInteger getStringDeduplicationCacheSize() {
    return stringDeduplicationCacheSize;
  }
  public void setStringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties templateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("templateDeduplicationCache.size")
  public ConfigNodePropertyInteger getTemplateDeduplicationCacheSize() {
    return templateDeduplicationCacheSize;
  }
  public void setTemplateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties nodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nodeDeduplicationCache.size")
  public ConfigNodePropertyInteger getNodeDeduplicationCacheSize() {
    return nodeDeduplicationCacheSize;
  }
  public void setNodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties pauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pauseCompaction")
  public ConfigNodePropertyBoolean getPauseCompaction() {
    return pauseCompaction;
  }
  public void setPauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compaction.retryCount")
  public ConfigNodePropertyInteger getCompactionRetryCount() {
    return compactionRetryCount;
  }
  public void setCompactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compaction.force.timeout")
  public ConfigNodePropertyInteger getCompactionForceTimeout() {
    return compactionForceTimeout;
  }
  public void setCompactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compaction.sizeDeltaEstimation")
  public ConfigNodePropertyInteger getCompactionSizeDeltaEstimation() {
    return compactionSizeDeltaEstimation;
  }
  public void setCompactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compaction.disableEstimation")
  public ConfigNodePropertyBoolean getCompactionDisableEstimation() {
    return compactionDisableEstimation;
  }
  public void setCompactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compaction.retainedGenerations")
  public ConfigNodePropertyInteger getCompactionRetainedGenerations() {
    return compactionRetainedGenerations;
  }
  public void setCompactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compaction.memoryThreshold")
  public ConfigNodePropertyInteger getCompactionMemoryThreshold() {
    return compactionMemoryThreshold;
  }
  public void setCompactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compaction.progressLog")
  public ConfigNodePropertyInteger getCompactionProgressLog() {
    return compactionProgressLog;
  }
  public void setCompactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties standby(ConfigNodePropertyBoolean standby) {
    this.standby = standby;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("standby")
  public ConfigNodePropertyBoolean getStandby() {
    return standby;
  }
  public void setStandby(ConfigNodePropertyBoolean standby) {
    this.standby = standby;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties customBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("customBlobStore")
  public ConfigNodePropertyBoolean getCustomBlobStore() {
    return customBlobStore;
  }
  public void setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties customSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("customSegmentStore")
  public ConfigNodePropertyBoolean getCustomSegmentStore() {
    return customSegmentStore;
  }
  public void setCustomSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties splitPersistence(ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("splitPersistence")
  public ConfigNodePropertyBoolean getSplitPersistence() {
    return splitPersistence;
  }
  public void setSplitPersistence(ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties repositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repository.backup.dir")
  public ConfigNodePropertyString getRepositoryBackupDir() {
    return repositoryBackupDir;
  }
  public void setRepositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties blobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("blobGcMaxAgeInSecs")
  public ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() {
    return blobGcMaxAgeInSecs;
  }
  public void setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties blobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  public ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() {
    return blobTrackSnapshotIntervalInSecs;
  }
  public void setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties = (OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) o;
    return Objects.equals(repositoryHome, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.repositoryHome) &&
        Objects.equals(tarmkMode, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.tarmkMode) &&
        Objects.equals(tarmkSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.tarmkSize) &&
        Objects.equals(segmentCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.segmentCacheSize) &&
        Objects.equals(stringCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.stringCacheSize) &&
        Objects.equals(templateCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.templateCacheSize) &&
        Objects.equals(stringDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.stringDeduplicationCacheSize) &&
        Objects.equals(templateDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.templateDeduplicationCacheSize) &&
        Objects.equals(nodeDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.nodeDeduplicationCacheSize) &&
        Objects.equals(pauseCompaction, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.pauseCompaction) &&
        Objects.equals(compactionRetryCount, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionRetryCount) &&
        Objects.equals(compactionForceTimeout, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionForceTimeout) &&
        Objects.equals(compactionSizeDeltaEstimation, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionSizeDeltaEstimation) &&
        Objects.equals(compactionDisableEstimation, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionDisableEstimation) &&
        Objects.equals(compactionRetainedGenerations, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionRetainedGenerations) &&
        Objects.equals(compactionMemoryThreshold, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionMemoryThreshold) &&
        Objects.equals(compactionProgressLog, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionProgressLog) &&
        Objects.equals(standby, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.standby) &&
        Objects.equals(customBlobStore, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.customBlobStore) &&
        Objects.equals(customSegmentStore, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.customSegmentStore) &&
        Objects.equals(splitPersistence, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.splitPersistence) &&
        Objects.equals(repositoryBackupDir, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.repositoryBackupDir) &&
        Objects.equals(blobGcMaxAgeInSecs, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.blobGcMaxAgeInSecs) &&
        Objects.equals(blobTrackSnapshotIntervalInSecs, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.blobTrackSnapshotIntervalInSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryHome, tarmkMode, tarmkSize, segmentCacheSize, stringCacheSize, templateCacheSize, stringDeduplicationCacheSize, templateDeduplicationCacheSize, nodeDeduplicationCacheSize, pauseCompaction, compactionRetryCount, compactionForceTimeout, compactionSizeDeltaEstimation, compactionDisableEstimation, compactionRetainedGenerations, compactionMemoryThreshold, compactionProgressLog, standby, customBlobStore, customSegmentStore, splitPersistence, repositoryBackupDir, blobGcMaxAgeInSecs, blobTrackSnapshotIntervalInSecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties {\n");
    
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

