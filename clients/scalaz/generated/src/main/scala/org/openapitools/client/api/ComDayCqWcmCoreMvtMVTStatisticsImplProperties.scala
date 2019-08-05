package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreMvtMVTStatisticsImplProperties._

case class ComDayCqWcmCoreMvtMVTStatisticsImplProperties (
  mvtstatisticsTrackingurl: Option[ConfigNodePropertyString])

object ComDayCqWcmCoreMvtMVTStatisticsImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesCodecJson: CodecJson[ComDayCqWcmCoreMvtMVTStatisticsImplProperties] = CodecJson.derive[ComDayCqWcmCoreMvtMVTStatisticsImplProperties]
  implicit val ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesDecoder: EntityDecoder[ComDayCqWcmCoreMvtMVTStatisticsImplProperties] = jsonOf[ComDayCqWcmCoreMvtMVTStatisticsImplProperties]
  implicit val ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesEncoder: EntityEncoder[ComDayCqWcmCoreMvtMVTStatisticsImplProperties] = jsonEncoderOf[ComDayCqWcmCoreMvtMVTStatisticsImplProperties]
}
