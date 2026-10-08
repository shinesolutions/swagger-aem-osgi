@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqMcmCampaignImplIntegrationConfigImplProperties(
    @field:JsonProperty("aem.mcm.campaign.formConstraints")
    val aemMcmCampaignFormConstraints: ConfigNodePropertyArray? = null,

    @field:JsonProperty("aem.mcm.campaign.publicUrl")
    val aemMcmCampaignPublicUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("aem.mcm.campaign.relaxedSSL")
    val aemMcmCampaignRelaxedSSL: ConfigNodePropertyBoolean? = null,

)
