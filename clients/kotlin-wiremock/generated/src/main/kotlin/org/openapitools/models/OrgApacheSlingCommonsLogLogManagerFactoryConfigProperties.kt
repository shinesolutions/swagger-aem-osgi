@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(
    @field:JsonProperty("org.apache.sling.commons.log.level")
    val orgApacheSlingCommonsLogLevel: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("org.apache.sling.commons.log.file")
    val orgApacheSlingCommonsLogFile: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.log.pattern")
    val orgApacheSlingCommonsLogPattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.log.names")
    val orgApacheSlingCommonsLogNames: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.sling.commons.log.additiv")
    val orgApacheSlingCommonsLogAdditiv: ConfigNodePropertyBoolean? = null,

)
