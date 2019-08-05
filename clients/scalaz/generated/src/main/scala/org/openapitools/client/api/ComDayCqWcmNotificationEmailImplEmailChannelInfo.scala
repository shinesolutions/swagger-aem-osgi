package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmNotificationEmailImplEmailChannelInfo._

case class ComDayCqWcmNotificationEmailImplEmailChannelInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmNotificationEmailImplEmailChannelProperties])

object ComDayCqWcmNotificationEmailImplEmailChannelInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmNotificationEmailImplEmailChannelInfoCodecJson: CodecJson[ComDayCqWcmNotificationEmailImplEmailChannelInfo] = CodecJson.derive[ComDayCqWcmNotificationEmailImplEmailChannelInfo]
  implicit val ComDayCqWcmNotificationEmailImplEmailChannelInfoDecoder: EntityDecoder[ComDayCqWcmNotificationEmailImplEmailChannelInfo] = jsonOf[ComDayCqWcmNotificationEmailImplEmailChannelInfo]
  implicit val ComDayCqWcmNotificationEmailImplEmailChannelInfoEncoder: EntityEncoder[ComDayCqWcmNotificationEmailImplEmailChannelInfo] = jsonEncoderOf[ComDayCqWcmNotificationEmailImplEmailChannelInfo]
}
