package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqAuthImplCugCugSupportImplInfo._

case class ComDayCqAuthImplCugCugSupportImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqAuthImplCugCugSupportImplProperties])

object ComDayCqAuthImplCugCugSupportImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqAuthImplCugCugSupportImplInfoCodecJson: CodecJson[ComDayCqAuthImplCugCugSupportImplInfo] = CodecJson.derive[ComDayCqAuthImplCugCugSupportImplInfo]
  implicit val ComDayCqAuthImplCugCugSupportImplInfoDecoder: EntityDecoder[ComDayCqAuthImplCugCugSupportImplInfo] = jsonOf[ComDayCqAuthImplCugCugSupportImplInfo]
  implicit val ComDayCqAuthImplCugCugSupportImplInfoEncoder: EntityEncoder[ComDayCqAuthImplCugCugSupportImplInfo] = jsonEncoderOf[ComDayCqAuthImplCugCugSupportImplInfo]
}
