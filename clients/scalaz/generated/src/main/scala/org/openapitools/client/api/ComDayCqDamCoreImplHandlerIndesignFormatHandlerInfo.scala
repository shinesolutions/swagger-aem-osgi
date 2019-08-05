package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo._

case class ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties])

object ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoCodecJson: CodecJson[ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo] = CodecJson.derive[ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo]
  implicit val ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoDecoder: EntityDecoder[ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo] = jsonOf[ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo]
  implicit val ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoEncoder: EntityEncoder[ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo] = jsonEncoderOf[ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo]
}
