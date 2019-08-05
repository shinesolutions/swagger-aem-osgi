package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo._

case class ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoCodecJson: CodecJson[ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo] = CodecJson.derive[ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo] = jsonOf[ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo] = jsonEncoderOf[ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo]
}
