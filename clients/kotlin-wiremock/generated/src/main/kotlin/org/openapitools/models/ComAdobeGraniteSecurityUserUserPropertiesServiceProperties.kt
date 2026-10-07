@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(
    @field:JsonProperty("adapter.condition")
    val adapterCondition: ConfigNodePropertyString? = null,

    @field:JsonProperty("granite.userproperties.nodetypes")
    val graniteUserpropertiesNodetypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("granite.userproperties.resourcetypes")
    val graniteUserpropertiesResourcetypes: ConfigNodePropertyArray? = null,

)
