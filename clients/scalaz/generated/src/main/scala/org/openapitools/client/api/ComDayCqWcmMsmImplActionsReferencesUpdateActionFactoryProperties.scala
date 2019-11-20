package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties._

case class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties (
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray],
cqWcmMsmImplActionReferencesupdatePropUpdateNested: Option[ConfigNodePropertyBoolean])

object ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesCodecJson: CodecJson[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties] = CodecJson.derive[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties]
  implicit val ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesDecoder: EntityDecoder[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties] = jsonOf[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties]
  implicit val ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesEncoder: EntityEncoder[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties] = jsonEncoderOf[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties]
}