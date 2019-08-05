package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplDamEventPurgeServiceProperties._

case class ComDayCqDamCoreImplDamEventPurgeServiceProperties (
  schedulerExpression: Option[ConfigNodePropertyString],
maxSavedActivities: Option[ConfigNodePropertyInteger],
saveInterval: Option[ConfigNodePropertyInteger],
enableActivityPurge: Option[ConfigNodePropertyBoolean],
eventTypes: Option[ConfigNodePropertyDropDown])

object ComDayCqDamCoreImplDamEventPurgeServiceProperties {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplDamEventPurgeServicePropertiesCodecJson: CodecJson[ComDayCqDamCoreImplDamEventPurgeServiceProperties] = CodecJson.derive[ComDayCqDamCoreImplDamEventPurgeServiceProperties]
  implicit val ComDayCqDamCoreImplDamEventPurgeServicePropertiesDecoder: EntityDecoder[ComDayCqDamCoreImplDamEventPurgeServiceProperties] = jsonOf[ComDayCqDamCoreImplDamEventPurgeServiceProperties]
  implicit val ComDayCqDamCoreImplDamEventPurgeServicePropertiesEncoder: EntityEncoder[ComDayCqDamCoreImplDamEventPurgeServiceProperties] = jsonEncoderOf[ComDayCqDamCoreImplDamEventPurgeServiceProperties]
}
