@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(
    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("pathPrefix")
    val pathPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("createVersion")
    val createVersion: ConfigNodePropertyBoolean? = null,

)
