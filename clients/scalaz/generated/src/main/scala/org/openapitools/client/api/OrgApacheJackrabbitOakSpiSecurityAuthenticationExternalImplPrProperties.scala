package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties._

case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties (
  protectExternalId: Option[ConfigNodePropertyBoolean])

object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties {
  import DateTimeCodecs._

  implicit val OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesCodecJson: CodecJson[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties] = CodecJson.derive[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties]
  implicit val OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesDecoder: EntityDecoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties] = jsonOf[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties]
  implicit val OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesEncoder: EntityEncoder[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties] = jsonEncoderOf[OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties]
}