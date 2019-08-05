package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletHealthCheckServletInfo._

case class ComDayCqDamCoreImplServletHealthCheckServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletHealthCheckServletProperties])

object ComDayCqDamCoreImplServletHealthCheckServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletHealthCheckServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletHealthCheckServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletHealthCheckServletInfo]
  implicit val ComDayCqDamCoreImplServletHealthCheckServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletHealthCheckServletInfo] = jsonOf[ComDayCqDamCoreImplServletHealthCheckServletInfo]
  implicit val ComDayCqDamCoreImplServletHealthCheckServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletHealthCheckServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletHealthCheckServletInfo]
}
