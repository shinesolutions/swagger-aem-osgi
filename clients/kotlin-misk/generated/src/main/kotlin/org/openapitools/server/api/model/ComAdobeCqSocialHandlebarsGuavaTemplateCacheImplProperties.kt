package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(
    val parameterGuavaCacheEnabled: ConfigNodePropertyBoolean? = null,
    val parameterGuavaCacheParams: ConfigNodePropertyString? = null,
    val parameterGuavaCacheReload: ConfigNodePropertyBoolean? = null,
    val serviceRanking: ConfigNodePropertyInteger? = null
)
