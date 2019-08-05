package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteOptoutImplOptOutServiceImplInfo._

case class ComAdobeGraniteOptoutImplOptOutServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteOptoutImplOptOutServiceImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteOptoutImplOptOutServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteOptoutImplOptOutServiceImplInfoCodecJson: CodecJson[ComAdobeGraniteOptoutImplOptOutServiceImplInfo] = CodecJson.derive[ComAdobeGraniteOptoutImplOptOutServiceImplInfo]
  implicit val ComAdobeGraniteOptoutImplOptOutServiceImplInfoDecoder: EntityDecoder[ComAdobeGraniteOptoutImplOptOutServiceImplInfo] = jsonOf[ComAdobeGraniteOptoutImplOptOutServiceImplInfo]
  implicit val ComAdobeGraniteOptoutImplOptOutServiceImplInfoEncoder: EntityEncoder[ComAdobeGraniteOptoutImplOptOutServiceImplInfo] = jsonEncoderOf[ComAdobeGraniteOptoutImplOptOutServiceImplInfo]
}
