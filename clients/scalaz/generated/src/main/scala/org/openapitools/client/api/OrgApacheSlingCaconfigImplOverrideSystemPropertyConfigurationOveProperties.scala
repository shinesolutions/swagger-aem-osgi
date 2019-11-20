package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties._

case class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties (
  enabled: Option[ConfigNodePropertyBoolean],
serviceRanking: Option[ConfigNodePropertyInteger])

object OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesCodecJson: CodecJson[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties] = CodecJson.derive[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties]
  implicit val OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesDecoder: EntityDecoder[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties] = jsonOf[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties]
  implicit val OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesEncoder: EntityEncoder[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties] = jsonEncoderOf[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties]
}