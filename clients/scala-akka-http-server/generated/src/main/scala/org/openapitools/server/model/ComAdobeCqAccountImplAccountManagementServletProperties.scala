package org.openapitools.server.model


/**
 * @param cqAccountmanagerConfigInformnewaccountMail  for example: ''null''
 * @param cqAccountmanagerConfigInformnewpwdMail  for example: ''null''
*/
final case class ComAdobeCqAccountImplAccountManagementServletProperties (
  cqAccountmanagerConfigInformnewaccountMail: Option[ConfigNodePropertyString] = None,
  cqAccountmanagerConfigInformnewpwdMail: Option[ConfigNodePropertyString] = None
)

