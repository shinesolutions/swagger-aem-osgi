package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyInteger
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
 * @param cqDamBatchMetadataAssetDefault 
 * @param cqDamBatchMetadataCollectionDefault 
 * @param cqDamBatchMetadataMaxresources 
 */
data class ComDayCqDamCoreImplServletBatchMetadataServletProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.batch.metadata.asset.default")
    @get:JsonProperty("cq.dam.batch.metadata.asset.default") val cqDamBatchMetadataAssetDefault: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.batch.metadata.collection.default")
    @get:JsonProperty("cq.dam.batch.metadata.collection.default") val cqDamBatchMetadataCollectionDefault: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.batch.metadata.maxresources")
    @get:JsonProperty("cq.dam.batch.metadata.maxresources") val cqDamBatchMetadataMaxresources: ConfigNodePropertyInteger? = null
) {

}

