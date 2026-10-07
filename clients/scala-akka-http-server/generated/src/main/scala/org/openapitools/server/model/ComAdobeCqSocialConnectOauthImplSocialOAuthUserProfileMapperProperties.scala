package org.openapitools.server.model


/**
 * @param facebook  for example: ''null''
 * @param twitter  for example: ''null''
 * @param providerConfigUserFolder  for example: ''null''
*/
final case class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties (
  facebook: Option[ConfigNodePropertyArray] = None,
  twitter: Option[ConfigNodePropertyArray] = None,
  providerConfigUserFolder: Option[ConfigNodePropertyString] = None
)

