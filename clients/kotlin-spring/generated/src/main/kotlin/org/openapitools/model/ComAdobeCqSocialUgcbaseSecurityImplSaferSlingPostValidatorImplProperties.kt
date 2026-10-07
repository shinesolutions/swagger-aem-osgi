package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
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
 * @param parameterWhitelist 
 * @param parameterWhitelistPrefixes 
 * @param binaryParameterWhitelist 
 * @param modifierWhitelist 
 * @param operationWhitelist 
 * @param operationWhitelistPrefixes 
 * @param typehintWhitelist 
 * @param resourcetypeWhitelist 
 */
data class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("parameter.whitelist")
    @get:JsonProperty("parameter.whitelist") val parameterWhitelist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("parameter.whitelist.prefixes")
    @get:JsonProperty("parameter.whitelist.prefixes") val parameterWhitelistPrefixes: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("binary.parameter.whitelist")
    @get:JsonProperty("binary.parameter.whitelist") val binaryParameterWhitelist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("modifier.whitelist")
    @get:JsonProperty("modifier.whitelist") val modifierWhitelist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("operation.whitelist")
    @get:JsonProperty("operation.whitelist") val operationWhitelist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("operation.whitelist.prefixes")
    @get:JsonProperty("operation.whitelist.prefixes") val operationWhitelistPrefixes: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("typehint.whitelist")
    @get:JsonProperty("typehint.whitelist") val typehintWhitelist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resourcetype.whitelist")
    @get:JsonProperty("resourcetype.whitelist") val resourcetypeWhitelist: ConfigNodePropertyArray? = null
) {

}

