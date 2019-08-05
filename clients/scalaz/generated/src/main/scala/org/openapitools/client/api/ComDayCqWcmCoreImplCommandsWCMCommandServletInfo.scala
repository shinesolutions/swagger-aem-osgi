package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplCommandsWCMCommandServletInfo._

case class ComDayCqWcmCoreImplCommandsWCMCommandServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplCommandsWCMCommandServletProperties])

object ComDayCqWcmCoreImplCommandsWCMCommandServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplCommandsWCMCommandServletInfoCodecJson: CodecJson[ComDayCqWcmCoreImplCommandsWCMCommandServletInfo] = CodecJson.derive[ComDayCqWcmCoreImplCommandsWCMCommandServletInfo]
  implicit val ComDayCqWcmCoreImplCommandsWCMCommandServletInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplCommandsWCMCommandServletInfo] = jsonOf[ComDayCqWcmCoreImplCommandsWCMCommandServletInfo]
  implicit val ComDayCqWcmCoreImplCommandsWCMCommandServletInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplCommandsWCMCommandServletInfo] = jsonEncoderOf[ComDayCqWcmCoreImplCommandsWCMCommandServletInfo]
}
