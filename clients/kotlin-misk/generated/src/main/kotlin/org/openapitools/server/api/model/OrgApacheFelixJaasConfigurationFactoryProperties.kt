package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheFelixJaasConfigurationFactoryProperties(
    val jaasControlFlag: ConfigNodePropertyDropDown? = null,
    val jaasRanking: ConfigNodePropertyInteger? = null,
    val jaasRealmName: ConfigNodePropertyString? = null,
    val jaasClassname: ConfigNodePropertyString? = null,
    val jaasOptions: ConfigNodePropertyArray? = null
)
