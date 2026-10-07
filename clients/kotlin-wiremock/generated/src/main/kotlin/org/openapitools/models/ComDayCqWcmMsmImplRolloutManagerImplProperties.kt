@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmMsmImplRolloutManagerImplProperties(
    @field:JsonProperty("event.filter")
    val eventFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("rolloutmgr.excludedprops.default")
    val rolloutmgrExcludedpropsDefault: ConfigNodePropertyArray? = null,

    @field:JsonProperty("rolloutmgr.excludedparagraphprops.default")
    val rolloutmgrExcludedparagraphpropsDefault: ConfigNodePropertyArray? = null,

    @field:JsonProperty("rolloutmgr.excludednodetypes.default")
    val rolloutmgrExcludednodetypesDefault: ConfigNodePropertyArray? = null,

    @field:JsonProperty("rolloutmgr.threadpool.maxsize")
    val rolloutmgrThreadpoolMaxsize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("rolloutmgr.threadpool.maxshutdowntime")
    val rolloutmgrThreadpoolMaxshutdowntime: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("rolloutmgr.threadpool.priority")
    val rolloutmgrThreadpoolPriority: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("rolloutmgr.commit.size")
    val rolloutmgrCommitSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("rolloutmgr.conflicthandling.enabled")
    val rolloutmgrConflicthandlingEnabled: ConfigNodePropertyBoolean? = null,

)
