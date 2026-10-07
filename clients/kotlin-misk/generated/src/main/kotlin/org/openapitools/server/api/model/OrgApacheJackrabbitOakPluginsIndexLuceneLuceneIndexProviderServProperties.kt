package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(
    val disabled: ConfigNodePropertyBoolean? = null,
    val debug: ConfigNodePropertyBoolean? = null,
    val localIndexDir: ConfigNodePropertyString? = null,
    val enableOpenIndexAsync: ConfigNodePropertyBoolean? = null,
    val threadPoolSize: ConfigNodePropertyInteger? = null,
    val prefetchIndexFiles: ConfigNodePropertyBoolean? = null,
    val extractedTextCacheSizeInMB: ConfigNodePropertyInteger? = null,
    val extractedTextCacheExpiryInSecs: ConfigNodePropertyInteger? = null,
    val alwaysUsePreExtractedCache: ConfigNodePropertyBoolean? = null,
    val booleanClauseLimit: ConfigNodePropertyInteger? = null,
    val enableHybridIndexing: ConfigNodePropertyBoolean? = null,
    val hybridQueueSize: ConfigNodePropertyInteger? = null,
    val disableStoredIndexDefinition: ConfigNodePropertyBoolean? = null,
    val deletedBlobsCollectionEnabled: ConfigNodePropertyBoolean? = null,
    val propIndexCleanerIntervalInSecs: ConfigNodePropertyInteger? = null,
    val enableSingleBlobIndexFiles: ConfigNodePropertyBoolean? = null
)
