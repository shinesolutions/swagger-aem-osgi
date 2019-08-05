package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties   {
  @JsonProperty("mongouri")
  private ConfigNodePropertyString mongouri = null;

  @JsonProperty("db")
  private ConfigNodePropertyString db = null;

  @JsonProperty("socketKeepAlive")
  private ConfigNodePropertyBoolean socketKeepAlive = null;

  @JsonProperty("cache")
  private ConfigNodePropertyInteger cache = null;

  @JsonProperty("nodeCachePercentage")
  private ConfigNodePropertyInteger nodeCachePercentage = null;

  @JsonProperty("prevDocCachePercentage")
  private ConfigNodePropertyInteger prevDocCachePercentage = null;

  @JsonProperty("childrenCachePercentage")
  private ConfigNodePropertyInteger childrenCachePercentage = null;

  @JsonProperty("diffCachePercentage")
  private ConfigNodePropertyInteger diffCachePercentage = null;

  @JsonProperty("cacheSegmentCount")
  private ConfigNodePropertyInteger cacheSegmentCount = null;

  @JsonProperty("cacheStackMoveDistance")
  private ConfigNodePropertyInteger cacheStackMoveDistance = null;

  @JsonProperty("blobCacheSize")
  private ConfigNodePropertyInteger blobCacheSize = null;

  @JsonProperty("persistentCache")
  private ConfigNodePropertyString persistentCache = null;

  @JsonProperty("journalCache")
  private ConfigNodePropertyString journalCache = null;

  @JsonProperty("customBlobStore")
  private ConfigNodePropertyBoolean customBlobStore = null;

  @JsonProperty("journalGCInterval")
  private ConfigNodePropertyInteger journalGCInterval = null;

  @JsonProperty("journalGCMaxAge")
  private ConfigNodePropertyInteger journalGCMaxAge = null;

  @JsonProperty("prefetchExternalChanges")
  private ConfigNodePropertyBoolean prefetchExternalChanges = null;

  @JsonProperty("role")
  private ConfigNodePropertyString role = null;

  @JsonProperty("versionGcMaxAgeInSecs")
  private ConfigNodePropertyInteger versionGcMaxAgeInSecs = null;

  @JsonProperty("versionGCExpression")
  private ConfigNodePropertyString versionGCExpression = null;

  @JsonProperty("versionGCTimeLimitInSecs")
  private ConfigNodePropertyInteger versionGCTimeLimitInSecs = null;

  @JsonProperty("blobGcMaxAgeInSecs")
  private ConfigNodePropertyInteger blobGcMaxAgeInSecs = null;

  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs = null;

  @JsonProperty("repository.home")
  private ConfigNodePropertyString repositoryHome = null;

  @JsonProperty("maxReplicationLagInSecs")
  private ConfigNodePropertyInteger maxReplicationLagInSecs = null;

  @JsonProperty("documentStoreType")
  private ConfigNodePropertyDropDown documentStoreType = null;

  @JsonProperty("bundlingDisabled")
  private ConfigNodePropertyBoolean bundlingDisabled = null;

  @JsonProperty("updateLimit")
  private ConfigNodePropertyInteger updateLimit = null;

  @JsonProperty("persistentCacheIncludes")
  private ConfigNodePropertyArray persistentCacheIncludes = null;

  @JsonProperty("leaseCheckMode")
  private ConfigNodePropertyDropDown leaseCheckMode = null;

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties mongouri(ConfigNodePropertyString mongouri) {
    this.mongouri = mongouri;
    return this;
  }

  /**
   * Get mongouri
   * @return mongouri
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getMongouri() {
    return mongouri;
  }

  public void setMongouri(ConfigNodePropertyString mongouri) {
    this.mongouri = mongouri;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties db(ConfigNodePropertyString db) {
    this.db = db;
    return this;
  }

  /**
   * Get db
   * @return db
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getDb() {
    return db;
  }

  public void setDb(ConfigNodePropertyString db) {
    this.db = db;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties socketKeepAlive(ConfigNodePropertyBoolean socketKeepAlive) {
    this.socketKeepAlive = socketKeepAlive;
    return this;
  }

  /**
   * Get socketKeepAlive
   * @return socketKeepAlive
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getSocketKeepAlive() {
    return socketKeepAlive;
  }

  public void setSocketKeepAlive(ConfigNodePropertyBoolean socketKeepAlive) {
    this.socketKeepAlive = socketKeepAlive;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties cache(ConfigNodePropertyInteger cache) {
    this.cache = cache;
    return this;
  }

  /**
   * Get cache
   * @return cache
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCache() {
    return cache;
  }

  public void setCache(ConfigNodePropertyInteger cache) {
    this.cache = cache;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties nodeCachePercentage(ConfigNodePropertyInteger nodeCachePercentage) {
    this.nodeCachePercentage = nodeCachePercentage;
    return this;
  }

  /**
   * Get nodeCachePercentage
   * @return nodeCachePercentage
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getNodeCachePercentage() {
    return nodeCachePercentage;
  }

  public void setNodeCachePercentage(ConfigNodePropertyInteger nodeCachePercentage) {
    this.nodeCachePercentage = nodeCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties prevDocCachePercentage(ConfigNodePropertyInteger prevDocCachePercentage) {
    this.prevDocCachePercentage = prevDocCachePercentage;
    return this;
  }

  /**
   * Get prevDocCachePercentage
   * @return prevDocCachePercentage
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getPrevDocCachePercentage() {
    return prevDocCachePercentage;
  }

  public void setPrevDocCachePercentage(ConfigNodePropertyInteger prevDocCachePercentage) {
    this.prevDocCachePercentage = prevDocCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties childrenCachePercentage(ConfigNodePropertyInteger childrenCachePercentage) {
    this.childrenCachePercentage = childrenCachePercentage;
    return this;
  }

  /**
   * Get childrenCachePercentage
   * @return childrenCachePercentage
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getChildrenCachePercentage() {
    return childrenCachePercentage;
  }

  public void setChildrenCachePercentage(ConfigNodePropertyInteger childrenCachePercentage) {
    this.childrenCachePercentage = childrenCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties diffCachePercentage(ConfigNodePropertyInteger diffCachePercentage) {
    this.diffCachePercentage = diffCachePercentage;
    return this;
  }

  /**
   * Get diffCachePercentage
   * @return diffCachePercentage
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getDiffCachePercentage() {
    return diffCachePercentage;
  }

  public void setDiffCachePercentage(ConfigNodePropertyInteger diffCachePercentage) {
    this.diffCachePercentage = diffCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties cacheSegmentCount(ConfigNodePropertyInteger cacheSegmentCount) {
    this.cacheSegmentCount = cacheSegmentCount;
    return this;
  }

  /**
   * Get cacheSegmentCount
   * @return cacheSegmentCount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCacheSegmentCount() {
    return cacheSegmentCount;
  }

  public void setCacheSegmentCount(ConfigNodePropertyInteger cacheSegmentCount) {
    this.cacheSegmentCount = cacheSegmentCount;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties cacheStackMoveDistance(ConfigNodePropertyInteger cacheStackMoveDistance) {
    this.cacheStackMoveDistance = cacheStackMoveDistance;
    return this;
  }

  /**
   * Get cacheStackMoveDistance
   * @return cacheStackMoveDistance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCacheStackMoveDistance() {
    return cacheStackMoveDistance;
  }

  public void setCacheStackMoveDistance(ConfigNodePropertyInteger cacheStackMoveDistance) {
    this.cacheStackMoveDistance = cacheStackMoveDistance;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties blobCacheSize(ConfigNodePropertyInteger blobCacheSize) {
    this.blobCacheSize = blobCacheSize;
    return this;
  }

  /**
   * Get blobCacheSize
   * @return blobCacheSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getBlobCacheSize() {
    return blobCacheSize;
  }

  public void setBlobCacheSize(ConfigNodePropertyInteger blobCacheSize) {
    this.blobCacheSize = blobCacheSize;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties persistentCache(ConfigNodePropertyString persistentCache) {
    this.persistentCache = persistentCache;
    return this;
  }

  /**
   * Get persistentCache
   * @return persistentCache
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getPersistentCache() {
    return persistentCache;
  }

  public void setPersistentCache(ConfigNodePropertyString persistentCache) {
    this.persistentCache = persistentCache;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties journalCache(ConfigNodePropertyString journalCache) {
    this.journalCache = journalCache;
    return this;
  }

  /**
   * Get journalCache
   * @return journalCache
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getJournalCache() {
    return journalCache;
  }

  public void setJournalCache(ConfigNodePropertyString journalCache) {
    this.journalCache = journalCache;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties customBlobStore(ConfigNodePropertyBoolean customBlobStore) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties journalGCInterval(ConfigNodePropertyInteger journalGCInterval) {
    this.journalGCInterval = journalGCInterval;
    return this;
  }

  /**
   * Get journalGCInterval
   * @return journalGCInterval
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getJournalGCInterval() {
    return journalGCInterval;
  }

  public void setJournalGCInterval(ConfigNodePropertyInteger journalGCInterval) {
    this.journalGCInterval = journalGCInterval;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties journalGCMaxAge(ConfigNodePropertyInteger journalGCMaxAge) {
    this.journalGCMaxAge = journalGCMaxAge;
    return this;
  }

  /**
   * Get journalGCMaxAge
   * @return journalGCMaxAge
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getJournalGCMaxAge() {
    return journalGCMaxAge;
  }

  public void setJournalGCMaxAge(ConfigNodePropertyInteger journalGCMaxAge) {
    this.journalGCMaxAge = journalGCMaxAge;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties prefetchExternalChanges(ConfigNodePropertyBoolean prefetchExternalChanges) {
    this.prefetchExternalChanges = prefetchExternalChanges;
    return this;
  }

  /**
   * Get prefetchExternalChanges
   * @return prefetchExternalChanges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getPrefetchExternalChanges() {
    return prefetchExternalChanges;
  }

  public void setPrefetchExternalChanges(ConfigNodePropertyBoolean prefetchExternalChanges) {
    this.prefetchExternalChanges = prefetchExternalChanges;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties role(ConfigNodePropertyString role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getRole() {
    return role;
  }

  public void setRole(ConfigNodePropertyString role) {
    this.role = role;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties versionGcMaxAgeInSecs(ConfigNodePropertyInteger versionGcMaxAgeInSecs) {
    this.versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
    return this;
  }

  /**
   * Get versionGcMaxAgeInSecs
   * @return versionGcMaxAgeInSecs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getVersionGcMaxAgeInSecs() {
    return versionGcMaxAgeInSecs;
  }

  public void setVersionGcMaxAgeInSecs(ConfigNodePropertyInteger versionGcMaxAgeInSecs) {
    this.versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties versionGCExpression(ConfigNodePropertyString versionGCExpression) {
    this.versionGCExpression = versionGCExpression;
    return this;
  }

  /**
   * Get versionGCExpression
   * @return versionGCExpression
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getVersionGCExpression() {
    return versionGCExpression;
  }

  public void setVersionGCExpression(ConfigNodePropertyString versionGCExpression) {
    this.versionGCExpression = versionGCExpression;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties versionGCTimeLimitInSecs(ConfigNodePropertyInteger versionGCTimeLimitInSecs) {
    this.versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
    return this;
  }

  /**
   * Get versionGCTimeLimitInSecs
   * @return versionGCTimeLimitInSecs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getVersionGCTimeLimitInSecs() {
    return versionGCTimeLimitInSecs;
  }

  public void setVersionGCTimeLimitInSecs(ConfigNodePropertyInteger versionGCTimeLimitInSecs) {
    this.versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties blobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties blobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties repositoryHome(ConfigNodePropertyString repositoryHome) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties maxReplicationLagInSecs(ConfigNodePropertyInteger maxReplicationLagInSecs) {
    this.maxReplicationLagInSecs = maxReplicationLagInSecs;
    return this;
  }

  /**
   * Get maxReplicationLagInSecs
   * @return maxReplicationLagInSecs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getMaxReplicationLagInSecs() {
    return maxReplicationLagInSecs;
  }

  public void setMaxReplicationLagInSecs(ConfigNodePropertyInteger maxReplicationLagInSecs) {
    this.maxReplicationLagInSecs = maxReplicationLagInSecs;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties documentStoreType(ConfigNodePropertyDropDown documentStoreType) {
    this.documentStoreType = documentStoreType;
    return this;
  }

  /**
   * Get documentStoreType
   * @return documentStoreType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyDropDown getDocumentStoreType() {
    return documentStoreType;
  }

  public void setDocumentStoreType(ConfigNodePropertyDropDown documentStoreType) {
    this.documentStoreType = documentStoreType;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties bundlingDisabled(ConfigNodePropertyBoolean bundlingDisabled) {
    this.bundlingDisabled = bundlingDisabled;
    return this;
  }

  /**
   * Get bundlingDisabled
   * @return bundlingDisabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getBundlingDisabled() {
    return bundlingDisabled;
  }

  public void setBundlingDisabled(ConfigNodePropertyBoolean bundlingDisabled) {
    this.bundlingDisabled = bundlingDisabled;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties updateLimit(ConfigNodePropertyInteger updateLimit) {
    this.updateLimit = updateLimit;
    return this;
  }

  /**
   * Get updateLimit
   * @return updateLimit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getUpdateLimit() {
    return updateLimit;
  }

  public void setUpdateLimit(ConfigNodePropertyInteger updateLimit) {
    this.updateLimit = updateLimit;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties persistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
    return this;
  }

  /**
   * Get persistentCacheIncludes
   * @return persistentCacheIncludes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getPersistentCacheIncludes() {
    return persistentCacheIncludes;
  }

  public void setPersistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties leaseCheckMode(ConfigNodePropertyDropDown leaseCheckMode) {
    this.leaseCheckMode = leaseCheckMode;
    return this;
  }

  /**
   * Get leaseCheckMode
   * @return leaseCheckMode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyDropDown getLeaseCheckMode() {
    return leaseCheckMode;
  }

  public void setLeaseCheckMode(ConfigNodePropertyDropDown leaseCheckMode) {
    this.leaseCheckMode = leaseCheckMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

