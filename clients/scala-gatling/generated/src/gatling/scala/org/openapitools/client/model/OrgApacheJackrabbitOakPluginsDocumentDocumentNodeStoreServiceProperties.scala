
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties (
    _mongouri: Option[ConfigNodePropertyString],
    _db: Option[ConfigNodePropertyString],
    _socketKeepAlive: Option[ConfigNodePropertyBoolean],
    _cache: Option[ConfigNodePropertyInteger],
    _nodeCachePercentage: Option[ConfigNodePropertyInteger],
    _prevDocCachePercentage: Option[ConfigNodePropertyInteger],
    _childrenCachePercentage: Option[ConfigNodePropertyInteger],
    _diffCachePercentage: Option[ConfigNodePropertyInteger],
    _cacheSegmentCount: Option[ConfigNodePropertyInteger],
    _cacheStackMoveDistance: Option[ConfigNodePropertyInteger],
    _blobCacheSize: Option[ConfigNodePropertyInteger],
    _persistentCache: Option[ConfigNodePropertyString],
    _journalCache: Option[ConfigNodePropertyString],
    _customBlobStore: Option[ConfigNodePropertyBoolean],
    _journalGCInterval: Option[ConfigNodePropertyInteger],
    _journalGCMaxAge: Option[ConfigNodePropertyInteger],
    _prefetchExternalChanges: Option[ConfigNodePropertyBoolean],
    _role: Option[ConfigNodePropertyString],
    _versionGcMaxAgeInSecs: Option[ConfigNodePropertyInteger],
    _versionGCExpression: Option[ConfigNodePropertyString],
    _versionGCTimeLimitInSecs: Option[ConfigNodePropertyInteger],
    _blobGcMaxAgeInSecs: Option[ConfigNodePropertyInteger],
    _blobTrackSnapshotIntervalInSecs: Option[ConfigNodePropertyInteger],
    _repositoryHome: Option[ConfigNodePropertyString],
    _maxReplicationLagInSecs: Option[ConfigNodePropertyInteger],
    _documentStoreType: Option[ConfigNodePropertyDropDown],
    _bundlingDisabled: Option[ConfigNodePropertyBoolean],
    _updateLimit: Option[ConfigNodePropertyInteger],
    _persistentCacheIncludes: Option[ConfigNodePropertyArray],
    _leaseCheckMode: Option[ConfigNodePropertyDropDown]
)
object OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {
    def toStringBody(var_mongouri: Object, var_db: Object, var_socketKeepAlive: Object, var_cache: Object, var_nodeCachePercentage: Object, var_prevDocCachePercentage: Object, var_childrenCachePercentage: Object, var_diffCachePercentage: Object, var_cacheSegmentCount: Object, var_cacheStackMoveDistance: Object, var_blobCacheSize: Object, var_persistentCache: Object, var_journalCache: Object, var_customBlobStore: Object, var_journalGCInterval: Object, var_journalGCMaxAge: Object, var_prefetchExternalChanges: Object, var_role: Object, var_versionGcMaxAgeInSecs: Object, var_versionGCExpression: Object, var_versionGCTimeLimitInSecs: Object, var_blobGcMaxAgeInSecs: Object, var_blobTrackSnapshotIntervalInSecs: Object, var_repositoryHome: Object, var_maxReplicationLagInSecs: Object, var_documentStoreType: Object, var_bundlingDisabled: Object, var_updateLimit: Object, var_persistentCacheIncludes: Object, var_leaseCheckMode: Object) =
        s"""
        | {
        | "mongouri":$var_mongouri,"db":$var_db,"socketKeepAlive":$var_socketKeepAlive,"cache":$var_cache,"nodeCachePercentage":$var_nodeCachePercentage,"prevDocCachePercentage":$var_prevDocCachePercentage,"childrenCachePercentage":$var_childrenCachePercentage,"diffCachePercentage":$var_diffCachePercentage,"cacheSegmentCount":$var_cacheSegmentCount,"cacheStackMoveDistance":$var_cacheStackMoveDistance,"blobCacheSize":$var_blobCacheSize,"persistentCache":$var_persistentCache,"journalCache":$var_journalCache,"customBlobStore":$var_customBlobStore,"journalGCInterval":$var_journalGCInterval,"journalGCMaxAge":$var_journalGCMaxAge,"prefetchExternalChanges":$var_prefetchExternalChanges,"role":$var_role,"versionGcMaxAgeInSecs":$var_versionGcMaxAgeInSecs,"versionGCExpression":$var_versionGCExpression,"versionGCTimeLimitInSecs":$var_versionGCTimeLimitInSecs,"blobGcMaxAgeInSecs":$var_blobGcMaxAgeInSecs,"blobTrackSnapshotIntervalInSecs":$var_blobTrackSnapshotIntervalInSecs,"repositoryHome":$var_repositoryHome,"maxReplicationLagInSecs":$var_maxReplicationLagInSecs,"documentStoreType":$var_documentStoreType,"bundlingDisabled":$var_bundlingDisabled,"updateLimit":$var_updateLimit,"persistentCacheIncludes":$var_persistentCacheIncludes,"leaseCheckMode":$var_leaseCheckMode
        | }
        """.stripMargin
}
