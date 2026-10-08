package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(
    val enable: ConfigNodePropertyBoolean? = null,
    val ugCLimit: ConfigNodePropertyInteger? = null,
    val ugcLimitDuration: ConfigNodePropertyInteger? = null,
    val domains: ConfigNodePropertyArray? = null,
    val toList: ConfigNodePropertyArray? = null
)
