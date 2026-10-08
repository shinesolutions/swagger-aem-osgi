package org.openapitools.server.model


/**
 * @param orgApacheJackrabbitOakAuthenticationAppName  for example: ''null''
 * @param orgApacheJackrabbitOakAuthenticationConfigSpiName  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties (
  orgApacheJackrabbitOakAuthenticationAppName: Option[ConfigNodePropertyString] = None,
  orgApacheJackrabbitOakAuthenticationConfigSpiName: Option[ConfigNodePropertyString] = None
)

