package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplUnzipUnzipConfigProperties._

case class ComDayCqDamCoreImplUnzipUnzipConfigProperties (
  cqDamConfigUnzipMaxuncompressedsize: Option[ConfigNodePropertyInteger],
cqDamConfigUnzipEncoding: Option[ConfigNodePropertyString])

object ComDayCqDamCoreImplUnzipUnzipConfigProperties {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplUnzipUnzipConfigPropertiesCodecJson: CodecJson[ComDayCqDamCoreImplUnzipUnzipConfigProperties] = CodecJson.derive[ComDayCqDamCoreImplUnzipUnzipConfigProperties]
  implicit val ComDayCqDamCoreImplUnzipUnzipConfigPropertiesDecoder: EntityDecoder[ComDayCqDamCoreImplUnzipUnzipConfigProperties] = jsonOf[ComDayCqDamCoreImplUnzipUnzipConfigProperties]
  implicit val ComDayCqDamCoreImplUnzipUnzipConfigPropertiesEncoder: EntityEncoder[ComDayCqDamCoreImplUnzipUnzipConfigProperties] = jsonEncoderOf[ComDayCqDamCoreImplUnzipUnzipConfigProperties]
}
