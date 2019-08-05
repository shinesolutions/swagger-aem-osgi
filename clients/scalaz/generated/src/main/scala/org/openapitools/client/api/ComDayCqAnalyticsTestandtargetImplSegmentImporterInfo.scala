package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo._

case class ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties])

object ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo {
  import DateTimeCodecs._

  implicit val ComDayCqAnalyticsTestandtargetImplSegmentImporterInfoCodecJson: CodecJson[ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo] = CodecJson.derive[ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo]
  implicit val ComDayCqAnalyticsTestandtargetImplSegmentImporterInfoDecoder: EntityDecoder[ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo] = jsonOf[ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo]
  implicit val ComDayCqAnalyticsTestandtargetImplSegmentImporterInfoEncoder: EntityEncoder[ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo] = jsonEncoderOf[ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo]
}
