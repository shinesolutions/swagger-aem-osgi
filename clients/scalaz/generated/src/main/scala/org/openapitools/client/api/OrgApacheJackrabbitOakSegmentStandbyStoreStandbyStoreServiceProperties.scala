package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties._

case class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties (
  orgApacheSlingInstallerConfigurationPersist: Option[ConfigNodePropertyBoolean],
mode: Option[ConfigNodePropertyDropDown],
port: Option[ConfigNodePropertyInteger],
primaryHost: Option[ConfigNodePropertyString],
interval: Option[ConfigNodePropertyInteger],
primaryAllowedClientIpRanges: Option[ConfigNodePropertyArray],
secure: Option[ConfigNodePropertyBoolean],
standbyReadtimeout: Option[ConfigNodePropertyInteger],
standbyAutoclean: Option[ConfigNodePropertyBoolean])

object OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {
  import DateTimeCodecs._

  implicit val OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesCodecJson: CodecJson[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties] = CodecJson.derive[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties]
  implicit val OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesDecoder: EntityDecoder[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties] = jsonOf[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties]
  implicit val OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesEncoder: EntityEncoder[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties] = jsonEncoderOf[OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties]
}