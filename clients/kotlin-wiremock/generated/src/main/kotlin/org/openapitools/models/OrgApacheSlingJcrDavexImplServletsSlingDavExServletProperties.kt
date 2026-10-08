@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(
    @field:JsonProperty("alias")
    val alias: ConfigNodePropertyString? = null,

    @field:JsonProperty("dav.create-absolute-uri")
    val davCreateAbsoluteUri: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("dav.protectedhandlers")
    val davProtectedhandlers: ConfigNodePropertyString? = null,

)
