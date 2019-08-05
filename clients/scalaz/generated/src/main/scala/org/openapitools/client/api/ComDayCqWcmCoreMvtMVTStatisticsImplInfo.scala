package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreMvtMVTStatisticsImplInfo._

case class ComDayCqWcmCoreMvtMVTStatisticsImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreMvtMVTStatisticsImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmCoreMvtMVTStatisticsImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreMvtMVTStatisticsImplInfoCodecJson: CodecJson[ComDayCqWcmCoreMvtMVTStatisticsImplInfo] = CodecJson.derive[ComDayCqWcmCoreMvtMVTStatisticsImplInfo]
  implicit val ComDayCqWcmCoreMvtMVTStatisticsImplInfoDecoder: EntityDecoder[ComDayCqWcmCoreMvtMVTStatisticsImplInfo] = jsonOf[ComDayCqWcmCoreMvtMVTStatisticsImplInfo]
  implicit val ComDayCqWcmCoreMvtMVTStatisticsImplInfoEncoder: EntityEncoder[ComDayCqWcmCoreMvtMVTStatisticsImplInfo] = jsonEncoderOf[ComDayCqWcmCoreMvtMVTStatisticsImplInfo]
}
