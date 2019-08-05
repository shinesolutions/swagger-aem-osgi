package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCommonsLogLogManagerInfo._

case class OrgApacheSlingCommonsLogLogManagerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingCommonsLogLogManagerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingCommonsLogLogManagerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCommonsLogLogManagerInfoCodecJson: CodecJson[OrgApacheSlingCommonsLogLogManagerInfo] = CodecJson.derive[OrgApacheSlingCommonsLogLogManagerInfo]
  implicit val OrgApacheSlingCommonsLogLogManagerInfoDecoder: EntityDecoder[OrgApacheSlingCommonsLogLogManagerInfo] = jsonOf[OrgApacheSlingCommonsLogLogManagerInfo]
  implicit val OrgApacheSlingCommonsLogLogManagerInfoEncoder: EntityEncoder[OrgApacheSlingCommonsLogLogManagerInfo] = jsonEncoderOf[OrgApacheSlingCommonsLogLogManagerInfo]
}
