@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(
    @field:JsonProperty("scheduler.period")
    val schedulerPeriod: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("scheduler.runOn")
    val schedulerRunOn: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("granite.threaddump.enabled")
    val graniteThreaddumpEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("granite.threaddump.dumpsPerFile")
    val graniteThreaddumpDumpsPerFile: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("granite.threaddump.enableGzipCompression")
    val graniteThreaddumpEnableGzipCompression: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("granite.threaddump.enableDirectoriesCompression")
    val graniteThreaddumpEnableDirectoriesCompression: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("granite.threaddump.enableJStack")
    val graniteThreaddumpEnableJStack: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("granite.threaddump.maxBackupDays")
    val graniteThreaddumpMaxBackupDays: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("granite.threaddump.backupCleanTrigger")
    val graniteThreaddumpBackupCleanTrigger: ConfigNodePropertyString? = null,

)
