
package org.openapitools.client.model


case class ComDayCqDamCoreImplAssetMoveListenerProperties (
    _enabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplAssetMoveListenerProperties {
    def toStringBody(var_enabled: Object) =
        s"""
        | {
        | "enabled":$var_enabled
        | }
        """.stripMargin
}
