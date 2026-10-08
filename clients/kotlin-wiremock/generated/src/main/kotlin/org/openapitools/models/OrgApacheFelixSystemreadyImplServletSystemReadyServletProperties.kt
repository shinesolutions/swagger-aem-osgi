@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties(
    @field:JsonProperty("osgi.http.whiteboard.servlet.pattern")
    val osgiHttpWhiteboardServletPattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("osgi.http.whiteboard.context.select")
    val osgiHttpWhiteboardContextSelect: ConfigNodePropertyString? = null,

)
