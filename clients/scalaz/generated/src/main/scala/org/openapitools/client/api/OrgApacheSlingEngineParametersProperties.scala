package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEngineParametersProperties._

case class OrgApacheSlingEngineParametersProperties (
  slingDefaultParameterEncoding: Option[ConfigNodePropertyString],
slingDefaultMaxParameters: Option[ConfigNodePropertyInteger],
fileLocation: Option[ConfigNodePropertyString],
fileThreshold: Option[ConfigNodePropertyInteger],
fileMax: Option[ConfigNodePropertyInteger],
requestMax: Option[ConfigNodePropertyInteger],
slingDefaultParameterCheckForAdditionalContainerParameters: Option[ConfigNodePropertyBoolean])

object OrgApacheSlingEngineParametersProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEngineParametersPropertiesCodecJson: CodecJson[OrgApacheSlingEngineParametersProperties] = CodecJson.derive[OrgApacheSlingEngineParametersProperties]
  implicit val OrgApacheSlingEngineParametersPropertiesDecoder: EntityDecoder[OrgApacheSlingEngineParametersProperties] = jsonOf[OrgApacheSlingEngineParametersProperties]
  implicit val OrgApacheSlingEngineParametersPropertiesEncoder: EntityEncoder[OrgApacheSlingEngineParametersProperties] = jsonEncoderOf[OrgApacheSlingEngineParametersProperties]
}
