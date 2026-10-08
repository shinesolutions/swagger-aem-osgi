package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
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
 * @param schedulerPeriod 
 * @param schedulerRunOn 
 * @param graniteThreaddumpEnabled 
 * @param graniteThreaddumpDumpsPerFile 
 * @param graniteThreaddumpEnableGzipCompression 
 * @param graniteThreaddumpEnableDirectoriesCompression 
 * @param graniteThreaddumpEnableJStack 
 * @param graniteThreaddumpMaxBackupDays 
 * @param graniteThreaddumpBackupCleanTrigger 
 */
data class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduler.period")
    @get:JsonProperty("scheduler.period") val schedulerPeriod: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduler.runOn")
    @get:JsonProperty("scheduler.runOn") val schedulerRunOn: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.threaddump.enabled")
    @get:JsonProperty("granite.threaddump.enabled") val graniteThreaddumpEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.threaddump.dumpsPerFile")
    @get:JsonProperty("granite.threaddump.dumpsPerFile") val graniteThreaddumpDumpsPerFile: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.threaddump.enableGzipCompression")
    @get:JsonProperty("granite.threaddump.enableGzipCompression") val graniteThreaddumpEnableGzipCompression: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.threaddump.enableDirectoriesCompression")
    @get:JsonProperty("granite.threaddump.enableDirectoriesCompression") val graniteThreaddumpEnableDirectoriesCompression: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.threaddump.enableJStack")
    @get:JsonProperty("granite.threaddump.enableJStack") val graniteThreaddumpEnableJStack: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.threaddump.maxBackupDays")
    @get:JsonProperty("granite.threaddump.maxBackupDays") val graniteThreaddumpMaxBackupDays: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.threaddump.backupCleanTrigger")
    @get:JsonProperty("granite.threaddump.backupCleanTrigger") val graniteThreaddumpBackupCleanTrigger: ConfigNodePropertyString? = null
) {

}

