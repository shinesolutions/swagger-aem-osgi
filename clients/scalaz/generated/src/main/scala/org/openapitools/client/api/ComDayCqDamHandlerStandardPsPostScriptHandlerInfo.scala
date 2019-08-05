package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamHandlerStandardPsPostScriptHandlerInfo._

case class ComDayCqDamHandlerStandardPsPostScriptHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamHandlerStandardPsPostScriptHandlerProperties])

object ComDayCqDamHandlerStandardPsPostScriptHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamHandlerStandardPsPostScriptHandlerInfoCodecJson: CodecJson[ComDayCqDamHandlerStandardPsPostScriptHandlerInfo] = CodecJson.derive[ComDayCqDamHandlerStandardPsPostScriptHandlerInfo]
  implicit val ComDayCqDamHandlerStandardPsPostScriptHandlerInfoDecoder: EntityDecoder[ComDayCqDamHandlerStandardPsPostScriptHandlerInfo] = jsonOf[ComDayCqDamHandlerStandardPsPostScriptHandlerInfo]
  implicit val ComDayCqDamHandlerStandardPsPostScriptHandlerInfoEncoder: EntityEncoder[ComDayCqDamHandlerStandardPsPostScriptHandlerInfo] = jsonEncoderOf[ComDayCqDamHandlerStandardPsPostScriptHandlerInfo]
}
