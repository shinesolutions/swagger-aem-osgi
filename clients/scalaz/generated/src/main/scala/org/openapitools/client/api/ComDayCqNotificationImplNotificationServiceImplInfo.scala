package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqNotificationImplNotificationServiceImplInfo._

case class ComDayCqNotificationImplNotificationServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqNotificationImplNotificationServiceImplProperties])

object ComDayCqNotificationImplNotificationServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqNotificationImplNotificationServiceImplInfoCodecJson: CodecJson[ComDayCqNotificationImplNotificationServiceImplInfo] = CodecJson.derive[ComDayCqNotificationImplNotificationServiceImplInfo]
  implicit val ComDayCqNotificationImplNotificationServiceImplInfoDecoder: EntityDecoder[ComDayCqNotificationImplNotificationServiceImplInfo] = jsonOf[ComDayCqNotificationImplNotificationServiceImplInfo]
  implicit val ComDayCqNotificationImplNotificationServiceImplInfoEncoder: EntityEncoder[ComDayCqNotificationImplNotificationServiceImplInfo] = jsonEncoderOf[ComDayCqNotificationImplNotificationServiceImplInfo]
}
