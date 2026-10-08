
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties (
    _serverType: Option[ConfigNodePropertyDropDown]
)
object OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties {
    def toStringBody(var_serverType: Object) =
        s"""
        | {
        | "serverType":$var_serverType
        | }
        """.stripMargin
}
