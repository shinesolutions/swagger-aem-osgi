package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(
    val schedulerPeriod: ConfigNodePropertyInteger? = null,
    val schedulerRunOn: ConfigNodePropertyDropDown? = null,
    val graniteThreaddumpEnabled: ConfigNodePropertyBoolean? = null,
    val graniteThreaddumpDumpsPerFile: ConfigNodePropertyInteger? = null,
    val graniteThreaddumpEnableGzipCompression: ConfigNodePropertyBoolean? = null,
    val graniteThreaddumpEnableDirectoriesCompression: ConfigNodePropertyBoolean? = null,
    val graniteThreaddumpEnableJStack: ConfigNodePropertyBoolean? = null,
    val graniteThreaddumpMaxBackupDays: ConfigNodePropertyInteger? = null,
    val graniteThreaddumpBackupCleanTrigger: ConfigNodePropertyString? = null
)
