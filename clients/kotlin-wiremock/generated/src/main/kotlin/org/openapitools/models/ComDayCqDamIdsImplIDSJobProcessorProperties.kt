@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamIdsImplIDSJobProcessorProperties(
    @field:JsonProperty("enable.multisession")
    val enableMultisession: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("ids.cc.enable")
    val idsCcEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("enable.retry")
    val enableRetry: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("enable.retry.scripterror")
    val enableRetryScripterror: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("externalizer.domain.cqhost")
    val externalizerDomainCqhost: ConfigNodePropertyString? = null,

    @field:JsonProperty("externalizer.domain.http")
    val externalizerDomainHttp: ConfigNodePropertyString? = null,

)
