package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqAuthImplLoginSelectorHandlerProperties._

case class ComDayCqAuthImplLoginSelectorHandlerProperties (
  `path`: Option[ConfigNodePropertyString],
serviceRanking: Option[ConfigNodePropertyInteger],
authLoginselectorMappings: Option[ConfigNodePropertyArray],
authLoginselectorChangepwMappings: Option[ConfigNodePropertyArray],
authLoginselectorDefaultloginpage: Option[ConfigNodePropertyString],
authLoginselectorDefaultchangepwpage: Option[ConfigNodePropertyString],
authLoginselectorHandle: Option[ConfigNodePropertyArray],
authLoginselectorHandleAllExtensions: Option[ConfigNodePropertyBoolean])

object ComDayCqAuthImplLoginSelectorHandlerProperties {
  import DateTimeCodecs._

  implicit val ComDayCqAuthImplLoginSelectorHandlerPropertiesCodecJson: CodecJson[ComDayCqAuthImplLoginSelectorHandlerProperties] = CodecJson.derive[ComDayCqAuthImplLoginSelectorHandlerProperties]
  implicit val ComDayCqAuthImplLoginSelectorHandlerPropertiesDecoder: EntityDecoder[ComDayCqAuthImplLoginSelectorHandlerProperties] = jsonOf[ComDayCqAuthImplLoginSelectorHandlerProperties]
  implicit val ComDayCqAuthImplLoginSelectorHandlerPropertiesEncoder: EntityEncoder[ComDayCqAuthImplLoginSelectorHandlerProperties] = jsonEncoderOf[ComDayCqAuthImplLoginSelectorHandlerProperties]
}
