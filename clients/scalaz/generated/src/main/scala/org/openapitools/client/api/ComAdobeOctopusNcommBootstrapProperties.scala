package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeOctopusNcommBootstrapProperties._

case class ComAdobeOctopusNcommBootstrapProperties (
  maxConnections: Option[ConfigNodePropertyInteger],
maxRequests: Option[ConfigNodePropertyInteger],
requestTimeout: Option[ConfigNodePropertyInteger],
requestRetries: Option[ConfigNodePropertyInteger],
launchTimeout: Option[ConfigNodePropertyInteger])

object ComAdobeOctopusNcommBootstrapProperties {
  import DateTimeCodecs._

  implicit val ComAdobeOctopusNcommBootstrapPropertiesCodecJson: CodecJson[ComAdobeOctopusNcommBootstrapProperties] = CodecJson.derive[ComAdobeOctopusNcommBootstrapProperties]
  implicit val ComAdobeOctopusNcommBootstrapPropertiesDecoder: EntityDecoder[ComAdobeOctopusNcommBootstrapProperties] = jsonOf[ComAdobeOctopusNcommBootstrapProperties]
  implicit val ComAdobeOctopusNcommBootstrapPropertiesEncoder: EntityEncoder[ComAdobeOctopusNcommBootstrapProperties] = jsonEncoderOf[ComAdobeOctopusNcommBootstrapProperties]
}
