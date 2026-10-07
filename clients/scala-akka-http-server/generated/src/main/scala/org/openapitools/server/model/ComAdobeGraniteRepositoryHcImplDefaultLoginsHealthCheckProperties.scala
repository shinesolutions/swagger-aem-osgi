package org.openapitools.server.model


/**
 * @param hcTags  for example: ''null''
 * @param accountLogins  for example: ''null''
 * @param consoleLogins  for example: ''null''
*/
final case class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties (
  hcTags: Option[ConfigNodePropertyArray] = None,
  accountLogins: Option[ConfigNodePropertyArray] = None,
  consoleLogins: Option[ConfigNodePropertyArray] = None
)

