
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties (
    _repositoryHome: Option[ConfigNodePropertyString],
    _tarmkMode: Option[ConfigNodePropertyString],
    _tarmkSize: Option[ConfigNodePropertyInteger],
    _segmentCacheSize: Option[ConfigNodePropertyInteger],
    _stringCacheSize: Option[ConfigNodePropertyInteger],
    _templateCacheSize: Option[ConfigNodePropertyInteger],
    _stringDeduplicationCacheSize: Option[ConfigNodePropertyInteger],
    _templateDeduplicationCacheSize: Option[ConfigNodePropertyInteger],
    _nodeDeduplicationCacheSize: Option[ConfigNodePropertyInteger],
    _pauseCompaction: Option[ConfigNodePropertyBoolean],
    _compactionRetryCount: Option[ConfigNodePropertyInteger],
    _compactionForceTimeout: Option[ConfigNodePropertyInteger],
    _compactionSizeDeltaEstimation: Option[ConfigNodePropertyInteger],
    _compactionDisableEstimation: Option[ConfigNodePropertyBoolean],
    _compactionRetainedGenerations: Option[ConfigNodePropertyInteger],
    _compactionMemoryThreshold: Option[ConfigNodePropertyInteger],
    _compactionProgressLog: Option[ConfigNodePropertyInteger],
    _standby: Option[ConfigNodePropertyBoolean],
    _customBlobStore: Option[ConfigNodePropertyBoolean],
    _customSegmentStore: Option[ConfigNodePropertyBoolean],
    _splitPersistence: Option[ConfigNodePropertyBoolean],
    _repositoryBackupDir: Option[ConfigNodePropertyString],
    _blobGcMaxAgeInSecs: Option[ConfigNodePropertyInteger],
    _blobTrackSnapshotIntervalInSecs: Option[ConfigNodePropertyInteger]
)
object OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties {
    def toStringBody(var_repositoryHome: Object, var_tarmkMode: Object, var_tarmkSize: Object, var_segmentCacheSize: Object, var_stringCacheSize: Object, var_templateCacheSize: Object, var_stringDeduplicationCacheSize: Object, var_templateDeduplicationCacheSize: Object, var_nodeDeduplicationCacheSize: Object, var_pauseCompaction: Object, var_compactionRetryCount: Object, var_compactionForceTimeout: Object, var_compactionSizeDeltaEstimation: Object, var_compactionDisableEstimation: Object, var_compactionRetainedGenerations: Object, var_compactionMemoryThreshold: Object, var_compactionProgressLog: Object, var_standby: Object, var_customBlobStore: Object, var_customSegmentStore: Object, var_splitPersistence: Object, var_repositoryBackupDir: Object, var_blobGcMaxAgeInSecs: Object, var_blobTrackSnapshotIntervalInSecs: Object) =
        s"""
        | {
        | "repositoryHome":$var_repositoryHome,"tarmkMode":$var_tarmkMode,"tarmkSize":$var_tarmkSize,"segmentCacheSize":$var_segmentCacheSize,"stringCacheSize":$var_stringCacheSize,"templateCacheSize":$var_templateCacheSize,"stringDeduplicationCacheSize":$var_stringDeduplicationCacheSize,"templateDeduplicationCacheSize":$var_templateDeduplicationCacheSize,"nodeDeduplicationCacheSize":$var_nodeDeduplicationCacheSize,"pauseCompaction":$var_pauseCompaction,"compactionRetryCount":$var_compactionRetryCount,"compactionForceTimeout":$var_compactionForceTimeout,"compactionSizeDeltaEstimation":$var_compactionSizeDeltaEstimation,"compactionDisableEstimation":$var_compactionDisableEstimation,"compactionRetainedGenerations":$var_compactionRetainedGenerations,"compactionMemoryThreshold":$var_compactionMemoryThreshold,"compactionProgressLog":$var_compactionProgressLog,"standby":$var_standby,"customBlobStore":$var_customBlobStore,"customSegmentStore":$var_customSegmentStore,"splitPersistence":$var_splitPersistence,"repositoryBackupDir":$var_repositoryBackupDir,"blobGcMaxAgeInSecs":$var_blobGcMaxAgeInSecs,"blobTrackSnapshotIntervalInSecs":$var_blobTrackSnapshotIntervalInSecs
        | }
        """.stripMargin
}
