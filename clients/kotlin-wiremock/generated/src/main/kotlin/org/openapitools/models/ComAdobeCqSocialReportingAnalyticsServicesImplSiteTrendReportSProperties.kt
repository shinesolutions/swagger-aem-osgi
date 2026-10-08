@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties(
    @field:JsonProperty("cq.social.console.analytics.sites.mapping")
    val cqSocialConsoleAnalyticsSitesMapping: ConfigNodePropertyArray? = null,

    @field:JsonProperty("priority")
    val priority: ConfigNodePropertyInteger? = null,

)
