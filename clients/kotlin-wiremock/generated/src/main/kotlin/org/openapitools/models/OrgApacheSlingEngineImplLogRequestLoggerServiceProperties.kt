@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(
    @field:JsonProperty("request.log.service.format")
    val requestLogServiceFormat: ConfigNodePropertyString? = null,

    @field:JsonProperty("request.log.service.output")
    val requestLogServiceOutput: ConfigNodePropertyString? = null,

    @field:JsonProperty("request.log.service.outputtype")
    val requestLogServiceOutputtype: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("request.log.service.onentry")
    val requestLogServiceOnentry: ConfigNodePropertyBoolean? = null,

)
