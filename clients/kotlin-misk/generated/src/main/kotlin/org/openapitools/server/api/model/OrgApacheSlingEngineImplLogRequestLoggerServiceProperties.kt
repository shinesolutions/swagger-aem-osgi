package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(
    val requestLogServiceFormat: ConfigNodePropertyString? = null,
    val requestLogServiceOutput: ConfigNodePropertyString? = null,
    val requestLogServiceOutputtype: ConfigNodePropertyDropDown? = null,
    val requestLogServiceOnentry: ConfigNodePropertyBoolean? = null
)
