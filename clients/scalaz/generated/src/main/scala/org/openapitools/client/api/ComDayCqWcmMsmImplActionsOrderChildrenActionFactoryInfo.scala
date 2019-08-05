package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo._

case class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoCodecJson: CodecJson[ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo] = CodecJson.derive[ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo] = jsonOf[ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo] = jsonEncoderOf[ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo]
}
