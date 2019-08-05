package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties._

case class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties (
  `path`: Option[ConfigNodePropertyString],
serviceRanking: Option[ConfigNodePropertyInteger],
jaasControlFlag: Option[ConfigNodePropertyString],
jaasRealmName: Option[ConfigNodePropertyString],
jaasRanking: Option[ConfigNodePropertyInteger],
headers: Option[ConfigNodePropertyArray],
cookies: Option[ConfigNodePropertyArray],
parameters: Option[ConfigNodePropertyArray],
usermap: Option[ConfigNodePropertyArray],
format: Option[ConfigNodePropertyString],
trustedCredentialsAttribute: Option[ConfigNodePropertyString])

object ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesCodecJson: CodecJson[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties] = CodecJson.derive[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties]
  implicit val ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesDecoder: EntityDecoder[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties] = jsonOf[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties]
  implicit val ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesEncoder: EntityEncoder[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties] = jsonEncoderOf[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties]
}
