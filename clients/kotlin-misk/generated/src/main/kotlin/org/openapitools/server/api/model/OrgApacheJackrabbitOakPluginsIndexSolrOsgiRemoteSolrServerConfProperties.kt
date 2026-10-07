package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(
    val solrHttpUrl: ConfigNodePropertyString? = null,
    val solrZkHost: ConfigNodePropertyString? = null,
    val solrCollection: ConfigNodePropertyString? = null,
    val solrSocketTimeout: ConfigNodePropertyInteger? = null,
    val solrConnectionTimeout: ConfigNodePropertyInteger? = null,
    val solrShardsNo: ConfigNodePropertyInteger? = null,
    val solrReplicationFactor: ConfigNodePropertyInteger? = null,
    val solrConfDir: ConfigNodePropertyString? = null
)
