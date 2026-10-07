package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingEngineParametersProperties(
    val slingDefaultParameterEncoding: ConfigNodePropertyString? = null,
    val slingDefaultMaxParameters: ConfigNodePropertyInteger? = null,
    val fileLocation: ConfigNodePropertyString? = null,
    val fileThreshold: ConfigNodePropertyInteger? = null,
    val fileMax: ConfigNodePropertyInteger? = null,
    val requestMax: ConfigNodePropertyInteger? = null,
    val slingDefaultParameterCheckForAdditionalContainerParameters: ConfigNodePropertyBoolean? = null
)
