package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(
    val damCfmComponentResourceType: ConfigNodePropertyString? = null,
    val damCfmComponentFileReferenceProp: ConfigNodePropertyString? = null,
    val damCfmComponentElementsProp: ConfigNodePropertyString? = null,
    val damCfmComponentVariationProp: ConfigNodePropertyString? = null
)
