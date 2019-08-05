package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplVersionPurgeTaskProperties._

case class ComDayCqWcmCoreImplVersionPurgeTaskProperties (
  versionpurgePaths: Option[ConfigNodePropertyArray],
versionpurgeRecursive: Option[ConfigNodePropertyBoolean],
versionpurgeMaxVersions: Option[ConfigNodePropertyInteger],
versionpurgeMinVersions: Option[ConfigNodePropertyInteger],
versionpurgeMaxAgeDays: Option[ConfigNodePropertyInteger])

object ComDayCqWcmCoreImplVersionPurgeTaskProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplVersionPurgeTaskPropertiesCodecJson: CodecJson[ComDayCqWcmCoreImplVersionPurgeTaskProperties] = CodecJson.derive[ComDayCqWcmCoreImplVersionPurgeTaskProperties]
  implicit val ComDayCqWcmCoreImplVersionPurgeTaskPropertiesDecoder: EntityDecoder[ComDayCqWcmCoreImplVersionPurgeTaskProperties] = jsonOf[ComDayCqWcmCoreImplVersionPurgeTaskProperties]
  implicit val ComDayCqWcmCoreImplVersionPurgeTaskPropertiesEncoder: EntityEncoder[ComDayCqWcmCoreImplVersionPurgeTaskProperties] = jsonEncoderOf[ComDayCqWcmCoreImplVersionPurgeTaskProperties]
}
