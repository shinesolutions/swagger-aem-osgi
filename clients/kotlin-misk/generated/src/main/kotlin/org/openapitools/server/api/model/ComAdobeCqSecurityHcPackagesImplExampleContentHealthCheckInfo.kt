package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties? = null,
    val additionalProperties: kotlin.String? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
