@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(
    @field:JsonProperty("htmlparser.processTags")
    val htmlparserProcessTags: ConfigNodePropertyArray? = null,

    @field:JsonProperty("htmlparser.preserveCamelCase")
    val htmlparserPreserveCamelCase: ConfigNodePropertyBoolean? = null,

)
