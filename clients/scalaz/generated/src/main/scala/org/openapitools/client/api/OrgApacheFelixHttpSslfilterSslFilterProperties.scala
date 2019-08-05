package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixHttpSslfilterSslFilterProperties._

case class OrgApacheFelixHttpSslfilterSslFilterProperties (
  sslForwardHeader: Option[ConfigNodePropertyString],
sslForwardValue: Option[ConfigNodePropertyString],
sslForwardCertHeader: Option[ConfigNodePropertyString],
rewriteAbsoluteUrls: Option[ConfigNodePropertyBoolean])

object OrgApacheFelixHttpSslfilterSslFilterProperties {
  import DateTimeCodecs._

  implicit val OrgApacheFelixHttpSslfilterSslFilterPropertiesCodecJson: CodecJson[OrgApacheFelixHttpSslfilterSslFilterProperties] = CodecJson.derive[OrgApacheFelixHttpSslfilterSslFilterProperties]
  implicit val OrgApacheFelixHttpSslfilterSslFilterPropertiesDecoder: EntityDecoder[OrgApacheFelixHttpSslfilterSslFilterProperties] = jsonOf[OrgApacheFelixHttpSslfilterSslFilterProperties]
  implicit val OrgApacheFelixHttpSslfilterSslFilterPropertiesEncoder: EntityEncoder[OrgApacheFelixHttpSslfilterSslFilterProperties] = jsonEncoderOf[OrgApacheFelixHttpSslfilterSslFilterProperties]
}
