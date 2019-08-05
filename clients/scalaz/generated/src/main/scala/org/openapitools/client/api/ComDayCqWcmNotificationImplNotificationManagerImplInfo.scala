package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmNotificationImplNotificationManagerImplInfo._

case class ComDayCqWcmNotificationImplNotificationManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmNotificationImplNotificationManagerImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmNotificationImplNotificationManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmNotificationImplNotificationManagerImplInfoCodecJson: CodecJson[ComDayCqWcmNotificationImplNotificationManagerImplInfo] = CodecJson.derive[ComDayCqWcmNotificationImplNotificationManagerImplInfo]
  implicit val ComDayCqWcmNotificationImplNotificationManagerImplInfoDecoder: EntityDecoder[ComDayCqWcmNotificationImplNotificationManagerImplInfo] = jsonOf[ComDayCqWcmNotificationImplNotificationManagerImplInfo]
  implicit val ComDayCqWcmNotificationImplNotificationManagerImplInfoEncoder: EntityEncoder[ComDayCqWcmNotificationImplNotificationManagerImplInfo] = jsonEncoderOf[ComDayCqWcmNotificationImplNotificationManagerImplInfo]
}
