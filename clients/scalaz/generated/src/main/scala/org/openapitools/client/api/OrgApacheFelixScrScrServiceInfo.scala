package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixScrScrServiceInfo._

case class OrgApacheFelixScrScrServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixScrScrServiceProperties])

object OrgApacheFelixScrScrServiceInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixScrScrServiceInfoCodecJson: CodecJson[OrgApacheFelixScrScrServiceInfo] = CodecJson.derive[OrgApacheFelixScrScrServiceInfo]
  implicit val OrgApacheFelixScrScrServiceInfoDecoder: EntityDecoder[OrgApacheFelixScrScrServiceInfo] = jsonOf[OrgApacheFelixScrScrServiceInfo]
  implicit val OrgApacheFelixScrScrServiceInfoEncoder: EntityEncoder[OrgApacheFelixScrScrServiceInfo] = jsonEncoderOf[OrgApacheFelixScrScrServiceInfo]
}
