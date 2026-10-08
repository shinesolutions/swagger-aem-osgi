package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
