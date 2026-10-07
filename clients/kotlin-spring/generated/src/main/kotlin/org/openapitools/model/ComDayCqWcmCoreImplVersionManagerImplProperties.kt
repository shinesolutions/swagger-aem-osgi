package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
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
 * @param versionmanagerCreateVersionOnActivation 
 * @param versionmanagerPurgingEnabled 
 * @param versionmanagerPurgePaths 
 * @param versionmanagerIvPaths 
 * @param versionmanagerMaxAgeDays 
 * @param versionmanagerMaxNumberVersions 
 * @param versionmanagerMinNumberVersions 
 */
data class ComDayCqWcmCoreImplVersionManagerImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionmanager.createVersionOnActivation")
    @get:JsonProperty("versionmanager.createVersionOnActivation") val versionmanagerCreateVersionOnActivation: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionmanager.purgingEnabled")
    @get:JsonProperty("versionmanager.purgingEnabled") val versionmanagerPurgingEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionmanager.purgePaths")
    @get:JsonProperty("versionmanager.purgePaths") val versionmanagerPurgePaths: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionmanager.ivPaths")
    @get:JsonProperty("versionmanager.ivPaths") val versionmanagerIvPaths: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionmanager.maxAgeDays")
    @get:JsonProperty("versionmanager.maxAgeDays") val versionmanagerMaxAgeDays: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionmanager.maxNumberVersions")
    @get:JsonProperty("versionmanager.maxNumberVersions") val versionmanagerMaxNumberVersions: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("versionmanager.minNumberVersions")
    @get:JsonProperty("versionmanager.minNumberVersions") val versionmanagerMinNumberVersions: ConfigNodePropertyInteger? = null
) {

}

