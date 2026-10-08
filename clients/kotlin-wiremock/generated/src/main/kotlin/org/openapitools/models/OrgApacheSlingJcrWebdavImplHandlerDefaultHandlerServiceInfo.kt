@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo(
    @field:JsonProperty("pid")
    val pid: kotlin.String? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("properties")
    val properties: OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties? = null,

)
