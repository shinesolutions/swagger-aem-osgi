package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteCsrfImplCSRFFilterInfo._

case class ComAdobeGraniteCsrfImplCSRFFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteCsrfImplCSRFFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteCsrfImplCSRFFilterInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteCsrfImplCSRFFilterInfoCodecJson: CodecJson[ComAdobeGraniteCsrfImplCSRFFilterInfo] = CodecJson.derive[ComAdobeGraniteCsrfImplCSRFFilterInfo]
  implicit val ComAdobeGraniteCsrfImplCSRFFilterInfoDecoder: EntityDecoder[ComAdobeGraniteCsrfImplCSRFFilterInfo] = jsonOf[ComAdobeGraniteCsrfImplCSRFFilterInfo]
  implicit val ComAdobeGraniteCsrfImplCSRFFilterInfoEncoder: EntityEncoder[ComAdobeGraniteCsrfImplCSRFFilterInfo] = jsonEncoderOf[ComAdobeGraniteCsrfImplCSRFFilterInfo]
}
