@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEngineParametersProperties(
    @field:JsonProperty("sling.default.parameter.encoding")
    val slingDefaultParameterEncoding: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.default.max.parameters")
    val slingDefaultMaxParameters: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("file.location")
    val fileLocation: ConfigNodePropertyString? = null,

    @field:JsonProperty("file.threshold")
    val fileThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("file.max")
    val fileMax: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("request.max")
    val requestMax: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
    val slingDefaultParameterCheckForAdditionalContainerParameters: ConfigNodePropertyBoolean? = null,

)
