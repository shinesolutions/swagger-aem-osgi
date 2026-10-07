package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(
    val fieldWhitelist: ConfigNodePropertyArray? = null,
    val sitePathFilters: ConfigNodePropertyArray? = null,
    val sitePackageGroup: ConfigNodePropertyString? = null
)
