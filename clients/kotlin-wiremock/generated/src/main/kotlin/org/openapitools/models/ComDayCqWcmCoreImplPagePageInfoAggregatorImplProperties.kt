@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties(
    @field:JsonProperty("page.info.provider.property.regex.default")
    val pageInfoProviderPropertyRegexDefault: ConfigNodePropertyString? = null,

    @field:JsonProperty("page.info.provider.property.name")
    val pageInfoProviderPropertyName: ConfigNodePropertyString? = null,

)
