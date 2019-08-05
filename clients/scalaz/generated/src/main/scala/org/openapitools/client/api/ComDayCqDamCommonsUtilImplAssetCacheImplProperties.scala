package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCommonsUtilImplAssetCacheImplProperties._

case class ComDayCqDamCommonsUtilImplAssetCacheImplProperties (
  largeFileMin: Option[ConfigNodePropertyInteger],
cacheApply: Option[ConfigNodePropertyBoolean],
mimeTypes: Option[ConfigNodePropertyArray])

object ComDayCqDamCommonsUtilImplAssetCacheImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesCodecJson: CodecJson[ComDayCqDamCommonsUtilImplAssetCacheImplProperties] = CodecJson.derive[ComDayCqDamCommonsUtilImplAssetCacheImplProperties]
  implicit val ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesDecoder: EntityDecoder[ComDayCqDamCommonsUtilImplAssetCacheImplProperties] = jsonOf[ComDayCqDamCommonsUtilImplAssetCacheImplProperties]
  implicit val ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesEncoder: EntityEncoder[ComDayCqDamCommonsUtilImplAssetCacheImplProperties] = jsonEncoderOf[ComDayCqDamCommonsUtilImplAssetCacheImplProperties]
}
