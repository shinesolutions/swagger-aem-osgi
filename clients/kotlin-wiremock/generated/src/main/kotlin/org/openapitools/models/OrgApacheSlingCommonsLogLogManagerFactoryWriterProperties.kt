@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(
    @field:JsonProperty("org.apache.sling.commons.log.file")
    val orgApacheSlingCommonsLogFile: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.log.file.number")
    val orgApacheSlingCommonsLogFileNumber: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.sling.commons.log.file.size")
    val orgApacheSlingCommonsLogFileSize: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.log.file.buffered")
    val orgApacheSlingCommonsLogFileBuffered: ConfigNodePropertyBoolean? = null,

)
