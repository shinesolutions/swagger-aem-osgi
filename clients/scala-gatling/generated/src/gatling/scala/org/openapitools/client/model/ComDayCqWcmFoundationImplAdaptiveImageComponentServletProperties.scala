
package org.openapitools.client.model


case class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties (
    _adaptSupportedWidths: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties {
    def toStringBody(var_adaptSupportedWidths: Object) =
        s"""
        | {
        | "adaptSupportedWidths":$var_adaptSupportedWidths
        | }
        """.stripMargin
}
