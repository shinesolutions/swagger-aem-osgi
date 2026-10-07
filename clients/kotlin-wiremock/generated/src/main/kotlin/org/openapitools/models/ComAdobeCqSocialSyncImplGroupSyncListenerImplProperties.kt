@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(
    @field:JsonProperty("nodetypes")
    val nodetypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("ignorableprops")
    val ignorableprops: ConfigNodePropertyArray? = null,

    @field:JsonProperty("ignorablenodes")
    val ignorablenodes: ConfigNodePropertyString? = null,

    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("distfolders")
    val distfolders: ConfigNodePropertyString? = null,

)
