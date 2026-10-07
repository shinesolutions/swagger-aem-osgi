@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(
    @field:JsonProperty("event.topics")
    val eventTopics: ConfigNodePropertyString? = null,

    @field:JsonProperty("event.filter")
    val eventFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("translate.listener.type")
    val translateListenerType: ConfigNodePropertyArray? = null,

    @field:JsonProperty("translate.property.list")
    val translatePropertyList: ConfigNodePropertyArray? = null,

    @field:JsonProperty("poolSize")
    val poolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxPoolSize")
    val maxPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queueSize")
    val queueSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("keepAliveTime")
    val keepAliveTime: ConfigNodePropertyInteger? = null,

)
