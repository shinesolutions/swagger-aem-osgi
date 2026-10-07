package org.openapitools.server.model


/**
 * @param mongouri  for example: ''null''
 * @param db  for example: ''null''
 * @param socketKeepAlive  for example: ''null''
 * @param cache  for example: ''null''
 * @param nodeCachePercentage  for example: ''null''
 * @param prevDocCachePercentage  for example: ''null''
 * @param childrenCachePercentage  for example: ''null''
 * @param diffCachePercentage  for example: ''null''
 * @param cacheSegmentCount  for example: ''null''
 * @param cacheStackMoveDistance  for example: ''null''
 * @param blobCacheSize  for example: ''null''
 * @param persistentCache  for example: ''null''
 * @param journalCache  for example: ''null''
 * @param customBlobStore  for example: ''null''
 * @param journalGCInterval  for example: ''null''
 * @param journalGCMaxAge  for example: ''null''
 * @param prefetchExternalChanges  for example: ''null''
 * @param role  for example: ''null''
 * @param versionGcMaxAgeInSecs  for example: ''null''
 * @param versionGCExpression  for example: ''null''
 * @param versionGCTimeLimitInSecs  for example: ''null''
 * @param blobGcMaxAgeInSecs  for example: ''null''
 * @param blobTrackSnapshotIntervalInSecs  for example: ''null''
 * @param repositoryHome  for example: ''null''
 * @param maxReplicationLagInSecs  for example: ''null''
 * @param documentStoreType  for example: ''null''
 * @param bundlingDisabled  for example: ''null''
 * @param updateLimit  for example: ''null''
 * @param persistentCacheIncludes  for example: ''null''
 * @param leaseCheckMode  for example: ''null''
*/
final case class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties (
  mongouri: Option[ConfigNodePropertyString] = None,
  db: Option[ConfigNodePropertyString] = None,
  socketKeepAlive: Option[ConfigNodePropertyBoolean] = None,
  cache: Option[ConfigNodePropertyInteger] = None,
  nodeCachePercentage: Option[ConfigNodePropertyInteger] = None,
  prevDocCachePercentage: Option[ConfigNodePropertyInteger] = None,
  childrenCachePercentage: Option[ConfigNodePropertyInteger] = None,
  diffCachePercentage: Option[ConfigNodePropertyInteger] = None,
  cacheSegmentCount: Option[ConfigNodePropertyInteger] = None,
  cacheStackMoveDistance: Option[ConfigNodePropertyInteger] = None,
  blobCacheSize: Option[ConfigNodePropertyInteger] = None,
  persistentCache: Option[ConfigNodePropertyString] = None,
  journalCache: Option[ConfigNodePropertyString] = None,
  customBlobStore: Option[ConfigNodePropertyBoolean] = None,
  journalGCInterval: Option[ConfigNodePropertyInteger] = None,
  journalGCMaxAge: Option[ConfigNodePropertyInteger] = None,
  prefetchExternalChanges: Option[ConfigNodePropertyBoolean] = None,
  role: Option[ConfigNodePropertyString] = None,
  versionGcMaxAgeInSecs: Option[ConfigNodePropertyInteger] = None,
  versionGCExpression: Option[ConfigNodePropertyString] = None,
  versionGCTimeLimitInSecs: Option[ConfigNodePropertyInteger] = None,
  blobGcMaxAgeInSecs: Option[ConfigNodePropertyInteger] = None,
  blobTrackSnapshotIntervalInSecs: Option[ConfigNodePropertyInteger] = None,
  repositoryHome: Option[ConfigNodePropertyString] = None,
  maxReplicationLagInSecs: Option[ConfigNodePropertyInteger] = None,
  documentStoreType: Option[ConfigNodePropertyDropDown] = None,
  bundlingDisabled: Option[ConfigNodePropertyBoolean] = None,
  updateLimit: Option[ConfigNodePropertyInteger] = None,
  persistentCacheIncludes: Option[ConfigNodePropertyArray] = None,
  leaseCheckMode: Option[ConfigNodePropertyDropDown] = None
)

