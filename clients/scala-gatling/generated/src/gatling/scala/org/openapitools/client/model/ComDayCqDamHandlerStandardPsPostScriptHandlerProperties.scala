
package org.openapitools.client.model


case class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties (
    _rasterAnnotation: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamHandlerStandardPsPostScriptHandlerProperties {
    def toStringBody(var_rasterAnnotation: Object) =
        s"""
        | {
        | "rasterAnnotation":$var_rasterAnnotation
        | }
        """.stripMargin
}
