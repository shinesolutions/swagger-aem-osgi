package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingServletsGetDefaultGetServletProperties(
    val aliases: ConfigNodePropertyArray? = null,
    val index: ConfigNodePropertyBoolean? = null,
    val indexFiles: ConfigNodePropertyArray? = null,
    val enableHtml: ConfigNodePropertyBoolean? = null,
    val enableJson: ConfigNodePropertyBoolean? = null,
    val enableTxt: ConfigNodePropertyBoolean? = null,
    val enableXml: ConfigNodePropertyBoolean? = null,
    val jsonMaximumresults: ConfigNodePropertyInteger? = null,
    val ecmaSuport: ConfigNodePropertyBoolean? = null
)
