package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
 */

@JsonTypeName("orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString mongouri;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString db;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean socketKeepAlive;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cache;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger nodeCachePercentage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger prevDocCachePercentage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger childrenCachePercentage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger diffCachePercentage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheSegmentCount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheStackMoveDistance;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger blobCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString persistentCache;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString journalCache;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean customBlobStore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger journalGCInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger journalGCMaxAge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean prefetchExternalChanges;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString role;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger versionGcMaxAgeInSecs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString versionGCExpression;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger versionGCTimeLimitInSecs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger blobGcMaxAgeInSecs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString repositoryHome;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxReplicationLagInSecs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown documentStoreType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean bundlingDisabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger updateLimit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray persistentCacheIncludes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown leaseCheckMode;

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties mongouri(@Nullable ConfigNodePropertyString mongouri) {
    this.mongouri = mongouri;
    return this;
  }

  /**
   * Get mongouri
   * @return mongouri
   */
  @Valid 
  @Schema(name = "mongouri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mongouri")
  public @Nullable ConfigNodePropertyString getMongouri() {
    return mongouri;
  }

  @JsonProperty("mongouri")
  public void setMongouri(@Nullable ConfigNodePropertyString mongouri) {
    this.mongouri = mongouri;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties db(@Nullable ConfigNodePropertyString db) {
    this.db = db;
    return this;
  }

  /**
   * Get db
   * @return db
   */
  @Valid 
  @Schema(name = "db", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("db")
  public @Nullable ConfigNodePropertyString getDb() {
    return db;
  }

  @JsonProperty("db")
  public void setDb(@Nullable ConfigNodePropertyString db) {
    this.db = db;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties socketKeepAlive(@Nullable ConfigNodePropertyBoolean socketKeepAlive) {
    this.socketKeepAlive = socketKeepAlive;
    return this;
  }

  /**
   * Get socketKeepAlive
   * @return socketKeepAlive
   */
  @Valid 
  @Schema(name = "socketKeepAlive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socketKeepAlive")
  public @Nullable ConfigNodePropertyBoolean getSocketKeepAlive() {
    return socketKeepAlive;
  }

  @JsonProperty("socketKeepAlive")
  public void setSocketKeepAlive(@Nullable ConfigNodePropertyBoolean socketKeepAlive) {
    this.socketKeepAlive = socketKeepAlive;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties cache(@Nullable ConfigNodePropertyInteger cache) {
    this.cache = cache;
    return this;
  }

  /**
   * Get cache
   * @return cache
   */
  @Valid 
  @Schema(name = "cache", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache")
  public @Nullable ConfigNodePropertyInteger getCache() {
    return cache;
  }

  @JsonProperty("cache")
  public void setCache(@Nullable ConfigNodePropertyInteger cache) {
    this.cache = cache;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties nodeCachePercentage(@Nullable ConfigNodePropertyInteger nodeCachePercentage) {
    this.nodeCachePercentage = nodeCachePercentage;
    return this;
  }

  /**
   * Get nodeCachePercentage
   * @return nodeCachePercentage
   */
  @Valid 
  @Schema(name = "nodeCachePercentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nodeCachePercentage")
  public @Nullable ConfigNodePropertyInteger getNodeCachePercentage() {
    return nodeCachePercentage;
  }

  @JsonProperty("nodeCachePercentage")
  public void setNodeCachePercentage(@Nullable ConfigNodePropertyInteger nodeCachePercentage) {
    this.nodeCachePercentage = nodeCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties prevDocCachePercentage(@Nullable ConfigNodePropertyInteger prevDocCachePercentage) {
    this.prevDocCachePercentage = prevDocCachePercentage;
    return this;
  }

  /**
   * Get prevDocCachePercentage
   * @return prevDocCachePercentage
   */
  @Valid 
  @Schema(name = "prevDocCachePercentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prevDocCachePercentage")
  public @Nullable ConfigNodePropertyInteger getPrevDocCachePercentage() {
    return prevDocCachePercentage;
  }

  @JsonProperty("prevDocCachePercentage")
  public void setPrevDocCachePercentage(@Nullable ConfigNodePropertyInteger prevDocCachePercentage) {
    this.prevDocCachePercentage = prevDocCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties childrenCachePercentage(@Nullable ConfigNodePropertyInteger childrenCachePercentage) {
    this.childrenCachePercentage = childrenCachePercentage;
    return this;
  }

  /**
   * Get childrenCachePercentage
   * @return childrenCachePercentage
   */
  @Valid 
  @Schema(name = "childrenCachePercentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("childrenCachePercentage")
  public @Nullable ConfigNodePropertyInteger getChildrenCachePercentage() {
    return childrenCachePercentage;
  }

  @JsonProperty("childrenCachePercentage")
  public void setChildrenCachePercentage(@Nullable ConfigNodePropertyInteger childrenCachePercentage) {
    this.childrenCachePercentage = childrenCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties diffCachePercentage(@Nullable ConfigNodePropertyInteger diffCachePercentage) {
    this.diffCachePercentage = diffCachePercentage;
    return this;
  }

  /**
   * Get diffCachePercentage
   * @return diffCachePercentage
   */
  @Valid 
  @Schema(name = "diffCachePercentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diffCachePercentage")
  public @Nullable ConfigNodePropertyInteger getDiffCachePercentage() {
    return diffCachePercentage;
  }

  @JsonProperty("diffCachePercentage")
  public void setDiffCachePercentage(@Nullable ConfigNodePropertyInteger diffCachePercentage) {
    this.diffCachePercentage = diffCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties cacheSegmentCount(@Nullable ConfigNodePropertyInteger cacheSegmentCount) {
    this.cacheSegmentCount = cacheSegmentCount;
    return this;
  }

  /**
   * Get cacheSegmentCount
   * @return cacheSegmentCount
   */
  @Valid 
  @Schema(name = "cacheSegmentCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cacheSegmentCount")
  public @Nullable ConfigNodePropertyInteger getCacheSegmentCount() {
    return cacheSegmentCount;
  }

  @JsonProperty("cacheSegmentCount")
  public void setCacheSegmentCount(@Nullable ConfigNodePropertyInteger cacheSegmentCount) {
    this.cacheSegmentCount = cacheSegmentCount;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties cacheStackMoveDistance(@Nullable ConfigNodePropertyInteger cacheStackMoveDistance) {
    this.cacheStackMoveDistance = cacheStackMoveDistance;
    return this;
  }

  /**
   * Get cacheStackMoveDistance
   * @return cacheStackMoveDistance
   */
  @Valid 
  @Schema(name = "cacheStackMoveDistance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cacheStackMoveDistance")
  public @Nullable ConfigNodePropertyInteger getCacheStackMoveDistance() {
    return cacheStackMoveDistance;
  }

  @JsonProperty("cacheStackMoveDistance")
  public void setCacheStackMoveDistance(@Nullable ConfigNodePropertyInteger cacheStackMoveDistance) {
    this.cacheStackMoveDistance = cacheStackMoveDistance;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties blobCacheSize(@Nullable ConfigNodePropertyInteger blobCacheSize) {
    this.blobCacheSize = blobCacheSize;
    return this;
  }

  /**
   * Get blobCacheSize
   * @return blobCacheSize
   */
  @Valid 
  @Schema(name = "blobCacheSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blobCacheSize")
  public @Nullable ConfigNodePropertyInteger getBlobCacheSize() {
    return blobCacheSize;
  }

  @JsonProperty("blobCacheSize")
  public void setBlobCacheSize(@Nullable ConfigNodePropertyInteger blobCacheSize) {
    this.blobCacheSize = blobCacheSize;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties persistentCache(@Nullable ConfigNodePropertyString persistentCache) {
    this.persistentCache = persistentCache;
    return this;
  }

  /**
   * Get persistentCache
   * @return persistentCache
   */
  @Valid 
  @Schema(name = "persistentCache", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("persistentCache")
  public @Nullable ConfigNodePropertyString getPersistentCache() {
    return persistentCache;
  }

  @JsonProperty("persistentCache")
  public void setPersistentCache(@Nullable ConfigNodePropertyString persistentCache) {
    this.persistentCache = persistentCache;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties journalCache(@Nullable ConfigNodePropertyString journalCache) {
    this.journalCache = journalCache;
    return this;
  }

  /**
   * Get journalCache
   * @return journalCache
   */
  @Valid 
  @Schema(name = "journalCache", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("journalCache")
  public @Nullable ConfigNodePropertyString getJournalCache() {
    return journalCache;
  }

  @JsonProperty("journalCache")
  public void setJournalCache(@Nullable ConfigNodePropertyString journalCache) {
    this.journalCache = journalCache;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties customBlobStore(@Nullable ConfigNodePropertyBoolean customBlobStore) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties journalGCInterval(@Nullable ConfigNodePropertyInteger journalGCInterval) {
    this.journalGCInterval = journalGCInterval;
    return this;
  }

  /**
   * Get journalGCInterval
   * @return journalGCInterval
   */
  @Valid 
  @Schema(name = "journalGCInterval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("journalGCInterval")
  public @Nullable ConfigNodePropertyInteger getJournalGCInterval() {
    return journalGCInterval;
  }

  @JsonProperty("journalGCInterval")
  public void setJournalGCInterval(@Nullable ConfigNodePropertyInteger journalGCInterval) {
    this.journalGCInterval = journalGCInterval;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties journalGCMaxAge(@Nullable ConfigNodePropertyInteger journalGCMaxAge) {
    this.journalGCMaxAge = journalGCMaxAge;
    return this;
  }

  /**
   * Get journalGCMaxAge
   * @return journalGCMaxAge
   */
  @Valid 
  @Schema(name = "journalGCMaxAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("journalGCMaxAge")
  public @Nullable ConfigNodePropertyInteger getJournalGCMaxAge() {
    return journalGCMaxAge;
  }

  @JsonProperty("journalGCMaxAge")
  public void setJournalGCMaxAge(@Nullable ConfigNodePropertyInteger journalGCMaxAge) {
    this.journalGCMaxAge = journalGCMaxAge;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties prefetchExternalChanges(@Nullable ConfigNodePropertyBoolean prefetchExternalChanges) {
    this.prefetchExternalChanges = prefetchExternalChanges;
    return this;
  }

  /**
   * Get prefetchExternalChanges
   * @return prefetchExternalChanges
   */
  @Valid 
  @Schema(name = "prefetchExternalChanges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefetchExternalChanges")
  public @Nullable ConfigNodePropertyBoolean getPrefetchExternalChanges() {
    return prefetchExternalChanges;
  }

  @JsonProperty("prefetchExternalChanges")
  public void setPrefetchExternalChanges(@Nullable ConfigNodePropertyBoolean prefetchExternalChanges) {
    this.prefetchExternalChanges = prefetchExternalChanges;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties role(@Nullable ConfigNodePropertyString role) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties versionGcMaxAgeInSecs(@Nullable ConfigNodePropertyInteger versionGcMaxAgeInSecs) {
    this.versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
    return this;
  }

  /**
   * Get versionGcMaxAgeInSecs
   * @return versionGcMaxAgeInSecs
   */
  @Valid 
  @Schema(name = "versionGcMaxAgeInSecs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionGcMaxAgeInSecs")
  public @Nullable ConfigNodePropertyInteger getVersionGcMaxAgeInSecs() {
    return versionGcMaxAgeInSecs;
  }

  @JsonProperty("versionGcMaxAgeInSecs")
  public void setVersionGcMaxAgeInSecs(@Nullable ConfigNodePropertyInteger versionGcMaxAgeInSecs) {
    this.versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties versionGCExpression(@Nullable ConfigNodePropertyString versionGCExpression) {
    this.versionGCExpression = versionGCExpression;
    return this;
  }

  /**
   * Get versionGCExpression
   * @return versionGCExpression
   */
  @Valid 
  @Schema(name = "versionGCExpression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionGCExpression")
  public @Nullable ConfigNodePropertyString getVersionGCExpression() {
    return versionGCExpression;
  }

  @JsonProperty("versionGCExpression")
  public void setVersionGCExpression(@Nullable ConfigNodePropertyString versionGCExpression) {
    this.versionGCExpression = versionGCExpression;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties versionGCTimeLimitInSecs(@Nullable ConfigNodePropertyInteger versionGCTimeLimitInSecs) {
    this.versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
    return this;
  }

  /**
   * Get versionGCTimeLimitInSecs
   * @return versionGCTimeLimitInSecs
   */
  @Valid 
  @Schema(name = "versionGCTimeLimitInSecs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionGCTimeLimitInSecs")
  public @Nullable ConfigNodePropertyInteger getVersionGCTimeLimitInSecs() {
    return versionGCTimeLimitInSecs;
  }

  @JsonProperty("versionGCTimeLimitInSecs")
  public void setVersionGCTimeLimitInSecs(@Nullable ConfigNodePropertyInteger versionGCTimeLimitInSecs) {
    this.versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties blobGcMaxAgeInSecs(@Nullable ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties blobTrackSnapshotIntervalInSecs(@Nullable ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties repositoryHome(@Nullable ConfigNodePropertyString repositoryHome) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties maxReplicationLagInSecs(@Nullable ConfigNodePropertyInteger maxReplicationLagInSecs) {
    this.maxReplicationLagInSecs = maxReplicationLagInSecs;
    return this;
  }

  /**
   * Get maxReplicationLagInSecs
   * @return maxReplicationLagInSecs
   */
  @Valid 
  @Schema(name = "maxReplicationLagInSecs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxReplicationLagInSecs")
  public @Nullable ConfigNodePropertyInteger getMaxReplicationLagInSecs() {
    return maxReplicationLagInSecs;
  }

  @JsonProperty("maxReplicationLagInSecs")
  public void setMaxReplicationLagInSecs(@Nullable ConfigNodePropertyInteger maxReplicationLagInSecs) {
    this.maxReplicationLagInSecs = maxReplicationLagInSecs;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties documentStoreType(@Nullable ConfigNodePropertyDropDown documentStoreType) {
    this.documentStoreType = documentStoreType;
    return this;
  }

  /**
   * Get documentStoreType
   * @return documentStoreType
   */
  @Valid 
  @Schema(name = "documentStoreType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentStoreType")
  public @Nullable ConfigNodePropertyDropDown getDocumentStoreType() {
    return documentStoreType;
  }

  @JsonProperty("documentStoreType")
  public void setDocumentStoreType(@Nullable ConfigNodePropertyDropDown documentStoreType) {
    this.documentStoreType = documentStoreType;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties bundlingDisabled(@Nullable ConfigNodePropertyBoolean bundlingDisabled) {
    this.bundlingDisabled = bundlingDisabled;
    return this;
  }

  /**
   * Get bundlingDisabled
   * @return bundlingDisabled
   */
  @Valid 
  @Schema(name = "bundlingDisabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundlingDisabled")
  public @Nullable ConfigNodePropertyBoolean getBundlingDisabled() {
    return bundlingDisabled;
  }

  @JsonProperty("bundlingDisabled")
  public void setBundlingDisabled(@Nullable ConfigNodePropertyBoolean bundlingDisabled) {
    this.bundlingDisabled = bundlingDisabled;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties updateLimit(@Nullable ConfigNodePropertyInteger updateLimit) {
    this.updateLimit = updateLimit;
    return this;
  }

  /**
   * Get updateLimit
   * @return updateLimit
   */
  @Valid 
  @Schema(name = "updateLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateLimit")
  public @Nullable ConfigNodePropertyInteger getUpdateLimit() {
    return updateLimit;
  }

  @JsonProperty("updateLimit")
  public void setUpdateLimit(@Nullable ConfigNodePropertyInteger updateLimit) {
    this.updateLimit = updateLimit;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties persistentCacheIncludes(@Nullable ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
    return this;
  }

  /**
   * Get persistentCacheIncludes
   * @return persistentCacheIncludes
   */
  @Valid 
  @Schema(name = "persistentCacheIncludes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("persistentCacheIncludes")
  public @Nullable ConfigNodePropertyArray getPersistentCacheIncludes() {
    return persistentCacheIncludes;
  }

  @JsonProperty("persistentCacheIncludes")
  public void setPersistentCacheIncludes(@Nullable ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties leaseCheckMode(@Nullable ConfigNodePropertyDropDown leaseCheckMode) {
    this.leaseCheckMode = leaseCheckMode;
    return this;
  }

  /**
   * Get leaseCheckMode
   * @return leaseCheckMode
   */
  @Valid 
  @Schema(name = "leaseCheckMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leaseCheckMode")
  public @Nullable ConfigNodePropertyDropDown getLeaseCheckMode() {
    return leaseCheckMode;
  }

  @JsonProperty("leaseCheckMode")
  public void setLeaseCheckMode(@Nullable ConfigNodePropertyDropDown leaseCheckMode) {
    this.leaseCheckMode = leaseCheckMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties = (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) o;
    return Objects.equals(this.mongouri, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.mongouri) &&
        Objects.equals(this.db, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.db) &&
        Objects.equals(this.socketKeepAlive, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.socketKeepAlive) &&
        Objects.equals(this.cache, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.cache) &&
        Objects.equals(this.nodeCachePercentage, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.nodeCachePercentage) &&
        Objects.equals(this.prevDocCachePercentage, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prevDocCachePercentage) &&
        Objects.equals(this.childrenCachePercentage, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.childrenCachePercentage) &&
        Objects.equals(this.diffCachePercentage, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.diffCachePercentage) &&
        Objects.equals(this.cacheSegmentCount, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.cacheSegmentCount) &&
        Objects.equals(this.cacheStackMoveDistance, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.cacheStackMoveDistance) &&
        Objects.equals(this.blobCacheSize, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.blobCacheSize) &&
        Objects.equals(this.persistentCache, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.persistentCache) &&
        Objects.equals(this.journalCache, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.journalCache) &&
        Objects.equals(this.customBlobStore, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.customBlobStore) &&
        Objects.equals(this.journalGCInterval, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.journalGCInterval) &&
        Objects.equals(this.journalGCMaxAge, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.journalGCMaxAge) &&
        Objects.equals(this.prefetchExternalChanges, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prefetchExternalChanges) &&
        Objects.equals(this.role, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.role) &&
        Objects.equals(this.versionGcMaxAgeInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.versionGcMaxAgeInSecs) &&
        Objects.equals(this.versionGCExpression, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.versionGCExpression) &&
        Objects.equals(this.versionGCTimeLimitInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.versionGCTimeLimitInSecs) &&
        Objects.equals(this.blobGcMaxAgeInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.blobGcMaxAgeInSecs) &&
        Objects.equals(this.blobTrackSnapshotIntervalInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.blobTrackSnapshotIntervalInSecs) &&
        Objects.equals(this.repositoryHome, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.repositoryHome) &&
        Objects.equals(this.maxReplicationLagInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.maxReplicationLagInSecs) &&
        Objects.equals(this.documentStoreType, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.documentStoreType) &&
        Objects.equals(this.bundlingDisabled, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.bundlingDisabled) &&
        Objects.equals(this.updateLimit, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.updateLimit) &&
        Objects.equals(this.persistentCacheIncludes, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.persistentCacheIncludes) &&
        Objects.equals(this.leaseCheckMode, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.leaseCheckMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mongouri, db, socketKeepAlive, cache, nodeCachePercentage, prevDocCachePercentage, childrenCachePercentage, diffCachePercentage, cacheSegmentCount, cacheStackMoveDistance, blobCacheSize, persistentCache, journalCache, customBlobStore, journalGCInterval, journalGCMaxAge, prefetchExternalChanges, role, versionGcMaxAgeInSecs, versionGCExpression, versionGCTimeLimitInSecs, blobGcMaxAgeInSecs, blobTrackSnapshotIntervalInSecs, repositoryHome, maxReplicationLagInSecs, documentStoreType, bundlingDisabled, updateLimit, persistentCacheIncludes, leaseCheckMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {\n");
    sb.append("    mongouri: ").append(toIndentedString(mongouri)).append("\n");
    sb.append("    db: ").append(toIndentedString(db)).append("\n");
    sb.append("    socketKeepAlive: ").append(toIndentedString(socketKeepAlive)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    nodeCachePercentage: ").append(toIndentedString(nodeCachePercentage)).append("\n");
    sb.append("    prevDocCachePercentage: ").append(toIndentedString(prevDocCachePercentage)).append("\n");
    sb.append("    childrenCachePercentage: ").append(toIndentedString(childrenCachePercentage)).append("\n");
    sb.append("    diffCachePercentage: ").append(toIndentedString(diffCachePercentage)).append("\n");
    sb.append("    cacheSegmentCount: ").append(toIndentedString(cacheSegmentCount)).append("\n");
    sb.append("    cacheStackMoveDistance: ").append(toIndentedString(cacheStackMoveDistance)).append("\n");
    sb.append("    blobCacheSize: ").append(toIndentedString(blobCacheSize)).append("\n");
    sb.append("    persistentCache: ").append(toIndentedString(persistentCache)).append("\n");
    sb.append("    journalCache: ").append(toIndentedString(journalCache)).append("\n");
    sb.append("    customBlobStore: ").append(toIndentedString(customBlobStore)).append("\n");
    sb.append("    journalGCInterval: ").append(toIndentedString(journalGCInterval)).append("\n");
    sb.append("    journalGCMaxAge: ").append(toIndentedString(journalGCMaxAge)).append("\n");
    sb.append("    prefetchExternalChanges: ").append(toIndentedString(prefetchExternalChanges)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    versionGcMaxAgeInSecs: ").append(toIndentedString(versionGcMaxAgeInSecs)).append("\n");
    sb.append("    versionGCExpression: ").append(toIndentedString(versionGCExpression)).append("\n");
    sb.append("    versionGCTimeLimitInSecs: ").append(toIndentedString(versionGCTimeLimitInSecs)).append("\n");
    sb.append("    blobGcMaxAgeInSecs: ").append(toIndentedString(blobGcMaxAgeInSecs)).append("\n");
    sb.append("    blobTrackSnapshotIntervalInSecs: ").append(toIndentedString(blobTrackSnapshotIntervalInSecs)).append("\n");
    sb.append("    repositoryHome: ").append(toIndentedString(repositoryHome)).append("\n");
    sb.append("    maxReplicationLagInSecs: ").append(toIndentedString(maxReplicationLagInSecs)).append("\n");
    sb.append("    documentStoreType: ").append(toIndentedString(documentStoreType)).append("\n");
    sb.append("    bundlingDisabled: ").append(toIndentedString(bundlingDisabled)).append("\n");
    sb.append("    updateLimit: ").append(toIndentedString(updateLimit)).append("\n");
    sb.append("    persistentCacheIncludes: ").append(toIndentedString(persistentCacheIncludes)).append("\n");
    sb.append("    leaseCheckMode: ").append(toIndentedString(leaseCheckMode)).append("\n");
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

