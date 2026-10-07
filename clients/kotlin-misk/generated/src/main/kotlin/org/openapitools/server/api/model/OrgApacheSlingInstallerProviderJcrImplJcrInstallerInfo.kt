package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
