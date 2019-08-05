package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplReportsReportExportServiceInfo._

case class ComDayCqDamCoreImplReportsReportExportServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplReportsReportExportServiceProperties])

object ComDayCqDamCoreImplReportsReportExportServiceInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplReportsReportExportServiceInfoCodecJson: CodecJson[ComDayCqDamCoreImplReportsReportExportServiceInfo] = CodecJson.derive[ComDayCqDamCoreImplReportsReportExportServiceInfo]
  implicit val ComDayCqDamCoreImplReportsReportExportServiceInfoDecoder: EntityDecoder[ComDayCqDamCoreImplReportsReportExportServiceInfo] = jsonOf[ComDayCqDamCoreImplReportsReportExportServiceInfo]
  implicit val ComDayCqDamCoreImplReportsReportExportServiceInfoEncoder: EntityEncoder[ComDayCqDamCoreImplReportsReportExportServiceInfo] = jsonEncoderOf[ComDayCqDamCoreImplReportsReportExportServiceInfo]
}
