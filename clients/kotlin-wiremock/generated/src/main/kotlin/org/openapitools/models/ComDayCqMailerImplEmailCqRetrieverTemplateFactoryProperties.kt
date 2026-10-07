@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(
    @field:JsonProperty("mailer.email.embed")
    val mailerEmailEmbed: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("mailer.email.charset")
    val mailerEmailCharset: ConfigNodePropertyString? = null,

    @field:JsonProperty("mailer.email.retrieverUserID")
    val mailerEmailRetrieverUserID: ConfigNodePropertyString? = null,

    @field:JsonProperty("mailer.email.retrieverUserPWD")
    val mailerEmailRetrieverUserPWD: ConfigNodePropertyString? = null,

)
