@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(
    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("type.collections")
    val typeCollections: ConfigNodePropertyString? = null,

    @field:JsonProperty("type.noncollections")
    val typeNoncollections: ConfigNodePropertyString? = null,

    @field:JsonProperty("type.content")
    val typeContent: ConfigNodePropertyString? = null,

)
