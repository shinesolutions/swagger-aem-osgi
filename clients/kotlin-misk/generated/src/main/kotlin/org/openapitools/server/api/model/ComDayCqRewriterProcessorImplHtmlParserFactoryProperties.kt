package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(
    val htmlparserProcessTags: ConfigNodePropertyArray? = null,
    val htmlparserPreserveCamelCase: ConfigNodePropertyBoolean? = null
)
