
package org.openapitools.client.model


case class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties (
    _createPreviewEnabled: Option[ConfigNodePropertyBoolean],
    _updatePreviewEnabled: Option[ConfigNodePropertyBoolean],
    _queueSize: Option[ConfigNodePropertyInteger],
    _folderPreviewRenditionRegex: Option[ConfigNodePropertyString]
)
object ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {
    def toStringBody(var_createPreviewEnabled: Object, var_updatePreviewEnabled: Object, var_queueSize: Object, var_folderPreviewRenditionRegex: Object) =
        s"""
        | {
        | "createPreviewEnabled":$var_createPreviewEnabled,"updatePreviewEnabled":$var_updatePreviewEnabled,"queueSize":$var_queueSize,"folderPreviewRenditionRegex":$var_folderPreviewRenditionRegex
        | }
        """.stripMargin
}
