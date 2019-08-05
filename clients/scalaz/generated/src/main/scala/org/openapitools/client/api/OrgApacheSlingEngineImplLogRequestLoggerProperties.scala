package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEngineImplLogRequestLoggerProperties._

case class OrgApacheSlingEngineImplLogRequestLoggerProperties (
  requestLogOutput: Option[ConfigNodePropertyString],
requestLogOutputtype: Option[ConfigNodePropertyDropDown],
requestLogEnabled: Option[ConfigNodePropertyBoolean],
accessLogOutput: Option[ConfigNodePropertyString],
accessLogOutputtype: Option[ConfigNodePropertyDropDown],
accessLogEnabled: Option[ConfigNodePropertyBoolean])

object OrgApacheSlingEngineImplLogRequestLoggerProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEngineImplLogRequestLoggerPropertiesCodecJson: CodecJson[OrgApacheSlingEngineImplLogRequestLoggerProperties] = CodecJson.derive[OrgApacheSlingEngineImplLogRequestLoggerProperties]
  implicit val OrgApacheSlingEngineImplLogRequestLoggerPropertiesDecoder: EntityDecoder[OrgApacheSlingEngineImplLogRequestLoggerProperties] = jsonOf[OrgApacheSlingEngineImplLogRequestLoggerProperties]
  implicit val OrgApacheSlingEngineImplLogRequestLoggerPropertiesEncoder: EntityEncoder[OrgApacheSlingEngineImplLogRequestLoggerProperties] = jsonEncoderOf[OrgApacheSlingEngineImplLogRequestLoggerProperties]
}
