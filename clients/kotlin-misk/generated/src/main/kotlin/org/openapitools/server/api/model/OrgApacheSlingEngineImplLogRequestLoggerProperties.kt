package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingEngineImplLogRequestLoggerProperties(
    val requestLogOutput: ConfigNodePropertyString? = null,
    val requestLogOutputtype: ConfigNodePropertyDropDown? = null,
    val requestLogEnabled: ConfigNodePropertyBoolean? = null,
    val accessLogOutput: ConfigNodePropertyString? = null,
    val accessLogOutputtype: ConfigNodePropertyDropDown? = null,
    val accessLogEnabled: ConfigNodePropertyBoolean? = null
)
