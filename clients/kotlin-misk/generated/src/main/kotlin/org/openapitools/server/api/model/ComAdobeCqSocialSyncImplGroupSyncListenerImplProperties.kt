package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(
    val nodetypes: ConfigNodePropertyArray? = null,
    val ignorableprops: ConfigNodePropertyArray? = null,
    val ignorablenodes: ConfigNodePropertyString? = null,
    val enabled: ConfigNodePropertyBoolean? = null,
    val distfolders: ConfigNodePropertyString? = null
)
