package org.openapitools.server.model


/**
 * @param comAdobeGraniteJettySslPort  for example: ''null''
 * @param comAdobeGraniteJettySslKeystoreUser  for example: ''null''
 * @param comAdobeGraniteJettySslKeystorePassword  for example: ''null''
 * @param comAdobeGraniteJettySslCiphersuitesExcluded  for example: ''null''
 * @param comAdobeGraniteJettySslCiphersuitesIncluded  for example: ''null''
 * @param comAdobeGraniteJettySslClientCertificate  for example: ''null''
*/
final case class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties (
  comAdobeGraniteJettySslPort: Option[ConfigNodePropertyInteger] = None,
  comAdobeGraniteJettySslKeystoreUser: Option[ConfigNodePropertyString] = None,
  comAdobeGraniteJettySslKeystorePassword: Option[ConfigNodePropertyString] = None,
  comAdobeGraniteJettySslCiphersuitesExcluded: Option[ConfigNodePropertyArray] = None,
  comAdobeGraniteJettySslCiphersuitesIncluded: Option[ConfigNodePropertyArray] = None,
  comAdobeGraniteJettySslClientCertificate: Option[ConfigNodePropertyDropDown] = None
)

