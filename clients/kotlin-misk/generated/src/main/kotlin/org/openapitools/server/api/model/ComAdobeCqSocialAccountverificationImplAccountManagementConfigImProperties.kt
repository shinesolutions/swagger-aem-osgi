package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(
    val enable: ConfigNodePropertyBoolean? = null,
    val ttl1: ConfigNodePropertyInteger? = null,
    val ttl2: ConfigNodePropertyInteger? = null
)
