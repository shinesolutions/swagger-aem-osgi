package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingJcrRepoinitRepositoryInitializerInfo._

case class OrgApacheSlingJcrRepoinitRepositoryInitializerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingJcrRepoinitRepositoryInitializerProperties])

object OrgApacheSlingJcrRepoinitRepositoryInitializerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingJcrRepoinitRepositoryInitializerInfoCodecJson: CodecJson[OrgApacheSlingJcrRepoinitRepositoryInitializerInfo] = CodecJson.derive[OrgApacheSlingJcrRepoinitRepositoryInitializerInfo]
  implicit val OrgApacheSlingJcrRepoinitRepositoryInitializerInfoDecoder: EntityDecoder[OrgApacheSlingJcrRepoinitRepositoryInitializerInfo] = jsonOf[OrgApacheSlingJcrRepoinitRepositoryInitializerInfo]
  implicit val OrgApacheSlingJcrRepoinitRepositoryInitializerInfoEncoder: EntityEncoder[OrgApacheSlingJcrRepoinitRepositoryInitializerInfo] = jsonEncoderOf[OrgApacheSlingJcrRepoinitRepositoryInitializerInfo]
}
