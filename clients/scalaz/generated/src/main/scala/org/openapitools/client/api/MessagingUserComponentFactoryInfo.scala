package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import MessagingUserComponentFactoryInfo._

case class MessagingUserComponentFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[MessagingUserComponentFactoryProperties])

object MessagingUserComponentFactoryInfo {
  import DateTimeCodecs._

  implicit val MessagingUserComponentFactoryInfoCodecJson: CodecJson[MessagingUserComponentFactoryInfo] = CodecJson.derive[MessagingUserComponentFactoryInfo]
  implicit val MessagingUserComponentFactoryInfoDecoder: EntityDecoder[MessagingUserComponentFactoryInfo] = jsonOf[MessagingUserComponentFactoryInfo]
  implicit val MessagingUserComponentFactoryInfoEncoder: EntityEncoder[MessagingUserComponentFactoryInfo] = jsonEncoderOf[MessagingUserComponentFactoryInfo]
}
