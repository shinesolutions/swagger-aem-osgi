package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
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
 * @param group2memberRelationshipOutgoing 
 * @param group2memberExcludedOutgoing 
 * @param group2memberRelationshipIncoming 
 * @param group2memberExcludedIncoming 
 */
data class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group2member.relationship.outgoing")
    @get:JsonProperty("group2member.relationship.outgoing") val group2memberRelationshipOutgoing: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group2member.excluded.outgoing")
    @get:JsonProperty("group2member.excluded.outgoing") val group2memberExcludedOutgoing: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group2member.relationship.incoming")
    @get:JsonProperty("group2member.relationship.incoming") val group2memberRelationshipIncoming: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group2member.excluded.incoming")
    @get:JsonProperty("group2member.excluded.incoming") val group2memberExcludedIncoming: ConfigNodePropertyArray? = null
) {

}

