package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo._

case class ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamScene7ImplScene7DamChangeEventListenerInfoCodecJson: CodecJson[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo] = CodecJson.derive[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo]
  implicit val ComDayCqDamScene7ImplScene7DamChangeEventListenerInfoDecoder: EntityDecoder[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo] = jsonOf[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo]
  implicit val ComDayCqDamScene7ImplScene7DamChangeEventListenerInfoEncoder: EntityEncoder[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo] = jsonEncoderOf[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo]
}
