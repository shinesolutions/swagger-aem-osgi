@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties(
    @field:JsonProperty("formsManagerConfig.includeOOTBTemplates")
    val formsManagerConfigIncludeOOTBTemplates: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("formsManagerConfig.includeDeprecatedTemplates")
    val formsManagerConfigIncludeDeprecatedTemplates: ConfigNodePropertyBoolean? = null,

)
