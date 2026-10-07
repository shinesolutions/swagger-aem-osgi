package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCommonsLogLogManagerProperties(
    val orgApacheSlingCommonsLogLevel: ConfigNodePropertyDropDown? = null,
    val orgApacheSlingCommonsLogFile: ConfigNodePropertyString? = null,
    val orgApacheSlingCommonsLogFileNumber: ConfigNodePropertyInteger? = null,
    val orgApacheSlingCommonsLogFileSize: ConfigNodePropertyString? = null,
    val orgApacheSlingCommonsLogPattern: ConfigNodePropertyString? = null,
    val orgApacheSlingCommonsLogConfigurationFile: ConfigNodePropertyString? = null,
    val orgApacheSlingCommonsLogPackagingDataEnabled: ConfigNodePropertyBoolean? = null,
    val orgApacheSlingCommonsLogMaxCallerDataDepth: ConfigNodePropertyInteger? = null,
    val orgApacheSlingCommonsLogMaxOldFileCountInDump: ConfigNodePropertyInteger? = null,
    val orgApacheSlingCommonsLogNumOfLines: ConfigNodePropertyInteger? = null
)
