package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties   {
  
  private ConfigNodePropertyString mongouri = null;
  private ConfigNodePropertyString db = null;
  private ConfigNodePropertyBoolean socketKeepAlive = null;
  private ConfigNodePropertyInteger cache = null;
  private ConfigNodePropertyInteger nodeCachePercentage = null;
  private ConfigNodePropertyInteger prevDocCachePercentage = null;
  private ConfigNodePropertyInteger childrenCachePercentage = null;
  private ConfigNodePropertyInteger diffCachePercentage = null;
  private ConfigNodePropertyInteger cacheSegmentCount = null;
  private ConfigNodePropertyInteger cacheStackMoveDistance = null;
  private ConfigNodePropertyInteger blobCacheSize = null;
  private ConfigNodePropertyString persistentCache = null;
  private ConfigNodePropertyString journalCache = null;
  private ConfigNodePropertyBoolean customBlobStore = null;
  private ConfigNodePropertyInteger journalGCInterval = null;
  private ConfigNodePropertyInteger journalGCMaxAge = null;
  private ConfigNodePropertyBoolean prefetchExternalChanges = null;
  private ConfigNodePropertyString role = null;
  private ConfigNodePropertyInteger versionGcMaxAgeInSecs = null;
  private ConfigNodePropertyString versionGCExpression = null;
  private ConfigNodePropertyInteger versionGCTimeLimitInSecs = null;
  private ConfigNodePropertyInteger blobGcMaxAgeInSecs = null;
  private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs = null;
  private ConfigNodePropertyString repositoryHome = null;
  private ConfigNodePropertyInteger maxReplicationLagInSecs = null;
  private ConfigNodePropertyDropDown documentStoreType = null;
  private ConfigNodePropertyBoolean bundlingDisabled = null;
  private ConfigNodePropertyInteger updateLimit = null;
  private ConfigNodePropertyArray persistentCacheIncludes = null;
  private ConfigNodePropertyDropDown leaseCheckMode = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mongouri")
  public ConfigNodePropertyString getMongouri() {
    return mongouri;
  }
  public void setMongouri(ConfigNodePropertyString mongouri) {
    this.mongouri = mongouri;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("db")
  public ConfigNodePropertyString getDb() {
    return db;
  }
  public void setDb(ConfigNodePropertyString db) {
    this.db = db;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("socketKeepAlive")
  public ConfigNodePropertyBoolean getSocketKeepAlive() {
    return socketKeepAlive;
  }
  public void setSocketKeepAlive(ConfigNodePropertyBoolean socketKeepAlive) {
    this.socketKeepAlive = socketKeepAlive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cache")
  public ConfigNodePropertyInteger getCache() {
    return cache;
  }
  public void setCache(ConfigNodePropertyInteger cache) {
    this.cache = cache;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nodeCachePercentage")
  public ConfigNodePropertyInteger getNodeCachePercentage() {
    return nodeCachePercentage;
  }
  public void setNodeCachePercentage(ConfigNodePropertyInteger nodeCachePercentage) {
    this.nodeCachePercentage = nodeCachePercentage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prevDocCachePercentage")
  public ConfigNodePropertyInteger getPrevDocCachePercentage() {
    return prevDocCachePercentage;
  }
  public void setPrevDocCachePercentage(ConfigNodePropertyInteger prevDocCachePercentage) {
    this.prevDocCachePercentage = prevDocCachePercentage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("childrenCachePercentage")
  public ConfigNodePropertyInteger getChildrenCachePercentage() {
    return childrenCachePercentage;
  }
  public void setChildrenCachePercentage(ConfigNodePropertyInteger childrenCachePercentage) {
    this.childrenCachePercentage = childrenCachePercentage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("diffCachePercentage")
  public ConfigNodePropertyInteger getDiffCachePercentage() {
    return diffCachePercentage;
  }
  public void setDiffCachePercentage(ConfigNodePropertyInteger diffCachePercentage) {
    this.diffCachePercentage = diffCachePercentage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cacheSegmentCount")
  public ConfigNodePropertyInteger getCacheSegmentCount() {
    return cacheSegmentCount;
  }
  public void setCacheSegmentCount(ConfigNodePropertyInteger cacheSegmentCount) {
    this.cacheSegmentCount = cacheSegmentCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cacheStackMoveDistance")
  public ConfigNodePropertyInteger getCacheStackMoveDistance() {
    return cacheStackMoveDistance;
  }
  public void setCacheStackMoveDistance(ConfigNodePropertyInteger cacheStackMoveDistance) {
    this.cacheStackMoveDistance = cacheStackMoveDistance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("blobCacheSize")
  public ConfigNodePropertyInteger getBlobCacheSize() {
    return blobCacheSize;
  }
  public void setBlobCacheSize(ConfigNodePropertyInteger blobCacheSize) {
    this.blobCacheSize = blobCacheSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("persistentCache")
  public ConfigNodePropertyString getPersistentCache() {
    return persistentCache;
  }
  public void setPersistentCache(ConfigNodePropertyString persistentCache) {
    this.persistentCache = persistentCache;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("journalCache")
  public ConfigNodePropertyString getJournalCache() {
    return journalCache;
  }
  public void setJournalCache(ConfigNodePropertyString journalCache) {
    this.journalCache = journalCache;
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
  @JsonProperty("journalGCInterval")
  public ConfigNodePropertyInteger getJournalGCInterval() {
    return journalGCInterval;
  }
  public void setJournalGCInterval(ConfigNodePropertyInteger journalGCInterval) {
    this.journalGCInterval = journalGCInterval;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("journalGCMaxAge")
  public ConfigNodePropertyInteger getJournalGCMaxAge() {
    return journalGCMaxAge;
  }
  public void setJournalGCMaxAge(ConfigNodePropertyInteger journalGCMaxAge) {
    this.journalGCMaxAge = journalGCMaxAge;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prefetchExternalChanges")
  public ConfigNodePropertyBoolean getPrefetchExternalChanges() {
    return prefetchExternalChanges;
  }
  public void setPrefetchExternalChanges(ConfigNodePropertyBoolean prefetchExternalChanges) {
    this.prefetchExternalChanges = prefetchExternalChanges;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("role")
  public ConfigNodePropertyString getRole() {
    return role;
  }
  public void setRole(ConfigNodePropertyString role) {
    this.role = role;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versionGcMaxAgeInSecs")
  public ConfigNodePropertyInteger getVersionGcMaxAgeInSecs() {
    return versionGcMaxAgeInSecs;
  }
  public void setVersionGcMaxAgeInSecs(ConfigNodePropertyInteger versionGcMaxAgeInSecs) {
    this.versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versionGCExpression")
  public ConfigNodePropertyString getVersionGCExpression() {
    return versionGCExpression;
  }
  public void setVersionGCExpression(ConfigNodePropertyString versionGCExpression) {
    this.versionGCExpression = versionGCExpression;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versionGCTimeLimitInSecs")
  public ConfigNodePropertyInteger getVersionGCTimeLimitInSecs() {
    return versionGCTimeLimitInSecs;
  }
  public void setVersionGCTimeLimitInSecs(ConfigNodePropertyInteger versionGCTimeLimitInSecs) {
    this.versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
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
  @JsonProperty("maxReplicationLagInSecs")
  public ConfigNodePropertyInteger getMaxReplicationLagInSecs() {
    return maxReplicationLagInSecs;
  }
  public void setMaxReplicationLagInSecs(ConfigNodePropertyInteger maxReplicationLagInSecs) {
    this.maxReplicationLagInSecs = maxReplicationLagInSecs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documentStoreType")
  public ConfigNodePropertyDropDown getDocumentStoreType() {
    return documentStoreType;
  }
  public void setDocumentStoreType(ConfigNodePropertyDropDown documentStoreType) {
    this.documentStoreType = documentStoreType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bundlingDisabled")
  public ConfigNodePropertyBoolean getBundlingDisabled() {
    return bundlingDisabled;
  }
  public void setBundlingDisabled(ConfigNodePropertyBoolean bundlingDisabled) {
    this.bundlingDisabled = bundlingDisabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updateLimit")
  public ConfigNodePropertyInteger getUpdateLimit() {
    return updateLimit;
  }
  public void setUpdateLimit(ConfigNodePropertyInteger updateLimit) {
    this.updateLimit = updateLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("persistentCacheIncludes")
  public ConfigNodePropertyArray getPersistentCacheIncludes() {
    return persistentCacheIncludes;
  }
  public void setPersistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("leaseCheckMode")
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

