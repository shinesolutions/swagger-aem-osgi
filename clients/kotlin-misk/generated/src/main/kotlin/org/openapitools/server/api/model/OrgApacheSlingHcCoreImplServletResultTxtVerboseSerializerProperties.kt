package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(
    val totalWidth: ConfigNodePropertyInteger? = null,
    val colWidthName: ConfigNodePropertyInteger? = null,
    val colWidthResult: ConfigNodePropertyInteger? = null,
    val colWidthTiming: ConfigNodePropertyInteger? = null
)
