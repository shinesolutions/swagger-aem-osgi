package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplRenditionMakerImplProperties._

case class ComDayCqDamCoreImplRenditionMakerImplProperties (
  xmpPropagate: Option[ConfigNodePropertyBoolean],
xmpExcludes: Option[ConfigNodePropertyArray])

object ComDayCqDamCoreImplRenditionMakerImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplRenditionMakerImplPropertiesCodecJson: CodecJson[ComDayCqDamCoreImplRenditionMakerImplProperties] = CodecJson.derive[ComDayCqDamCoreImplRenditionMakerImplProperties]
  implicit val ComDayCqDamCoreImplRenditionMakerImplPropertiesDecoder: EntityDecoder[ComDayCqDamCoreImplRenditionMakerImplProperties] = jsonOf[ComDayCqDamCoreImplRenditionMakerImplProperties]
  implicit val ComDayCqDamCoreImplRenditionMakerImplPropertiesEncoder: EntityEncoder[ComDayCqDamCoreImplRenditionMakerImplProperties] = jsonEncoderOf[ComDayCqDamCoreImplRenditionMakerImplProperties]
}
