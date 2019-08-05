package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo._

case class OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoCodecJson: CodecJson[OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo] = CodecJson.derive[OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo]
  implicit val OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoDecoder: EntityDecoder[OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo] = jsonOf[OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo]
  implicit val OrgApacheFelixSystemreadyImplServletSystemAliveServletInfoEncoder: EntityEncoder[OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo] = jsonEncoderOf[OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo]
}
