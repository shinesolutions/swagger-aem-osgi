package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(
    val mongouri: ConfigNodePropertyString? = null,
    val db: ConfigNodePropertyString? = null,
    val socketKeepAlive: ConfigNodePropertyBoolean? = null,
    val cache: ConfigNodePropertyInteger? = null,
    val nodeCachePercentage: ConfigNodePropertyInteger? = null,
    val prevDocCachePercentage: ConfigNodePropertyInteger? = null,
    val childrenCachePercentage: ConfigNodePropertyInteger? = null,
    val diffCachePercentage: ConfigNodePropertyInteger? = null,
    val cacheSegmentCount: ConfigNodePropertyInteger? = null,
    val cacheStackMoveDistance: ConfigNodePropertyInteger? = null,
    val blobCacheSize: ConfigNodePropertyInteger? = null,
    val persistentCache: ConfigNodePropertyString? = null,
    val journalCache: ConfigNodePropertyString? = null,
    val customBlobStore: ConfigNodePropertyBoolean? = null,
    val journalGCInterval: ConfigNodePropertyInteger? = null,
    val journalGCMaxAge: ConfigNodePropertyInteger? = null,
    val prefetchExternalChanges: ConfigNodePropertyBoolean? = null,
    val role: ConfigNodePropertyString? = null,
    val versionGcMaxAgeInSecs: ConfigNodePropertyInteger? = null,
    val versionGCExpression: ConfigNodePropertyString? = null,
    val versionGCTimeLimitInSecs: ConfigNodePropertyInteger? = null,
    val blobGcMaxAgeInSecs: ConfigNodePropertyInteger? = null,
    val blobTrackSnapshotIntervalInSecs: ConfigNodePropertyInteger? = null,
    val repositoryHome: ConfigNodePropertyString? = null,
    val maxReplicationLagInSecs: ConfigNodePropertyInteger? = null,
    val documentStoreType: ConfigNodePropertyDropDown? = null,
    val bundlingDisabled: ConfigNodePropertyBoolean? = null,
    val updateLimit: ConfigNodePropertyInteger? = null,
    val persistentCacheIncludes: ConfigNodePropertyArray? = null,
    val leaseCheckMode: ConfigNodePropertyDropDown? = null
)
