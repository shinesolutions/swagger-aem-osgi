@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(
    @field:JsonProperty("java.naming.factory.initial")
    val javaNamingFactoryInitial: ConfigNodePropertyString? = null,

    @field:JsonProperty("java.naming.provider.url")
    val javaNamingProviderUrl: ConfigNodePropertyString? = null,

)
