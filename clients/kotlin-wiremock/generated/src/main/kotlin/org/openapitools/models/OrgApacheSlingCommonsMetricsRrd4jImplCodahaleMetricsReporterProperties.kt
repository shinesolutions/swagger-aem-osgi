@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(
    @field:JsonProperty("datasources")
    val datasources: ConfigNodePropertyArray? = null,

    @field:JsonProperty("step")
    val step: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("archives")
    val archives: ConfigNodePropertyArray? = null,

    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

)
