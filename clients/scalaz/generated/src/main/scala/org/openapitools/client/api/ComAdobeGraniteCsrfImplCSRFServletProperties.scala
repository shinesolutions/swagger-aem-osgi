package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteCsrfImplCSRFServletProperties._

case class ComAdobeGraniteCsrfImplCSRFServletProperties (
  csrfTokenExpiresIn: Option[ConfigNodePropertyInteger],
slingAuthRequirements: Option[ConfigNodePropertyString])

object ComAdobeGraniteCsrfImplCSRFServletProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteCsrfImplCSRFServletPropertiesCodecJson: CodecJson[ComAdobeGraniteCsrfImplCSRFServletProperties] = CodecJson.derive[ComAdobeGraniteCsrfImplCSRFServletProperties]
  implicit val ComAdobeGraniteCsrfImplCSRFServletPropertiesDecoder: EntityDecoder[ComAdobeGraniteCsrfImplCSRFServletProperties] = jsonOf[ComAdobeGraniteCsrfImplCSRFServletProperties]
  implicit val ComAdobeGraniteCsrfImplCSRFServletPropertiesEncoder: EntityEncoder[ComAdobeGraniteCsrfImplCSRFServletProperties] = jsonEncoderOf[ComAdobeGraniteCsrfImplCSRFServletProperties]
}
