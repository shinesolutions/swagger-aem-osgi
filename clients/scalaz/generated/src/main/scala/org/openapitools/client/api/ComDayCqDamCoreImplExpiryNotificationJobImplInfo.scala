package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplExpiryNotificationJobImplInfo._

case class ComDayCqDamCoreImplExpiryNotificationJobImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplExpiryNotificationJobImplProperties])

object ComDayCqDamCoreImplExpiryNotificationJobImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplExpiryNotificationJobImplInfoCodecJson: CodecJson[ComDayCqDamCoreImplExpiryNotificationJobImplInfo] = CodecJson.derive[ComDayCqDamCoreImplExpiryNotificationJobImplInfo]
  implicit val ComDayCqDamCoreImplExpiryNotificationJobImplInfoDecoder: EntityDecoder[ComDayCqDamCoreImplExpiryNotificationJobImplInfo] = jsonOf[ComDayCqDamCoreImplExpiryNotificationJobImplInfo]
  implicit val ComDayCqDamCoreImplExpiryNotificationJobImplInfoEncoder: EntityEncoder[ComDayCqDamCoreImplExpiryNotificationJobImplInfo] = jsonEncoderOf[ComDayCqDamCoreImplExpiryNotificationJobImplInfo]
}
