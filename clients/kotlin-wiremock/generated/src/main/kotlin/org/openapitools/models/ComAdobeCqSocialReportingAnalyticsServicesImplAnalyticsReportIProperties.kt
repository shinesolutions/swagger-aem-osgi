@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(
    @field:JsonProperty("cq.social.reporting.analytics.polling.importer.interval")
    val cqSocialReportingAnalyticsPollingImporterInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.social.reporting.analytics.polling.importer.pageSize")
    val cqSocialReportingAnalyticsPollingImporterPageSize: ConfigNodePropertyInteger? = null,

)
