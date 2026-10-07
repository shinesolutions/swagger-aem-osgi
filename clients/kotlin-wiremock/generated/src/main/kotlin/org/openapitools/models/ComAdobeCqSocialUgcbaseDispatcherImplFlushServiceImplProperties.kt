@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(
    @field:JsonProperty("threadPoolSize")
    val threadPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("delayTime")
    val delayTime: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("workerSleepTime")
    val workerSleepTime: ConfigNodePropertyInteger? = null,

)
