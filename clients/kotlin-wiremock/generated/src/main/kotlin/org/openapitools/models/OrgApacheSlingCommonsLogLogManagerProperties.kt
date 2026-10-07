@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCommonsLogLogManagerProperties(
    @field:JsonProperty("org.apache.sling.commons.log.level")
    val orgApacheSlingCommonsLogLevel: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("org.apache.sling.commons.log.file")
    val orgApacheSlingCommonsLogFile: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.log.file.number")
    val orgApacheSlingCommonsLogFileNumber: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.sling.commons.log.file.size")
    val orgApacheSlingCommonsLogFileSize: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.log.pattern")
    val orgApacheSlingCommonsLogPattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.log.configurationFile")
    val orgApacheSlingCommonsLogConfigurationFile: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.log.packagingDataEnabled")
    val orgApacheSlingCommonsLogPackagingDataEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.sling.commons.log.maxCallerDataDepth")
    val orgApacheSlingCommonsLogMaxCallerDataDepth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.sling.commons.log.maxOldFileCountInDump")
    val orgApacheSlingCommonsLogMaxOldFileCountInDump: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.sling.commons.log.numOfLines")
    val orgApacheSlingCommonsLogNumOfLines: ConfigNodePropertyInteger? = null,

)
