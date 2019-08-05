package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo._

case class OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties])

object OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoCodecJson: CodecJson[OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo] = CodecJson.derive[OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo]
  implicit val OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoDecoder: EntityDecoder[OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo] = jsonOf[OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo]
  implicit val OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoEncoder: EntityEncoder[OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo] = jsonEncoderOf[OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo]
}
