package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReportingImplRLogAnalyzerInfo._

case class ComDayCqReportingImplRLogAnalyzerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReportingImplRLogAnalyzerProperties])

object ComDayCqReportingImplRLogAnalyzerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReportingImplRLogAnalyzerInfoCodecJson: CodecJson[ComDayCqReportingImplRLogAnalyzerInfo] = CodecJson.derive[ComDayCqReportingImplRLogAnalyzerInfo]
  implicit val ComDayCqReportingImplRLogAnalyzerInfoDecoder: EntityDecoder[ComDayCqReportingImplRLogAnalyzerInfo] = jsonOf[ComDayCqReportingImplRLogAnalyzerInfo]
  implicit val ComDayCqReportingImplRLogAnalyzerInfoEncoder: EntityEncoder[ComDayCqReportingImplRLogAnalyzerInfo] = jsonEncoderOf[ComDayCqReportingImplRLogAnalyzerInfo]
}
