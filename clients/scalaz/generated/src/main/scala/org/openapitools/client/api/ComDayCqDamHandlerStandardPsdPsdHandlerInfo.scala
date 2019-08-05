package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamHandlerStandardPsdPsdHandlerInfo._

case class ComDayCqDamHandlerStandardPsdPsdHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamHandlerStandardPsdPsdHandlerProperties])

object ComDayCqDamHandlerStandardPsdPsdHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamHandlerStandardPsdPsdHandlerInfoCodecJson: CodecJson[ComDayCqDamHandlerStandardPsdPsdHandlerInfo] = CodecJson.derive[ComDayCqDamHandlerStandardPsdPsdHandlerInfo]
  implicit val ComDayCqDamHandlerStandardPsdPsdHandlerInfoDecoder: EntityDecoder[ComDayCqDamHandlerStandardPsdPsdHandlerInfo] = jsonOf[ComDayCqDamHandlerStandardPsdPsdHandlerInfo]
  implicit val ComDayCqDamHandlerStandardPsdPsdHandlerInfoEncoder: EntityEncoder[ComDayCqDamHandlerStandardPsdPsdHandlerInfo] = jsonEncoderOf[ComDayCqDamHandlerStandardPsdPsdHandlerInfo]
}
