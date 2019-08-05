package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties   {
  

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

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  public ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() {
    return blobTrackSnapshotIntervalInSecs;
  }
  public void setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

