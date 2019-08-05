package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo._

case class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfoCodecJson: CodecJson[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo] = CodecJson.derive[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo]
  implicit val ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfoDecoder: EntityDecoder[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo] = jsonOf[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo]
  implicit val ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfoEncoder: EntityEncoder[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo] = jsonEncoderOf[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo]
}
