package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamHandlerStandardPdfPdfHandlerInfo._

case class ComDayCqDamHandlerStandardPdfPdfHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamHandlerStandardPdfPdfHandlerProperties])

object ComDayCqDamHandlerStandardPdfPdfHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamHandlerStandardPdfPdfHandlerInfoCodecJson: CodecJson[ComDayCqDamHandlerStandardPdfPdfHandlerInfo] = CodecJson.derive[ComDayCqDamHandlerStandardPdfPdfHandlerInfo]
  implicit val ComDayCqDamHandlerStandardPdfPdfHandlerInfoDecoder: EntityDecoder[ComDayCqDamHandlerStandardPdfPdfHandlerInfo] = jsonOf[ComDayCqDamHandlerStandardPdfPdfHandlerInfo]
  implicit val ComDayCqDamHandlerStandardPdfPdfHandlerInfoEncoder: EntityEncoder[ComDayCqDamHandlerStandardPdfPdfHandlerInfo] = jsonEncoderOf[ComDayCqDamHandlerStandardPdfPdfHandlerInfo]
}
