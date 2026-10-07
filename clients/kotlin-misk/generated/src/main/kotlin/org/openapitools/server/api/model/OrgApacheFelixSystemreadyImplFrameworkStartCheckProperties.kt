package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(
    val timeout: ConfigNodePropertyInteger? = null,
    val targetStartLevel: ConfigNodePropertyInteger? = null,
    val targetStartLevelPropName: ConfigNodePropertyString? = null,
    val type: ConfigNodePropertyDropDown? = null
)
