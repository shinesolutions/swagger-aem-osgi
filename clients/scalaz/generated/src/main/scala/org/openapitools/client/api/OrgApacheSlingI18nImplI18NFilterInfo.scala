package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingI18nImplI18NFilterInfo._

case class OrgApacheSlingI18nImplI18NFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingI18nImplI18NFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingI18nImplI18NFilterInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingI18nImplI18NFilterInfoCodecJson: CodecJson[OrgApacheSlingI18nImplI18NFilterInfo] = CodecJson.derive[OrgApacheSlingI18nImplI18NFilterInfo]
  implicit val OrgApacheSlingI18nImplI18NFilterInfoDecoder: EntityDecoder[OrgApacheSlingI18nImplI18NFilterInfo] = jsonOf[OrgApacheSlingI18nImplI18NFilterInfo]
  implicit val OrgApacheSlingI18nImplI18NFilterInfoEncoder: EntityEncoder[OrgApacheSlingI18nImplI18NFilterInfo] = jsonEncoderOf[OrgApacheSlingI18nImplI18NFilterInfo]
}
