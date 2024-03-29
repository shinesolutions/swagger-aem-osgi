package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties._

case class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties (
  fullGcDays: Option[ConfigNodePropertyArray])

object ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesCodecJson: CodecJson[ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties] = CodecJson.derive[ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties]
  implicit val ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesDecoder: EntityDecoder[ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties] = jsonOf[ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties]
  implicit val ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesEncoder: EntityEncoder[ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties] = jsonEncoderOf[ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties]
}
