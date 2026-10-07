
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties (
    _disabled: Option[ConfigNodePropertyBoolean],
    _debug: Option[ConfigNodePropertyBoolean],
    _localIndexDir: Option[ConfigNodePropertyString],
    _enableOpenIndexAsync: Option[ConfigNodePropertyBoolean],
    _threadPoolSize: Option[ConfigNodePropertyInteger],
    _prefetchIndexFiles: Option[ConfigNodePropertyBoolean],
    _extractedTextCacheSizeInMB: Option[ConfigNodePropertyInteger],
    _extractedTextCacheExpiryInSecs: Option[ConfigNodePropertyInteger],
    _alwaysUsePreExtractedCache: Option[ConfigNodePropertyBoolean],
    _booleanClauseLimit: Option[ConfigNodePropertyInteger],
    _enableHybridIndexing: Option[ConfigNodePropertyBoolean],
    _hybridQueueSize: Option[ConfigNodePropertyInteger],
    _disableStoredIndexDefinition: Option[ConfigNodePropertyBoolean],
    _deletedBlobsCollectionEnabled: Option[ConfigNodePropertyBoolean],
    _propIndexCleanerIntervalInSecs: Option[ConfigNodePropertyInteger],
    _enableSingleBlobIndexFiles: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {
    def toStringBody(var_disabled: Object, var_debug: Object, var_localIndexDir: Object, var_enableOpenIndexAsync: Object, var_threadPoolSize: Object, var_prefetchIndexFiles: Object, var_extractedTextCacheSizeInMB: Object, var_extractedTextCacheExpiryInSecs: Object, var_alwaysUsePreExtractedCache: Object, var_booleanClauseLimit: Object, var_enableHybridIndexing: Object, var_hybridQueueSize: Object, var_disableStoredIndexDefinition: Object, var_deletedBlobsCollectionEnabled: Object, var_propIndexCleanerIntervalInSecs: Object, var_enableSingleBlobIndexFiles: Object) =
        s"""
        | {
        | "disabled":$var_disabled,"debug":$var_debug,"localIndexDir":$var_localIndexDir,"enableOpenIndexAsync":$var_enableOpenIndexAsync,"threadPoolSize":$var_threadPoolSize,"prefetchIndexFiles":$var_prefetchIndexFiles,"extractedTextCacheSizeInMB":$var_extractedTextCacheSizeInMB,"extractedTextCacheExpiryInSecs":$var_extractedTextCacheExpiryInSecs,"alwaysUsePreExtractedCache":$var_alwaysUsePreExtractedCache,"booleanClauseLimit":$var_booleanClauseLimit,"enableHybridIndexing":$var_enableHybridIndexing,"hybridQueueSize":$var_hybridQueueSize,"disableStoredIndexDefinition":$var_disableStoredIndexDefinition,"deletedBlobsCollectionEnabled":$var_deletedBlobsCollectionEnabled,"propIndexCleanerIntervalInSecs":$var_propIndexCleanerIntervalInSecs,"enableSingleBlobIndexFiles":$var_enableSingleBlobIndexFiles
        | }
        """.stripMargin
}
