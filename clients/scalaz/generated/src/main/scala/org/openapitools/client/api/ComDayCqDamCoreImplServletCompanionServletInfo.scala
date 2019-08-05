package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletCompanionServletInfo._

case class ComDayCqDamCoreImplServletCompanionServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletCompanionServletProperties])

object ComDayCqDamCoreImplServletCompanionServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletCompanionServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletCompanionServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletCompanionServletInfo]
  implicit val ComDayCqDamCoreImplServletCompanionServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletCompanionServletInfo] = jsonOf[ComDayCqDamCoreImplServletCompanionServletInfo]
  implicit val ComDayCqDamCoreImplServletCompanionServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletCompanionServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletCompanionServletInfo]
}
