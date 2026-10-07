package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqReportingImplConfigServiceImplProperties(
    val repconfTimezone: ConfigNodePropertyString? = null,
    val repconfLocale: ConfigNodePropertyString? = null,
    val repconfSnapshots: ConfigNodePropertyString? = null,
    val repconfRepdir: ConfigNodePropertyString? = null,
    val repconfHourofday: ConfigNodePropertyInteger? = null,
    val repconfMinofhour: ConfigNodePropertyInteger? = null,
    val repconfMaxrows: ConfigNodePropertyInteger? = null,
    val repconfFakedata: ConfigNodePropertyBoolean? = null,
    val repconfSnapshotuser: ConfigNodePropertyString? = null,
    val repconfEnforcesnapshotuser: ConfigNodePropertyBoolean? = null
)
