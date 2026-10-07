@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEngineImplLogRequestLoggerProperties(
    @field:JsonProperty("request.log.output")
    val requestLogOutput: ConfigNodePropertyString? = null,

    @field:JsonProperty("request.log.outputtype")
    val requestLogOutputtype: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("request.log.enabled")
    val requestLogEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("access.log.output")
    val accessLogOutput: ConfigNodePropertyString? = null,

    @field:JsonProperty("access.log.outputtype")
    val accessLogOutputtype: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("access.log.enabled")
    val accessLogEnabled: ConfigNodePropertyBoolean? = null,

)
