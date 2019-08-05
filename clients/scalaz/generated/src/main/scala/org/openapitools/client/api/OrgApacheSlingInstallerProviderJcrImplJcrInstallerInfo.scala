package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo._

case class OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoCodecJson: CodecJson[OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo] = CodecJson.derive[OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo]
  implicit val OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoDecoder: EntityDecoder[OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo] = jsonOf[OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo]
  implicit val OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoEncoder: EntityEncoder[OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo] = jsonEncoderOf[OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo]
}
