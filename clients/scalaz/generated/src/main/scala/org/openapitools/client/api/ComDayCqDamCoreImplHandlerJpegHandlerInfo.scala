package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplHandlerJpegHandlerInfo._

case class ComDayCqDamCoreImplHandlerJpegHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplHandlerJpegHandlerProperties])

object ComDayCqDamCoreImplHandlerJpegHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplHandlerJpegHandlerInfoCodecJson: CodecJson[ComDayCqDamCoreImplHandlerJpegHandlerInfo] = CodecJson.derive[ComDayCqDamCoreImplHandlerJpegHandlerInfo]
  implicit val ComDayCqDamCoreImplHandlerJpegHandlerInfoDecoder: EntityDecoder[ComDayCqDamCoreImplHandlerJpegHandlerInfo] = jsonOf[ComDayCqDamCoreImplHandlerJpegHandlerInfo]
  implicit val ComDayCqDamCoreImplHandlerJpegHandlerInfoEncoder: EntityEncoder[ComDayCqDamCoreImplHandlerJpegHandlerInfo] = jsonEncoderOf[ComDayCqDamCoreImplHandlerJpegHandlerInfo]
}
