package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCaconfigImplConfigurationResolverImplInfo._

case class OrgApacheSlingCaconfigImplConfigurationResolverImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingCaconfigImplConfigurationResolverImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingCaconfigImplConfigurationResolverImplInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCaconfigImplConfigurationResolverImplInfoCodecJson: CodecJson[OrgApacheSlingCaconfigImplConfigurationResolverImplInfo] = CodecJson.derive[OrgApacheSlingCaconfigImplConfigurationResolverImplInfo]
  implicit val OrgApacheSlingCaconfigImplConfigurationResolverImplInfoDecoder: EntityDecoder[OrgApacheSlingCaconfigImplConfigurationResolverImplInfo] = jsonOf[OrgApacheSlingCaconfigImplConfigurationResolverImplInfo]
  implicit val OrgApacheSlingCaconfigImplConfigurationResolverImplInfoEncoder: EntityEncoder[OrgApacheSlingCaconfigImplConfigurationResolverImplInfo] = jsonEncoderOf[OrgApacheSlingCaconfigImplConfigurationResolverImplInfo]
}
