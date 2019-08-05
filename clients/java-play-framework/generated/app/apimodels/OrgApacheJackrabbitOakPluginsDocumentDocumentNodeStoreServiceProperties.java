package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

