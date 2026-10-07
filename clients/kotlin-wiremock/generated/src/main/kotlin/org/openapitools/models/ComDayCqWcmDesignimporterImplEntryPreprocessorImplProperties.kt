@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(
    @field:JsonProperty("search.pattern")
    val searchPattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("replace.pattern")
    val replacePattern: ConfigNodePropertyString? = null,

)
