package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param disabled 
 * @param debug 
 * @param localIndexDir 
 * @param enableOpenIndexAsync 
 * @param threadPoolSize 
 * @param prefetchIndexFiles 
 * @param extractedTextCacheSizeInMB 
 * @param extractedTextCacheExpiryInSecs 
 * @param alwaysUsePreExtractedCache 
 * @param booleanClauseLimit 
 * @param enableHybridIndexing 
 * @param hybridQueueSize 
 * @param disableStoredIndexDefinition 
 * @param deletedBlobsCollectionEnabled 
 * @param propIndexCleanerIntervalInSecs 
 * @param enableSingleBlobIndexFiles 
 */
data class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("disabled")
    @get:JsonProperty("disabled") val disabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("debug")
    @get:JsonProperty("debug") val debug: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("localIndexDir")
    @get:JsonProperty("localIndexDir") val localIndexDir: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("enableOpenIndexAsync")
    @get:JsonProperty("enableOpenIndexAsync") val enableOpenIndexAsync: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("threadPoolSize")
    @get:JsonProperty("threadPoolSize") val threadPoolSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("prefetchIndexFiles")
    @get:JsonProperty("prefetchIndexFiles") val prefetchIndexFiles: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("extractedTextCacheSizeInMB")
    @get:JsonProperty("extractedTextCacheSizeInMB") val extractedTextCacheSizeInMB: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("extractedTextCacheExpiryInSecs")
    @get:JsonProperty("extractedTextCacheExpiryInSecs") val extractedTextCacheExpiryInSecs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("alwaysUsePreExtractedCache")
    @get:JsonProperty("alwaysUsePreExtractedCache") val alwaysUsePreExtractedCache: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("booleanClauseLimit")
    @get:JsonProperty("booleanClauseLimit") val booleanClauseLimit: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("enableHybridIndexing")
    @get:JsonProperty("enableHybridIndexing") val enableHybridIndexing: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hybridQueueSize")
    @get:JsonProperty("hybridQueueSize") val hybridQueueSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("disableStoredIndexDefinition")
    @get:JsonProperty("disableStoredIndexDefinition") val disableStoredIndexDefinition: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("deletedBlobsCollectionEnabled")
    @get:JsonProperty("deletedBlobsCollectionEnabled") val deletedBlobsCollectionEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("propIndexCleanerIntervalInSecs")
    @get:JsonProperty("propIndexCleanerIntervalInSecs") val propIndexCleanerIntervalInSecs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("enableSingleBlobIndexFiles")
    @get:JsonProperty("enableSingleBlobIndexFiles") val enableSingleBlobIndexFiles: ConfigNodePropertyBoolean? = null
) {

}

