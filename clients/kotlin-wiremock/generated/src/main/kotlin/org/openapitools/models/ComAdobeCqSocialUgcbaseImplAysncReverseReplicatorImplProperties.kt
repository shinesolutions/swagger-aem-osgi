@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(
    @field:JsonProperty("poolSize")
    val poolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxPoolSize")
    val maxPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queueSize")
    val queueSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("keepAliveTime")
    val keepAliveTime: ConfigNodePropertyInteger? = null,

)
