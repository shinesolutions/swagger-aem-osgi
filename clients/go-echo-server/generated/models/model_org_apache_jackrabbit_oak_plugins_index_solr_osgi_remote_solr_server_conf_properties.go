package models

type OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties struct {

	SolrHttpUrl ConfigNodePropertyString `json:"solr.http.url,omitempty"`

	SolrZkHost ConfigNodePropertyString `json:"solr.zk.host,omitempty"`

	SolrCollection ConfigNodePropertyString `json:"solr.collection,omitempty"`

	SolrSocketTimeout ConfigNodePropertyInteger `json:"solr.socket.timeout,omitempty"`

	SolrConnectionTimeout ConfigNodePropertyInteger `json:"solr.connection.timeout,omitempty"`

	SolrShardsNo ConfigNodePropertyInteger `json:"solr.shards.no,omitempty"`

	SolrReplicationFactor ConfigNodePropertyInteger `json:"solr.replication.factor,omitempty"`

	SolrConfDir ConfigNodePropertyString `json:"solr.conf.dir,omitempty"`
}
