@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialGroupImplGroupServiceImplProperties(
    @field:JsonProperty("maxWaitTime")
    val maxWaitTime: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("minWaitBetweenRetries")
    val minWaitBetweenRetries: ConfigNodePropertyInteger? = null,

)
