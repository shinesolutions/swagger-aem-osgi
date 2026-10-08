package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(
    val damCfmResourceTypes: ConfigNodePropertyArray? = null,
    val damCfmReferenceProperties: ConfigNodePropertyArray? = null
)
