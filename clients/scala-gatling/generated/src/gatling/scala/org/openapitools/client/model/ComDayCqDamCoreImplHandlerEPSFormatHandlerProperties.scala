
package org.openapitools.client.model


case class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties (
    _mimetype: Option[ConfigNodePropertyString]
)
object ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties {
    def toStringBody(var_mimetype: Object) =
        s"""
        | {
        | "mimetype":$var_mimetype
        | }
        """.stripMargin
}
