
package org.openapitools.client.model


case class ComDayCqDamHandlerFfmpegLocatorImplProperties (
    _executableSearchpath: Option[ConfigNodePropertyArray]
)
object ComDayCqDamHandlerFfmpegLocatorImplProperties {
    def toStringBody(var_executableSearchpath: Object) =
        s"""
        | {
        | "executableSearchpath":$var_executableSearchpath
        | }
        """.stripMargin
}
