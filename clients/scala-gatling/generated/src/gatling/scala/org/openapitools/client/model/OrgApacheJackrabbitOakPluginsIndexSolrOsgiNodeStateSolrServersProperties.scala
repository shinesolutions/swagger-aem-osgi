
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties (
    _enabled: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties {
    def toStringBody(var_enabled: Object) =
        s"""
        | {
        | "enabled":$var_enabled
        | }
        """.stripMargin
}
