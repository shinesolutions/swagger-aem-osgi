@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(
    @field:JsonProperty("xmp.filter.apply_whitelist")
    val xmpFilterApplyWhitelist: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("xmp.filter.whitelist")
    val xmpFilterWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("xmp.filter.apply_blacklist")
    val xmpFilterApplyBlacklist: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("xmp.filter.blacklist")
    val xmpFilterBlacklist: ConfigNodePropertyArray? = null,

)
