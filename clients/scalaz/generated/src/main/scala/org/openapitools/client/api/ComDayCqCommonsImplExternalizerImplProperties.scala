package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqCommonsImplExternalizerImplProperties._

case class ComDayCqCommonsImplExternalizerImplProperties (
  externalizerDomains: Option[ConfigNodePropertyArray],
externalizerHost: Option[ConfigNodePropertyString],
externalizerContextpath: Option[ConfigNodePropertyString],
externalizerEncodedpath: Option[ConfigNodePropertyBoolean])

object ComDayCqCommonsImplExternalizerImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqCommonsImplExternalizerImplPropertiesCodecJson: CodecJson[ComDayCqCommonsImplExternalizerImplProperties] = CodecJson.derive[ComDayCqCommonsImplExternalizerImplProperties]
  implicit val ComDayCqCommonsImplExternalizerImplPropertiesDecoder: EntityDecoder[ComDayCqCommonsImplExternalizerImplProperties] = jsonOf[ComDayCqCommonsImplExternalizerImplProperties]
  implicit val ComDayCqCommonsImplExternalizerImplPropertiesEncoder: EntityEncoder[ComDayCqCommonsImplExternalizerImplProperties] = jsonEncoderOf[ComDayCqCommonsImplExternalizerImplProperties]
}
