package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheFelixJaasConfigurationSpiProperties(
    val jaasDefaultRealmName: ConfigNodePropertyString? = null,
    val jaasConfigProviderName: ConfigNodePropertyString? = null,
    val jaasGlobalConfigPolicy: ConfigNodePropertyDropDown? = null
)
