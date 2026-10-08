@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(
    @field:JsonProperty("solr.http.url")
    val solrHttpUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("solr.zk.host")
    val solrZkHost: ConfigNodePropertyString? = null,

    @field:JsonProperty("solr.collection")
    val solrCollection: ConfigNodePropertyString? = null,

    @field:JsonProperty("solr.socket.timeout")
    val solrSocketTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("solr.connection.timeout")
    val solrConnectionTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("solr.shards.no")
    val solrShardsNo: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("solr.replication.factor")
    val solrReplicationFactor: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("solr.conf.dir")
    val solrConfDir: ConfigNodePropertyString? = null,

)
