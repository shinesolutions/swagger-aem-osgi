package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqStatisticsImplStatisticsServiceImplProperties._

case class ComDayCqStatisticsImplStatisticsServiceImplProperties (
  schedulerPeriod: Option[ConfigNodePropertyInteger],
schedulerConcurrent: Option[ConfigNodePropertyBoolean],
`path`: Option[ConfigNodePropertyString],
workspace: Option[ConfigNodePropertyString],
keywordsPath: Option[ConfigNodePropertyString],
asyncEntries: Option[ConfigNodePropertyBoolean])

object ComDayCqStatisticsImplStatisticsServiceImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqStatisticsImplStatisticsServiceImplPropertiesCodecJson: CodecJson[ComDayCqStatisticsImplStatisticsServiceImplProperties] = CodecJson.derive[ComDayCqStatisticsImplStatisticsServiceImplProperties]
  implicit val ComDayCqStatisticsImplStatisticsServiceImplPropertiesDecoder: EntityDecoder[ComDayCqStatisticsImplStatisticsServiceImplProperties] = jsonOf[ComDayCqStatisticsImplStatisticsServiceImplProperties]
  implicit val ComDayCqStatisticsImplStatisticsServiceImplPropertiesEncoder: EntityEncoder[ComDayCqStatisticsImplStatisticsServiceImplProperties] = jsonEncoderOf[ComDayCqStatisticsImplStatisticsServiceImplProperties]
}
