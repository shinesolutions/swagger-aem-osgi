package org.openapitools.server.model


/**
 * @param osgiHttpWhiteboardContextSelect  for example: ''null''
 * @param osgiHttpWhiteboardListener  for example: ''null''
 * @param authSudoCookie  for example: ''null''
 * @param authSudoParameter  for example: ''null''
 * @param authAnnonymous  for example: ''null''
 * @param slingAuthRequirements  for example: ''null''
 * @param slingAuthAnonymousUser  for example: ''null''
 * @param slingAuthAnonymousPassword  for example: ''null''
 * @param authHttp  for example: ''null''
 * @param authHttpRealm  for example: ''null''
 * @param authUriSuffix  for example: ''null''
*/
final case class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties (
  osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString] = None,
  osgiHttpWhiteboardListener: Option[ConfigNodePropertyString] = None,
  authSudoCookie: Option[ConfigNodePropertyString] = None,
  authSudoParameter: Option[ConfigNodePropertyString] = None,
  authAnnonymous: Option[ConfigNodePropertyBoolean] = None,
  slingAuthRequirements: Option[ConfigNodePropertyArray] = None,
  slingAuthAnonymousUser: Option[ConfigNodePropertyString] = None,
  slingAuthAnonymousPassword: Option[ConfigNodePropertyString] = None,
  authHttp: Option[ConfigNodePropertyDropDown] = None,
  authHttpRealm: Option[ConfigNodePropertyString] = None,
  authUriSuffix: Option[ConfigNodePropertyArray] = None
)

