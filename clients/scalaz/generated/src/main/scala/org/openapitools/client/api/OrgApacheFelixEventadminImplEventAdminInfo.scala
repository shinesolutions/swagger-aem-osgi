package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixEventadminImplEventAdminInfo._

case class OrgApacheFelixEventadminImplEventAdminInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixEventadminImplEventAdminProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheFelixEventadminImplEventAdminInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixEventadminImplEventAdminInfoCodecJson: CodecJson[OrgApacheFelixEventadminImplEventAdminInfo] = CodecJson.derive[OrgApacheFelixEventadminImplEventAdminInfo]
  implicit val OrgApacheFelixEventadminImplEventAdminInfoDecoder: EntityDecoder[OrgApacheFelixEventadminImplEventAdminInfo] = jsonOf[OrgApacheFelixEventadminImplEventAdminInfo]
  implicit val OrgApacheFelixEventadminImplEventAdminInfoEncoder: EntityEncoder[OrgApacheFelixEventadminImplEventAdminInfo] = jsonEncoderOf[OrgApacheFelixEventadminImplEventAdminInfo]
}
