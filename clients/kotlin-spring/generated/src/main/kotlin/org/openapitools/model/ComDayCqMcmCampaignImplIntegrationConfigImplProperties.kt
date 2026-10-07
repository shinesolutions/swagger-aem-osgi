package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param aemMcmCampaignFormConstraints 
 * @param aemMcmCampaignPublicUrl 
 * @param aemMcmCampaignRelaxedSSL 
 */
data class ComDayCqMcmCampaignImplIntegrationConfigImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("aem.mcm.campaign.formConstraints")
    @get:JsonProperty("aem.mcm.campaign.formConstraints") val aemMcmCampaignFormConstraints: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("aem.mcm.campaign.publicUrl")
    @get:JsonProperty("aem.mcm.campaign.publicUrl") val aemMcmCampaignPublicUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("aem.mcm.campaign.relaxedSSL")
    @get:JsonProperty("aem.mcm.campaign.relaxedSSL") val aemMcmCampaignRelaxedSSL: ConfigNodePropertyBoolean? = null
) {

}

