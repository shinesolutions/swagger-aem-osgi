@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(
    @field:JsonProperty("whitelist.bypass")
    val whitelistBypass: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("whitelist.bundles.regexp")
    val whitelistBundlesRegexp: ConfigNodePropertyString? = null,

)
