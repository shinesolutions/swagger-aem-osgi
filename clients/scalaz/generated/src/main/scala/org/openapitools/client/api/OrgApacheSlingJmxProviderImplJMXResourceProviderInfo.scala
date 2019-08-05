package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingJmxProviderImplJMXResourceProviderInfo._

case class OrgApacheSlingJmxProviderImplJMXResourceProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingJmxProviderImplJMXResourceProviderProperties])

object OrgApacheSlingJmxProviderImplJMXResourceProviderInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingJmxProviderImplJMXResourceProviderInfoCodecJson: CodecJson[OrgApacheSlingJmxProviderImplJMXResourceProviderInfo] = CodecJson.derive[OrgApacheSlingJmxProviderImplJMXResourceProviderInfo]
  implicit val OrgApacheSlingJmxProviderImplJMXResourceProviderInfoDecoder: EntityDecoder[OrgApacheSlingJmxProviderImplJMXResourceProviderInfo] = jsonOf[OrgApacheSlingJmxProviderImplJMXResourceProviderInfo]
  implicit val OrgApacheSlingJmxProviderImplJMXResourceProviderInfoEncoder: EntityEncoder[OrgApacheSlingJmxProviderImplJMXResourceProviderInfo] = jsonEncoderOf[OrgApacheSlingJmxProviderImplJMXResourceProviderInfo]
}
