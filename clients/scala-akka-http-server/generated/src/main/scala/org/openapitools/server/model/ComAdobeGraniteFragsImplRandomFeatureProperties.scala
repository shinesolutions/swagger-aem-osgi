package org.openapitools.server.model


/**
 * @param featureName  for example: ''null''
 * @param featureDescription  for example: ''null''
 * @param activePercentage  for example: ''null''
 * @param cookieName  for example: ''null''
 * @param cookieMaxAge  for example: ''null''
*/
final case class ComAdobeGraniteFragsImplRandomFeatureProperties (
  featureName: Option[ConfigNodePropertyString] = None,
  featureDescription: Option[ConfigNodePropertyString] = None,
  activePercentage: Option[ConfigNodePropertyString] = None,
  cookieName: Option[ConfigNodePropertyString] = None,
  cookieMaxAge: Option[ConfigNodePropertyInteger] = None
)

