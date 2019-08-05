package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo._

case class ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties])

object ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoCodecJson: CodecJson[ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo] = CodecJson.derive[ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo] = jsonOf[ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo] = jsonEncoderOf[ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo]
}
