package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqStatisticsImplStatisticsServiceImplInfo._

case class ComDayCqStatisticsImplStatisticsServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqStatisticsImplStatisticsServiceImplProperties])

object ComDayCqStatisticsImplStatisticsServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqStatisticsImplStatisticsServiceImplInfoCodecJson: CodecJson[ComDayCqStatisticsImplStatisticsServiceImplInfo] = CodecJson.derive[ComDayCqStatisticsImplStatisticsServiceImplInfo]
  implicit val ComDayCqStatisticsImplStatisticsServiceImplInfoDecoder: EntityDecoder[ComDayCqStatisticsImplStatisticsServiceImplInfo] = jsonOf[ComDayCqStatisticsImplStatisticsServiceImplInfo]
  implicit val ComDayCqStatisticsImplStatisticsServiceImplInfoEncoder: EntityEncoder[ComDayCqStatisticsImplStatisticsServiceImplInfo] = jsonEncoderOf[ComDayCqStatisticsImplStatisticsServiceImplInfo]
}
