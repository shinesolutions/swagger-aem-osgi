package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamIdsImplIDSJobProcessorProperties(
    val enableMultisession: ConfigNodePropertyBoolean? = null,
    val idsCcEnable: ConfigNodePropertyBoolean? = null,
    val enableRetry: ConfigNodePropertyBoolean? = null,
    val enableRetryScripterror: ConfigNodePropertyBoolean? = null,
    val externalizerDomainCqhost: ConfigNodePropertyString? = null,
    val externalizerDomainHttp: ConfigNodePropertyString? = null
)
