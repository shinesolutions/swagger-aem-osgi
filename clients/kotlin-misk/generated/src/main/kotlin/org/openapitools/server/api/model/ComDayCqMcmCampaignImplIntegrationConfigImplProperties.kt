package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqMcmCampaignImplIntegrationConfigImplProperties(
    val aemMcmCampaignFormConstraints: ConfigNodePropertyArray? = null,
    val aemMcmCampaignPublicUrl: ConfigNodePropertyString? = null,
    val aemMcmCampaignRelaxedSSL: ConfigNodePropertyBoolean? = null
)
