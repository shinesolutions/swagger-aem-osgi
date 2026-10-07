@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(
    @field:JsonProperty("jaas.ranking")
    val jaasRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("jaas.controlFlag")
    val jaasControlFlag: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.realmName")
    val jaasRealmName: ConfigNodePropertyString? = null,

    @field:JsonProperty("idp.name")
    val idpName: ConfigNodePropertyString? = null,

    @field:JsonProperty("sync.handlerName")
    val syncHandlerName: ConfigNodePropertyString? = null,

)
