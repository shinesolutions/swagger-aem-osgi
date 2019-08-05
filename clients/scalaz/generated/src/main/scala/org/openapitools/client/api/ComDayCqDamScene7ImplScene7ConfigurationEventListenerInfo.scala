package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo._

case class ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoCodecJson: CodecJson[ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo] = CodecJson.derive[ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo]
  implicit val ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoDecoder: EntityDecoder[ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo] = jsonOf[ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo]
  implicit val ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoEncoder: EntityEncoder[ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo] = jsonEncoderOf[ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo]
}
