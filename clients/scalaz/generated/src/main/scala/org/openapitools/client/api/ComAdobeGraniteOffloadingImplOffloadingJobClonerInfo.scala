package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo._

case class ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoCodecJson: CodecJson[ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo] = CodecJson.derive[ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo]
  implicit val ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoDecoder: EntityDecoder[ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo] = jsonOf[ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo]
  implicit val ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoEncoder: EntityEncoder[ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo] = jsonEncoderOf[ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo]
}
