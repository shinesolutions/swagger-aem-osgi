package org.openapitools.server.model


/**
 * @param proxyEnabled  for example: ''null''
 * @param proxyHost  for example: ''null''
 * @param proxyPort  for example: ''null''
 * @param proxyUser  for example: ''null''
 * @param proxyPassword  for example: ''null''
 * @param proxyExceptions  for example: ''null''
*/
final case class OrgApacheHttpProxyconfiguratorProperties (
  proxyEnabled: Option[ConfigNodePropertyBoolean] = None,
  proxyHost: Option[ConfigNodePropertyString] = None,
  proxyPort: Option[ConfigNodePropertyInteger] = None,
  proxyUser: Option[ConfigNodePropertyString] = None,
  proxyPassword: Option[ConfigNodePropertyString] = None,
  proxyExceptions: Option[ConfigNodePropertyArray] = None
)

