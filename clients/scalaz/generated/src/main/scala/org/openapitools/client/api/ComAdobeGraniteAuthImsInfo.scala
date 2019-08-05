package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthImsInfo._

case class ComAdobeGraniteAuthImsInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthImsProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteAuthImsInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthImsInfoCodecJson: CodecJson[ComAdobeGraniteAuthImsInfo] = CodecJson.derive[ComAdobeGraniteAuthImsInfo]
  implicit val ComAdobeGraniteAuthImsInfoDecoder: EntityDecoder[ComAdobeGraniteAuthImsInfo] = jsonOf[ComAdobeGraniteAuthImsInfo]
  implicit val ComAdobeGraniteAuthImsInfoEncoder: EntityEncoder[ComAdobeGraniteAuthImsInfo] = jsonEncoderOf[ComAdobeGraniteAuthImsInfo]
}
