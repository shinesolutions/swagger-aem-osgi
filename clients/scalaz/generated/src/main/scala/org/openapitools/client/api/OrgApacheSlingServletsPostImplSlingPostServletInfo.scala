package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingServletsPostImplSlingPostServletInfo._

case class OrgApacheSlingServletsPostImplSlingPostServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingServletsPostImplSlingPostServletProperties])

object OrgApacheSlingServletsPostImplSlingPostServletInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingServletsPostImplSlingPostServletInfoCodecJson: CodecJson[OrgApacheSlingServletsPostImplSlingPostServletInfo] = CodecJson.derive[OrgApacheSlingServletsPostImplSlingPostServletInfo]
  implicit val OrgApacheSlingServletsPostImplSlingPostServletInfoDecoder: EntityDecoder[OrgApacheSlingServletsPostImplSlingPostServletInfo] = jsonOf[OrgApacheSlingServletsPostImplSlingPostServletInfo]
  implicit val OrgApacheSlingServletsPostImplSlingPostServletInfoEncoder: EntityEncoder[OrgApacheSlingServletsPostImplSlingPostServletInfo] = jsonEncoderOf[OrgApacheSlingServletsPostImplSlingPostServletInfo]
}
