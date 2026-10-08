package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param authTokenProviderTitle  for example: ''null''
 * @param authTokenProviderDefaultClaims  for example: ''null''
 * @param authTokenProviderEndpoint  for example: ''null''
 * @param authAccessTokenRequest  for example: ''null''
 * @param authTokenProviderKeypairAlias  for example: ''null''
 * @param authTokenProviderConnTimeout  for example: ''null''
 * @param authTokenProviderSoTimeout  for example: ''null''
 * @param authTokenProviderClientId  for example: ''null''
 * @param authTokenProviderScope  for example: ''null''
 * @param authTokenProviderReuseAccessToken  for example: ''null''
 * @param authTokenProviderRelaxedSsl  for example: ''null''
 * @param tokenRequestCustomizerType  for example: ''null''
 * @param authTokenValidatorType  for example: ''null''
*/
final case class ComAdobeGraniteAuthOauthAccesstokenProviderProperties (
  name: Option[ConfigNodePropertyString] = None,
  authTokenProviderTitle: Option[ConfigNodePropertyString] = None,
  authTokenProviderDefaultClaims: Option[ConfigNodePropertyArray] = None,
  authTokenProviderEndpoint: Option[ConfigNodePropertyString] = None,
  authAccessTokenRequest: Option[ConfigNodePropertyString] = None,
  authTokenProviderKeypairAlias: Option[ConfigNodePropertyString] = None,
  authTokenProviderConnTimeout: Option[ConfigNodePropertyInteger] = None,
  authTokenProviderSoTimeout: Option[ConfigNodePropertyInteger] = None,
  authTokenProviderClientId: Option[ConfigNodePropertyString] = None,
  authTokenProviderScope: Option[ConfigNodePropertyString] = None,
  authTokenProviderReuseAccessToken: Option[ConfigNodePropertyBoolean] = None,
  authTokenProviderRelaxedSsl: Option[ConfigNodePropertyBoolean] = None,
  tokenRequestCustomizerType: Option[ConfigNodePropertyString] = None,
  authTokenValidatorType: Option[ConfigNodePropertyString] = None
)

