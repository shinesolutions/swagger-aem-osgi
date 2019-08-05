package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties._

case class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties (
  maxConnections: Option[ConfigNodePropertyString],
maxRequests: Option[ConfigNodePropertyString],
requestTimeout: Option[ConfigNodePropertyString],
logDir: Option[ConfigNodePropertyString])

object ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {
  import DateTimeCodecs._

  implicit val ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesCodecJson: CodecJson[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties] = CodecJson.derive[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties]
  implicit val ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesDecoder: EntityDecoder[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties] = jsonOf[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties]
  implicit val ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesEncoder: EntityEncoder[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties] = jsonEncoderOf[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties]
}
