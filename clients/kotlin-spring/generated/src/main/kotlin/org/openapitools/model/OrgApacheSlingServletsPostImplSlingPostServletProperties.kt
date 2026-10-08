package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyInteger
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
 * @param servletPostDateFormats 
 * @param servletPostNodeNameHints 
 * @param servletPostNodeNameMaxLength 
 * @param servletPostCheckinNewVersionableNodes 
 * @param servletPostAutoCheckout 
 * @param servletPostAutoCheckin 
 * @param servletPostIgnorePattern 
 */
data class OrgApacheSlingServletsPostImplSlingPostServletProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("servlet.post.dateFormats")
    @get:JsonProperty("servlet.post.dateFormats") val servletPostDateFormats: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("servlet.post.nodeNameHints")
    @get:JsonProperty("servlet.post.nodeNameHints") val servletPostNodeNameHints: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("servlet.post.nodeNameMaxLength")
    @get:JsonProperty("servlet.post.nodeNameMaxLength") val servletPostNodeNameMaxLength: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("servlet.post.checkinNewVersionableNodes")
    @get:JsonProperty("servlet.post.checkinNewVersionableNodes") val servletPostCheckinNewVersionableNodes: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("servlet.post.autoCheckout")
    @get:JsonProperty("servlet.post.autoCheckout") val servletPostAutoCheckout: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("servlet.post.autoCheckin")
    @get:JsonProperty("servlet.post.autoCheckin") val servletPostAutoCheckin: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("servlet.post.ignorePattern")
    @get:JsonProperty("servlet.post.ignorePattern") val servletPostIgnorePattern: ConfigNodePropertyString? = null
) {

}

