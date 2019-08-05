package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteCsrfImplCSRFFilterProperties._

case class ComAdobeGraniteCsrfImplCSRFFilterProperties (
  filterMethods: Option[ConfigNodePropertyArray],
filterEnableSafeUserAgents: Option[ConfigNodePropertyBoolean],
filterSafeUserAgents: Option[ConfigNodePropertyArray],
filterExcludedPaths: Option[ConfigNodePropertyArray])

object ComAdobeGraniteCsrfImplCSRFFilterProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteCsrfImplCSRFFilterPropertiesCodecJson: CodecJson[ComAdobeGraniteCsrfImplCSRFFilterProperties] = CodecJson.derive[ComAdobeGraniteCsrfImplCSRFFilterProperties]
  implicit val ComAdobeGraniteCsrfImplCSRFFilterPropertiesDecoder: EntityDecoder[ComAdobeGraniteCsrfImplCSRFFilterProperties] = jsonOf[ComAdobeGraniteCsrfImplCSRFFilterProperties]
  implicit val ComAdobeGraniteCsrfImplCSRFFilterPropertiesEncoder: EntityEncoder[ComAdobeGraniteCsrfImplCSRFFilterProperties] = jsonEncoderOf[ComAdobeGraniteCsrfImplCSRFFilterProperties]
}
