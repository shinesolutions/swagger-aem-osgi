package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplReportsReportPurgeServiceInfo._

case class ComDayCqDamCoreImplReportsReportPurgeServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplReportsReportPurgeServiceProperties])

object ComDayCqDamCoreImplReportsReportPurgeServiceInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplReportsReportPurgeServiceInfoCodecJson: CodecJson[ComDayCqDamCoreImplReportsReportPurgeServiceInfo] = CodecJson.derive[ComDayCqDamCoreImplReportsReportPurgeServiceInfo]
  implicit val ComDayCqDamCoreImplReportsReportPurgeServiceInfoDecoder: EntityDecoder[ComDayCqDamCoreImplReportsReportPurgeServiceInfo] = jsonOf[ComDayCqDamCoreImplReportsReportPurgeServiceInfo]
  implicit val ComDayCqDamCoreImplReportsReportPurgeServiceInfoEncoder: EntityEncoder[ComDayCqDamCoreImplReportsReportPurgeServiceInfo] = jsonEncoderOf[ComDayCqDamCoreImplReportsReportPurgeServiceInfo]
}
