package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(
    val inboxImplTypeproviderRegistrypaths: ConfigNodePropertyArray? = null,
    val inboxImplTypeproviderLegacypaths: ConfigNodePropertyArray? = null,
    val inboxImplTypeproviderDefaulturlFailureitem: ConfigNodePropertyString? = null,
    val inboxImplTypeproviderDefaulturlWorkitem: ConfigNodePropertyString? = null,
    val inboxImplTypeproviderDefaulturlTask: ConfigNodePropertyString? = null
)
