package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReportingImplConfigServiceImplProperties._

case class ComDayCqReportingImplConfigServiceImplProperties (
  repconfTimezone: Option[ConfigNodePropertyString],
repconfLocale: Option[ConfigNodePropertyString],
repconfSnapshots: Option[ConfigNodePropertyString],
repconfRepdir: Option[ConfigNodePropertyString],
repconfHourofday: Option[ConfigNodePropertyInteger],
repconfMinofhour: Option[ConfigNodePropertyInteger],
repconfMaxrows: Option[ConfigNodePropertyInteger],
repconfFakedata: Option[ConfigNodePropertyBoolean],
repconfSnapshotuser: Option[ConfigNodePropertyString],
repconfEnforcesnapshotuser: Option[ConfigNodePropertyBoolean])

object ComDayCqReportingImplConfigServiceImplProperties {
  import DateTimeCodecs._

  implicit val ComDayCqReportingImplConfigServiceImplPropertiesCodecJson: CodecJson[ComDayCqReportingImplConfigServiceImplProperties] = CodecJson.derive[ComDayCqReportingImplConfigServiceImplProperties]
  implicit val ComDayCqReportingImplConfigServiceImplPropertiesDecoder: EntityDecoder[ComDayCqReportingImplConfigServiceImplProperties] = jsonOf[ComDayCqReportingImplConfigServiceImplProperties]
  implicit val ComDayCqReportingImplConfigServiceImplPropertiesEncoder: EntityEncoder[ComDayCqReportingImplConfigServiceImplProperties] = jsonEncoderOf[ComDayCqReportingImplConfigServiceImplProperties]
}
