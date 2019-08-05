package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamInddProcessINDDMediaExtractProcessInfo._

case class ComDayCqDamInddProcessINDDMediaExtractProcessInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamInddProcessINDDMediaExtractProcessProperties])

object ComDayCqDamInddProcessINDDMediaExtractProcessInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamInddProcessINDDMediaExtractProcessInfoCodecJson: CodecJson[ComDayCqDamInddProcessINDDMediaExtractProcessInfo] = CodecJson.derive[ComDayCqDamInddProcessINDDMediaExtractProcessInfo]
  implicit val ComDayCqDamInddProcessINDDMediaExtractProcessInfoDecoder: EntityDecoder[ComDayCqDamInddProcessINDDMediaExtractProcessInfo] = jsonOf[ComDayCqDamInddProcessINDDMediaExtractProcessInfo]
  implicit val ComDayCqDamInddProcessINDDMediaExtractProcessInfoEncoder: EntityEncoder[ComDayCqDamInddProcessINDDMediaExtractProcessInfo] = jsonEncoderOf[ComDayCqDamInddProcessINDDMediaExtractProcessInfo]
}
