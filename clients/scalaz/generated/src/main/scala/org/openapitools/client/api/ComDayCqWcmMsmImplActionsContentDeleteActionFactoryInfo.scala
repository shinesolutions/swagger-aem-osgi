package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo._

case class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoCodecJson: CodecJson[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo] = CodecJson.derive[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo] = jsonOf[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo] = jsonEncoderOf[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo]
}
