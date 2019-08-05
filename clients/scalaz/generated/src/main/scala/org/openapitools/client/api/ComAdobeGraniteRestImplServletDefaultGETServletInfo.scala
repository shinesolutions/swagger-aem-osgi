package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteRestImplServletDefaultGETServletInfo._

case class ComAdobeGraniteRestImplServletDefaultGETServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteRestImplServletDefaultGETServletProperties])

object ComAdobeGraniteRestImplServletDefaultGETServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteRestImplServletDefaultGETServletInfoCodecJson: CodecJson[ComAdobeGraniteRestImplServletDefaultGETServletInfo] = CodecJson.derive[ComAdobeGraniteRestImplServletDefaultGETServletInfo]
  implicit val ComAdobeGraniteRestImplServletDefaultGETServletInfoDecoder: EntityDecoder[ComAdobeGraniteRestImplServletDefaultGETServletInfo] = jsonOf[ComAdobeGraniteRestImplServletDefaultGETServletInfo]
  implicit val ComAdobeGraniteRestImplServletDefaultGETServletInfoEncoder: EntityEncoder[ComAdobeGraniteRestImplServletDefaultGETServletInfo] = jsonEncoderOf[ComAdobeGraniteRestImplServletDefaultGETServletInfo]
}
