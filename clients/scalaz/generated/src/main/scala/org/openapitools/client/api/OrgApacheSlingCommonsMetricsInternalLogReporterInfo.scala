package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCommonsMetricsInternalLogReporterInfo._

case class OrgApacheSlingCommonsMetricsInternalLogReporterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingCommonsMetricsInternalLogReporterProperties])

object OrgApacheSlingCommonsMetricsInternalLogReporterInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCommonsMetricsInternalLogReporterInfoCodecJson: CodecJson[OrgApacheSlingCommonsMetricsInternalLogReporterInfo] = CodecJson.derive[OrgApacheSlingCommonsMetricsInternalLogReporterInfo]
  implicit val OrgApacheSlingCommonsMetricsInternalLogReporterInfoDecoder: EntityDecoder[OrgApacheSlingCommonsMetricsInternalLogReporterInfo] = jsonOf[OrgApacheSlingCommonsMetricsInternalLogReporterInfo]
  implicit val OrgApacheSlingCommonsMetricsInternalLogReporterInfoEncoder: EntityEncoder[OrgApacheSlingCommonsMetricsInternalLogReporterInfo] = jsonEncoderOf[OrgApacheSlingCommonsMetricsInternalLogReporterInfo]
}
