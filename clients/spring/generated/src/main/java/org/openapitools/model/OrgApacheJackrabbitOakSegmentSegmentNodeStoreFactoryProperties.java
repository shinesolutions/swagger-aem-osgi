package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString repositoryHome;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString tarmkMode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger tarmkSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger segmentCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger stringCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger templateCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger stringDeduplicationCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger templateDeduplicationCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger nodeDeduplicationCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean pauseCompaction;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger compactionRetryCount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger compactionForceTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger compactionSizeDeltaEstimation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean compactionDisableEstimation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger compactionRetainedGenerations;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger compactionMemoryThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger compactionProgressLog;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean standby;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean customBlobStore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean customSegmentStore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean splitPersistence;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString repositoryBackupDir;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger blobGcMaxAgeInSecs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString role;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean registerDescriptors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean dispatchChanges;

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties repositoryHome(@Nullable ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
    return this;
  }

  /**
   * Get repositoryHome
   * @return repositoryHome
   */
  @Valid 
  @Schema(name = "repository.home", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repository.home")
  public @Nullable ConfigNodePropertyString getRepositoryHome() {
    return repositoryHome;
  }

  @JsonProperty("repository.home")
  public void setRepositoryHome(@Nullable ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties tarmkMode(@Nullable ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
    return this;
  }

  /**
   * Get tarmkMode
   * @return tarmkMode
   */
  @Valid 
  @Schema(name = "tarmk.mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tarmk.mode")
  public @Nullable ConfigNodePropertyString getTarmkMode() {
    return tarmkMode;
  }

  @JsonProperty("tarmk.mode")
  public void setTarmkMode(@Nullable ConfigNodePropertyString tarmkMode) {
    this.tarmkMode = tarmkMode;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties tarmkSize(@Nullable ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
    return this;
  }

  /**
   * Get tarmkSize
   * @return tarmkSize
   */
  @Valid 
  @Schema(name = "tarmk.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tarmk.size")
  public @Nullable ConfigNodePropertyInteger getTarmkSize() {
    return tarmkSize;
  }

  @JsonProperty("tarmk.size")
  public void setTarmkSize(@Nullable ConfigNodePropertyInteger tarmkSize) {
    this.tarmkSize = tarmkSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties segmentCacheSize(@Nullable ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
    return this;
  }

  /**
   * Get segmentCacheSize
   * @return segmentCacheSize
   */
  @Valid 
  @Schema(name = "segmentCache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("segmentCache.size")
  public @Nullable ConfigNodePropertyInteger getSegmentCacheSize() {
    return segmentCacheSize;
  }

  @JsonProperty("segmentCache.size")
  public void setSegmentCacheSize(@Nullable ConfigNodePropertyInteger segmentCacheSize) {
    this.segmentCacheSize = segmentCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties stringCacheSize(@Nullable ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
    return this;
  }

  /**
   * Get stringCacheSize
   * @return stringCacheSize
   */
  @Valid 
  @Schema(name = "stringCache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringCache.size")
  public @Nullable ConfigNodePropertyInteger getStringCacheSize() {
    return stringCacheSize;
  }

  @JsonProperty("stringCache.size")
  public void setStringCacheSize(@Nullable ConfigNodePropertyInteger stringCacheSize) {
    this.stringCacheSize = stringCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties templateCacheSize(@Nullable ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
    return this;
  }

  /**
   * Get templateCacheSize
   * @return templateCacheSize
   */
  @Valid 
  @Schema(name = "templateCache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("templateCache.size")
  public @Nullable ConfigNodePropertyInteger getTemplateCacheSize() {
    return templateCacheSize;
  }

  @JsonProperty("templateCache.size")
  public void setTemplateCacheSize(@Nullable ConfigNodePropertyInteger templateCacheSize) {
    this.templateCacheSize = templateCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties stringDeduplicationCacheSize(@Nullable ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
    return this;
  }

  /**
   * Get stringDeduplicationCacheSize
   * @return stringDeduplicationCacheSize
   */
  @Valid 
  @Schema(name = "stringDeduplicationCache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringDeduplicationCache.size")
  public @Nullable ConfigNodePropertyInteger getStringDeduplicationCacheSize() {
    return stringDeduplicationCacheSize;
  }

  @JsonProperty("stringDeduplicationCache.size")
  public void setStringDeduplicationCacheSize(@Nullable ConfigNodePropertyInteger stringDeduplicationCacheSize) {
    this.stringDeduplicationCacheSize = stringDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties templateDeduplicationCacheSize(@Nullable ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
    return this;
  }

  /**
   * Get templateDeduplicationCacheSize
   * @return templateDeduplicationCacheSize
   */
  @Valid 
  @Schema(name = "templateDeduplicationCache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("templateDeduplicationCache.size")
  public @Nullable ConfigNodePropertyInteger getTemplateDeduplicationCacheSize() {
    return templateDeduplicationCacheSize;
  }

  @JsonProperty("templateDeduplicationCache.size")
  public void setTemplateDeduplicationCacheSize(@Nullable ConfigNodePropertyInteger templateDeduplicationCacheSize) {
    this.templateDeduplicationCacheSize = templateDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties nodeDeduplicationCacheSize(@Nullable ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
    return this;
  }

  /**
   * Get nodeDeduplicationCacheSize
   * @return nodeDeduplicationCacheSize
   */
  @Valid 
  @Schema(name = "nodeDeduplicationCache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nodeDeduplicationCache.size")
  public @Nullable ConfigNodePropertyInteger getNodeDeduplicationCacheSize() {
    return nodeDeduplicationCacheSize;
  }

  @JsonProperty("nodeDeduplicationCache.size")
  public void setNodeDeduplicationCacheSize(@Nullable ConfigNodePropertyInteger nodeDeduplicationCacheSize) {
    this.nodeDeduplicationCacheSize = nodeDeduplicationCacheSize;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties pauseCompaction(@Nullable ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
    return this;
  }

  /**
   * Get pauseCompaction
   * @return pauseCompaction
   */
  @Valid 
  @Schema(name = "pauseCompaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pauseCompaction")
  public @Nullable ConfigNodePropertyBoolean getPauseCompaction() {
    return pauseCompaction;
  }

  @JsonProperty("pauseCompaction")
  public void setPauseCompaction(@Nullable ConfigNodePropertyBoolean pauseCompaction) {
    this.pauseCompaction = pauseCompaction;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionRetryCount(@Nullable ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
    return this;
  }

  /**
   * Get compactionRetryCount
   * @return compactionRetryCount
   */
  @Valid 
  @Schema(name = "compaction.retryCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compaction.retryCount")
  public @Nullable ConfigNodePropertyInteger getCompactionRetryCount() {
    return compactionRetryCount;
  }

  @JsonProperty("compaction.retryCount")
  public void setCompactionRetryCount(@Nullable ConfigNodePropertyInteger compactionRetryCount) {
    this.compactionRetryCount = compactionRetryCount;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionForceTimeout(@Nullable ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
    return this;
  }

  /**
   * Get compactionForceTimeout
   * @return compactionForceTimeout
   */
  @Valid 
  @Schema(name = "compaction.force.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compaction.force.timeout")
  public @Nullable ConfigNodePropertyInteger getCompactionForceTimeout() {
    return compactionForceTimeout;
  }

  @JsonProperty("compaction.force.timeout")
  public void setCompactionForceTimeout(@Nullable ConfigNodePropertyInteger compactionForceTimeout) {
    this.compactionForceTimeout = compactionForceTimeout;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionSizeDeltaEstimation(@Nullable ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
    return this;
  }

  /**
   * Get compactionSizeDeltaEstimation
   * @return compactionSizeDeltaEstimation
   */
  @Valid 
  @Schema(name = "compaction.sizeDeltaEstimation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compaction.sizeDeltaEstimation")
  public @Nullable ConfigNodePropertyInteger getCompactionSizeDeltaEstimation() {
    return compactionSizeDeltaEstimation;
  }

  @JsonProperty("compaction.sizeDeltaEstimation")
  public void setCompactionSizeDeltaEstimation(@Nullable ConfigNodePropertyInteger compactionSizeDeltaEstimation) {
    this.compactionSizeDeltaEstimation = compactionSizeDeltaEstimation;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionDisableEstimation(@Nullable ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
    return this;
  }

  /**
   * Get compactionDisableEstimation
   * @return compactionDisableEstimation
   */
  @Valid 
  @Schema(name = "compaction.disableEstimation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compaction.disableEstimation")
  public @Nullable ConfigNodePropertyBoolean getCompactionDisableEstimation() {
    return compactionDisableEstimation;
  }

  @JsonProperty("compaction.disableEstimation")
  public void setCompactionDisableEstimation(@Nullable ConfigNodePropertyBoolean compactionDisableEstimation) {
    this.compactionDisableEstimation = compactionDisableEstimation;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionRetainedGenerations(@Nullable ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
    return this;
  }

  /**
   * Get compactionRetainedGenerations
   * @return compactionRetainedGenerations
   */
  @Valid 
  @Schema(name = "compaction.retainedGenerations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compaction.retainedGenerations")
  public @Nullable ConfigNodePropertyInteger getCompactionRetainedGenerations() {
    return compactionRetainedGenerations;
  }

  @JsonProperty("compaction.retainedGenerations")
  public void setCompactionRetainedGenerations(@Nullable ConfigNodePropertyInteger compactionRetainedGenerations) {
    this.compactionRetainedGenerations = compactionRetainedGenerations;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionMemoryThreshold(@Nullable ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
    return this;
  }

  /**
   * Get compactionMemoryThreshold
   * @return compactionMemoryThreshold
   */
  @Valid 
  @Schema(name = "compaction.memoryThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compaction.memoryThreshold")
  public @Nullable ConfigNodePropertyInteger getCompactionMemoryThreshold() {
    return compactionMemoryThreshold;
  }

  @JsonProperty("compaction.memoryThreshold")
  public void setCompactionMemoryThreshold(@Nullable ConfigNodePropertyInteger compactionMemoryThreshold) {
    this.compactionMemoryThreshold = compactionMemoryThreshold;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties compactionProgressLog(@Nullable ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
    return this;
  }

  /**
   * Get compactionProgressLog
   * @return compactionProgressLog
   */
  @Valid 
  @Schema(name = "compaction.progressLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compaction.progressLog")
  public @Nullable ConfigNodePropertyInteger getCompactionProgressLog() {
    return compactionProgressLog;
  }

  @JsonProperty("compaction.progressLog")
  public void setCompactionProgressLog(@Nullable ConfigNodePropertyInteger compactionProgressLog) {
    this.compactionProgressLog = compactionProgressLog;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties standby(@Nullable ConfigNodePropertyBoolean standby) {
    this.standby = standby;
    return this;
  }

  /**
   * Get standby
   * @return standby
   */
  @Valid 
  @Schema(name = "standby", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("standby")
  public @Nullable ConfigNodePropertyBoolean getStandby() {
    return standby;
  }

  @JsonProperty("standby")
  public void setStandby(@Nullable ConfigNodePropertyBoolean standby) {
    this.standby = standby;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties customBlobStore(@Nullable ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
    return this;
  }

  /**
   * Get customBlobStore
   * @return customBlobStore
   */
  @Valid 
  @Schema(name = "customBlobStore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customBlobStore")
  public @Nullable ConfigNodePropertyBoolean getCustomBlobStore() {
    return customBlobStore;
  }

  @JsonProperty("customBlobStore")
  public void setCustomBlobStore(@Nullable ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties customSegmentStore(@Nullable ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
    return this;
  }

  /**
   * Get customSegmentStore
   * @return customSegmentStore
   */
  @Valid 
  @Schema(name = "customSegmentStore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customSegmentStore")
  public @Nullable ConfigNodePropertyBoolean getCustomSegmentStore() {
    return customSegmentStore;
  }

  @JsonProperty("customSegmentStore")
  public void setCustomSegmentStore(@Nullable ConfigNodePropertyBoolean customSegmentStore) {
    this.customSegmentStore = customSegmentStore;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties splitPersistence(@Nullable ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
    return this;
  }

  /**
   * Get splitPersistence
   * @return splitPersistence
   */
  @Valid 
  @Schema(name = "splitPersistence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("splitPersistence")
  public @Nullable ConfigNodePropertyBoolean getSplitPersistence() {
    return splitPersistence;
  }

  @JsonProperty("splitPersistence")
  public void setSplitPersistence(@Nullable ConfigNodePropertyBoolean splitPersistence) {
    this.splitPersistence = splitPersistence;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties repositoryBackupDir(@Nullable ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
    return this;
  }

  /**
   * Get repositoryBackupDir
   * @return repositoryBackupDir
   */
  @Valid 
  @Schema(name = "repository.backup.dir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repository.backup.dir")
  public @Nullable ConfigNodePropertyString getRepositoryBackupDir() {
    return repositoryBackupDir;
  }

  @JsonProperty("repository.backup.dir")
  public void setRepositoryBackupDir(@Nullable ConfigNodePropertyString repositoryBackupDir) {
    this.repositoryBackupDir = repositoryBackupDir;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties blobGcMaxAgeInSecs(@Nullable ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
    return this;
  }

  /**
   * Get blobGcMaxAgeInSecs
   * @return blobGcMaxAgeInSecs
   */
  @Valid 
  @Schema(name = "blobGcMaxAgeInSecs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blobGcMaxAgeInSecs")
  public @Nullable ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() {
    return blobGcMaxAgeInSecs;
  }

  @JsonProperty("blobGcMaxAgeInSecs")
  public void setBlobGcMaxAgeInSecs(@Nullable ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
    this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties blobTrackSnapshotIntervalInSecs(@Nullable ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
    return this;
  }

  /**
   * Get blobTrackSnapshotIntervalInSecs
   * @return blobTrackSnapshotIntervalInSecs
   */
  @Valid 
  @Schema(name = "blobTrackSnapshotIntervalInSecs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  public @Nullable ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() {
    return blobTrackSnapshotIntervalInSecs;
  }

  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  public void setBlobTrackSnapshotIntervalInSecs(@Nullable ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties role(@Nullable ConfigNodePropertyString role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @Valid 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public @Nullable ConfigNodePropertyString getRole() {
    return role;
  }

  @JsonProperty("role")
  public void setRole(@Nullable ConfigNodePropertyString role) {
    this.role = role;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties registerDescriptors(@Nullable ConfigNodePropertyBoolean registerDescriptors) {
    this.registerDescriptors = registerDescriptors;
    return this;
  }

  /**
   * Get registerDescriptors
   * @return registerDescriptors
   */
  @Valid 
  @Schema(name = "registerDescriptors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registerDescriptors")
  public @Nullable ConfigNodePropertyBoolean getRegisterDescriptors() {
    return registerDescriptors;
  }

  @JsonProperty("registerDescriptors")
  public void setRegisterDescriptors(@Nullable ConfigNodePropertyBoolean registerDescriptors) {
    this.registerDescriptors = registerDescriptors;
  }

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties dispatchChanges(@Nullable ConfigNodePropertyBoolean dispatchChanges) {
    this.dispatchChanges = dispatchChanges;
    return this;
  }

  /**
   * Get dispatchChanges
   * @return dispatchChanges
   */
  @Valid 
  @Schema(name = "dispatchChanges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dispatchChanges")
  public @Nullable ConfigNodePropertyBoolean getDispatchChanges() {
    return dispatchChanges;
  }

  @JsonProperty("dispatchChanges")
  public void setDispatchChanges(@Nullable ConfigNodePropertyBoolean dispatchChanges) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

