package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingI18nImplJcrResourceBundleProviderInfo._

case class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingI18nImplJcrResourceBundleProviderProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingI18nImplJcrResourceBundleProviderInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingI18nImplJcrResourceBundleProviderInfoCodecJson: CodecJson[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo] = CodecJson.derive[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo]
  implicit val OrgApacheSlingI18nImplJcrResourceBundleProviderInfoDecoder: EntityDecoder[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo] = jsonOf[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo]
  implicit val OrgApacheSlingI18nImplJcrResourceBundleProviderInfoEncoder: EntityEncoder[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo] = jsonEncoderOf[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo]
}
