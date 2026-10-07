package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheFelixSystemreadyImplServicesCheckProperties(
    val servicesList: ConfigNodePropertyArray? = null,
    val type: ConfigNodePropertyDropDown? = null
)
