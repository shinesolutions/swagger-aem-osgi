package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingHcCoreImplCompositeHealthCheckInfo._

case class OrgApacheSlingHcCoreImplCompositeHealthCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingHcCoreImplCompositeHealthCheckProperties])

object OrgApacheSlingHcCoreImplCompositeHealthCheckInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingHcCoreImplCompositeHealthCheckInfoCodecJson: CodecJson[OrgApacheSlingHcCoreImplCompositeHealthCheckInfo] = CodecJson.derive[OrgApacheSlingHcCoreImplCompositeHealthCheckInfo]
  implicit val OrgApacheSlingHcCoreImplCompositeHealthCheckInfoDecoder: EntityDecoder[OrgApacheSlingHcCoreImplCompositeHealthCheckInfo] = jsonOf[OrgApacheSlingHcCoreImplCompositeHealthCheckInfo]
  implicit val OrgApacheSlingHcCoreImplCompositeHealthCheckInfoEncoder: EntityEncoder[OrgApacheSlingHcCoreImplCompositeHealthCheckInfo] = jsonEncoderOf[OrgApacheSlingHcCoreImplCompositeHealthCheckInfo]
}
