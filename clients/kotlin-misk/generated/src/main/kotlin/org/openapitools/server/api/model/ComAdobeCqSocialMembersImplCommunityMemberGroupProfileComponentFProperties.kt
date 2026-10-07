package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(
    val everyoneLimit: ConfigNodePropertyInteger? = null,
    val priority: ConfigNodePropertyInteger? = null
)
