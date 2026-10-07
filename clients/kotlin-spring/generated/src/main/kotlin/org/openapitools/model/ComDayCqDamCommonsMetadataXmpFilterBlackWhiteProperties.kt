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
 * @param xmpFilterApplyWhitelist 
 * @param xmpFilterWhitelist 
 * @param xmpFilterApplyBlacklist 
 * @param xmpFilterBlacklist 
 */
data class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("xmp.filter.apply_whitelist")
    @get:JsonProperty("xmp.filter.apply_whitelist") val xmpFilterApplyWhitelist: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("xmp.filter.whitelist")
    @get:JsonProperty("xmp.filter.whitelist") val xmpFilterWhitelist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("xmp.filter.apply_blacklist")
    @get:JsonProperty("xmp.filter.apply_blacklist") val xmpFilterApplyBlacklist: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("xmp.filter.blacklist")
    @get:JsonProperty("xmp.filter.blacklist") val xmpFilterBlacklist: ConfigNodePropertyArray? = null
) {

}

