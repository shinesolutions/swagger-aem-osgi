package org.openapitools.server.model


/**
 * @param featureName  for example: ''null''
 * @param featureDescription  for example: ''null''
 * @param httpHeaderName  for example: ''null''
 * @param httpHeaderValuepattern  for example: ''null''
*/
final case class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties (
  featureName: Option[ConfigNodePropertyString] = None,
  featureDescription: Option[ConfigNodePropertyString] = None,
  httpHeaderName: Option[ConfigNodePropertyString] = None,
  httpHeaderValuepattern: Option[ConfigNodePropertyString] = None
)

