package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixSystemreadyImplComponentsCheckInfo._

case class OrgApacheFelixSystemreadyImplComponentsCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixSystemreadyImplComponentsCheckProperties])

object OrgApacheFelixSystemreadyImplComponentsCheckInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixSystemreadyImplComponentsCheckInfoCodecJson: CodecJson[OrgApacheFelixSystemreadyImplComponentsCheckInfo] = CodecJson.derive[OrgApacheFelixSystemreadyImplComponentsCheckInfo]
  implicit val OrgApacheFelixSystemreadyImplComponentsCheckInfoDecoder: EntityDecoder[OrgApacheFelixSystemreadyImplComponentsCheckInfo] = jsonOf[OrgApacheFelixSystemreadyImplComponentsCheckInfo]
  implicit val OrgApacheFelixSystemreadyImplComponentsCheckInfoEncoder: EntityEncoder[OrgApacheFelixSystemreadyImplComponentsCheckInfo] = jsonEncoderOf[OrgApacheFelixSystemreadyImplComponentsCheckInfo]
}
