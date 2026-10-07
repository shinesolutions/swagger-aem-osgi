
package org.openapitools.client.model


case class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties (
    _isEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties {
    def toStringBody(var_isEnabled: Object) =
        s"""
        | {
        | "isEnabled":$var_isEnabled
        | }
        """.stripMargin
}
