@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(
    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("configPath")
    val configPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("fallbackPaths")
    val fallbackPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("configCollectionInheritancePropertyNames")
    val configCollectionInheritancePropertyNames: ConfigNodePropertyArray? = null,

)
