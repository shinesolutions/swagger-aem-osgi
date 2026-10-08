package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(
    val eventTopics: ConfigNodePropertyString? = null,
    val eventFilter: ConfigNodePropertyString? = null,
    val translateListenerType: ConfigNodePropertyArray? = null,
    val translatePropertyList: ConfigNodePropertyArray? = null,
    val poolSize: ConfigNodePropertyInteger? = null,
    val maxPoolSize: ConfigNodePropertyInteger? = null,
    val queueSize: ConfigNodePropertyInteger? = null,
    val keepAliveTime: ConfigNodePropertyInteger? = null
)
