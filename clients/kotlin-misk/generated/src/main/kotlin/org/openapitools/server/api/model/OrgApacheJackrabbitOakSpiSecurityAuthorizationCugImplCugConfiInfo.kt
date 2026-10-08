package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
