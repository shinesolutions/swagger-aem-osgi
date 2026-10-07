package org.openapitools.server.model


/**
 * @param disabled  for example: ''null''
 * @param debug  for example: ''null''
 * @param localIndexDir  for example: ''null''
 * @param enableOpenIndexAsync  for example: ''null''
 * @param threadPoolSize  for example: ''null''
 * @param prefetchIndexFiles  for example: ''null''
 * @param extractedTextCacheSizeInMB  for example: ''null''
 * @param extractedTextCacheExpiryInSecs  for example: ''null''
 * @param alwaysUsePreExtractedCache  for example: ''null''
 * @param booleanClauseLimit  for example: ''null''
 * @param enableHybridIndexing  for example: ''null''
 * @param hybridQueueSize  for example: ''null''
 * @param disableStoredIndexDefinition  for example: ''null''
 * @param deletedBlobsCollectionEnabled  for example: ''null''
 * @param propIndexCleanerIntervalInSecs  for example: ''null''
 * @param enableSingleBlobIndexFiles  for example: ''null''
*/
final case class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties (
  disabled: Option[ConfigNodePropertyBoolean] = None,
  debug: Option[ConfigNodePropertyBoolean] = None,
  localIndexDir: Option[ConfigNodePropertyString] = None,
  enableOpenIndexAsync: Option[ConfigNodePropertyBoolean] = None,
  threadPoolSize: Option[ConfigNodePropertyInteger] = None,
  prefetchIndexFiles: Option[ConfigNodePropertyBoolean] = None,
  extractedTextCacheSizeInMB: Option[ConfigNodePropertyInteger] = None,
  extractedTextCacheExpiryInSecs: Option[ConfigNodePropertyInteger] = None,
  alwaysUsePreExtractedCache: Option[ConfigNodePropertyBoolean] = None,
  booleanClauseLimit: Option[ConfigNodePropertyInteger] = None,
  enableHybridIndexing: Option[ConfigNodePropertyBoolean] = None,
  hybridQueueSize: Option[ConfigNodePropertyInteger] = None,
  disableStoredIndexDefinition: Option[ConfigNodePropertyBoolean] = None,
  deletedBlobsCollectionEnabled: Option[ConfigNodePropertyBoolean] = None,
  propIndexCleanerIntervalInSecs: Option[ConfigNodePropertyInteger] = None,
  enableSingleBlobIndexFiles: Option[ConfigNodePropertyBoolean] = None
)

