package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AnalyticsComponentQueryCacheServiceInfo._

case class AnalyticsComponentQueryCacheServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[AnalyticsComponentQueryCacheServiceProperties])

object AnalyticsComponentQueryCacheServiceInfo {
  import DateTimeCodecs._

  implicit val AnalyticsComponentQueryCacheServiceInfoCodecJson: CodecJson[AnalyticsComponentQueryCacheServiceInfo] = CodecJson.derive[AnalyticsComponentQueryCacheServiceInfo]
  implicit val AnalyticsComponentQueryCacheServiceInfoDecoder: EntityDecoder[AnalyticsComponentQueryCacheServiceInfo] = jsonOf[AnalyticsComponentQueryCacheServiceInfo]
  implicit val AnalyticsComponentQueryCacheServiceInfoEncoder: EntityEncoder[AnalyticsComponentQueryCacheServiceInfo] = jsonEncoderOf[AnalyticsComponentQueryCacheServiceInfo]
}
