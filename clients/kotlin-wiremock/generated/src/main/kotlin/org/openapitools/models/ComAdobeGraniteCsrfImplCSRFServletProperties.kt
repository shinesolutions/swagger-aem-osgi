@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteCsrfImplCSRFServletProperties(
    @field:JsonProperty("csrf.token.expires.in")
    val csrfTokenExpiresIn: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("sling.auth.requirements")
    val slingAuthRequirements: ConfigNodePropertyString? = null,

)
