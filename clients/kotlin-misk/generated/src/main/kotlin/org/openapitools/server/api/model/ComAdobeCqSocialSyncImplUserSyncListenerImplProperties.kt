package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties(
    val nodetypes: ConfigNodePropertyArray? = null,
    val ignorableprops: ConfigNodePropertyArray? = null,
    val ignorablenodes: ConfigNodePropertyArray? = null,
    val enabled: ConfigNodePropertyBoolean? = null,
    val distfolders: ConfigNodePropertyArray? = null
)
