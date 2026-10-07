
package org.openapitools.client.model


case class ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties (
    _disabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties {
    def toStringBody(var_disabled: Object) =
        s"""
        | {
        | "disabled":$var_disabled
        | }
        """.stripMargin
}
