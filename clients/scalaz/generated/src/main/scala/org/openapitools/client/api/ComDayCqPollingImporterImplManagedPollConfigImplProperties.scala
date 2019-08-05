package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqPollingImporterImplManagedPollConfigImplProperties._

case class ComDayCqPollingImporterImplManagedPollConfigImplProperties (
  id: Option[ConfigNodePropertyString],
enabled: Option[ConfigNodePropertyBoolean],
reference: Option[ConfigNodePropertyBoolean],
interval: Option[ConfigNodePropertyInteger],
expression: Option[ConfigNodePropertyString],
source: Option[ConfigNodePropertyString],
target: Option[ConfigNodePropertyString],
login: Option[ConfigNodePropertyString],
password: Option[ConfigNodePropertyString])

object ComDayCqPollingImporterImplManagedPollConfigImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqPollingImporterImplManagedPollConfigImplPropertiesCodecJson: CodecJson[ComDayCqPollingImporterImplManagedPollConfigImplProperties] = CodecJson.derive[ComDayCqPollingImporterImplManagedPollConfigImplProperties]
  implicit val ComDayCqPollingImporterImplManagedPollConfigImplPropertiesDecoder: EntityDecoder[ComDayCqPollingImporterImplManagedPollConfigImplProperties] = jsonOf[ComDayCqPollingImporterImplManagedPollConfigImplProperties]
  implicit val ComDayCqPollingImporterImplManagedPollConfigImplPropertiesEncoder: EntityEncoder[ComDayCqPollingImporterImplManagedPollConfigImplProperties] = jsonEncoderOf[ComDayCqPollingImporterImplManagedPollConfigImplProperties]
}
