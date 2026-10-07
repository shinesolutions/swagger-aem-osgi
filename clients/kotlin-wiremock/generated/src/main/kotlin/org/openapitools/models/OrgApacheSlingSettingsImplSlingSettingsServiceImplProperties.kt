@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(
    @field:JsonProperty("sling.name")
    val slingName: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.description")
    val slingDescription: ConfigNodePropertyString? = null,

)
