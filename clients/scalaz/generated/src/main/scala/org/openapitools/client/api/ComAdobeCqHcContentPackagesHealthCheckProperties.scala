package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqHcContentPackagesHealthCheckProperties._

case class ComAdobeCqHcContentPackagesHealthCheckProperties (
  hcName: Option[ConfigNodePropertyString],
hcTags: Option[ConfigNodePropertyArray],
hcMbeanName: Option[ConfigNodePropertyString],
packageNames: Option[ConfigNodePropertyArray])

object ComAdobeCqHcContentPackagesHealthCheckProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqHcContentPackagesHealthCheckPropertiesCodecJson: CodecJson[ComAdobeCqHcContentPackagesHealthCheckProperties] = CodecJson.derive[ComAdobeCqHcContentPackagesHealthCheckProperties]
  implicit val ComAdobeCqHcContentPackagesHealthCheckPropertiesDecoder: EntityDecoder[ComAdobeCqHcContentPackagesHealthCheckProperties] = jsonOf[ComAdobeCqHcContentPackagesHealthCheckProperties]
  implicit val ComAdobeCqHcContentPackagesHealthCheckPropertiesEncoder: EntityEncoder[ComAdobeCqHcContentPackagesHealthCheckProperties] = jsonEncoderOf[ComAdobeCqHcContentPackagesHealthCheckProperties]
}
