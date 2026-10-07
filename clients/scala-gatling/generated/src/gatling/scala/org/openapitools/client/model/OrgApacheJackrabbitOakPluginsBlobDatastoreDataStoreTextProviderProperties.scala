
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties (
    _dir: Option[ConfigNodePropertyString]
)
object OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties {
    def toStringBody(var_dir: Object) =
        s"""
        | {
        | "dir":$var_dir
        | }
        """.stripMargin
}
