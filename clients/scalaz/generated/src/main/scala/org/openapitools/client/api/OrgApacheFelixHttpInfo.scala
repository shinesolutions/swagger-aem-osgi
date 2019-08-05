package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixHttpInfo._

case class OrgApacheFelixHttpInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixHttpProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheFelixHttpInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixHttpInfoCodecJson: CodecJson[OrgApacheFelixHttpInfo] = CodecJson.derive[OrgApacheFelixHttpInfo]
  implicit val OrgApacheFelixHttpInfoDecoder: EntityDecoder[OrgApacheFelixHttpInfo] = jsonOf[OrgApacheFelixHttpInfo]
  implicit val OrgApacheFelixHttpInfoEncoder: EntityEncoder[OrgApacheFelixHttpInfo] = jsonEncoderOf[OrgApacheFelixHttpInfo]
}
