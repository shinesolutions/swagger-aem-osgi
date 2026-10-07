package org.openapitools.server.model


/**
 * @param smtpHost  for example: ''null''
 * @param smtpPort  for example: ''null''
 * @param smtpUser  for example: ''null''
 * @param smtpPassword  for example: ''null''
 * @param fromAddress  for example: ''null''
 * @param smtpSsl  for example: ''null''
 * @param smtpStarttls  for example: ''null''
 * @param debugEmail  for example: ''null''
*/
final case class ComDayCqMailerDefaultMailServiceProperties (
  smtpHost: Option[ConfigNodePropertyString] = None,
  smtpPort: Option[ConfigNodePropertyInteger] = None,
  smtpUser: Option[ConfigNodePropertyString] = None,
  smtpPassword: Option[ConfigNodePropertyString] = None,
  fromAddress: Option[ConfigNodePropertyString] = None,
  smtpSsl: Option[ConfigNodePropertyBoolean] = None,
  smtpStarttls: Option[ConfigNodePropertyBoolean] = None,
  debugEmail: Option[ConfigNodePropertyBoolean] = None
)

