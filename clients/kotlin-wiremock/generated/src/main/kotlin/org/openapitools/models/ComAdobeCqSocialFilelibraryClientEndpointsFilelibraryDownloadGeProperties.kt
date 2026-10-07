@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties(
    @field:JsonProperty("sling.servlet.selectors")
    val slingServletSelectors: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.extensions")
    val slingServletExtensions: ConfigNodePropertyString? = null,

)
