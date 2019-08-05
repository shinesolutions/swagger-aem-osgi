package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo._

case class ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties])

object ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoCodecJson: CodecJson[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo] = CodecJson.derive[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo]
  implicit val ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoDecoder: EntityDecoder[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo] = jsonOf[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo]
  implicit val ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoEncoder: EntityEncoder[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo] = jsonEncoderOf[ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo]
}
