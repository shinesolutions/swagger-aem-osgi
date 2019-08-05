package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo._

case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties])

object OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoCodecJson: CodecJson[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo] = CodecJson.derive[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo]
  implicit val OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoDecoder: EntityDecoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo] = jsonOf[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo]
  implicit val OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoEncoder: EntityEncoder[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo] = jsonEncoderOf[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo]
}
