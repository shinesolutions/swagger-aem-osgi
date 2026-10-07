package org.openapitools.server.model


/**
 * @param solrHomePath  for example: ''null''
 * @param solrCoreName  for example: ''null''
*/
final case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties (
  solrHomePath: Option[ConfigNodePropertyString] = None,
  solrCoreName: Option[ConfigNodePropertyString] = None
)

