@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCommonsMetricsInternalLogReporterProperties(
    @field:JsonProperty("period")
    val period: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("timeUnit")
    val timeUnit: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("level")
    val level: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("loggerName")
    val loggerName: ConfigNodePropertyString? = null,

    @field:JsonProperty("prefix")
    val prefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("pattern")
    val pattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("registryName")
    val registryName: ConfigNodePropertyString? = null,

)
