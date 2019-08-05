package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixHttpSslfilterSslFilterInfo._

case class OrgApacheFelixHttpSslfilterSslFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixHttpSslfilterSslFilterProperties])

object OrgApacheFelixHttpSslfilterSslFilterInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixHttpSslfilterSslFilterInfoCodecJson: CodecJson[OrgApacheFelixHttpSslfilterSslFilterInfo] = CodecJson.derive[OrgApacheFelixHttpSslfilterSslFilterInfo]
  implicit val OrgApacheFelixHttpSslfilterSslFilterInfoDecoder: EntityDecoder[OrgApacheFelixHttpSslfilterSslFilterInfo] = jsonOf[OrgApacheFelixHttpSslfilterSslFilterInfo]
  implicit val OrgApacheFelixHttpSslfilterSslFilterInfoEncoder: EntityEncoder[OrgApacheFelixHttpSslfilterSslFilterInfo] = jsonEncoderOf[OrgApacheFelixHttpSslfilterSslFilterInfo]
}
