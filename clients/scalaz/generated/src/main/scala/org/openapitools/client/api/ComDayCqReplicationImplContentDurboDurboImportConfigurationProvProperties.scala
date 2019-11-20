package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties._

case class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties (
  preserveHierarchyNodes: Option[ConfigNodePropertyBoolean],
ignoreVersioning: Option[ConfigNodePropertyBoolean],
importAcl: Option[ConfigNodePropertyBoolean],
saveThreshold: Option[ConfigNodePropertyInteger],
preserveUserPaths: Option[ConfigNodePropertyBoolean],
preserveUuid: Option[ConfigNodePropertyBoolean],
preserveUuidNodetypes: Option[ConfigNodePropertyArray],
preserveUuidSubtrees: Option[ConfigNodePropertyArray],
autoCommit: Option[ConfigNodePropertyBoolean])

object ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesCodecJson: CodecJson[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties] = CodecJson.derive[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties]
  implicit val ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesDecoder: EntityDecoder[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties] = jsonOf[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties]
  implicit val ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesEncoder: EntityEncoder[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties] = jsonEncoderOf[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties]
}