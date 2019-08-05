package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixSystemreadyImplServicesCheckInfo._

case class OrgApacheFelixSystemreadyImplServicesCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixSystemreadyImplServicesCheckProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheFelixSystemreadyImplServicesCheckInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixSystemreadyImplServicesCheckInfoCodecJson: CodecJson[OrgApacheFelixSystemreadyImplServicesCheckInfo] = CodecJson.derive[OrgApacheFelixSystemreadyImplServicesCheckInfo]
  implicit val OrgApacheFelixSystemreadyImplServicesCheckInfoDecoder: EntityDecoder[OrgApacheFelixSystemreadyImplServicesCheckInfo] = jsonOf[OrgApacheFelixSystemreadyImplServicesCheckInfo]
  implicit val OrgApacheFelixSystemreadyImplServicesCheckInfoEncoder: EntityEncoder[OrgApacheFelixSystemreadyImplServicesCheckInfo] = jsonEncoderOf[OrgApacheFelixSystemreadyImplServicesCheckInfo]
}
