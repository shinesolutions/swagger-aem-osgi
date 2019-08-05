package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingFeatureflagsFeatureProperties._

case class OrgApacheSlingFeatureflagsFeatureProperties (
  name: Option[ConfigNodePropertyString],
description: Option[ConfigNodePropertyString],
enabled: Option[ConfigNodePropertyBoolean])

object OrgApacheSlingFeatureflagsFeatureProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingFeatureflagsFeaturePropertiesCodecJson: CodecJson[OrgApacheSlingFeatureflagsFeatureProperties] = CodecJson.derive[OrgApacheSlingFeatureflagsFeatureProperties]
  implicit val OrgApacheSlingFeatureflagsFeaturePropertiesDecoder: EntityDecoder[OrgApacheSlingFeatureflagsFeatureProperties] = jsonOf[OrgApacheSlingFeatureflagsFeatureProperties]
  implicit val OrgApacheSlingFeatureflagsFeaturePropertiesEncoder: EntityEncoder[OrgApacheSlingFeatureflagsFeatureProperties] = jsonEncoderOf[OrgApacheSlingFeatureflagsFeatureProperties]
}
