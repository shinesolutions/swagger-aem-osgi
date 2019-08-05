package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletCreateAssetServletInfo._

case class ComDayCqDamCoreImplServletCreateAssetServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletCreateAssetServletProperties])

object ComDayCqDamCoreImplServletCreateAssetServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletCreateAssetServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletCreateAssetServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletCreateAssetServletInfo]
  implicit val ComDayCqDamCoreImplServletCreateAssetServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletCreateAssetServletInfo] = jsonOf[ComDayCqDamCoreImplServletCreateAssetServletInfo]
  implicit val ComDayCqDamCoreImplServletCreateAssetServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletCreateAssetServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletCreateAssetServletInfo]
}
