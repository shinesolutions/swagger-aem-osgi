package org.openapitools.server.model


/**
 * @param filterMethods  for example: ''null''
 * @param filterEnableSafeUserAgents  for example: ''null''
 * @param filterSafeUserAgents  for example: ''null''
 * @param filterExcludedPaths  for example: ''null''
*/
final case class ComAdobeGraniteCsrfImplCSRFFilterProperties (
  filterMethods: Option[ConfigNodePropertyArray] = None,
  filterEnableSafeUserAgents: Option[ConfigNodePropertyBoolean] = None,
  filterSafeUserAgents: Option[ConfigNodePropertyArray] = None,
  filterExcludedPaths: Option[ConfigNodePropertyArray] = None
)

