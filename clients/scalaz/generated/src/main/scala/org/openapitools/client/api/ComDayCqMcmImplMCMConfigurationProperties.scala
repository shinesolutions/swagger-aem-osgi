package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqMcmImplMCMConfigurationProperties._

case class ComDayCqMcmImplMCMConfigurationProperties (
  experienceIndirection: Option[ConfigNodePropertyArray],
touchpointIndirection: Option[ConfigNodePropertyArray])

object ComDayCqMcmImplMCMConfigurationProperties {
  import DateTimeCodecs._

  implicit val ComDayCqMcmImplMCMConfigurationPropertiesCodecJson: CodecJson[ComDayCqMcmImplMCMConfigurationProperties] = CodecJson.derive[ComDayCqMcmImplMCMConfigurationProperties]
  implicit val ComDayCqMcmImplMCMConfigurationPropertiesDecoder: EntityDecoder[ComDayCqMcmImplMCMConfigurationProperties] = jsonOf[ComDayCqMcmImplMCMConfigurationProperties]
  implicit val ComDayCqMcmImplMCMConfigurationPropertiesEncoder: EntityEncoder[ComDayCqMcmImplMCMConfigurationProperties] = jsonEncoderOf[ComDayCqMcmImplMCMConfigurationProperties]
}
