package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmFoundationImplHTTPAuthHandlerProperties._

case class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties (
  `path`: Option[ConfigNodePropertyString],
authHttpNologin: Option[ConfigNodePropertyBoolean],
authHttpRealm: Option[ConfigNodePropertyString],
authDefaultLoginpage: Option[ConfigNodePropertyString],
authCredForm: Option[ConfigNodePropertyArray],
authCredUtf8: Option[ConfigNodePropertyArray])

object ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesCodecJson: CodecJson[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties] = CodecJson.derive[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties]
  implicit val ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesDecoder: EntityDecoder[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties] = jsonOf[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties]
  implicit val ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesEncoder: EntityEncoder[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties] = jsonEncoderOf[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties]
}
