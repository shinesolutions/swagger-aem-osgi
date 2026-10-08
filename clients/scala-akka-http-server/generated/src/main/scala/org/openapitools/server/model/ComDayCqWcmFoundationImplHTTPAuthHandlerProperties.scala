package org.openapitools.server.model


/**
 * @param path  for example: ''null''
 * @param authHttpNologin  for example: ''null''
 * @param authHttpRealm  for example: ''null''
 * @param authDefaultLoginpage  for example: ''null''
 * @param authCredForm  for example: ''null''
 * @param authCredUtf8  for example: ''null''
*/
final case class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties (
  path: Option[ConfigNodePropertyString] = None,
  authHttpNologin: Option[ConfigNodePropertyBoolean] = None,
  authHttpRealm: Option[ConfigNodePropertyString] = None,
  authDefaultLoginpage: Option[ConfigNodePropertyString] = None,
  authCredForm: Option[ConfigNodePropertyArray] = None,
  authCredUtf8: Option[ConfigNodePropertyArray] = None
)

