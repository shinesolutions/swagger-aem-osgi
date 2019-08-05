package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqImageInternalFontFontHelperInfo._

case class ComDayCqImageInternalFontFontHelperInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqImageInternalFontFontHelperProperties])

object ComDayCqImageInternalFontFontHelperInfo {
  import DateTimeCodecs._

  implicit val ComDayCqImageInternalFontFontHelperInfoCodecJson: CodecJson[ComDayCqImageInternalFontFontHelperInfo] = CodecJson.derive[ComDayCqImageInternalFontFontHelperInfo]
  implicit val ComDayCqImageInternalFontFontHelperInfoDecoder: EntityDecoder[ComDayCqImageInternalFontFontHelperInfo] = jsonOf[ComDayCqImageInternalFontFontHelperInfo]
  implicit val ComDayCqImageInternalFontFontHelperInfoEncoder: EntityEncoder[ComDayCqImageInternalFontFontHelperInfo] = jsonEncoderOf[ComDayCqImageInternalFontFontHelperInfo]
}
