package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo._

case class ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoCodecJson: CodecJson[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo] = CodecJson.derive[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo] = jsonOf[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo] = jsonEncoderOf[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo]
}
