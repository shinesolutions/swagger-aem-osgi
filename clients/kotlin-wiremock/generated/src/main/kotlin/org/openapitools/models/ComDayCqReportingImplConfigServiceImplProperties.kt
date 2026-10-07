@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqReportingImplConfigServiceImplProperties(
    @field:JsonProperty("repconf.timezone")
    val repconfTimezone: ConfigNodePropertyString? = null,

    @field:JsonProperty("repconf.locale")
    val repconfLocale: ConfigNodePropertyString? = null,

    @field:JsonProperty("repconf.snapshots")
    val repconfSnapshots: ConfigNodePropertyString? = null,

    @field:JsonProperty("repconf.repdir")
    val repconfRepdir: ConfigNodePropertyString? = null,

    @field:JsonProperty("repconf.hourofday")
    val repconfHourofday: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("repconf.minofhour")
    val repconfMinofhour: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("repconf.maxrows")
    val repconfMaxrows: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("repconf.fakedata")
    val repconfFakedata: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("repconf.snapshotuser")
    val repconfSnapshotuser: ConfigNodePropertyString? = null,

    @field:JsonProperty("repconf.enforcesnapshotuser")
    val repconfEnforcesnapshotuser: ConfigNodePropertyBoolean? = null,

)
