
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties (
    _queryAggregation: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties {
    def toStringBody(var_queryAggregation: Object) =
        s"""
        | {
        | "queryAggregation":$var_queryAggregation
        | }
        """.stripMargin
}
