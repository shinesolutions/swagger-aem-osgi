package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param linkcheckertransformerDisableRewriting 
 * @param linkcheckertransformerDisableChecking 
 * @param linkcheckertransformerMapCacheSize 
 * @param linkcheckertransformerStrictExtensionCheck 
 * @param linkcheckertransformerStripHtmltExtension 
 * @param linkcheckertransformerRewriteElements 
 * @param linkcheckertransformerStripExtensionPathBlacklist 
 */
data class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("linkcheckertransformer.disableRewriting")
    @get:JsonProperty("linkcheckertransformer.disableRewriting") val linkcheckertransformerDisableRewriting: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("linkcheckertransformer.disableChecking")
    @get:JsonProperty("linkcheckertransformer.disableChecking") val linkcheckertransformerDisableChecking: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("linkcheckertransformer.mapCacheSize")
    @get:JsonProperty("linkcheckertransformer.mapCacheSize") val linkcheckertransformerMapCacheSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("linkcheckertransformer.strictExtensionCheck")
    @get:JsonProperty("linkcheckertransformer.strictExtensionCheck") val linkcheckertransformerStrictExtensionCheck: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("linkcheckertransformer.stripHtmltExtension")
    @get:JsonProperty("linkcheckertransformer.stripHtmltExtension") val linkcheckertransformerStripHtmltExtension: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("linkcheckertransformer.rewriteElements")
    @get:JsonProperty("linkcheckertransformer.rewriteElements") val linkcheckertransformerRewriteElements: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("linkcheckertransformer.stripExtensionPathBlacklist")
    @get:JsonProperty("linkcheckertransformer.stripExtensionPathBlacklist") val linkcheckertransformerStripExtensionPathBlacklist: ConfigNodePropertyArray? = null
) {

}

