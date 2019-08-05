package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCommonsHandlerStandardImageHandlerInfo._

case class ComDayCqDamCommonsHandlerStandardImageHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCommonsHandlerStandardImageHandlerProperties])

object ComDayCqDamCommonsHandlerStandardImageHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCommonsHandlerStandardImageHandlerInfoCodecJson: CodecJson[ComDayCqDamCommonsHandlerStandardImageHandlerInfo] = CodecJson.derive[ComDayCqDamCommonsHandlerStandardImageHandlerInfo]
  implicit val ComDayCqDamCommonsHandlerStandardImageHandlerInfoDecoder: EntityDecoder[ComDayCqDamCommonsHandlerStandardImageHandlerInfo] = jsonOf[ComDayCqDamCommonsHandlerStandardImageHandlerInfo]
  implicit val ComDayCqDamCommonsHandlerStandardImageHandlerInfoEncoder: EntityEncoder[ComDayCqDamCommonsHandlerStandardImageHandlerInfo] = jsonEncoderOf[ComDayCqDamCommonsHandlerStandardImageHandlerInfo]
}
