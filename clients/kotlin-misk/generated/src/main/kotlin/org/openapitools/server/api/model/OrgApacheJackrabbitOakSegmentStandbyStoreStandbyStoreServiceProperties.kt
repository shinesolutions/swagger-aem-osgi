package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(
    val orgApacheSlingInstallerConfigurationPersist: ConfigNodePropertyBoolean? = null,
    val mode: ConfigNodePropertyDropDown? = null,
    val port: ConfigNodePropertyInteger? = null,
    val primaryHost: ConfigNodePropertyString? = null,
    val interval: ConfigNodePropertyInteger? = null,
    val primaryAllowedClientIpRanges: ConfigNodePropertyArray? = null,
    val secure: ConfigNodePropertyBoolean? = null,
    val standbyReadtimeout: ConfigNodePropertyInteger? = null,
    val standbyAutoclean: ConfigNodePropertyBoolean? = null
)
