package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqAuthImplLoginSelectorHandlerInfo._

case class ComDayCqAuthImplLoginSelectorHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqAuthImplLoginSelectorHandlerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqAuthImplLoginSelectorHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqAuthImplLoginSelectorHandlerInfoCodecJson: CodecJson[ComDayCqAuthImplLoginSelectorHandlerInfo] = CodecJson.derive[ComDayCqAuthImplLoginSelectorHandlerInfo]
  implicit val ComDayCqAuthImplLoginSelectorHandlerInfoDecoder: EntityDecoder[ComDayCqAuthImplLoginSelectorHandlerInfo] = jsonOf[ComDayCqAuthImplLoginSelectorHandlerInfo]
  implicit val ComDayCqAuthImplLoginSelectorHandlerInfoEncoder: EntityEncoder[ComDayCqAuthImplLoginSelectorHandlerInfo] = jsonEncoderOf[ComDayCqAuthImplLoginSelectorHandlerInfo]
}
