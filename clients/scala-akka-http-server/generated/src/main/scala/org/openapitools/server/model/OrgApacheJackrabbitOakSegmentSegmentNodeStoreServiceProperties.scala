package org.openapitools.server.model


/**
 * @param repositoryHome  for example: ''null''
 * @param tarmkMode  for example: ''null''
 * @param tarmkSize  for example: ''null''
 * @param segmentCacheSize  for example: ''null''
 * @param stringCacheSize  for example: ''null''
 * @param templateCacheSize  for example: ''null''
 * @param stringDeduplicationCacheSize  for example: ''null''
 * @param templateDeduplicationCacheSize  for example: ''null''
 * @param nodeDeduplicationCacheSize  for example: ''null''
 * @param pauseCompaction  for example: ''null''
 * @param compactionRetryCount  for example: ''null''
 * @param compactionForceTimeout  for example: ''null''
 * @param compactionSizeDeltaEstimation  for example: ''null''
 * @param compactionDisableEstimation  for example: ''null''
 * @param compactionRetainedGenerations  for example: ''null''
 * @param compactionMemoryThreshold  for example: ''null''
 * @param compactionProgressLog  for example: ''null''
 * @param standby  for example: ''null''
 * @param customBlobStore  for example: ''null''
 * @param customSegmentStore  for example: ''null''
 * @param splitPersistence  for example: ''null''
 * @param repositoryBackupDir  for example: ''null''
 * @param blobGcMaxAgeInSecs  for example: ''null''
 * @param blobTrackSnapshotIntervalInSecs  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties (
  repositoryHome: Option[ConfigNodePropertyString] = None,
  tarmkMode: Option[ConfigNodePropertyString] = None,
  tarmkSize: Option[ConfigNodePropertyInteger] = None,
  segmentCacheSize: Option[ConfigNodePropertyInteger] = None,
  stringCacheSize: Option[ConfigNodePropertyInteger] = None,
  templateCacheSize: Option[ConfigNodePropertyInteger] = None,
  stringDeduplicationCacheSize: Option[ConfigNodePropertyInteger] = None,
  templateDeduplicationCacheSize: Option[ConfigNodePropertyInteger] = None,
  nodeDeduplicationCacheSize: Option[ConfigNodePropertyInteger] = None,
  pauseCompaction: Option[ConfigNodePropertyBoolean] = None,
  compactionRetryCount: Option[ConfigNodePropertyInteger] = None,
  compactionForceTimeout: Option[ConfigNodePropertyInteger] = None,
  compactionSizeDeltaEstimation: Option[ConfigNodePropertyInteger] = None,
  compactionDisableEstimation: Option[ConfigNodePropertyBoolean] = None,
  compactionRetainedGenerations: Option[ConfigNodePropertyInteger] = None,
  compactionMemoryThreshold: Option[ConfigNodePropertyInteger] = None,
  compactionProgressLog: Option[ConfigNodePropertyInteger] = None,
  standby: Option[ConfigNodePropertyBoolean] = None,
  customBlobStore: Option[ConfigNodePropertyBoolean] = None,
  customSegmentStore: Option[ConfigNodePropertyBoolean] = None,
  splitPersistence: Option[ConfigNodePropertyBoolean] = None,
  repositoryBackupDir: Option[ConfigNodePropertyString] = None,
  blobGcMaxAgeInSecs: Option[ConfigNodePropertyInteger] = None,
  blobTrackSnapshotIntervalInSecs: Option[ConfigNodePropertyInteger] = None
)

