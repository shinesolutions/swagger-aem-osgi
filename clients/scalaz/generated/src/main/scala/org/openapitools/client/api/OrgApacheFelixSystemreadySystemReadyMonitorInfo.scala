package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixSystemreadySystemReadyMonitorInfo._

case class OrgApacheFelixSystemreadySystemReadyMonitorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixSystemreadySystemReadyMonitorProperties])

object OrgApacheFelixSystemreadySystemReadyMonitorInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixSystemreadySystemReadyMonitorInfoCodecJson: CodecJson[OrgApacheFelixSystemreadySystemReadyMonitorInfo] = CodecJson.derive[OrgApacheFelixSystemreadySystemReadyMonitorInfo]
  implicit val OrgApacheFelixSystemreadySystemReadyMonitorInfoDecoder: EntityDecoder[OrgApacheFelixSystemreadySystemReadyMonitorInfo] = jsonOf[OrgApacheFelixSystemreadySystemReadyMonitorInfo]
  implicit val OrgApacheFelixSystemreadySystemReadyMonitorInfoEncoder: EntityEncoder[OrgApacheFelixSystemreadySystemReadyMonitorInfo] = jsonEncoderOf[OrgApacheFelixSystemreadySystemReadyMonitorInfo]
}
