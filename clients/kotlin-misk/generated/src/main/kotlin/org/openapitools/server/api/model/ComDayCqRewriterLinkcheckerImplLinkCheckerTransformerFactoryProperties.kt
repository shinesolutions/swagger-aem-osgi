package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(
    val linkcheckertransformerDisableRewriting: ConfigNodePropertyBoolean? = null,
    val linkcheckertransformerDisableChecking: ConfigNodePropertyBoolean? = null,
    val linkcheckertransformerMapCacheSize: ConfigNodePropertyInteger? = null,
    val linkcheckertransformerStrictExtensionCheck: ConfigNodePropertyBoolean? = null,
    val linkcheckertransformerStripHtmltExtension: ConfigNodePropertyBoolean? = null,
    val linkcheckertransformerRewriteElements: ConfigNodePropertyArray? = null,
    val linkcheckertransformerStripExtensionPathBlacklist: ConfigNodePropertyArray? = null
)
