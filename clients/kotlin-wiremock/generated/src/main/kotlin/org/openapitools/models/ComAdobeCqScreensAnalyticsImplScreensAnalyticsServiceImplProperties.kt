@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(
    @field:JsonProperty("com.adobe.cq.screens.analytics.impl.url")
    val comAdobeCqScreensAnalyticsImplUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.screens.analytics.impl.apikey")
    val comAdobeCqScreensAnalyticsImplApikey: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.screens.analytics.impl.project")
    val comAdobeCqScreensAnalyticsImplProject: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.screens.analytics.impl.environment")
    val comAdobeCqScreensAnalyticsImplEnvironment: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("com.adobe.cq.screens.analytics.impl.sendFrequency")
    val comAdobeCqScreensAnalyticsImplSendFrequency: ConfigNodePropertyInteger? = null,

)
