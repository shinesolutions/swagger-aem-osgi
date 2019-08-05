package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEventImplEventingThreadPoolInfo._

case class OrgApacheSlingEventImplEventingThreadPoolInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEventImplEventingThreadPoolProperties])

object OrgApacheSlingEventImplEventingThreadPoolInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEventImplEventingThreadPoolInfoCodecJson: CodecJson[OrgApacheSlingEventImplEventingThreadPoolInfo] = CodecJson.derive[OrgApacheSlingEventImplEventingThreadPoolInfo]
  implicit val OrgApacheSlingEventImplEventingThreadPoolInfoDecoder: EntityDecoder[OrgApacheSlingEventImplEventingThreadPoolInfo] = jsonOf[OrgApacheSlingEventImplEventingThreadPoolInfo]
  implicit val OrgApacheSlingEventImplEventingThreadPoolInfoEncoder: EntityEncoder[OrgApacheSlingEventImplEventingThreadPoolInfo] = jsonEncoderOf[OrgApacheSlingEventImplEventingThreadPoolInfo]
}
