package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqMailerDefaultMailServiceInfo._

case class ComDayCqMailerDefaultMailServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqMailerDefaultMailServiceProperties])

object ComDayCqMailerDefaultMailServiceInfo {
  import DateTimeCodecs._

  implicit val ComDayCqMailerDefaultMailServiceInfoCodecJson: CodecJson[ComDayCqMailerDefaultMailServiceInfo] = CodecJson.derive[ComDayCqMailerDefaultMailServiceInfo]
  implicit val ComDayCqMailerDefaultMailServiceInfoDecoder: EntityDecoder[ComDayCqMailerDefaultMailServiceInfo] = jsonOf[ComDayCqMailerDefaultMailServiceInfo]
  implicit val ComDayCqMailerDefaultMailServiceInfoEncoder: EntityEncoder[ComDayCqMailerDefaultMailServiceInfo] = jsonEncoderOf[ComDayCqMailerDefaultMailServiceInfo]
}
