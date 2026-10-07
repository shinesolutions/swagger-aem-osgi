package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(
    val threadPoolSize: ConfigNodePropertyInteger? = null,
    val delayTime: ConfigNodePropertyInteger? = null,
    val workerSleepTime: ConfigNodePropertyInteger? = null
)
