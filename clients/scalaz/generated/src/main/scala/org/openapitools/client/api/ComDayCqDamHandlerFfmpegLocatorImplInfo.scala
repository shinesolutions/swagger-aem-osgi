package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamHandlerFfmpegLocatorImplInfo._

case class ComDayCqDamHandlerFfmpegLocatorImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamHandlerFfmpegLocatorImplProperties])

object ComDayCqDamHandlerFfmpegLocatorImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamHandlerFfmpegLocatorImplInfoCodecJson: CodecJson[ComDayCqDamHandlerFfmpegLocatorImplInfo] = CodecJson.derive[ComDayCqDamHandlerFfmpegLocatorImplInfo]
  implicit val ComDayCqDamHandlerFfmpegLocatorImplInfoDecoder: EntityDecoder[ComDayCqDamHandlerFfmpegLocatorImplInfo] = jsonOf[ComDayCqDamHandlerFfmpegLocatorImplInfo]
  implicit val ComDayCqDamHandlerFfmpegLocatorImplInfoEncoder: EntityEncoder[ComDayCqDamHandlerFfmpegLocatorImplInfo] = jsonEncoderOf[ComDayCqDamHandlerFfmpegLocatorImplInfo]
}
