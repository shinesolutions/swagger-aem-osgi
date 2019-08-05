package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingServletsResolverSlingServletResolverInfo._

case class OrgApacheSlingServletsResolverSlingServletResolverInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingServletsResolverSlingServletResolverProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingServletsResolverSlingServletResolverInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingServletsResolverSlingServletResolverInfoCodecJson: CodecJson[OrgApacheSlingServletsResolverSlingServletResolverInfo] = CodecJson.derive[OrgApacheSlingServletsResolverSlingServletResolverInfo]
  implicit val OrgApacheSlingServletsResolverSlingServletResolverInfoDecoder: EntityDecoder[OrgApacheSlingServletsResolverSlingServletResolverInfo] = jsonOf[OrgApacheSlingServletsResolverSlingServletResolverInfo]
  implicit val OrgApacheSlingServletsResolverSlingServletResolverInfoEncoder: EntityEncoder[OrgApacheSlingServletsResolverSlingServletResolverInfo] = jsonEncoderOf[OrgApacheSlingServletsResolverSlingServletResolverInfo]
}
