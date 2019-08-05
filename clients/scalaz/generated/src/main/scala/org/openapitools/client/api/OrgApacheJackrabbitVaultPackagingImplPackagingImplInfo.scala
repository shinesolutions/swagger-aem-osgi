package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo._

case class OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties])

object OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo {
  import DateTimeCodecs._

  implicit val OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoCodecJson: CodecJson[OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo] = CodecJson.derive[OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo]
  implicit val OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoDecoder: EntityDecoder[OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo] = jsonOf[OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo]
  implicit val OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoEncoder: EntityEncoder[OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo] = jsonEncoderOf[OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo]
}
