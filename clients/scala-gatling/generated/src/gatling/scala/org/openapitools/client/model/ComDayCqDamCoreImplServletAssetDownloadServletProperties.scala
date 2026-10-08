
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletAssetDownloadServletProperties (
    _enabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplServletAssetDownloadServletProperties {
    def toStringBody(var_enabled: Object) =
        s"""
        | {
        | "enabled":$var_enabled
        | }
        """.stripMargin
}
