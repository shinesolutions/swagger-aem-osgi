@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties(
    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("configPropertyInheritancePropertyNames")
    val configPropertyInheritancePropertyNames: ConfigNodePropertyArray? = null,

)
