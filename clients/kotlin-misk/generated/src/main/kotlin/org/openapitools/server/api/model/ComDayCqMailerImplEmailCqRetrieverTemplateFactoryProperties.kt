package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(
    val mailerEmailEmbed: ConfigNodePropertyBoolean? = null,
    val mailerEmailCharset: ConfigNodePropertyString? = null,
    val mailerEmailRetrieverUserID: ConfigNodePropertyString? = null,
    val mailerEmailRetrieverUserPWD: ConfigNodePropertyString? = null
)
