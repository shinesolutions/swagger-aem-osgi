@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(
    @field:JsonProperty("totalWidth")
    val totalWidth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("colWidthName")
    val colWidthName: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("colWidthResult")
    val colWidthResult: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("colWidthTiming")
    val colWidthTiming: ConfigNodePropertyInteger? = null,

)
