package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(
    val enabledActions: ConfigNodePropertyDropDown? = null,
    val userPrivilegeNames: ConfigNodePropertyArray? = null,
    val groupPrivilegeNames: ConfigNodePropertyArray? = null,
    val constraint: ConfigNodePropertyString? = null
)
