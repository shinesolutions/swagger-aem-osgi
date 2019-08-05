package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixScrScrServiceProperties._

case class OrgApacheFelixScrScrServiceProperties (
  dsLoglevel: Option[ConfigNodePropertyDropDown],
dsFactoryEnabled: Option[ConfigNodePropertyBoolean],
dsDelayedKeepInstances: Option[ConfigNodePropertyBoolean],
dsLockTimeoutMilliseconds: Option[ConfigNodePropertyInteger],
dsStopTimeoutMilliseconds: Option[ConfigNodePropertyInteger],
dsGlobalExtender: Option[ConfigNodePropertyBoolean])

object OrgApacheFelixScrScrServiceProperties {
  import DateTimeCodecs._

  implicit val OrgApacheFelixScrScrServicePropertiesCodecJson: CodecJson[OrgApacheFelixScrScrServiceProperties] = CodecJson.derive[OrgApacheFelixScrScrServiceProperties]
  implicit val OrgApacheFelixScrScrServicePropertiesDecoder: EntityDecoder[OrgApacheFelixScrScrServiceProperties] = jsonOf[OrgApacheFelixScrScrServiceProperties]
  implicit val OrgApacheFelixScrScrServicePropertiesEncoder: EntityEncoder[OrgApacheFelixScrScrServiceProperties] = jsonEncoderOf[OrgApacheFelixScrScrServiceProperties]
}
