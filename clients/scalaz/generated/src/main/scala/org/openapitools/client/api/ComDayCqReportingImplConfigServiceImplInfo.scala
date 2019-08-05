package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReportingImplConfigServiceImplInfo._

case class ComDayCqReportingImplConfigServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReportingImplConfigServiceImplProperties])

object ComDayCqReportingImplConfigServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReportingImplConfigServiceImplInfoCodecJson: CodecJson[ComDayCqReportingImplConfigServiceImplInfo] = CodecJson.derive[ComDayCqReportingImplConfigServiceImplInfo]
  implicit val ComDayCqReportingImplConfigServiceImplInfoDecoder: EntityDecoder[ComDayCqReportingImplConfigServiceImplInfo] = jsonOf[ComDayCqReportingImplConfigServiceImplInfo]
  implicit val ComDayCqReportingImplConfigServiceImplInfoEncoder: EntityEncoder[ComDayCqReportingImplConfigServiceImplInfo] = jsonEncoderOf[ComDayCqReportingImplConfigServiceImplInfo]
}
