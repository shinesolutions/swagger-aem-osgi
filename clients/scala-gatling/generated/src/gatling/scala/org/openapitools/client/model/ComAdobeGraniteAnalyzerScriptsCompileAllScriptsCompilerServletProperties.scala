
package org.openapitools.client.model


case class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties (
    _disabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties {
    def toStringBody(var_disabled: Object) =
        s"""
        | {
        | "disabled":$var_disabled
        | }
        """.stripMargin
}
