package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString mongouri = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString db = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean socketKeepAlive = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cache = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger nodeCachePercentage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger prevDocCachePercentage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger childrenCachePercentage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger diffCachePercentage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cacheSegmentCount = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cacheStackMoveDistance = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger blobCacheSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString persistentCache = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString journalCache = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean customBlobStore = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger journalGCInterval = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger journalGCMaxAge = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean prefetchExternalChanges = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString role = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger versionGcMaxAgeInSecs = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString versionGCExpression = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger versionGCTimeLimitInSecs = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger blobGcMaxAgeInSecs = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString repositoryHome = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxReplicationLagInSecs = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown documentStoreType = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean bundlingDisabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger updateLimit = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray persistentCacheIncludes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown leaseCheckMode = null;
 /**
   * Get mongouri
   * @return mongouri
  **/
  @JsonProperty("mongouri")
  public ConfigNodePropertyString getMongouri() {
    return mongouri;
  }

  public void setMongouri(ConfigNodePropertyString mongouri) {
    this.mongouri = mongouri;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties mongouri(ConfigNodePropertyString mongouri) {
    this.mongouri = mongouri;
    return this;
  }

 /**
   * Get db
   * @return db
  **/
  @JsonProperty("db")
  public ConfigNodePropertyString getDb() {
    return db;
  }

  public void setDb(ConfigNodePropertyString db) {
    this.db = db;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties db(ConfigNodePropertyString db) {
    this.db = db;
    return this;
  }

 /**
   * Get socketKeepAlive
   * @return socketKeepAlive
  **/
  @JsonProperty("socketKeepAlive")
  public ConfigNodePropertyBoolean getSocketKeepAlive() {
    return socketKeepAlive;
  }

  public void setSocketKeepAlive(ConfigNodePropertyBoolean socketKeepAlive) {
    this.socketKeepAlive = socketKeepAlive;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties socketKeepAlive(ConfigNodePropertyBoolean socketKeepAlive) {
    this.socketKeepAlive = socketKeepAlive;
    return this;
  }

 /**
   * Get cache
   * @return cache
  **/
  @JsonProperty("cache")
  public ConfigNodePropertyInteger getCache() {
    return cache;
  }

  public void setCache(ConfigNodePropertyInteger cache) {
    this.cache = cache;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties cache(ConfigNodePropertyInteger cache) {
    this.cache = cache;
    return this;
  }

 /**
   * Get nodeCachePercentage
   * @return nodeCachePercentage
  **/
  @JsonProperty("nodeCachePercentage")
  public ConfigNodePropertyInteger getNodeCachePercentage() {
    return nodeCachePercentage;
  }

  public void setNodeCachePercentage(ConfigNodePropertyInteger nodeCachePercentage) {
    this.nodeCachePercentage = nodeCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties nodeCachePercentage(ConfigNodePropertyInteger nodeCachePercentage) {
    this.nodeCachePercentage = nodeCachePercentage;
    return this;
  }

 /**
   * Get prevDocCachePercentage
   * @return prevDocCachePercentage
  **/
  @JsonProperty("prevDocCachePercentage")
  public ConfigNodePropertyInteger getPrevDocCachePercentage() {
    return prevDocCachePercentage;
  }

  public void setPrevDocCachePercentage(ConfigNodePropertyInteger prevDocCachePercentage) {
    this.prevDocCachePercentage = prevDocCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties prevDocCachePercentage(ConfigNodePropertyInteger prevDocCachePercentage) {
    this.prevDocCachePercentage = prevDocCachePercentage;
    return this;
  }

 /**
   * Get childrenCachePercentage
   * @return childrenCachePercentage
  **/
  @JsonProperty("childrenCachePercentage")
  public ConfigNodePropertyInteger getChildrenCachePercentage() {
    return childrenCachePercentage;
  }

  public void setChildrenCachePercentage(ConfigNodePropertyInteger childrenCachePercentage) {
    this.childrenCachePercentage = childrenCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties childrenCachePercentage(ConfigNodePropertyInteger childrenCachePercentage) {
    this.childrenCachePercentage = childrenCachePercentage;
    return this;
  }

 /**
   * Get diffCachePercentage
   * @return diffCachePercentage
  **/
  @JsonProperty("diffCachePercentage")
  public ConfigNodePropertyInteger getDiffCachePercentage() {
    return diffCachePercentage;
  }

  public void setDiffCachePercentage(ConfigNodePropertyInteger diffCachePercentage) {
    this.diffCachePercentage = diffCachePercentage;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties diffCachePercentage(ConfigNodePropertyInteger diffCachePercentage) {
    this.diffCachePercentage = diffCachePercentage;
    return this;
  }

 /**
   * Get cacheSegmentCount
   * @return cacheSegmentCount
  **/
  @JsonProperty("cacheSegmentCount")
  public ConfigNodePropertyInteger getCacheSegmentCount() {
    return cacheSegmentCount;
  }

  public void setCacheSegmentCount(ConfigNodePropertyInteger cacheSegmentCount) {
    this.cacheSegmentCount = cacheSegmentCount;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties cacheSegmentCount(ConfigNodePropertyInteger cacheSegmentCount) {
    this.cacheSegmentCount = cacheSegmentCount;
    return this;
  }

 /**
   * Get cacheStackMoveDistance
   * @return cacheStackMoveDistance
  **/
  @JsonProperty("cacheStackMoveDistance")
  public ConfigNodePropertyInteger getCacheStackMoveDistance() {
    return cacheStackMoveDistance;
  }

  public void setCacheStackMoveDistance(ConfigNodePropertyInteger cacheStackMoveDistance) {
    this.cacheStackMoveDistance = cacheStackMoveDistance;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties cacheStackMoveDistance(ConfigNodePropertyInteger cacheStackMoveDistance) {
    this.cacheStackMoveDistance = cacheStackMoveDistance;
    return this;
  }

 /**
   * Get blobCacheSize
   * @return blobCacheSize
  **/
  @JsonProperty("blobCacheSize")
  public ConfigNodePropertyInteger getBlobCacheSize() {
    return blobCacheSize;
  }

  public void setBlobCacheSize(ConfigNodePropertyInteger blobCacheSize) {
    this.blobCacheSize = blobCacheSize;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties blobCacheSize(ConfigNodePropertyInteger blobCacheSize) {
    this.blobCacheSize = blobCacheSize;
    return this;
  }

 /**
   * Get persistentCache
   * @return persistentCache
  **/
  @JsonProperty("persistentCache")
  public ConfigNodePropertyString getPersistentCache() {
    return persistentCache;
  }

  public void setPersistentCache(ConfigNodePropertyString persistentCache) {
    this.persistentCache = persistentCache;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties persistentCache(ConfigNodePropertyString persistentCache) {
    this.persistentCache = persistentCache;
    return this;
  }

 /**
   * Get journalCache
   * @return journalCache
  **/
  @JsonProperty("journalCache")
  public ConfigNodePropertyString getJournalCache() {
    return journalCache;
  }

  public void setJournalCache(ConfigNodePropertyString journalCache) {
    this.journalCache = journalCache;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties journalCache(ConfigNodePropertyString journalCache) {
    this.journalCache = journalCache;
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties customBlobStore(ConfigNodePropertyBoolean customBlobStore) {
    this.customBlobStore = customBlobStore;
    return this;
  }

 /**
   * Get journalGCInterval
   * @return journalGCInterval
  **/
  @JsonProperty("journalGCInterval")
  public ConfigNodePropertyInteger getJournalGCInterval() {
    return journalGCInterval;
  }

  public void setJournalGCInterval(ConfigNodePropertyInteger journalGCInterval) {
    this.journalGCInterval = journalGCInterval;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties journalGCInterval(ConfigNodePropertyInteger journalGCInterval) {
    this.journalGCInterval = journalGCInterval;
    return this;
  }

 /**
   * Get journalGCMaxAge
   * @return journalGCMaxAge
  **/
  @JsonProperty("journalGCMaxAge")
  public ConfigNodePropertyInteger getJournalGCMaxAge() {
    return journalGCMaxAge;
  }

  public void setJournalGCMaxAge(ConfigNodePropertyInteger journalGCMaxAge) {
    this.journalGCMaxAge = journalGCMaxAge;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties journalGCMaxAge(ConfigNodePropertyInteger journalGCMaxAge) {
    this.journalGCMaxAge = journalGCMaxAge;
    return this;
  }

 /**
   * Get prefetchExternalChanges
   * @return prefetchExternalChanges
  **/
  @JsonProperty("prefetchExternalChanges")
  public ConfigNodePropertyBoolean getPrefetchExternalChanges() {
    return prefetchExternalChanges;
  }

  public void setPrefetchExternalChanges(ConfigNodePropertyBoolean prefetchExternalChanges) {
    this.prefetchExternalChanges = prefetchExternalChanges;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties prefetchExternalChanges(ConfigNodePropertyBoolean prefetchExternalChanges) {
    this.prefetchExternalChanges = prefetchExternalChanges;
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties role(ConfigNodePropertyString role) {
    this.role = role;
    return this;
  }

 /**
   * Get versionGcMaxAgeInSecs
   * @return versionGcMaxAgeInSecs
  **/
  @JsonProperty("versionGcMaxAgeInSecs")
  public ConfigNodePropertyInteger getVersionGcMaxAgeInSecs() {
    return versionGcMaxAgeInSecs;
  }

  public void setVersionGcMaxAgeInSecs(ConfigNodePropertyInteger versionGcMaxAgeInSecs) {
    this.versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties versionGcMaxAgeInSecs(ConfigNodePropertyInteger versionGcMaxAgeInSecs) {
    this.versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
    return this;
  }

 /**
   * Get versionGCExpression
   * @return versionGCExpression
  **/
  @JsonProperty("versionGCExpression")
  public ConfigNodePropertyString getVersionGCExpression() {
    return versionGCExpression;
  }

  public void setVersionGCExpression(ConfigNodePropertyString versionGCExpression) {
    this.versionGCExpression = versionGCExpression;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties versionGCExpression(ConfigNodePropertyString versionGCExpression) {
    this.versionGCExpression = versionGCExpression;
    return this;
  }

 /**
   * Get versionGCTimeLimitInSecs
   * @return versionGCTimeLimitInSecs
  **/
  @JsonProperty("versionGCTimeLimitInSecs")
  public ConfigNodePropertyInteger getVersionGCTimeLimitInSecs() {
    return versionGCTimeLimitInSecs;
  }

  public void setVersionGCTimeLimitInSecs(ConfigNodePropertyInteger versionGCTimeLimitInSecs) {
    this.versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties versionGCTimeLimitInSecs(ConfigNodePropertyInteger versionGCTimeLimitInSecs) {
    this.versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties blobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties blobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
    this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
    return this;
  }

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

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties repositoryHome(ConfigNodePropertyString repositoryHome) {
    this.repositoryHome = repositoryHome;
    return this;
  }

 /**
   * Get maxReplicationLagInSecs
   * @return maxReplicationLagInSecs
  **/
  @JsonProperty("maxReplicationLagInSecs")
  public ConfigNodePropertyInteger getMaxReplicationLagInSecs() {
    return maxReplicationLagInSecs;
  }

  public void setMaxReplicationLagInSecs(ConfigNodePropertyInteger maxReplicationLagInSecs) {
    this.maxReplicationLagInSecs = maxReplicationLagInSecs;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties maxReplicationLagInSecs(ConfigNodePropertyInteger maxReplicationLagInSecs) {
    this.maxReplicationLagInSecs = maxReplicationLagInSecs;
    return this;
  }

 /**
   * Get documentStoreType
   * @return documentStoreType
  **/
  @JsonProperty("documentStoreType")
  public ConfigNodePropertyDropDown getDocumentStoreType() {
    return documentStoreType;
  }

  public void setDocumentStoreType(ConfigNodePropertyDropDown documentStoreType) {
    this.documentStoreType = documentStoreType;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties documentStoreType(ConfigNodePropertyDropDown documentStoreType) {
    this.documentStoreType = documentStoreType;
    return this;
  }

 /**
   * Get bundlingDisabled
   * @return bundlingDisabled
  **/
  @JsonProperty("bundlingDisabled")
  public ConfigNodePropertyBoolean getBundlingDisabled() {
    return bundlingDisabled;
  }

  public void setBundlingDisabled(ConfigNodePropertyBoolean bundlingDisabled) {
    this.bundlingDisabled = bundlingDisabled;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties bundlingDisabled(ConfigNodePropertyBoolean bundlingDisabled) {
    this.bundlingDisabled = bundlingDisabled;
    return this;
  }

 /**
   * Get updateLimit
   * @return updateLimit
  **/
  @JsonProperty("updateLimit")
  public ConfigNodePropertyInteger getUpdateLimit() {
    return updateLimit;
  }

  public void setUpdateLimit(ConfigNodePropertyInteger updateLimit) {
    this.updateLimit = updateLimit;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties updateLimit(ConfigNodePropertyInteger updateLimit) {
    this.updateLimit = updateLimit;
    return this;
  }

 /**
   * Get persistentCacheIncludes
   * @return persistentCacheIncludes
  **/
  @JsonProperty("persistentCacheIncludes")
  public ConfigNodePropertyArray getPersistentCacheIncludes() {
    return persistentCacheIncludes;
  }

  public void setPersistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties persistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
    return this;
  }

 /**
   * Get leaseCheckMode
   * @return leaseCheckMode
  **/
  @JsonProperty("leaseCheckMode")
  public ConfigNodePropertyDropDown getLeaseCheckMode() {
    return leaseCheckMode;
  }

  public void setLeaseCheckMode(ConfigNodePropertyDropDown leaseCheckMode) {
    this.leaseCheckMode = leaseCheckMode;
  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties leaseCheckMode(ConfigNodePropertyDropDown leaseCheckMode) {
    this.leaseCheckMode = leaseCheckMode;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

