@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(
    @field:JsonProperty("whitelist.name")
    val whitelistName: ConfigNodePropertyString? = null,

    @field:JsonProperty("whitelist.bundles")
    val whitelistBundles: ConfigNodePropertyArray? = null,

)
