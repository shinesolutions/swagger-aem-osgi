@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqProjectsImplServletProjectImageServletProperties(
    @field:JsonProperty("image.quality")
    val imageQuality: ConfigNodePropertyString? = null,

    @field:JsonProperty("image.supported.resolutions")
    val imageSupportedResolutions: ConfigNodePropertyString? = null,

)
