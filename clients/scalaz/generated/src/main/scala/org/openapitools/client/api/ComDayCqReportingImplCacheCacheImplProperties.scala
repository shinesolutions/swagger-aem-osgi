package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReportingImplCacheCacheImplProperties._

case class ComDayCqReportingImplCacheCacheImplProperties (
  repcacheEnable: Option[ConfigNodePropertyBoolean],
repcacheTtl: Option[ConfigNodePropertyInteger],
repcacheMax: Option[ConfigNodePropertyInteger])

object ComDayCqReportingImplCacheCacheImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqReportingImplCacheCacheImplPropertiesCodecJson: CodecJson[ComDayCqReportingImplCacheCacheImplProperties] = CodecJson.derive[ComDayCqReportingImplCacheCacheImplProperties]
  implicit val ComDayCqReportingImplCacheCacheImplPropertiesDecoder: EntityDecoder[ComDayCqReportingImplCacheCacheImplProperties] = jsonOf[ComDayCqReportingImplCacheCacheImplProperties]
  implicit val ComDayCqReportingImplCacheCacheImplPropertiesEncoder: EntityEncoder[ComDayCqReportingImplCacheCacheImplProperties] = jsonEncoderOf[ComDayCqReportingImplCacheCacheImplProperties]
}
