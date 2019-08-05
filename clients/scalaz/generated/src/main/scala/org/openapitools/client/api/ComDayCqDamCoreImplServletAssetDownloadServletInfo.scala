package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletAssetDownloadServletInfo._

case class ComDayCqDamCoreImplServletAssetDownloadServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletAssetDownloadServletProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqDamCoreImplServletAssetDownloadServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletAssetDownloadServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletAssetDownloadServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletAssetDownloadServletInfo]
  implicit val ComDayCqDamCoreImplServletAssetDownloadServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletAssetDownloadServletInfo] = jsonOf[ComDayCqDamCoreImplServletAssetDownloadServletInfo]
  implicit val ComDayCqDamCoreImplServletAssetDownloadServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletAssetDownloadServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletAssetDownloadServletInfo]
}
