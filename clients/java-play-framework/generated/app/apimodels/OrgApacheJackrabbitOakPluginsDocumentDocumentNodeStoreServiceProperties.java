package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
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
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties   {
  @JsonProperty("mongouri")
  @Valid

  private ConfigNodePropertyString mongouri;

  @JsonProperty("db")
  @Valid

  private ConfigNodePropertyString db;

  @JsonProperty("socketKeepAlive")
  @Valid

  private ConfigNodePropertyBoolean socketKeepAlive;

  @JsonProperty("cache")
  @Valid

  private ConfigNodePropertyInteger cache;

  @JsonProperty("nodeCachePercentage")
  @Valid

  private ConfigNodePropertyInteger nodeCachePercentage;

  @JsonProperty("prevDocCachePercentage")
  @Valid

  private ConfigNodePropertyInteger prevDocCachePercentage;

  @JsonProperty("childrenCachePercentage")
  @Valid

  private ConfigNodePropertyInteger childrenCachePercentage;

  @JsonProperty("diffCachePercentage")
  @Valid

  private ConfigNodePropertyInteger diffCachePercentage;

  @JsonProperty("cacheSegmentCount")
  @Valid

  private ConfigNodePropertyInteger cacheSegmentCount;

  @JsonProperty("cacheStackMoveDistance")
  @Valid

  private ConfigNodePropertyInteger cacheStackMoveDistance;

  @JsonProperty("blobCacheSize")
  @Valid

  private ConfigNodePropertyInteger blobCacheSize;

  @JsonProperty("persistentCache")
  @Valid

  private ConfigNodePropertyString persistentCache;

  @JsonProperty("journalCache")
  @Valid

  private ConfigNodePropertyString journalCache;

  @JsonProperty("customBlobStore")
  @Valid

  private ConfigNodePropertyBoolean customBlobStore;

  @JsonProperty("journalGCInterval")
  @Valid

  private ConfigNodePropertyInteger journalGCInterval;

  @JsonProperty("journalGCMaxAge")
  @Valid

  private ConfigNodePropertyInteger journalGCMaxAge;

  @JsonProperty("prefetchExternalChanges")
  @Valid

  private ConfigNodePropertyBoolean prefetchExternalChanges;

  @JsonProperty("role")
  @Valid

  private ConfigNodePropertyString role;

  @JsonProperty("versionGcMaxAgeInSecs")
  @Valid

  private ConfigNodePropertyInteger versionGcMaxAgeInSecs;

  @JsonProperty("versionGCExpression")
  @Valid

  private ConfigNodePropertyString versionGCExpression;

  @JsonProperty("versionGCTimeLimitInSecs")
  @Valid

  private ConfigNodePropertyInteger versionGCTimeLimitInSecs;

  @JsonProperty("blobGcMaxAgeInSecs")
  @Valid

  private ConfigNodePropertyInteger blobGcMaxAgeInSecs;

  @JsonProperty("blobTrackSnapshotIntervalInSecs")
  @Valid

  private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs;

  @JsonProperty("repository.home")
  @Valid

  private ConfigNodePropertyString repositoryHome;

  @JsonProperty("maxReplicationLagInSecs")
  @Valid

  private ConfigNodePropertyInteger maxReplicationLagInSecs;

  @JsonProperty("documentStoreType")
  @Valid

  private ConfigNodePropertyDropDown documentStoreType;

  @JsonProperty("bundlingDisabled")
  @Valid

  private ConfigNodePropertyBoolean bundlingDisabled;

  @JsonProperty("updateLimit")
  @Valid

  private ConfigNodePropertyInteger updateLimit;

  @JsonProperty("persistentCacheIncludes")
  @Valid

  private ConfigNodePropertyArray persistentCacheIncludes;

  @JsonProperty("leaseCheckMode")
  @Valid

  private ConfigNodePropertyDropDown leaseCheckMode;

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties mongouri(ConfigNodePropertyString mongouri) {
    this.mongouri = mongouri;
    return this;
  }

   /**
   * Get mongouri
   * @return mongouri
  **/
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
  public ConfigNodePropertyDropDown getLeaseCheckMode() {
    return leaseCheckMode;
  }

  public void setLeaseCheckMode(ConfigNodePropertyDropDown leaseCheckMode) {
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
    return Objects.equals(mongouri, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.mongouri) &&
        Objects.equals(db, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.db) &&
        Objects.equals(socketKeepAlive, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.socketKeepAlive) &&
        Objects.equals(cache, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.cache) &&
        Objects.equals(nodeCachePercentage, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.nodeCachePercentage) &&
        Objects.equals(prevDocCachePercentage, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prevDocCachePercentage) &&
        Objects.equals(childrenCachePercentage, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.childrenCachePercentage) &&
        Objects.equals(diffCachePercentage, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.diffCachePercentage) &&
        Objects.equals(cacheSegmentCount, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.cacheSegmentCount) &&
        Objects.equals(cacheStackMoveDistance, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.cacheStackMoveDistance) &&
        Objects.equals(blobCacheSize, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.blobCacheSize) &&
        Objects.equals(persistentCache, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.persistentCache) &&
        Objects.equals(journalCache, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.journalCache) &&
        Objects.equals(customBlobStore, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.customBlobStore) &&
        Objects.equals(journalGCInterval, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.journalGCInterval) &&
        Objects.equals(journalGCMaxAge, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.journalGCMaxAge) &&
        Objects.equals(prefetchExternalChanges, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prefetchExternalChanges) &&
        Objects.equals(role, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.role) &&
        Objects.equals(versionGcMaxAgeInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.versionGcMaxAgeInSecs) &&
        Objects.equals(versionGCExpression, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.versionGCExpression) &&
        Objects.equals(versionGCTimeLimitInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.versionGCTimeLimitInSecs) &&
        Objects.equals(blobGcMaxAgeInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.blobGcMaxAgeInSecs) &&
        Objects.equals(blobTrackSnapshotIntervalInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.blobTrackSnapshotIntervalInSecs) &&
        Objects.equals(repositoryHome, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.repositoryHome) &&
        Objects.equals(maxReplicationLagInSecs, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.maxReplicationLagInSecs) &&
        Objects.equals(documentStoreType, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.documentStoreType) &&
        Objects.equals(bundlingDisabled, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.bundlingDisabled) &&
        Objects.equals(updateLimit, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.updateLimit) &&
        Objects.equals(persistentCacheIncludes, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.persistentCacheIncludes) &&
        Objects.equals(leaseCheckMode, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.leaseCheckMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mongouri, db, socketKeepAlive, cache, nodeCachePercentage, prevDocCachePercentage, childrenCachePercentage, diffCachePercentage, cacheSegmentCount, cacheStackMoveDistance, blobCacheSize, persistentCache, journalCache, customBlobStore, journalGCInterval, journalGCMaxAge, prefetchExternalChanges, role, versionGcMaxAgeInSecs, versionGCExpression, versionGCTimeLimitInSecs, blobGcMaxAgeInSecs, blobTrackSnapshotIntervalInSecs, repositoryHome, maxReplicationLagInSecs, documentStoreType, bundlingDisabled, updateLimit, persistentCacheIncludes, leaseCheckMode);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

