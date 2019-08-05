package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties._

case class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties (
  `path`: Option[ConfigNodePropertyArray],
serviceRanking: Option[ConfigNodePropertyInteger],
idpUrl: Option[ConfigNodePropertyString],
idpCertAlias: Option[ConfigNodePropertyString],
idpHttpRedirect: Option[ConfigNodePropertyBoolean],
serviceProviderEntityId: Option[ConfigNodePropertyString],
assertionConsumerServiceURL: Option[ConfigNodePropertyString],
spPrivateKeyAlias: Option[ConfigNodePropertyString],
keyStorePassword: Option[ConfigNodePropertyString],
defaultRedirectUrl: Option[ConfigNodePropertyString],
userIDAttribute: Option[ConfigNodePropertyString],
useEncryption: Option[ConfigNodePropertyBoolean],
createUser: Option[ConfigNodePropertyBoolean],
userIntermediatePath: Option[ConfigNodePropertyString],
addGroupMemberships: Option[ConfigNodePropertyBoolean],
groupMembershipAttribute: Option[ConfigNodePropertyString],
defaultGroups: Option[ConfigNodePropertyArray],
nameIdFormat: Option[ConfigNodePropertyString],
synchronizeAttributes: Option[ConfigNodePropertyArray],
handleLogout: Option[ConfigNodePropertyBoolean],
logoutUrl: Option[ConfigNodePropertyString],
clockTolerance: Option[ConfigNodePropertyInteger],
digestMethod: Option[ConfigNodePropertyString],
signatureMethod: Option[ConfigNodePropertyString],
identitySyncType: Option[ConfigNodePropertyDropDown],
idpIdentifier: Option[ConfigNodePropertyString])

object ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesCodecJson: CodecJson[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties] = CodecJson.derive[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties]
  implicit val ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesDecoder: EntityDecoder[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties] = jsonOf[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties]
  implicit val ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesEncoder: EntityEncoder[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties] = jsonEncoderOf[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties]
}
