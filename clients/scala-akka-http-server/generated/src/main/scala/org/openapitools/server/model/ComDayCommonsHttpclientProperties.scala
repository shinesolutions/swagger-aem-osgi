package org.openapitools.server.model


/**
 * @param proxyEnabled  for example: ''null''
 * @param proxyHost  for example: ''null''
 * @param proxyUser  for example: ''null''
 * @param proxyPassword  for example: ''null''
 * @param proxyNtlmHost  for example: ''null''
 * @param proxyNtlmDomain  for example: ''null''
 * @param proxyExceptions  for example: ''null''
*/
final case class ComDayCommonsHttpclientProperties (
  proxyEnabled: Option[ConfigNodePropertyBoolean] = None,
  proxyHost: Option[ConfigNodePropertyString] = None,
  proxyUser: Option[ConfigNodePropertyString] = None,
  proxyPassword: Option[ConfigNodePropertyString] = None,
  proxyNtlmHost: Option[ConfigNodePropertyString] = None,
  proxyNtlmDomain: Option[ConfigNodePropertyString] = None,
  proxyExceptions: Option[ConfigNodePropertyArray] = None
)

