package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(
    val orgApacheSlingCommonsLogFile: ConfigNodePropertyString? = null,
    val orgApacheSlingCommonsLogFileNumber: ConfigNodePropertyInteger? = null,
    val orgApacheSlingCommonsLogFileSize: ConfigNodePropertyString? = null,
    val orgApacheSlingCommonsLogFileBuffered: ConfigNodePropertyBoolean? = null
)
