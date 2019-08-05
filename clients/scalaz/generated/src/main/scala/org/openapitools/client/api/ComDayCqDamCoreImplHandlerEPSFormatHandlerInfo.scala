package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo._

case class ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties])

object ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplHandlerEPSFormatHandlerInfoCodecJson: CodecJson[ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo] = CodecJson.derive[ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo]
  implicit val ComDayCqDamCoreImplHandlerEPSFormatHandlerInfoDecoder: EntityDecoder[ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo] = jsonOf[ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo]
  implicit val ComDayCqDamCoreImplHandlerEPSFormatHandlerInfoEncoder: EntityEncoder[ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo] = jsonEncoderOf[ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo]
}
