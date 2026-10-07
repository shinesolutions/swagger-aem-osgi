
package org.openapitools.client.model


case class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties (
    _pseudoPatterns: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {
    def toStringBody(var_pseudoPatterns: Object) =
        s"""
        | {
        | "pseudoPatterns":$var_pseudoPatterns
        | }
        """.stripMargin
}
