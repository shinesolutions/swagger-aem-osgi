package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqAuthImplCugCugSupportImplProperties._

case class ComDayCqAuthImplCugCugSupportImplProperties (
  cugExemptedPrincipals: Option[ConfigNodePropertyArray],
cugEnabled: Option[ConfigNodePropertyBoolean],
cugPrincipalsRegex: Option[ConfigNodePropertyString],
cugPrincipalsReplacement: Option[ConfigNodePropertyString])

object ComDayCqAuthImplCugCugSupportImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqAuthImplCugCugSupportImplPropertiesCodecJson: CodecJson[ComDayCqAuthImplCugCugSupportImplProperties] = CodecJson.derive[ComDayCqAuthImplCugCugSupportImplProperties]
  implicit val ComDayCqAuthImplCugCugSupportImplPropertiesDecoder: EntityDecoder[ComDayCqAuthImplCugCugSupportImplProperties] = jsonOf[ComDayCqAuthImplCugCugSupportImplProperties]
  implicit val ComDayCqAuthImplCugCugSupportImplPropertiesEncoder: EntityEncoder[ComDayCqAuthImplCugCugSupportImplProperties] = jsonEncoderOf[ComDayCqAuthImplCugCugSupportImplProperties]
}
