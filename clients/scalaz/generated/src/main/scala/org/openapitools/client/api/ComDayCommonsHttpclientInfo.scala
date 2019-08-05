package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCommonsHttpclientInfo._

case class ComDayCommonsHttpclientInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCommonsHttpclientProperties])

object ComDayCommonsHttpclientInfo {
  import DateTimeCodecs._

  implicit val ComDayCommonsHttpclientInfoCodecJson: CodecJson[ComDayCommonsHttpclientInfo] = CodecJson.derive[ComDayCommonsHttpclientInfo]
  implicit val ComDayCommonsHttpclientInfoDecoder: EntityDecoder[ComDayCommonsHttpclientInfo] = jsonOf[ComDayCommonsHttpclientInfo]
  implicit val ComDayCommonsHttpclientInfoEncoder: EntityEncoder[ComDayCommonsHttpclientInfo] = jsonEncoderOf[ComDayCommonsHttpclientInfo]
}
