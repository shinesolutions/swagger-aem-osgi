package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
