package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo._

case class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties])

object ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoCodecJson: CodecJson[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo] = CodecJson.derive[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo]
  implicit val ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoDecoder: EntityDecoder[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo] = jsonOf[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo]
  implicit val ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoEncoder: EntityEncoder[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo] = jsonEncoderOf[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo]
}
