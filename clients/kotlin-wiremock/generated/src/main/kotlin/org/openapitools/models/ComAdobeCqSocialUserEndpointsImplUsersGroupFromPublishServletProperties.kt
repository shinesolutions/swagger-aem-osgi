@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties(
    @field:JsonProperty("sling.servlet.extensions")
    val slingServletExtensions: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.paths")
    val slingServletPaths: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.methods")
    val slingServletMethods: ConfigNodePropertyString? = null,

)
