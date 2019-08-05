package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo._

case class OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoCodecJson: CodecJson[OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo] = CodecJson.derive[OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo]
  implicit val OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoDecoder: EntityDecoder[OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo] = jsonOf[OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo]
  implicit val OrgApacheFelixSystemreadyImplServletSystemReadyServletInfoEncoder: EntityEncoder[OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo] = jsonEncoderOf[OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo]
}
