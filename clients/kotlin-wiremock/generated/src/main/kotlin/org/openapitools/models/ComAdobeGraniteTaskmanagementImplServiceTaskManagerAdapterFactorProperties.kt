@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(
    @field:JsonProperty("adapter.condition")
    val adapterCondition: ConfigNodePropertyString? = null,

    @field:JsonProperty("taskmanager.admingroups")
    val taskmanagerAdmingroups: ConfigNodePropertyArray? = null,

)
