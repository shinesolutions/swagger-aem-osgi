@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(
    @field:JsonProperty("translationFactory")
    val translationFactory: ConfigNodePropertyString? = null,

    @field:JsonProperty("defaultConnectorLabel")
    val defaultConnectorLabel: ConfigNodePropertyString? = null,

    @field:JsonProperty("defaultConnectorAttribution")
    val defaultConnectorAttribution: ConfigNodePropertyString? = null,

    @field:JsonProperty("defaultConnectorWorkspaceId")
    val defaultConnectorWorkspaceId: ConfigNodePropertyString? = null,

    @field:JsonProperty("defaultConnectorSubscriptionKey")
    val defaultConnectorSubscriptionKey: ConfigNodePropertyString? = null,

    @field:JsonProperty("languageMapLocation")
    val languageMapLocation: ConfigNodePropertyString? = null,

    @field:JsonProperty("categoryMapLocation")
    val categoryMapLocation: ConfigNodePropertyString? = null,

    @field:JsonProperty("retryAttempts")
    val retryAttempts: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("timeoutCount")
    val timeoutCount: ConfigNodePropertyInteger? = null,

)
