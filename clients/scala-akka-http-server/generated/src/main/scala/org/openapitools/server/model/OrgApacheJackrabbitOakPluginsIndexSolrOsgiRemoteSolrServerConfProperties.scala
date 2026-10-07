package org.openapitools.server.model


/**
 * @param solrHttpUrl  for example: ''null''
 * @param solrZkHost  for example: ''null''
 * @param solrCollection  for example: ''null''
 * @param solrSocketTimeout  for example: ''null''
 * @param solrConnectionTimeout  for example: ''null''
 * @param solrShardsNo  for example: ''null''
 * @param solrReplicationFactor  for example: ''null''
 * @param solrConfDir  for example: ''null''
*/
final case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties (
  solrHttpUrl: Option[ConfigNodePropertyString] = None,
  solrZkHost: Option[ConfigNodePropertyString] = None,
  solrCollection: Option[ConfigNodePropertyString] = None,
  solrSocketTimeout: Option[ConfigNodePropertyInteger] = None,
  solrConnectionTimeout: Option[ConfigNodePropertyInteger] = None,
  solrShardsNo: Option[ConfigNodePropertyInteger] = None,
  solrReplicationFactor: Option[ConfigNodePropertyInteger] = None,
  solrConfDir: Option[ConfigNodePropertyString] = None
)

