package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixJaasConfigurationFactoryProperties._

case class OrgApacheFelixJaasConfigurationFactoryProperties (
  jaasControlFlag: Option[ConfigNodePropertyDropDown],
jaasRanking: Option[ConfigNodePropertyInteger],
jaasRealmName: Option[ConfigNodePropertyString],
jaasClassname: Option[ConfigNodePropertyString],
jaasOptions: Option[ConfigNodePropertyArray])

object OrgApacheFelixJaasConfigurationFactoryProperties {
  import DateTimeCodecs._

  implicit val OrgApacheFelixJaasConfigurationFactoryPropertiesCodecJson: CodecJson[OrgApacheFelixJaasConfigurationFactoryProperties] = CodecJson.derive[OrgApacheFelixJaasConfigurationFactoryProperties]
  implicit val OrgApacheFelixJaasConfigurationFactoryPropertiesDecoder: EntityDecoder[OrgApacheFelixJaasConfigurationFactoryProperties] = jsonOf[OrgApacheFelixJaasConfigurationFactoryProperties]
  implicit val OrgApacheFelixJaasConfigurationFactoryPropertiesEncoder: EntityEncoder[OrgApacheFelixJaasConfigurationFactoryProperties] = jsonEncoderOf[OrgApacheFelixJaasConfigurationFactoryProperties]
}
