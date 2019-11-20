package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties._

case class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties (
  felixMemoryusageDumpThreshold: Option[ConfigNodePropertyInteger],
felixMemoryusageDumpInterval: Option[ConfigNodePropertyInteger],
felixMemoryusageDumpLocation: Option[ConfigNodePropertyString])

object OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {
  import DateTimeCodecs._

  implicit val OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesCodecJson: CodecJson[OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties] = CodecJson.derive[OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties]
  implicit val OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesDecoder: EntityDecoder[OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties] = jsonOf[OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties]
  implicit val OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesEncoder: EntityEncoder[OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties] = jsonEncoderOf[OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties]
}