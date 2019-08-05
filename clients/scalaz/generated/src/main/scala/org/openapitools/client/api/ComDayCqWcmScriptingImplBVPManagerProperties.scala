package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmScriptingImplBVPManagerProperties._

case class ComDayCqWcmScriptingImplBVPManagerProperties (
  comDayCqWcmScriptingBvpScriptEngines: Option[ConfigNodePropertyArray])

object ComDayCqWcmScriptingImplBVPManagerProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmScriptingImplBVPManagerPropertiesCodecJson: CodecJson[ComDayCqWcmScriptingImplBVPManagerProperties] = CodecJson.derive[ComDayCqWcmScriptingImplBVPManagerProperties]
  implicit val ComDayCqWcmScriptingImplBVPManagerPropertiesDecoder: EntityDecoder[ComDayCqWcmScriptingImplBVPManagerProperties] = jsonOf[ComDayCqWcmScriptingImplBVPManagerProperties]
  implicit val ComDayCqWcmScriptingImplBVPManagerPropertiesEncoder: EntityEncoder[ComDayCqWcmScriptingImplBVPManagerProperties] = jsonEncoderOf[ComDayCqWcmScriptingImplBVPManagerProperties]
}
