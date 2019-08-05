package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteCorsImplCORSPolicyImplInfo._

case class ComAdobeGraniteCorsImplCORSPolicyImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteCorsImplCORSPolicyImplProperties])

object ComAdobeGraniteCorsImplCORSPolicyImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteCorsImplCORSPolicyImplInfoCodecJson: CodecJson[ComAdobeGraniteCorsImplCORSPolicyImplInfo] = CodecJson.derive[ComAdobeGraniteCorsImplCORSPolicyImplInfo]
  implicit val ComAdobeGraniteCorsImplCORSPolicyImplInfoDecoder: EntityDecoder[ComAdobeGraniteCorsImplCORSPolicyImplInfo] = jsonOf[ComAdobeGraniteCorsImplCORSPolicyImplInfo]
  implicit val ComAdobeGraniteCorsImplCORSPolicyImplInfoEncoder: EntityEncoder[ComAdobeGraniteCorsImplCORSPolicyImplInfo] = jsonEncoderOf[ComAdobeGraniteCorsImplCORSPolicyImplInfo]
}
