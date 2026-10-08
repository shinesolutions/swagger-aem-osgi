package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(
    val poolSize: ConfigNodePropertyInteger? = null,
    val maxPoolSize: ConfigNodePropertyInteger? = null,
    val queueSize: ConfigNodePropertyInteger? = null,
    val keepAliveTime: ConfigNodePropertyInteger? = null
)
