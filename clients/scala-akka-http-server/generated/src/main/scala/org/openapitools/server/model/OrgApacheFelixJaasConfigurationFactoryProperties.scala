package org.openapitools.server.model


/**
 * @param jaasControlFlag  for example: ''null''
 * @param jaasRanking  for example: ''null''
 * @param jaasRealmName  for example: ''null''
 * @param jaasClassname  for example: ''null''
 * @param jaasOptions  for example: ''null''
*/
final case class OrgApacheFelixJaasConfigurationFactoryProperties (
  jaasControlFlag: Option[ConfigNodePropertyDropDown] = None,
  jaasRanking: Option[ConfigNodePropertyInteger] = None,
  jaasRealmName: Option[ConfigNodePropertyString] = None,
  jaasClassname: Option[ConfigNodePropertyString] = None,
  jaasOptions: Option[ConfigNodePropertyArray] = None
)

