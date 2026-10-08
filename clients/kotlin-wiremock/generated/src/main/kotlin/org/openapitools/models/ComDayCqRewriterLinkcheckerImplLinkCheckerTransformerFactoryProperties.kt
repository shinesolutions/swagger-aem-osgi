@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(
    @field:JsonProperty("linkcheckertransformer.disableRewriting")
    val linkcheckertransformerDisableRewriting: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("linkcheckertransformer.disableChecking")
    val linkcheckertransformerDisableChecking: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("linkcheckertransformer.mapCacheSize")
    val linkcheckertransformerMapCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("linkcheckertransformer.strictExtensionCheck")
    val linkcheckertransformerStrictExtensionCheck: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("linkcheckertransformer.stripHtmltExtension")
    val linkcheckertransformerStripHtmltExtension: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("linkcheckertransformer.rewriteElements")
    val linkcheckertransformerRewriteElements: ConfigNodePropertyArray? = null,

    @field:JsonProperty("linkcheckertransformer.stripExtensionPathBlacklist")
    val linkcheckertransformerStripExtensionPathBlacklist: ConfigNodePropertyArray? = null,

)
