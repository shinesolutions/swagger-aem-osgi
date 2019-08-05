package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteCorsImplCORSPolicyImplProperties._

case class ComAdobeGraniteCorsImplCORSPolicyImplProperties (
  alloworigin: Option[ConfigNodePropertyArray],
alloworiginregexp: Option[ConfigNodePropertyArray],
allowedpaths: Option[ConfigNodePropertyArray],
exposedheaders: Option[ConfigNodePropertyArray],
maxage: Option[ConfigNodePropertyInteger],
supportedheaders: Option[ConfigNodePropertyArray],
supportedmethods: Option[ConfigNodePropertyArray],
supportscredentials: Option[ConfigNodePropertyBoolean])

object ComAdobeGraniteCorsImplCORSPolicyImplProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteCorsImplCORSPolicyImplPropertiesCodecJson: CodecJson[ComAdobeGraniteCorsImplCORSPolicyImplProperties] = CodecJson.derive[ComAdobeGraniteCorsImplCORSPolicyImplProperties]
  implicit val ComAdobeGraniteCorsImplCORSPolicyImplPropertiesDecoder: EntityDecoder[ComAdobeGraniteCorsImplCORSPolicyImplProperties] = jsonOf[ComAdobeGraniteCorsImplCORSPolicyImplProperties]
  implicit val ComAdobeGraniteCorsImplCORSPolicyImplPropertiesEncoder: EntityEncoder[ComAdobeGraniteCorsImplCORSPolicyImplProperties] = jsonEncoderOf[ComAdobeGraniteCorsImplCORSPolicyImplProperties]
}
