package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo._

case class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties])

object ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoCodecJson: CodecJson[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo] = CodecJson.derive[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo]
  implicit val ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoDecoder: EntityDecoder[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo] = jsonOf[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo]
  implicit val ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoEncoder: EntityEncoder[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo] = jsonEncoderOf[ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo]
}
