package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCommonsUtilImplAssetCacheImplInfo._

case class ComDayCqDamCommonsUtilImplAssetCacheImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCommonsUtilImplAssetCacheImplProperties])

object ComDayCqDamCommonsUtilImplAssetCacheImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCommonsUtilImplAssetCacheImplInfoCodecJson: CodecJson[ComDayCqDamCommonsUtilImplAssetCacheImplInfo] = CodecJson.derive[ComDayCqDamCommonsUtilImplAssetCacheImplInfo]
  implicit val ComDayCqDamCommonsUtilImplAssetCacheImplInfoDecoder: EntityDecoder[ComDayCqDamCommonsUtilImplAssetCacheImplInfo] = jsonOf[ComDayCqDamCommonsUtilImplAssetCacheImplInfo]
  implicit val ComDayCqDamCommonsUtilImplAssetCacheImplInfoEncoder: EntityEncoder[ComDayCqDamCommonsUtilImplAssetCacheImplInfo] = jsonEncoderOf[ComDayCqDamCommonsUtilImplAssetCacheImplInfo]
}
