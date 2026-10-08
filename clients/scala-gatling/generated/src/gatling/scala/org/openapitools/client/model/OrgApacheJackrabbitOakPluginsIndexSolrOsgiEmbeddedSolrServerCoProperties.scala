
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties (
    _solrHomePath: Option[ConfigNodePropertyString],
    _solrCoreName: Option[ConfigNodePropertyString]
)
object OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
    def toStringBody(var_solrHomePath: Object, var_solrCoreName: Object) =
        s"""
        | {
        | "solrHomePath":$var_solrHomePath,"solrCoreName":$var_solrCoreName
        | }
        """.stripMargin
}
