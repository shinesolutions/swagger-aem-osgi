package org.openapitools.server.model


/**
 * @param enabled  for example: ''null''
 * @param fallbackPaths  for example: ''null''
*/
final case class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties (
  enabled: Option[ConfigNodePropertyBoolean] = None,
  fallbackPaths: Option[ConfigNodePropertyArray] = None
)

