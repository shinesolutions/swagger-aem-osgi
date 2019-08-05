package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo._

case class ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties])

object ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoCodecJson: CodecJson[ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo] = CodecJson.derive[ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo]
  implicit val ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoDecoder: EntityDecoder[ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo] = jsonOf[ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo]
  implicit val ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoEncoder: EntityEncoder[ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo] = jsonEncoderOf[ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo]
}
