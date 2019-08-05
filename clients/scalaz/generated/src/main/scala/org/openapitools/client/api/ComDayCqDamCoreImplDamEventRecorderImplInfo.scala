package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplDamEventRecorderImplInfo._

case class ComDayCqDamCoreImplDamEventRecorderImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplDamEventRecorderImplProperties])

object ComDayCqDamCoreImplDamEventRecorderImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplDamEventRecorderImplInfoCodecJson: CodecJson[ComDayCqDamCoreImplDamEventRecorderImplInfo] = CodecJson.derive[ComDayCqDamCoreImplDamEventRecorderImplInfo]
  implicit val ComDayCqDamCoreImplDamEventRecorderImplInfoDecoder: EntityDecoder[ComDayCqDamCoreImplDamEventRecorderImplInfo] = jsonOf[ComDayCqDamCoreImplDamEventRecorderImplInfo]
  implicit val ComDayCqDamCoreImplDamEventRecorderImplInfoEncoder: EntityEncoder[ComDayCqDamCoreImplDamEventRecorderImplInfo] = jsonEncoderOf[ComDayCqDamCoreImplDamEventRecorderImplInfo]
}
