package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReportingImplCacheCacheImplInfo._

case class ComDayCqReportingImplCacheCacheImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReportingImplCacheCacheImplProperties])

object ComDayCqReportingImplCacheCacheImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReportingImplCacheCacheImplInfoCodecJson: CodecJson[ComDayCqReportingImplCacheCacheImplInfo] = CodecJson.derive[ComDayCqReportingImplCacheCacheImplInfo]
  implicit val ComDayCqReportingImplCacheCacheImplInfoDecoder: EntityDecoder[ComDayCqReportingImplCacheCacheImplInfo] = jsonOf[ComDayCqReportingImplCacheCacheImplInfo]
  implicit val ComDayCqReportingImplCacheCacheImplInfoEncoder: EntityEncoder[ComDayCqReportingImplCacheCacheImplInfo] = jsonEncoderOf[ComDayCqReportingImplCacheCacheImplInfo]
}
