package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingServletsGetDefaultGetServletInfo._

case class OrgApacheSlingServletsGetDefaultGetServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingServletsGetDefaultGetServletProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingServletsGetDefaultGetServletInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingServletsGetDefaultGetServletInfoCodecJson: CodecJson[OrgApacheSlingServletsGetDefaultGetServletInfo] = CodecJson.derive[OrgApacheSlingServletsGetDefaultGetServletInfo]
  implicit val OrgApacheSlingServletsGetDefaultGetServletInfoDecoder: EntityDecoder[OrgApacheSlingServletsGetDefaultGetServletInfo] = jsonOf[OrgApacheSlingServletsGetDefaultGetServletInfo]
  implicit val OrgApacheSlingServletsGetDefaultGetServletInfoEncoder: EntityEncoder[OrgApacheSlingServletsGetDefaultGetServletInfo] = jsonEncoderOf[OrgApacheSlingServletsGetDefaultGetServletInfo]
}
