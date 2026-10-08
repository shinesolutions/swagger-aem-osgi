@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(
    @field:JsonProperty("illegalCharMapping")
    val illegalCharMapping: ConfigNodePropertyString? = null,

    @field:JsonProperty("pageSubTreeActivationCheck")
    val pageSubTreeActivationCheck: ConfigNodePropertyBoolean? = null,

)
