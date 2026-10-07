@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties(
    @field:JsonProperty("sling.servlet.selectors")
    val slingServletSelectors: ConfigNodePropertyArray? = null,

    @field:JsonProperty("ecmaSuport")
    val ecmaSuport: ConfigNodePropertyBoolean? = null,

)
