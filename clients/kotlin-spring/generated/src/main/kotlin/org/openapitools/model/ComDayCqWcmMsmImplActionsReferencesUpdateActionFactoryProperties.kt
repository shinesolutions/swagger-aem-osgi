package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param cqWcmMsmActionExcludednodetypes 
 * @param cqWcmMsmActionExcludedparagraphitems 
 * @param cqWcmMsmActionExcludedprops 
 * @param cqWcmMsmImplActionReferencesupdatePropUpdateNested 
 */
data class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.msm.action.excludednodetypes")
    @get:JsonProperty("cq.wcm.msm.action.excludednodetypes") val cqWcmMsmActionExcludednodetypes: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
    @get:JsonProperty("cq.wcm.msm.action.excludedparagraphitems") val cqWcmMsmActionExcludedparagraphitems: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.msm.action.excludedprops")
    @get:JsonProperty("cq.wcm.msm.action.excludedprops") val cqWcmMsmActionExcludedprops: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.msm.impl.action.referencesupdate.prop_updateNested")
    @get:JsonProperty("cq.wcm.msm.impl.action.referencesupdate.prop_updateNested") val cqWcmMsmImplActionReferencesupdatePropUpdateNested: ConfigNodePropertyBoolean? = null
) {

}

