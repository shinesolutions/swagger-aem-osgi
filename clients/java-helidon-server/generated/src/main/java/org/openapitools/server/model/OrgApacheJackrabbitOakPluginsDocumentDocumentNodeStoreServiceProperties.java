package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties   {

    private ConfigNodePropertyString mongouri;
    private ConfigNodePropertyString db;
    private ConfigNodePropertyBoolean socketKeepAlive;
    private ConfigNodePropertyInteger cache;
    private ConfigNodePropertyInteger nodeCachePercentage;
    private ConfigNodePropertyInteger prevDocCachePercentage;
    private ConfigNodePropertyInteger childrenCachePercentage;
    private ConfigNodePropertyInteger diffCachePercentage;
    private ConfigNodePropertyInteger cacheSegmentCount;
    private ConfigNodePropertyInteger cacheStackMoveDistance;
    private ConfigNodePropertyInteger blobCacheSize;
    private ConfigNodePropertyString persistentCache;
    private ConfigNodePropertyString journalCache;
    private ConfigNodePropertyBoolean customBlobStore;
    private ConfigNodePropertyInteger journalGCInterval;
    private ConfigNodePropertyInteger journalGCMaxAge;
    private ConfigNodePropertyBoolean prefetchExternalChanges;
    private ConfigNodePropertyString role;
    private ConfigNodePropertyInteger versionGcMaxAgeInSecs;
    private ConfigNodePropertyString versionGCExpression;
    private ConfigNodePropertyInteger versionGCTimeLimitInSecs;
    private ConfigNodePropertyInteger blobGcMaxAgeInSecs;
    private ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs;
    private ConfigNodePropertyString repositoryHome;
    private ConfigNodePropertyInteger maxReplicationLagInSecs;
    private ConfigNodePropertyDropDown documentStoreType;
    private ConfigNodePropertyBoolean bundlingDisabled;
    private ConfigNodePropertyInteger updateLimit;
    private ConfigNodePropertyArray persistentCacheIncludes;
    private ConfigNodePropertyDropDown leaseCheckMode;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.
     *
     * @param mongouri mongouri
     * @param db db
     * @param socketKeepAlive socketKeepAlive
     * @param cache cache
     * @param nodeCachePercentage nodeCachePercentage
     * @param prevDocCachePercentage prevDocCachePercentage
     * @param childrenCachePercentage childrenCachePercentage
     * @param diffCachePercentage diffCachePercentage
     * @param cacheSegmentCount cacheSegmentCount
     * @param cacheStackMoveDistance cacheStackMoveDistance
     * @param blobCacheSize blobCacheSize
     * @param persistentCache persistentCache
     * @param journalCache journalCache
     * @param customBlobStore customBlobStore
     * @param journalGCInterval journalGCInterval
     * @param journalGCMaxAge journalGCMaxAge
     * @param prefetchExternalChanges prefetchExternalChanges
     * @param role role
     * @param versionGcMaxAgeInSecs versionGcMaxAgeInSecs
     * @param versionGCExpression versionGCExpression
     * @param versionGCTimeLimitInSecs versionGCTimeLimitInSecs
     * @param blobGcMaxAgeInSecs blobGcMaxAgeInSecs
     * @param blobTrackSnapshotIntervalInSecs blobTrackSnapshotIntervalInSecs
     * @param repositoryHome repositoryHome
     * @param maxReplicationLagInSecs maxReplicationLagInSecs
     * @param documentStoreType documentStoreType
     * @param bundlingDisabled bundlingDisabled
     * @param updateLimit updateLimit
     * @param persistentCacheIncludes persistentCacheIncludes
     * @param leaseCheckMode leaseCheckMode
     */
    public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(
        ConfigNodePropertyString mongouri, 
        ConfigNodePropertyString db, 
        ConfigNodePropertyBoolean socketKeepAlive, 
        ConfigNodePropertyInteger cache, 
        ConfigNodePropertyInteger nodeCachePercentage, 
        ConfigNodePropertyInteger prevDocCachePercentage, 
        ConfigNodePropertyInteger childrenCachePercentage, 
        ConfigNodePropertyInteger diffCachePercentage, 
        ConfigNodePropertyInteger cacheSegmentCount, 
        ConfigNodePropertyInteger cacheStackMoveDistance, 
        ConfigNodePropertyInteger blobCacheSize, 
        ConfigNodePropertyString persistentCache, 
        ConfigNodePropertyString journalCache, 
        ConfigNodePropertyBoolean customBlobStore, 
        ConfigNodePropertyInteger journalGCInterval, 
        ConfigNodePropertyInteger journalGCMaxAge, 
        ConfigNodePropertyBoolean prefetchExternalChanges, 
        ConfigNodePropertyString role, 
        ConfigNodePropertyInteger versionGcMaxAgeInSecs, 
        ConfigNodePropertyString versionGCExpression, 
        ConfigNodePropertyInteger versionGCTimeLimitInSecs, 
        ConfigNodePropertyInteger blobGcMaxAgeInSecs, 
        ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs, 
        ConfigNodePropertyString repositoryHome, 
        ConfigNodePropertyInteger maxReplicationLagInSecs, 
        ConfigNodePropertyDropDown documentStoreType, 
        ConfigNodePropertyBoolean bundlingDisabled, 
        ConfigNodePropertyInteger updateLimit, 
        ConfigNodePropertyArray persistentCacheIncludes, 
        ConfigNodePropertyDropDown leaseCheckMode
    ) {
        this.mongouri = mongouri;
        this.db = db;
        this.socketKeepAlive = socketKeepAlive;
        this.cache = cache;
        this.nodeCachePercentage = nodeCachePercentage;
        this.prevDocCachePercentage = prevDocCachePercentage;
        this.childrenCachePercentage = childrenCachePercentage;
        this.diffCachePercentage = diffCachePercentage;
        this.cacheSegmentCount = cacheSegmentCount;
        this.cacheStackMoveDistance = cacheStackMoveDistance;
        this.blobCacheSize = blobCacheSize;
        this.persistentCache = persistentCache;
        this.journalCache = journalCache;
        this.customBlobStore = customBlobStore;
        this.journalGCInterval = journalGCInterval;
        this.journalGCMaxAge = journalGCMaxAge;
        this.prefetchExternalChanges = prefetchExternalChanges;
        this.role = role;
        this.versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
        this.versionGCExpression = versionGCExpression;
        this.versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
        this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
        this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
        this.repositoryHome = repositoryHome;
        this.maxReplicationLagInSecs = maxReplicationLagInSecs;
        this.documentStoreType = documentStoreType;
        this.bundlingDisabled = bundlingDisabled;
        this.updateLimit = updateLimit;
        this.persistentCacheIncludes = persistentCacheIncludes;
        this.leaseCheckMode = leaseCheckMode;
    }



    /**
     * Get mongouri
     * @return mongouri
     */
    public ConfigNodePropertyString getMongouri() {
        return mongouri;
    }

    public void setMongouri(ConfigNodePropertyString mongouri) {
        this.mongouri = mongouri;
    }

    /**
     * Get db
     * @return db
     */
    public ConfigNodePropertyString getDb() {
        return db;
    }

    public void setDb(ConfigNodePropertyString db) {
        this.db = db;
    }

    /**
     * Get socketKeepAlive
     * @return socketKeepAlive
     */
    public ConfigNodePropertyBoolean getSocketKeepAlive() {
        return socketKeepAlive;
    }

    public void setSocketKeepAlive(ConfigNodePropertyBoolean socketKeepAlive) {
        this.socketKeepAlive = socketKeepAlive;
    }

    /**
     * Get cache
     * @return cache
     */
    public ConfigNodePropertyInteger getCache() {
        return cache;
    }

    public void setCache(ConfigNodePropertyInteger cache) {
        this.cache = cache;
    }

    /**
     * Get nodeCachePercentage
     * @return nodeCachePercentage
     */
    public ConfigNodePropertyInteger getNodeCachePercentage() {
        return nodeCachePercentage;
    }

    public void setNodeCachePercentage(ConfigNodePropertyInteger nodeCachePercentage) {
        this.nodeCachePercentage = nodeCachePercentage;
    }

    /**
     * Get prevDocCachePercentage
     * @return prevDocCachePercentage
     */
    public ConfigNodePropertyInteger getPrevDocCachePercentage() {
        return prevDocCachePercentage;
    }

    public void setPrevDocCachePercentage(ConfigNodePropertyInteger prevDocCachePercentage) {
        this.prevDocCachePercentage = prevDocCachePercentage;
    }

    /**
     * Get childrenCachePercentage
     * @return childrenCachePercentage
     */
    public ConfigNodePropertyInteger getChildrenCachePercentage() {
        return childrenCachePercentage;
    }

    public void setChildrenCachePercentage(ConfigNodePropertyInteger childrenCachePercentage) {
        this.childrenCachePercentage = childrenCachePercentage;
    }

    /**
     * Get diffCachePercentage
     * @return diffCachePercentage
     */
    public ConfigNodePropertyInteger getDiffCachePercentage() {
        return diffCachePercentage;
    }

    public void setDiffCachePercentage(ConfigNodePropertyInteger diffCachePercentage) {
        this.diffCachePercentage = diffCachePercentage;
    }

    /**
     * Get cacheSegmentCount
     * @return cacheSegmentCount
     */
    public ConfigNodePropertyInteger getCacheSegmentCount() {
        return cacheSegmentCount;
    }

    public void setCacheSegmentCount(ConfigNodePropertyInteger cacheSegmentCount) {
        this.cacheSegmentCount = cacheSegmentCount;
    }

    /**
     * Get cacheStackMoveDistance
     * @return cacheStackMoveDistance
     */
    public ConfigNodePropertyInteger getCacheStackMoveDistance() {
        return cacheStackMoveDistance;
    }

    public void setCacheStackMoveDistance(ConfigNodePropertyInteger cacheStackMoveDistance) {
        this.cacheStackMoveDistance = cacheStackMoveDistance;
    }

    /**
     * Get blobCacheSize
     * @return blobCacheSize
     */
    public ConfigNodePropertyInteger getBlobCacheSize() {
        return blobCacheSize;
    }

    public void setBlobCacheSize(ConfigNodePropertyInteger blobCacheSize) {
        this.blobCacheSize = blobCacheSize;
    }

    /**
     * Get persistentCache
     * @return persistentCache
     */
    public ConfigNodePropertyString getPersistentCache() {
        return persistentCache;
    }

    public void setPersistentCache(ConfigNodePropertyString persistentCache) {
        this.persistentCache = persistentCache;
    }

    /**
     * Get journalCache
     * @return journalCache
     */
    public ConfigNodePropertyString getJournalCache() {
        return journalCache;
    }

    public void setJournalCache(ConfigNodePropertyString journalCache) {
        this.journalCache = journalCache;
    }

    /**
     * Get customBlobStore
     * @return customBlobStore
     */
    public ConfigNodePropertyBoolean getCustomBlobStore() {
        return customBlobStore;
    }

    public void setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore) {
        this.customBlobStore = customBlobStore;
    }

    /**
     * Get journalGCInterval
     * @return journalGCInterval
     */
    public ConfigNodePropertyInteger getJournalGCInterval() {
        return journalGCInterval;
    }

    public void setJournalGCInterval(ConfigNodePropertyInteger journalGCInterval) {
        this.journalGCInterval = journalGCInterval;
    }

    /**
     * Get journalGCMaxAge
     * @return journalGCMaxAge
     */
    public ConfigNodePropertyInteger getJournalGCMaxAge() {
        return journalGCMaxAge;
    }

    public void setJournalGCMaxAge(ConfigNodePropertyInteger journalGCMaxAge) {
        this.journalGCMaxAge = journalGCMaxAge;
    }

    /**
     * Get prefetchExternalChanges
     * @return prefetchExternalChanges
     */
    public ConfigNodePropertyBoolean getPrefetchExternalChanges() {
        return prefetchExternalChanges;
    }

    public void setPrefetchExternalChanges(ConfigNodePropertyBoolean prefetchExternalChanges) {
        this.prefetchExternalChanges = prefetchExternalChanges;
    }

    /**
     * Get role
     * @return role
     */
    public ConfigNodePropertyString getRole() {
        return role;
    }

    public void setRole(ConfigNodePropertyString role) {
        this.role = role;
    }

    /**
     * Get versionGcMaxAgeInSecs
     * @return versionGcMaxAgeInSecs
     */
    public ConfigNodePropertyInteger getVersionGcMaxAgeInSecs() {
        return versionGcMaxAgeInSecs;
    }

    public void setVersionGcMaxAgeInSecs(ConfigNodePropertyInteger versionGcMaxAgeInSecs) {
        this.versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
    }

    /**
     * Get versionGCExpression
     * @return versionGCExpression
     */
    public ConfigNodePropertyString getVersionGCExpression() {
        return versionGCExpression;
    }

    public void setVersionGCExpression(ConfigNodePropertyString versionGCExpression) {
        this.versionGCExpression = versionGCExpression;
    }

    /**
     * Get versionGCTimeLimitInSecs
     * @return versionGCTimeLimitInSecs
     */
    public ConfigNodePropertyInteger getVersionGCTimeLimitInSecs() {
        return versionGCTimeLimitInSecs;
    }

    public void setVersionGCTimeLimitInSecs(ConfigNodePropertyInteger versionGCTimeLimitInSecs) {
        this.versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
    }

    /**
     * Get blobGcMaxAgeInSecs
     * @return blobGcMaxAgeInSecs
     */
    public ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() {
        return blobGcMaxAgeInSecs;
    }

    public void setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs) {
        this.blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
    }

    /**
     * Get blobTrackSnapshotIntervalInSecs
     * @return blobTrackSnapshotIntervalInSecs
     */
    public ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() {
        return blobTrackSnapshotIntervalInSecs;
    }

    public void setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs) {
        this.blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
    }

    /**
     * Get repositoryHome
     * @return repositoryHome
     */
    public ConfigNodePropertyString getRepositoryHome() {
        return repositoryHome;
    }

    public void setRepositoryHome(ConfigNodePropertyString repositoryHome) {
        this.repositoryHome = repositoryHome;
    }

    /**
     * Get maxReplicationLagInSecs
     * @return maxReplicationLagInSecs
     */
    public ConfigNodePropertyInteger getMaxReplicationLagInSecs() {
        return maxReplicationLagInSecs;
    }

    public void setMaxReplicationLagInSecs(ConfigNodePropertyInteger maxReplicationLagInSecs) {
        this.maxReplicationLagInSecs = maxReplicationLagInSecs;
    }

    /**
     * Get documentStoreType
     * @return documentStoreType
     */
    public ConfigNodePropertyDropDown getDocumentStoreType() {
        return documentStoreType;
    }

    public void setDocumentStoreType(ConfigNodePropertyDropDown documentStoreType) {
        this.documentStoreType = documentStoreType;
    }

    /**
     * Get bundlingDisabled
     * @return bundlingDisabled
     */
    public ConfigNodePropertyBoolean getBundlingDisabled() {
        return bundlingDisabled;
    }

    public void setBundlingDisabled(ConfigNodePropertyBoolean bundlingDisabled) {
        this.bundlingDisabled = bundlingDisabled;
    }

    /**
     * Get updateLimit
     * @return updateLimit
     */
    public ConfigNodePropertyInteger getUpdateLimit() {
        return updateLimit;
    }

    public void setUpdateLimit(ConfigNodePropertyInteger updateLimit) {
        this.updateLimit = updateLimit;
    }

    /**
     * Get persistentCacheIncludes
     * @return persistentCacheIncludes
     */
    public ConfigNodePropertyArray getPersistentCacheIncludes() {
        return persistentCacheIncludes;
    }

    public void setPersistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
        this.persistentCacheIncludes = persistentCacheIncludes;
    }

    /**
     * Get leaseCheckMode
     * @return leaseCheckMode
     */
    public ConfigNodePropertyDropDown getLeaseCheckMode() {
        return leaseCheckMode;
    }

    public void setLeaseCheckMode(ConfigNodePropertyDropDown leaseCheckMode) {
        this.leaseCheckMode = leaseCheckMode;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

