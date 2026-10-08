package org.openapitools.server.model


/**
 * @param path  for example: ''null''
 * @param serviceRanking  for example: ''null''
 * @param authLoginselectorMappings  for example: ''null''
 * @param authLoginselectorChangepwMappings  for example: ''null''
 * @param authLoginselectorDefaultloginpage  for example: ''null''
 * @param authLoginselectorDefaultchangepwpage  for example: ''null''
 * @param authLoginselectorHandle  for example: ''null''
 * @param authLoginselectorHandleAllExtensions  for example: ''null''
*/
final case class ComDayCqAuthImplLoginSelectorHandlerProperties (
  path: Option[ConfigNodePropertyString] = None,
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  authLoginselectorMappings: Option[ConfigNodePropertyArray] = None,
  authLoginselectorChangepwMappings: Option[ConfigNodePropertyArray] = None,
  authLoginselectorDefaultloginpage: Option[ConfigNodePropertyString] = None,
  authLoginselectorDefaultchangepwpage: Option[ConfigNodePropertyString] = None,
  authLoginselectorHandle: Option[ConfigNodePropertyArray] = None,
  authLoginselectorHandleAllExtensions: Option[ConfigNodePropertyBoolean] = None
)

