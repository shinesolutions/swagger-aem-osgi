package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties   {
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

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties() {
  }

  /**
   **/
  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties repositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repository.home")
  @Valid public ConfigNodePropertyString getRepositoryHome() {
    return repositoryHome;
  }

  @JsonProperty("repository.home")
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
  @Valid public ConfigNodePropertyString getTarmkMode() {
    return tarmkMode;
  }

  @JsonProperty("tarmk.mode")
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
  @Valid public ConfigNodePropertyInteger getTarmkSize() {
    return tarmkSize;
  }

  @JsonProperty("tarmk.size")
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
  @Valid public ConfigNodePropertyInteger getSegmentCacheSize() {
    return segmentCacheSize;
  }

  @JsonProperty("segmentCache.size")
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
  @Valid public ConfigNodePropertyInteger getStringCacheSize() {
    return stringCacheSize;
  }

  @JsonProperty("stringCache.size")
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
  @Valid public ConfigNodePropertyInteger getTemplateCacheSize() {
    return templateCacheSize;
  }

  @JsonProperty("templateCache.size")
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
  @Valid public ConfigNodePropertyInteger getStringDeduplicationCacheSize() {
    return stringDeduplicationCacheSize;
  }

  @JsonProperty("stringDeduplicationCache.size")
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
  @Valid public ConfigNodePropertyInteger getTemplateDeduplicationCacheSize() {
    return templateDeduplicationCacheSize;
  }

  @JsonProperty("templateDeduplicationCache.size")
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
  @Valid public ConfigNodePropertyInteger getNodeDeduplicationCacheSize() {
    return nodeDeduplicationCacheSize;
  }

  @JsonProperty("nodeDeduplicationCache.size")
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
  @Valid public ConfigNodePropertyBoolean getPauseCompaction() {
    return pauseCompaction;
  }

  @JsonProperty("pauseCompaction")
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
  @Valid public ConfigNodePropertyInteger getCompactionRetryCount() {
    return compactionRetryCount;
  }

  @JsonProperty("compaction.retryCount")
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
  @Valid public ConfigNodePropertyInteger getCompactionForceTimeout() {
    return compactionForceTimeout;
  }

  @JsonProperty("compaction.force.timeout")
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
  @Valid public ConfigNodePropertyInteger getCompactionSizeDeltaEstimation() {
    return compactionSizeDeltaEstimation;
  }

  @JsonProperty("compaction.sizeDeltaEstimation")
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
  @Valid public ConfigNodePropertyBoolean getCompactionDisableEstimation() {
    return compactionDisableEstimation;
  }

  @JsonProperty("compaction.disableEstimation")
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
  @Valid public ConfigNodePropertyInteger getCompactionRetainedGenerations() {
    return compactionRetainedGenerations;
  }

  @JsonProperty("compaction.retainedGenerations")
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
  @Valid public ConfigNodePropertyInteger getCompactionMemoryThreshold() {
    return compactionMemoryThreshold;
  }

  @JsonProperty("compaction.memoryThreshold")
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
  @Valid public ConfigNodePropertyInteger getCompactionProgressLog() {
    return compactionProgressLog;
  }

  @JsonProperty("compaction.progressLog")
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
  @Valid public ConfigNodePropertyBoolean getStandby() {
    return standby;
  }

  @JsonProperty("standby")
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
  @Valid public ConfigNodePropertyBoolean getCustomBlobStore() {
    return customBlobStore;
  }

  @JsonProperty("customBlobStore")
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
  @Valid public ConfigNodePropertyBoolean getCustomSegmentStore() {
    return customSegmentStore;
  }

  @JsonProperty("customSegmentStore")
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
  @Valid public ConfigNodePropertyBoolean getSplitPersistence() {
    return splitPersistence;
  }

  @JsonProperty("splitPersistence")
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
  @Valid public ConfigNodePropertyString getRepositoryBackupDir() {
    return repositoryBackupDir;
  }

  @JsonProperty("repository.backup.dir")
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
  @Valid public ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() {
    return blobGcMaxAgeInSecs;
  }

  @JsonProperty("blobGcMaxAgeInSecs")
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
  @Valid public ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() {
    return blobTrackSnapshotIntervalInSecs;
  }

  @JsonProperty("blobTrackSnapshotIntervalInSecs")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
