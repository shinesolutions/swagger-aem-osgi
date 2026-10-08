@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(
    @field:JsonProperty("fieldWhitelist")
    val fieldWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sitePathFilters")
    val sitePathFilters: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sitePackageGroup")
    val sitePackageGroup: ConfigNodePropertyString? = null,

)
