package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteLicenseImplLicenseCheckFilterInfo._

case class ComAdobeGraniteLicenseImplLicenseCheckFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteLicenseImplLicenseCheckFilterProperties])

object ComAdobeGraniteLicenseImplLicenseCheckFilterInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteLicenseImplLicenseCheckFilterInfoCodecJson: CodecJson[ComAdobeGraniteLicenseImplLicenseCheckFilterInfo] = CodecJson.derive[ComAdobeGraniteLicenseImplLicenseCheckFilterInfo]
  implicit val ComAdobeGraniteLicenseImplLicenseCheckFilterInfoDecoder: EntityDecoder[ComAdobeGraniteLicenseImplLicenseCheckFilterInfo] = jsonOf[ComAdobeGraniteLicenseImplLicenseCheckFilterInfo]
  implicit val ComAdobeGraniteLicenseImplLicenseCheckFilterInfoEncoder: EntityEncoder[ComAdobeGraniteLicenseImplLicenseCheckFilterInfo] = jsonEncoderOf[ComAdobeGraniteLicenseImplLicenseCheckFilterInfo]
}
