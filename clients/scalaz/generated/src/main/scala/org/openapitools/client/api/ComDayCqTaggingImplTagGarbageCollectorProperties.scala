package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqTaggingImplTagGarbageCollectorProperties._

case class ComDayCqTaggingImplTagGarbageCollectorProperties (
  schedulerExpression: Option[ConfigNodePropertyString])

object ComDayCqTaggingImplTagGarbageCollectorProperties {
  import DateTimeCodecs._

  implicit val ComDayCqTaggingImplTagGarbageCollectorPropertiesCodecJson: CodecJson[ComDayCqTaggingImplTagGarbageCollectorProperties] = CodecJson.derive[ComDayCqTaggingImplTagGarbageCollectorProperties]
  implicit val ComDayCqTaggingImplTagGarbageCollectorPropertiesDecoder: EntityDecoder[ComDayCqTaggingImplTagGarbageCollectorProperties] = jsonOf[ComDayCqTaggingImplTagGarbageCollectorProperties]
  implicit val ComDayCqTaggingImplTagGarbageCollectorPropertiesEncoder: EntityEncoder[ComDayCqTaggingImplTagGarbageCollectorProperties] = jsonEncoderOf[ComDayCqTaggingImplTagGarbageCollectorProperties]
}
