
package org.openapitools.client.model


case class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties (
    _deleteZipFile: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties {
    def toStringBody(var_deleteZipFile: Object) =
        s"""
        | {
        | "deleteZipFile":$var_deleteZipFile
        | }
        """.stripMargin
}
