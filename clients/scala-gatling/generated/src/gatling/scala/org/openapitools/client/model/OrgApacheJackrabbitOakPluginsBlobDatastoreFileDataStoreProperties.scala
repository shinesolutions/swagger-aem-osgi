
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties (
    _path: Option[ConfigNodePropertyString]
)
object OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties {
    def toStringBody(var_path: Object) =
        s"""
        | {
        | "path":$var_path
        | }
        """.stripMargin
}
