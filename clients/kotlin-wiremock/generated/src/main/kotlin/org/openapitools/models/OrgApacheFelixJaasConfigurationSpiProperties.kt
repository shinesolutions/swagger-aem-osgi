@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixJaasConfigurationSpiProperties(
    @field:JsonProperty("jaas.defaultRealmName")
    val jaasDefaultRealmName: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.configProviderName")
    val jaasConfigProviderName: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.globalConfigPolicy")
    val jaasGlobalConfigPolicy: ConfigNodePropertyDropDown? = null,

)
