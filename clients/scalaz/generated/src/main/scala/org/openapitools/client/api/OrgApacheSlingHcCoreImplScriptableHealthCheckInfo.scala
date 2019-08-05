package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingHcCoreImplScriptableHealthCheckInfo._

case class OrgApacheSlingHcCoreImplScriptableHealthCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingHcCoreImplScriptableHealthCheckProperties])

object OrgApacheSlingHcCoreImplScriptableHealthCheckInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingHcCoreImplScriptableHealthCheckInfoCodecJson: CodecJson[OrgApacheSlingHcCoreImplScriptableHealthCheckInfo] = CodecJson.derive[OrgApacheSlingHcCoreImplScriptableHealthCheckInfo]
  implicit val OrgApacheSlingHcCoreImplScriptableHealthCheckInfoDecoder: EntityDecoder[OrgApacheSlingHcCoreImplScriptableHealthCheckInfo] = jsonOf[OrgApacheSlingHcCoreImplScriptableHealthCheckInfo]
  implicit val OrgApacheSlingHcCoreImplScriptableHealthCheckInfoEncoder: EntityEncoder[OrgApacheSlingHcCoreImplScriptableHealthCheckInfo] = jsonEncoderOf[OrgApacheSlingHcCoreImplScriptableHealthCheckInfo]
}
