@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(
    @field:JsonProperty("disabled")
    val disabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("debug")
    val debug: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("localIndexDir")
    val localIndexDir: ConfigNodePropertyString? = null,

    @field:JsonProperty("enableOpenIndexAsync")
    val enableOpenIndexAsync: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("threadPoolSize")
    val threadPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("prefetchIndexFiles")
    val prefetchIndexFiles: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("extractedTextCacheSizeInMB")
    val extractedTextCacheSizeInMB: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("extractedTextCacheExpiryInSecs")
    val extractedTextCacheExpiryInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("alwaysUsePreExtractedCache")
    val alwaysUsePreExtractedCache: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("booleanClauseLimit")
    val booleanClauseLimit: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("enableHybridIndexing")
    val enableHybridIndexing: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("hybridQueueSize")
    val hybridQueueSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("disableStoredIndexDefinition")
    val disableStoredIndexDefinition: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("deletedBlobsCollectionEnabled")
    val deletedBlobsCollectionEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("propIndexCleanerIntervalInSecs")
    val propIndexCleanerIntervalInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("enableSingleBlobIndexFiles")
    val enableSingleBlobIndexFiles: ConfigNodePropertyBoolean? = null,

)
