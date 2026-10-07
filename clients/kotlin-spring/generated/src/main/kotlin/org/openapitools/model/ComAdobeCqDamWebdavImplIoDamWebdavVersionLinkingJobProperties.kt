package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyInteger
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
 * @param cqDamWebdavVersionLinkingEnable 
 * @param cqDamWebdavVersionLinkingSchedulerPeriod 
 * @param cqDamWebdavVersionLinkingStagingTimeout 
 */
data class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.webdav.version.linking.enable")
    @get:JsonProperty("cq.dam.webdav.version.linking.enable") val cqDamWebdavVersionLinkingEnable: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.webdav.version.linking.scheduler.period")
    @get:JsonProperty("cq.dam.webdav.version.linking.scheduler.period") val cqDamWebdavVersionLinkingSchedulerPeriod: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.webdav.version.linking.staging.timeout")
    @get:JsonProperty("cq.dam.webdav.version.linking.staging.timeout") val cqDamWebdavVersionLinkingStagingTimeout: ConfigNodePropertyInteger? = null
) {

}

