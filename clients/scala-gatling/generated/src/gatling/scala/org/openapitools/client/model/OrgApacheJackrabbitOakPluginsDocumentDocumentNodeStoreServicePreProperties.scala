
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties (
    _persistentCacheIncludes: Option[ConfigNodePropertyArray]
)
object OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties {
    def toStringBody(var_persistentCacheIncludes: Object) =
        s"""
        | {
        | "persistentCacheIncludes":$var_persistentCacheIncludes
        | }
        """.stripMargin
}
