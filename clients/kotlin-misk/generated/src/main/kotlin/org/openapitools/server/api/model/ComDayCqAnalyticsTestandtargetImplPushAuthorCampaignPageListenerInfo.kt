package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
