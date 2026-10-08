package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(
    val watchwordsPositive: ConfigNodePropertyArray? = null,
    val watchwordsNegative: ConfigNodePropertyArray? = null,
    val watchwordsPath: ConfigNodePropertyString? = null,
    val sentimentPath: ConfigNodePropertyString? = null
)
