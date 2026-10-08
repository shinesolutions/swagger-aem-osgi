package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(
    val orgApacheSlingCommonsLogLevel: ConfigNodePropertyDropDown? = null,
    val orgApacheSlingCommonsLogFile: ConfigNodePropertyString? = null,
    val orgApacheSlingCommonsLogPattern: ConfigNodePropertyString? = null,
    val orgApacheSlingCommonsLogNames: ConfigNodePropertyArray? = null,
    val orgApacheSlingCommonsLogAdditiv: ConfigNodePropertyBoolean? = null
)
