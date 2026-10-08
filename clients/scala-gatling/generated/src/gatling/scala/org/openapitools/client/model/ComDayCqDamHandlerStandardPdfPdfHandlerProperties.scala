
package org.openapitools.client.model


case class ComDayCqDamHandlerStandardPdfPdfHandlerProperties (
    _rasterAnnotation: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamHandlerStandardPdfPdfHandlerProperties {
    def toStringBody(var_rasterAnnotation: Object) =
        s"""
        | {
        | "rasterAnnotation":$var_rasterAnnotation
        | }
        """.stripMargin
}
