package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo._

case class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoCodecJson: CodecJson[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo] = CodecJson.derive[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo] = jsonOf[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo]
  implicit val ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo] = jsonEncoderOf[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo]
}
