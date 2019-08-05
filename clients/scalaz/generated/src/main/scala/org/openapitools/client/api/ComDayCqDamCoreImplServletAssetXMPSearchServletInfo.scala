package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletAssetXMPSearchServletInfo._

case class ComDayCqDamCoreImplServletAssetXMPSearchServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletAssetXMPSearchServletProperties])

object ComDayCqDamCoreImplServletAssetXMPSearchServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletAssetXMPSearchServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletAssetXMPSearchServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletAssetXMPSearchServletInfo]
  implicit val ComDayCqDamCoreImplServletAssetXMPSearchServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletAssetXMPSearchServletInfo] = jsonOf[ComDayCqDamCoreImplServletAssetXMPSearchServletInfo]
  implicit val ComDayCqDamCoreImplServletAssetXMPSearchServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletAssetXMPSearchServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletAssetXMPSearchServletInfo]
}
