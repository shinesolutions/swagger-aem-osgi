package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteFragsImplRandomFeatureInfo._

case class ComAdobeGraniteFragsImplRandomFeatureInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteFragsImplRandomFeatureProperties])

object ComAdobeGraniteFragsImplRandomFeatureInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteFragsImplRandomFeatureInfoCodecJson: CodecJson[ComAdobeGraniteFragsImplRandomFeatureInfo] = CodecJson.derive[ComAdobeGraniteFragsImplRandomFeatureInfo]
  implicit val ComAdobeGraniteFragsImplRandomFeatureInfoDecoder: EntityDecoder[ComAdobeGraniteFragsImplRandomFeatureInfo] = jsonOf[ComAdobeGraniteFragsImplRandomFeatureInfo]
  implicit val ComAdobeGraniteFragsImplRandomFeatureInfoEncoder: EntityEncoder[ComAdobeGraniteFragsImplRandomFeatureInfo] = jsonEncoderOf[ComAdobeGraniteFragsImplRandomFeatureInfo]
}
