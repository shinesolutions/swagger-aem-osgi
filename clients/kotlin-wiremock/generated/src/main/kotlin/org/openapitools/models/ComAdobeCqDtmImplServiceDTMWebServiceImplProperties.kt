@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(
    @field:JsonProperty("connection.timeout")
    val connectionTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("socket.timeout")
    val socketTimeout: ConfigNodePropertyInteger? = null,

)
