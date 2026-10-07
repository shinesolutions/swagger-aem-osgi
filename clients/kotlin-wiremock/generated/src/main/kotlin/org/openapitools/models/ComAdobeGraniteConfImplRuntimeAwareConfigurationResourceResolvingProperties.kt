@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties(
    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("fallbackPaths")
    val fallbackPaths: ConfigNodePropertyArray? = null,

)
