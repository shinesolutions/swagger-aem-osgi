package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties._

case class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties (
  supportedPaths: Option[ConfigNodePropertyArray])

object ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesCodecJson: CodecJson[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties] = CodecJson.derive[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties]
  implicit val ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesDecoder: EntityDecoder[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties] = jsonOf[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties]
  implicit val ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesEncoder: EntityEncoder[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties] = jsonEncoderOf[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties]
}
