package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(
    val permissionsJr2: ConfigNodePropertyDropDown? = null,
    val importBehavior: ConfigNodePropertyDropDown? = null,
    val readPaths: ConfigNodePropertyArray? = null,
    val administrativePrincipals: ConfigNodePropertyArray? = null,
    val configurationRanking: ConfigNodePropertyInteger? = null
)
