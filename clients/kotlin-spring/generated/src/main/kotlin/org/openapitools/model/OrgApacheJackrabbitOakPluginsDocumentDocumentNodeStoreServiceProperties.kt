package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param mongouri 
 * @param db 
 * @param socketKeepAlive 
 * @param cache 
 * @param nodeCachePercentage 
 * @param prevDocCachePercentage 
 * @param childrenCachePercentage 
 * @param diffCachePercentage 
 * @param cacheSegmentCount 
 * @param cacheStackMoveDistance 
 * @param blobCacheSize 
 * @param persistentCache 
 * @param journalCache 
 * @param customBlobStore 
 * @param journalGCInterval 
 * @param journalGCMaxAge 
 * @param prefetchExternalChanges 
 * @param role 
 * @param versionGcMaxAgeInSecs 
 * @param versionGCExpression 
 * @param versionGCTimeLimitInSecs 
 * @param blobGcMaxAgeInSecs 
 * @param blobTrackSnapshotIntervalInSecs 
 * @param repositoryHome 
 * @param maxReplicationLagInSecs 
 * @param documentStoreType 
 * @param bundlingDisabled 
 * @param updateLimit 
 * @param persistentCacheIncludes 
 * @param leaseCheckMode 
 */
data class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("mongouri")
    @get:JsonProperty("mongouri") val mongouri: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("db")
    @get:JsonProperty("db") val db: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("socketKeepAlive")
    @get:JsonProperty("socketKeepAlive") val socketKeepAlive: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cache")
    @get:JsonProperty("cache") val cache: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("nodeCachePercentage")
    @get:JsonProperty("nodeCachePercentage") val nodeCachePercentage: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("prevDocCachePercentage")
    @get:JsonProperty("prevDocCachePercentage") val prevDocCachePercentage: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("childrenCachePercentage")
    @get:JsonProperty("childrenCachePercentage") val childrenCachePercentage: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("diffCachePercentage")
    @get:JsonProperty("diffCachePercentage") val diffCachePercentage: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cacheSegmentCount")
    @get:JsonProperty("cacheSegmentCount") val cacheSegmentCount: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cacheStackMoveDistance")
    @get:JsonProperty("cacheStackMoveDistance") val cacheStackMoveDistance: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("blobCacheSize")
    @get:JsonProperty("blobCacheSize") val blobCacheSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("persistentCache")
    @get:JsonProperty("persistentCache") val persistentCache: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("journalCache")
    @get:JsonProperty("journalCache") val journalCache: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("customBlobStore")
    @get:JsonProperty("customBlobStore") val customBlobStore: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("journalGCInterval")
    @get:JsonProperty("journalGCInterval") val journalGCInterval: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("journalGCMaxAge")
    @get:JsonProperty("journalGCMaxAge") val journalGCMaxAge: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("prefetchExternalChanges")
    @get:JsonProperty("prefetchExternalChanges") val prefetchExternalChanges: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("role")
    @get:JsonProperty("role") val role: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionGcMaxAgeInSecs")
    @get:JsonProperty("versionGcMaxAgeInSecs") val versionGcMaxAgeInSecs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionGCExpression")
    @get:JsonProperty("versionGCExpression") val versionGCExpression: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionGCTimeLimitInSecs")
    @get:JsonProperty("versionGCTimeLimitInSecs") val versionGCTimeLimitInSecs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("blobGcMaxAgeInSecs")
    @get:JsonProperty("blobGcMaxAgeInSecs") val blobGcMaxAgeInSecs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("blobTrackSnapshotIntervalInSecs")
    @get:JsonProperty("blobTrackSnapshotIntervalInSecs") val blobTrackSnapshotIntervalInSecs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("repository.home")
    @get:JsonProperty("repository.home") val repositoryHome: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("maxReplicationLagInSecs")
    @get:JsonProperty("maxReplicationLagInSecs") val maxReplicationLagInSecs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("documentStoreType")
    @get:JsonProperty("documentStoreType") val documentStoreType: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("bundlingDisabled")
    @get:JsonProperty("bundlingDisabled") val bundlingDisabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("updateLimit")
    @get:JsonProperty("updateLimit") val updateLimit: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("persistentCacheIncludes")
    @get:JsonProperty("persistentCacheIncludes") val persistentCacheIncludes: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("leaseCheckMode")
    @get:JsonProperty("leaseCheckMode") val leaseCheckMode: ConfigNodePropertyDropDown? = null
) {

}

