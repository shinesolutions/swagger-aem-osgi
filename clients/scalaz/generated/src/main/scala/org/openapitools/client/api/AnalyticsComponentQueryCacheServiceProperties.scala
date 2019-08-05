package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AnalyticsComponentQueryCacheServiceProperties._

case class AnalyticsComponentQueryCacheServiceProperties (
  cqAnalyticsComponentQueryCacheSize: Option[ConfigNodePropertyInteger])

object AnalyticsComponentQueryCacheServiceProperties {
  import DateTimeCodecs._

  implicit val AnalyticsComponentQueryCacheServicePropertiesCodecJson: CodecJson[AnalyticsComponentQueryCacheServiceProperties] = CodecJson.derive[AnalyticsComponentQueryCacheServiceProperties]
  implicit val AnalyticsComponentQueryCacheServicePropertiesDecoder: EntityDecoder[AnalyticsComponentQueryCacheServiceProperties] = jsonOf[AnalyticsComponentQueryCacheServiceProperties]
  implicit val AnalyticsComponentQueryCacheServicePropertiesEncoder: EntityEncoder[AnalyticsComponentQueryCacheServiceProperties] = jsonEncoderOf[AnalyticsComponentQueryCacheServiceProperties]
}
