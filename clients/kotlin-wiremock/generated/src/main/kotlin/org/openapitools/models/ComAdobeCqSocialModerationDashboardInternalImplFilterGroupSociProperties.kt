@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties(
    @field:JsonProperty("resourceType.filters")
    val resourceTypeFilters: ConfigNodePropertyArray? = null,

    @field:JsonProperty("priority")
    val priority: ConfigNodePropertyInteger? = null,

)
