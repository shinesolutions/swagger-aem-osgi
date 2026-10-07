@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingTenantInternalTenantProviderImplProperties(
    @field:JsonProperty("tenant.root")
    val tenantRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("tenant.path.matcher")
    val tenantPathMatcher: ConfigNodePropertyArray? = null,

)
