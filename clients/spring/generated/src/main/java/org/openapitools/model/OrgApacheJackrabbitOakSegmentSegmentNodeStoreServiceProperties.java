package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties   {
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

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties repositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
    return this;
  }

  /**
   * Get repositoryHome
   * @return repositoryHome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getRepositoryHome() {
    return repositoryHome;
  }

  public void setRepositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties tarmkMode(ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
    return this;
  }

  /**
   * Get tarmkMode
   * @return tarmkMode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getTarmkMode() {
    return tarmkMode;
  }

  public void setTarmkMode(ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties tarmkSize(ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
    return this;
  }

  /**
   * Get tarmkSize
   * @return tarmkSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getTarmkSize() {
    return tarmkSize;
  }

  public void setTarmkSize(ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties segmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
    return this;
  }

  /**
   * Get segmentCacheSize
   * @return segmentCacheSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getSegmentCacheSize() {
    return segmentCacheSize;
  }

  public void setSegmentCacheSize(ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties stringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
    return this;
  }

  /**
   * Get stringCacheSize
   * @return stringCacheSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getStringCacheSize() {
    return stringCacheSize;
  }

  public void setStringCacheSize(ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties templateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
    return this;
  }

  /**
   * Get templateCacheSize
   * @return templateCacheSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getTemplateCacheSize() {
    return templateCacheSize;
  }

  public void setTemplateCacheSize(ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties stringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
    return this;
  }

  /**
   * Get stringDeduplicationCacheSize
   * @return stringDeduplicationCacheSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getStringDeduplicationCacheSize() {
    return stringDeduplicationCacheSize;
  }

  public void setStringDeduplicationCacheSize(ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties templateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
    return this;
  }

  /**
   * Get templateDeduplicationCacheSize
   * @return templateDeduplicationCacheSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getTemplateDeduplicationCacheSize() {
    return templateDeduplicationCacheSize;
  }

  public void setTemplateDeduplicationCacheSize(ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties nodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
    return this;
  }

  /**
   * Get nodeDeduplicationCacheSize
   * @return nodeDeduplicationCacheSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getNodeDeduplicationCacheSize() {
    return nodeDeduplicationCacheSize;
  }

  public void setNodeDeduplicationCacheSize(ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties pauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
    return this;
  }

  /**
   * Get pauseCompaction
   * @return pauseCompaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getPauseCompaction() {
    return pauseCompaction;
  }

  public void setPauseCompaction(ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
    return this;
  }

  /**
   * Get compactionRetryCount
   * @return compactionRetryCount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCompactionRetryCount() {
    return compactionRetryCount;
  }

  public void setCompactionRetryCount(ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
    return this;
  }

  /**
   * Get compactionForceTimeout
   * @return compactionForceTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCompactionForceTimeout() {
    return compactionForceTimeout;
  }

  public void setCompactionForceTimeout(ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
    return this;
  }

  /**
   * Get compactionSizeDeltaEstimation
   * @return compactionSizeDeltaEstimation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCompactionSizeDeltaEstimation() {
    return compactionSizeDeltaEstimation;
  }

  public void setCompactionSizeDeltaEstimation(ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
    return this;
  }

  /**
   * Get compactionDisableEstimation
   * @return compactionDisableEstimation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getCompactionDisableEstimation() {
    return compactionDisableEstimation;
  }

  public void setCompactionDisableEstimation(ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
    return this;
  }

  /**
   * Get compactionRetainedGenerations
   * @return compactionRetainedGenerations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCompactionRetainedGenerations() {
    return compactionRetainedGenerations;
  }

  public void setCompactionRetainedGenerations(ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
    return this;
  }

  /**
   * Get compactionMemoryThreshold
   * @return compactionMemoryThreshold
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCompactionMemoryThreshold() {
    return compactionMemoryThreshold;
  }

  public void setCompactionMemoryThreshold(ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties compactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
    return this;
  }

  /**
   * Get compactionProgressLog
   * @return compactionProgressLog
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCompactionProgressLog() {
    return compactionProgressLog;
  }

  public void setCompactionProgressLog(ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties standby(ConfigNodePropertyBoolean standby) {
    this.standby = standby;
    return this;
  }

  /**
   * Get standby
   * @return standby
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getStandby() {
    return standby;
  }

  public void setStandby(ConfigNodePropertyBoolean standby) {
    this.standby = standby;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties customBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
    return this;
  }

  /**
   * Get customBlobStore
   * @return customBlobStore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getCustomBlobStore() {
    return customBlobStore;
  }

  public void setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties customSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
    return this;
  }

  /**
   * Get customSegmentStore
   * @return customSegmentStore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getCustomSegmentStore() {
    return customSegmentStore;
  }

  public void setCustomSegmentStore(ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties splitPersistence(ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
    return this;
  }

  /**
   * Get splitPersistence
   * @return splitPersistence
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getSplitPersistence() {
    return splitPersistence;
  }

  public void setSplitPersistence(ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties repositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
    return this;
  }

  /**
   * Get repositoryBackupDir
   * @return repositoryBackupDir
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getRepositoryBackupDir() {
    return repositoryBackupDir;
  }

  public void setRepositoryBackupDir(ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties blobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
    return this;
  }

  /**
   * Get blobGcMaxAgeInSecs
   * @return blobGcMaxAgeInSecs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() {
    return blobGcMaxAgeInSecs;
  }

  public void setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties blobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
    return this;
  }

  /**
   * Get blobTrackSnapshotIntervalInSecs
   * @return blobTrackSnapshotIntervalInSecs
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.repositoryHome, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.repositoryHome) &&
        Objects.equals(this.tarmkMode, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.tarmkMode) &&
        Objects.equals(this.tarmkSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.tarmkSize) &&
        Objects.equals(this.segmentCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.segmentCacheSize) &&
        Objects.equals(this.stringCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.stringCacheSize) &&
        Objects.equals(this.templateCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.templateCacheSize) &&
        Objects.equals(this.stringDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.stringDeduplicationCacheSize) &&
        Objects.equals(this.templateDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.templateDeduplicationCacheSize) &&
        Objects.equals(this.nodeDeduplicationCacheSize, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.nodeDeduplicationCacheSize) &&
        Objects.equals(this.pauseCompaction, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.pauseCompaction) &&
        Objects.equals(this.compactionRetryCount, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionRetryCount) &&
        Objects.equals(this.compactionForceTimeout, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionForceTimeout) &&
        Objects.equals(this.compactionSizeDeltaEstimation, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionSizeDeltaEstimation) &&
        Objects.equals(this.compactionDisableEstimation, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionDisableEstimation) &&
        Objects.equals(this.compactionRetainedGenerations, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionRetainedGenerations) &&
        Objects.equals(this.compactionMemoryThreshold, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionMemoryThreshold) &&
        Objects.equals(this.compactionProgressLog, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.compactionProgressLog) &&
        Objects.equals(this.standby, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.standby) &&
        Objects.equals(this.customBlobStore, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.customBlobStore) &&
        Objects.equals(this.customSegmentStore, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.customSegmentStore) &&
        Objects.equals(this.splitPersistence, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.splitPersistence) &&
        Objects.equals(this.repositoryBackupDir, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.repositoryBackupDir) &&
        Objects.equals(this.blobGcMaxAgeInSecs, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.blobGcMaxAgeInSecs) &&
        Objects.equals(this.blobTrackSnapshotIntervalInSecs, orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.blobTrackSnapshotIntervalInSecs);
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

