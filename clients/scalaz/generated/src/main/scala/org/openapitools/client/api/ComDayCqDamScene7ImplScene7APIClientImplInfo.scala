package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamScene7ImplScene7APIClientImplInfo._

case class ComDayCqDamScene7ImplScene7APIClientImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamScene7ImplScene7APIClientImplProperties])

object ComDayCqDamScene7ImplScene7APIClientImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamScene7ImplScene7APIClientImplInfoCodecJson: CodecJson[ComDayCqDamScene7ImplScene7APIClientImplInfo] = CodecJson.derive[ComDayCqDamScene7ImplScene7APIClientImplInfo]
  implicit val ComDayCqDamScene7ImplScene7APIClientImplInfoDecoder: EntityDecoder[ComDayCqDamScene7ImplScene7APIClientImplInfo] = jsonOf[ComDayCqDamScene7ImplScene7APIClientImplInfo]
  implicit val ComDayCqDamScene7ImplScene7APIClientImplInfoEncoder: EntityEncoder[ComDayCqDamScene7ImplScene7APIClientImplInfo] = jsonEncoderOf[ComDayCqDamScene7ImplScene7APIClientImplInfo]
}
