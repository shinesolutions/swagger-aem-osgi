
package org.openapitools.client.model


case class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties (
    _graniteData: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {
    def toStringBody(var_graniteData: Object) =
        s"""
        | {
        | "graniteData":$var_graniteData
        | }
        """.stripMargin
}
