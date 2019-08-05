package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmFoundationImplHTTPAuthHandlerInfo._

case class ComDayCqWcmFoundationImplHTTPAuthHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties])

object ComDayCqWcmFoundationImplHTTPAuthHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmFoundationImplHTTPAuthHandlerInfoCodecJson: CodecJson[ComDayCqWcmFoundationImplHTTPAuthHandlerInfo] = CodecJson.derive[ComDayCqWcmFoundationImplHTTPAuthHandlerInfo]
  implicit val ComDayCqWcmFoundationImplHTTPAuthHandlerInfoDecoder: EntityDecoder[ComDayCqWcmFoundationImplHTTPAuthHandlerInfo] = jsonOf[ComDayCqWcmFoundationImplHTTPAuthHandlerInfo]
  implicit val ComDayCqWcmFoundationImplHTTPAuthHandlerInfoEncoder: EntityEncoder[ComDayCqWcmFoundationImplHTTPAuthHandlerInfo] = jsonEncoderOf[ComDayCqWcmFoundationImplHTTPAuthHandlerInfo]
}
