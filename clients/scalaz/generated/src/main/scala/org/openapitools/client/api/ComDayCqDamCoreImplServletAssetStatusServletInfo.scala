package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletAssetStatusServletInfo._

case class ComDayCqDamCoreImplServletAssetStatusServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletAssetStatusServletProperties])

object ComDayCqDamCoreImplServletAssetStatusServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletAssetStatusServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletAssetStatusServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletAssetStatusServletInfo]
  implicit val ComDayCqDamCoreImplServletAssetStatusServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletAssetStatusServletInfo] = jsonOf[ComDayCqDamCoreImplServletAssetStatusServletInfo]
  implicit val ComDayCqDamCoreImplServletAssetStatusServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletAssetStatusServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletAssetStatusServletInfo]
}
