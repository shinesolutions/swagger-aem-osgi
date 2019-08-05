package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmUndoUndoConfigProperties._

case class ComDayCqWcmUndoUndoConfigProperties (
  cqWcmUndoEnabled: Option[ConfigNodePropertyBoolean],
cqWcmUndoPath: Option[ConfigNodePropertyString],
cqWcmUndoValidity: Option[ConfigNodePropertyInteger],
cqWcmUndoSteps: Option[ConfigNodePropertyInteger],
cqWcmUndoPersistence: Option[ConfigNodePropertyString],
cqWcmUndoPersistenceMode: Option[ConfigNodePropertyBoolean],
cqWcmUndoMarkermode: Option[ConfigNodePropertyString],
cqWcmUndoWhitelist: Option[ConfigNodePropertyArray],
cqWcmUndoBlacklist: Option[ConfigNodePropertyArray])

object ComDayCqWcmUndoUndoConfigProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmUndoUndoConfigPropertiesCodecJson: CodecJson[ComDayCqWcmUndoUndoConfigProperties] = CodecJson.derive[ComDayCqWcmUndoUndoConfigProperties]
  implicit val ComDayCqWcmUndoUndoConfigPropertiesDecoder: EntityDecoder[ComDayCqWcmUndoUndoConfigProperties] = jsonOf[ComDayCqWcmUndoUndoConfigProperties]
  implicit val ComDayCqWcmUndoUndoConfigPropertiesEncoder: EntityEncoder[ComDayCqWcmUndoUndoConfigProperties] = jsonEncoderOf[ComDayCqWcmUndoUndoConfigProperties]
}
