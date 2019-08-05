package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingFeatureflagsFeatureInfo._

case class OrgApacheSlingFeatureflagsFeatureInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingFeatureflagsFeatureProperties])

object OrgApacheSlingFeatureflagsFeatureInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingFeatureflagsFeatureInfoCodecJson: CodecJson[OrgApacheSlingFeatureflagsFeatureInfo] = CodecJson.derive[OrgApacheSlingFeatureflagsFeatureInfo]
  implicit val OrgApacheSlingFeatureflagsFeatureInfoDecoder: EntityDecoder[OrgApacheSlingFeatureflagsFeatureInfo] = jsonOf[OrgApacheSlingFeatureflagsFeatureInfo]
  implicit val OrgApacheSlingFeatureflagsFeatureInfoEncoder: EntityEncoder[OrgApacheSlingFeatureflagsFeatureInfo] = jsonEncoderOf[OrgApacheSlingFeatureflagsFeatureInfo]
}
