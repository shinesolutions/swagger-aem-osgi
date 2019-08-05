package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqMcmImplMCMConfigurationInfo._

case class ComDayCqMcmImplMCMConfigurationInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqMcmImplMCMConfigurationProperties])

object ComDayCqMcmImplMCMConfigurationInfo {
  import DateTimeCodecs._

  implicit val ComDayCqMcmImplMCMConfigurationInfoCodecJson: CodecJson[ComDayCqMcmImplMCMConfigurationInfo] = CodecJson.derive[ComDayCqMcmImplMCMConfigurationInfo]
  implicit val ComDayCqMcmImplMCMConfigurationInfoDecoder: EntityDecoder[ComDayCqMcmImplMCMConfigurationInfo] = jsonOf[ComDayCqMcmImplMCMConfigurationInfo]
  implicit val ComDayCqMcmImplMCMConfigurationInfoEncoder: EntityEncoder[ComDayCqMcmImplMCMConfigurationInfo] = jsonEncoderOf[ComDayCqMcmImplMCMConfigurationInfo]
}
