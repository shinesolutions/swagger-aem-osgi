package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties._

case class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties (
  importerName: Option[ConfigNodePropertyArray])

object ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesCodecJson: CodecJson[ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties] = CodecJson.derive[ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties]
  implicit val ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesDecoder: EntityDecoder[ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties] = jsonOf[ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties]
  implicit val ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesEncoder: EntityEncoder[ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties] = jsonEncoderOf[ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties]
}