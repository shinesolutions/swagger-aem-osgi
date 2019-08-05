package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo._

case class OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfoCodecJson: CodecJson[OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo] = CodecJson.derive[OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo]
  implicit val OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfoDecoder: EntityDecoder[OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo] = jsonOf[OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo]
  implicit val OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfoEncoder: EntityEncoder[OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo] = jsonEncoderOf[OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo]
}
