package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo._

case class OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties])

object OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoCodecJson: CodecJson[OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo] = CodecJson.derive[OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo]
  implicit val OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoDecoder: EntityDecoder[OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo] = jsonOf[OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo]
  implicit val OrgApacheSlingSettingsImplSlingSettingsServiceImplInfoEncoder: EntityEncoder[OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo] = jsonEncoderOf[OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo]
}
