@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixJaasConfigurationFactoryProperties(
    @field:JsonProperty("jaas.controlFlag")
    val jaasControlFlag: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("jaas.ranking")
    val jaasRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("jaas.realmName")
    val jaasRealmName: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.classname")
    val jaasClassname: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.options")
    val jaasOptions: ConfigNodePropertyArray? = null,

)
