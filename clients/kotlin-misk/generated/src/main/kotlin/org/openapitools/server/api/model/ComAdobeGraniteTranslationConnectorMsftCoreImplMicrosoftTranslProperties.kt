package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(
    val translationFactory: ConfigNodePropertyString? = null,
    val defaultConnectorLabel: ConfigNodePropertyString? = null,
    val defaultConnectorAttribution: ConfigNodePropertyString? = null,
    val defaultConnectorWorkspaceId: ConfigNodePropertyString? = null,
    val defaultConnectorSubscriptionKey: ConfigNodePropertyString? = null,
    val languageMapLocation: ConfigNodePropertyString? = null,
    val categoryMapLocation: ConfigNodePropertyString? = null,
    val retryAttempts: ConfigNodePropertyInteger? = null,
    val timeoutCount: ConfigNodePropertyInteger? = null
)
