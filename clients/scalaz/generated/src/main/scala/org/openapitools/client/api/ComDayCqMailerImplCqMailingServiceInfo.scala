package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqMailerImplCqMailingServiceInfo._

case class ComDayCqMailerImplCqMailingServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqMailerImplCqMailingServiceProperties])

object ComDayCqMailerImplCqMailingServiceInfo {
  import DateTimeCodecs._

  implicit val ComDayCqMailerImplCqMailingServiceInfoCodecJson: CodecJson[ComDayCqMailerImplCqMailingServiceInfo] = CodecJson.derive[ComDayCqMailerImplCqMailingServiceInfo]
  implicit val ComDayCqMailerImplCqMailingServiceInfoDecoder: EntityDecoder[ComDayCqMailerImplCqMailingServiceInfo] = jsonOf[ComDayCqMailerImplCqMailingServiceInfo]
  implicit val ComDayCqMailerImplCqMailingServiceInfoEncoder: EntityEncoder[ComDayCqMailerImplCqMailingServiceInfo] = jsonEncoderOf[ComDayCqMailerImplCqMailingServiceInfo]
}
