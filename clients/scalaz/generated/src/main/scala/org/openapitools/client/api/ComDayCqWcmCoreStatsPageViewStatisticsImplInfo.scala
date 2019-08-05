package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreStatsPageViewStatisticsImplInfo._

case class ComDayCqWcmCoreStatsPageViewStatisticsImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreStatsPageViewStatisticsImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmCoreStatsPageViewStatisticsImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreStatsPageViewStatisticsImplInfoCodecJson: CodecJson[ComDayCqWcmCoreStatsPageViewStatisticsImplInfo] = CodecJson.derive[ComDayCqWcmCoreStatsPageViewStatisticsImplInfo]
  implicit val ComDayCqWcmCoreStatsPageViewStatisticsImplInfoDecoder: EntityDecoder[ComDayCqWcmCoreStatsPageViewStatisticsImplInfo] = jsonOf[ComDayCqWcmCoreStatsPageViewStatisticsImplInfo]
  implicit val ComDayCqWcmCoreStatsPageViewStatisticsImplInfoEncoder: EntityEncoder[ComDayCqWcmCoreStatsPageViewStatisticsImplInfo] = jsonEncoderOf[ComDayCqWcmCoreStatsPageViewStatisticsImplInfo]
}
