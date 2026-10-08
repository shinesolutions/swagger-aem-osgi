@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(
    @field:JsonProperty("ignorePropertyNameRegex")
    val ignorePropertyNameRegex: ConfigNodePropertyArray? = null,

    @field:JsonProperty("configCollectionPropertiesResourceNames")
    val configCollectionPropertiesResourceNames: ConfigNodePropertyArray? = null,

)
