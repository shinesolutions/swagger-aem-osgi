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
 * @param cdnConfigDistributionDomain 
 * @param cdnConfigEnableRewriting 
 * @param cdnConfigPathPrefixes 
 * @param cdnConfigCdnttl 
 * @param cdnConfigApplicationProtocol 
 */
data class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cdn.config.distribution.domain")
    @get:JsonProperty("cdn.config.distribution.domain") val cdnConfigDistributionDomain: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cdn.config.enable.rewriting")
    @get:JsonProperty("cdn.config.enable.rewriting") val cdnConfigEnableRewriting: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cdn.config.path.prefixes")
    @get:JsonProperty("cdn.config.path.prefixes") val cdnConfigPathPrefixes: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cdn.config.cdnttl")
    @get:JsonProperty("cdn.config.cdnttl") val cdnConfigCdnttl: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cdn.config.application.protocol")
    @get:JsonProperty("cdn.config.application.protocol") val cdnConfigApplicationProtocol: ConfigNodePropertyString? = null
) {

}

