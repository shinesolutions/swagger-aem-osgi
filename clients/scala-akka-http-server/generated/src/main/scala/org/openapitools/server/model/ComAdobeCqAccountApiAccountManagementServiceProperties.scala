package org.openapitools.server.model


/**
 * @param cqAccountmanagerTokenValidityPeriod  for example: ''null''
 * @param cqAccountmanagerConfigRequestnewaccountMail  for example: ''null''
 * @param cqAccountmanagerConfigRequestnewpwdMail  for example: ''null''
*/
final case class ComAdobeCqAccountApiAccountManagementServiceProperties (
  cqAccountmanagerTokenValidityPeriod: Option[ConfigNodePropertyInteger] = None,
  cqAccountmanagerConfigRequestnewaccountMail: Option[ConfigNodePropertyString] = None,
  cqAccountmanagerConfigRequestnewpwdMail: Option[ConfigNodePropertyString] = None
)

