@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(
    @field:JsonProperty("org.apache.sling.installer.configuration.persist")
    val orgApacheSlingInstallerConfigurationPersist: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("mode")
    val mode: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("port")
    val port: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("primary.host")
    val primaryHost: ConfigNodePropertyString? = null,

    @field:JsonProperty("interval")
    val interval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("primary.allowed-client-ip-ranges")
    val primaryAllowedClientIpRanges: ConfigNodePropertyArray? = null,

    @field:JsonProperty("secure")
    val secure: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("standby.readtimeout")
    val standbyReadtimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("standby.autoclean")
    val standbyAutoclean: ConfigNodePropertyBoolean? = null,

)
