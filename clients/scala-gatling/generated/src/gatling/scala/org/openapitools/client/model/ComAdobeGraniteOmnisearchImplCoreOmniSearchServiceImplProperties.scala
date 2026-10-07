
package org.openapitools.client.model


case class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties (
    _omnisearchSuggestionRequiretextMin: Option[ConfigNodePropertyInteger],
    _omnisearchSuggestionSpellcheckRequire: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties {
    def toStringBody(var_omnisearchSuggestionRequiretextMin: Object, var_omnisearchSuggestionSpellcheckRequire: Object) =
        s"""
        | {
        | "omnisearchSuggestionRequiretextMin":$var_omnisearchSuggestionRequiretextMin,"omnisearchSuggestionSpellcheckRequire":$var_omnisearchSuggestionSpellcheckRequire
        | }
        """.stripMargin
}
