package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo._

case class OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties])

object OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoCodecJson: CodecJson[OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo] = CodecJson.derive[OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo]
  implicit val OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoDecoder: EntityDecoder[OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo] = jsonOf[OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo]
  implicit val OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoEncoder: EntityEncoder[OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo] = jsonEncoderOf[OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo]
}
