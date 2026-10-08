package org.openapitools.server.model


/**
 * @param path  for example: ''null''
 * @param tokenRequiredAttr  for example: ''null''
 * @param tokenAlternateUrl  for example: ''null''
 * @param tokenEncapsulated  for example: ''null''
 * @param skipTokenRefresh  for example: ''null''
*/
final case class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties (
  path: Option[ConfigNodePropertyString] = None,
  tokenRequiredAttr: Option[ConfigNodePropertyDropDown] = None,
  tokenAlternateUrl: Option[ConfigNodePropertyString] = None,
  tokenEncapsulated: Option[ConfigNodePropertyBoolean] = None,
  skipTokenRefresh: Option[ConfigNodePropertyArray] = None
)

