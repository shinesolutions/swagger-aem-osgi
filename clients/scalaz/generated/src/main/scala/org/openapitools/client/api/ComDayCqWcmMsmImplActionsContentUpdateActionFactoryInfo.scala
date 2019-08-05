package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo._

case class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfoCodecJson: CodecJson[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo] = CodecJson.derive[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo] = jsonOf[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo] = jsonEncoderOf[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo]
}
