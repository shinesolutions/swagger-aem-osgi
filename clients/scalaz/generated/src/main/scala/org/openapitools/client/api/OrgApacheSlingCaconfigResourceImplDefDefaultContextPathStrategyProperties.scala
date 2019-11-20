package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties._

case class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties (
  enabled: Option[ConfigNodePropertyBoolean],
configRefResourceNames: Option[ConfigNodePropertyArray],
configRefPropertyNames: Option[ConfigNodePropertyArray],
serviceRanking: Option[ConfigNodePropertyInteger])

object OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesCodecJson: CodecJson[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties] = CodecJson.derive[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties]
  implicit val OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesDecoder: EntityDecoder[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties] = jsonOf[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties]
  implicit val OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesEncoder: EntityEncoder[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties] = jsonEncoderOf[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties]
}