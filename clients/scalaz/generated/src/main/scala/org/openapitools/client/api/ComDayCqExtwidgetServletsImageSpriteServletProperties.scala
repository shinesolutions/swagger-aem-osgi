package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqExtwidgetServletsImageSpriteServletProperties._

case class ComDayCqExtwidgetServletsImageSpriteServletProperties (
  maxWidth: Option[ConfigNodePropertyInteger],
maxHeight: Option[ConfigNodePropertyInteger])

object ComDayCqExtwidgetServletsImageSpriteServletProperties {
  import DateTimeCodecs._

  implicit val ComDayCqExtwidgetServletsImageSpriteServletPropertiesCodecJson: CodecJson[ComDayCqExtwidgetServletsImageSpriteServletProperties] = CodecJson.derive[ComDayCqExtwidgetServletsImageSpriteServletProperties]
  implicit val ComDayCqExtwidgetServletsImageSpriteServletPropertiesDecoder: EntityDecoder[ComDayCqExtwidgetServletsImageSpriteServletProperties] = jsonOf[ComDayCqExtwidgetServletsImageSpriteServletProperties]
  implicit val ComDayCqExtwidgetServletsImageSpriteServletPropertiesEncoder: EntityEncoder[ComDayCqExtwidgetServletsImageSpriteServletProperties] = jsonEncoderOf[ComDayCqExtwidgetServletsImageSpriteServletProperties]
}