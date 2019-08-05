package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixJaasConfigurationSpiProperties._

case class OrgApacheFelixJaasConfigurationSpiProperties (
  jaasDefaultRealmName: Option[ConfigNodePropertyString],
jaasConfigProviderName: Option[ConfigNodePropertyString],
jaasGlobalConfigPolicy: Option[ConfigNodePropertyDropDown])

object OrgApacheFelixJaasConfigurationSpiProperties {
  import DateTimeCodecs._

  implicit val OrgApacheFelixJaasConfigurationSpiPropertiesCodecJson: CodecJson[OrgApacheFelixJaasConfigurationSpiProperties] = CodecJson.derive[OrgApacheFelixJaasConfigurationSpiProperties]
  implicit val OrgApacheFelixJaasConfigurationSpiPropertiesDecoder: EntityDecoder[OrgApacheFelixJaasConfigurationSpiProperties] = jsonOf[OrgApacheFelixJaasConfigurationSpiProperties]
  implicit val OrgApacheFelixJaasConfigurationSpiPropertiesEncoder: EntityEncoder[OrgApacheFelixJaasConfigurationSpiProperties] = jsonEncoderOf[OrgApacheFelixJaasConfigurationSpiProperties]
}
