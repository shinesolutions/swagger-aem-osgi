@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingServletsGetDefaultGetServletProperties(
    @field:JsonProperty("aliases")
    val aliases: ConfigNodePropertyArray? = null,

    @field:JsonProperty("index")
    val index: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("index.files")
    val indexFiles: ConfigNodePropertyArray? = null,

    @field:JsonProperty("enable.html")
    val enableHtml: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("enable.json")
    val enableJson: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("enable.txt")
    val enableTxt: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("enable.xml")
    val enableXml: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("json.maximumresults")
    val jsonMaximumresults: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("ecmaSuport")
    val ecmaSuport: ConfigNodePropertyBoolean? = null,

)
