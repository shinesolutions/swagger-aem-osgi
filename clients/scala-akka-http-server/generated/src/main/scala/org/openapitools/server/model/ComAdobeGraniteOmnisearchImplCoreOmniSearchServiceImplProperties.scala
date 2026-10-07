package org.openapitools.server.model


/**
 * @param omnisearchSuggestionRequiretextMin  for example: ''null''
 * @param omnisearchSuggestionSpellcheckRequire  for example: ''null''
*/
final case class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties (
  omnisearchSuggestionRequiretextMin: Option[ConfigNodePropertyInteger] = None,
  omnisearchSuggestionSpellcheckRequire: Option[ConfigNodePropertyBoolean] = None
)

