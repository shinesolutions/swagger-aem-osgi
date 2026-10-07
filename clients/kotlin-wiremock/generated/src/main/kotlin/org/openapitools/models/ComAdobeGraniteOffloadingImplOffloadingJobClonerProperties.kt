@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(
    @field:JsonProperty("offloading.jobcloner.enabled")
    val offloadingJobclonerEnabled: ConfigNodePropertyBoolean? = null,

)
