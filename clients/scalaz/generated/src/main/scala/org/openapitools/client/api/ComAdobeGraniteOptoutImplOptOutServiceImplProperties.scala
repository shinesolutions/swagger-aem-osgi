package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteOptoutImplOptOutServiceImplProperties._

case class ComAdobeGraniteOptoutImplOptOutServiceImplProperties (
  optoutCookies: Option[ConfigNodePropertyArray],
optoutHeaders: Option[ConfigNodePropertyArray],
optoutWhitelistCookies: Option[ConfigNodePropertyArray])

object ComAdobeGraniteOptoutImplOptOutServiceImplProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesCodecJson: CodecJson[ComAdobeGraniteOptoutImplOptOutServiceImplProperties] = CodecJson.derive[ComAdobeGraniteOptoutImplOptOutServiceImplProperties]
  implicit val ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesDecoder: EntityDecoder[ComAdobeGraniteOptoutImplOptOutServiceImplProperties] = jsonOf[ComAdobeGraniteOptoutImplOptOutServiceImplProperties]
  implicit val ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesEncoder: EntityEncoder[ComAdobeGraniteOptoutImplOptOutServiceImplProperties] = jsonEncoderOf[ComAdobeGraniteOptoutImplOptOutServiceImplProperties]
}