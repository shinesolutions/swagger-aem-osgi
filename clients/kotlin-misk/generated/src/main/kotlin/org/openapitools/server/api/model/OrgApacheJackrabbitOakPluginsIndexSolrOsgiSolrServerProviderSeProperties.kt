package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties(
    val serverType: ConfigNodePropertyDropDown? = null
)
