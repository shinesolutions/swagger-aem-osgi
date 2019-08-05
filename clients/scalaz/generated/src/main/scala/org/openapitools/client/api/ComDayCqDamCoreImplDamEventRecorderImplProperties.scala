package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplDamEventRecorderImplProperties._

case class ComDayCqDamCoreImplDamEventRecorderImplProperties (
  eventFilter: Option[ConfigNodePropertyString],
eventQueueLength: Option[ConfigNodePropertyInteger],
eventrecorderEnabled: Option[ConfigNodePropertyBoolean],
eventrecorderBlacklist: Option[ConfigNodePropertyArray],
eventrecorderEventtypes: Option[ConfigNodePropertyDropDown])

object ComDayCqDamCoreImplDamEventRecorderImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplDamEventRecorderImplPropertiesCodecJson: CodecJson[ComDayCqDamCoreImplDamEventRecorderImplProperties] = CodecJson.derive[ComDayCqDamCoreImplDamEventRecorderImplProperties]
  implicit val ComDayCqDamCoreImplDamEventRecorderImplPropertiesDecoder: EntityDecoder[ComDayCqDamCoreImplDamEventRecorderImplProperties] = jsonOf[ComDayCqDamCoreImplDamEventRecorderImplProperties]
  implicit val ComDayCqDamCoreImplDamEventRecorderImplPropertiesEncoder: EntityEncoder[ComDayCqDamCoreImplDamEventRecorderImplProperties] = jsonEncoderOf[ComDayCqDamCoreImplDamEventRecorderImplProperties]
}
