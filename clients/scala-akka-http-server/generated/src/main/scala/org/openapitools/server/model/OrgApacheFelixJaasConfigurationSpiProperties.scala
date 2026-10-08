package org.openapitools.server.model


/**
 * @param jaasDefaultRealmName  for example: ''null''
 * @param jaasConfigProviderName  for example: ''null''
 * @param jaasGlobalConfigPolicy  for example: ''null''
*/
final case class OrgApacheFelixJaasConfigurationSpiProperties (
  jaasDefaultRealmName: Option[ConfigNodePropertyString] = None,
  jaasConfigProviderName: Option[ConfigNodePropertyString] = None,
  jaasGlobalConfigPolicy: Option[ConfigNodePropertyDropDown] = None
)

