
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties (
    _solrHttpUrl: Option[ConfigNodePropertyString],
    _solrZkHost: Option[ConfigNodePropertyString],
    _solrCollection: Option[ConfigNodePropertyString],
    _solrSocketTimeout: Option[ConfigNodePropertyInteger],
    _solrConnectionTimeout: Option[ConfigNodePropertyInteger],
    _solrShardsNo: Option[ConfigNodePropertyInteger],
    _solrReplicationFactor: Option[ConfigNodePropertyInteger],
    _solrConfDir: Option[ConfigNodePropertyString]
)
object OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {
    def toStringBody(var_solrHttpUrl: Object, var_solrZkHost: Object, var_solrCollection: Object, var_solrSocketTimeout: Object, var_solrConnectionTimeout: Object, var_solrShardsNo: Object, var_solrReplicationFactor: Object, var_solrConfDir: Object) =
        s"""
        | {
        | "solrHttpUrl":$var_solrHttpUrl,"solrZkHost":$var_solrZkHost,"solrCollection":$var_solrCollection,"solrSocketTimeout":$var_solrSocketTimeout,"solrConnectionTimeout":$var_solrConnectionTimeout,"solrShardsNo":$var_solrShardsNo,"solrReplicationFactor":$var_solrReplicationFactor,"solrConfDir":$var_solrConfDir
        | }
        """.stripMargin
}
