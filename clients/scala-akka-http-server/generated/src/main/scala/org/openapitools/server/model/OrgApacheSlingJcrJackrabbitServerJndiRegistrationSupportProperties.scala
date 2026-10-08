package org.openapitools.server.model


/**
 * @param javaNamingFactoryInitial  for example: ''null''
 * @param javaNamingProviderUrl  for example: ''null''
*/
final case class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties (
  javaNamingFactoryInitial: Option[ConfigNodePropertyString] = None,
  javaNamingProviderUrl: Option[ConfigNodePropertyString] = None
)

