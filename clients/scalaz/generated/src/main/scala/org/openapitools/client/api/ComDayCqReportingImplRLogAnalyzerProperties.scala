package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReportingImplRLogAnalyzerProperties._

case class ComDayCqReportingImplRLogAnalyzerProperties (
  requestLogOutput: Option[ConfigNodePropertyString])

object ComDayCqReportingImplRLogAnalyzerProperties {
  import DateTimeCodecs._

  implicit val ComDayCqReportingImplRLogAnalyzerPropertiesCodecJson: CodecJson[ComDayCqReportingImplRLogAnalyzerProperties] = CodecJson.derive[ComDayCqReportingImplRLogAnalyzerProperties]
  implicit val ComDayCqReportingImplRLogAnalyzerPropertiesDecoder: EntityDecoder[ComDayCqReportingImplRLogAnalyzerProperties] = jsonOf[ComDayCqReportingImplRLogAnalyzerProperties]
  implicit val ComDayCqReportingImplRLogAnalyzerPropertiesEncoder: EntityEncoder[ComDayCqReportingImplRLogAnalyzerProperties] = jsonEncoderOf[ComDayCqReportingImplRLogAnalyzerProperties]
}
