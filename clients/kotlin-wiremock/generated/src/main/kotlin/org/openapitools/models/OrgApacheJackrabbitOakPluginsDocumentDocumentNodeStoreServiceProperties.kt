@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(
    @field:JsonProperty("mongouri")
    val mongouri: ConfigNodePropertyString? = null,

    @field:JsonProperty("db")
    val db: ConfigNodePropertyString? = null,

    @field:JsonProperty("socketKeepAlive")
    val socketKeepAlive: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cache")
    val cache: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("nodeCachePercentage")
    val nodeCachePercentage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("prevDocCachePercentage")
    val prevDocCachePercentage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("childrenCachePercentage")
    val childrenCachePercentage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("diffCachePercentage")
    val diffCachePercentage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cacheSegmentCount")
    val cacheSegmentCount: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cacheStackMoveDistance")
    val cacheStackMoveDistance: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("blobCacheSize")
    val blobCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("persistentCache")
    val persistentCache: ConfigNodePropertyString? = null,

    @field:JsonProperty("journalCache")
    val journalCache: ConfigNodePropertyString? = null,

    @field:JsonProperty("customBlobStore")
    val customBlobStore: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("journalGCInterval")
    val journalGCInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("journalGCMaxAge")
    val journalGCMaxAge: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("prefetchExternalChanges")
    val prefetchExternalChanges: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("role")
    val role: ConfigNodePropertyString? = null,

    @field:JsonProperty("versionGcMaxAgeInSecs")
    val versionGcMaxAgeInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("versionGCExpression")
    val versionGCExpression: ConfigNodePropertyString? = null,

    @field:JsonProperty("versionGCTimeLimitInSecs")
    val versionGCTimeLimitInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("blobGcMaxAgeInSecs")
    val blobGcMaxAgeInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("blobTrackSnapshotIntervalInSecs")
    val blobTrackSnapshotIntervalInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("repository.home")
    val repositoryHome: ConfigNodePropertyString? = null,

    @field:JsonProperty("maxReplicationLagInSecs")
    val maxReplicationLagInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("documentStoreType")
    val documentStoreType: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("bundlingDisabled")
    val bundlingDisabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("updateLimit")
    val updateLimit: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("persistentCacheIncludes")
    val persistentCacheIncludes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("leaseCheckMode")
    val leaseCheckMode: ConfigNodePropertyDropDown? = null,

)
