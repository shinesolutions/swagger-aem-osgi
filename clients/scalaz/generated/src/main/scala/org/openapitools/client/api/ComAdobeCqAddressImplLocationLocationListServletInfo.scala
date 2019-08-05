package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqAddressImplLocationLocationListServletInfo._

case class ComAdobeCqAddressImplLocationLocationListServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqAddressImplLocationLocationListServletProperties])

object ComAdobeCqAddressImplLocationLocationListServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqAddressImplLocationLocationListServletInfoCodecJson: CodecJson[ComAdobeCqAddressImplLocationLocationListServletInfo] = CodecJson.derive[ComAdobeCqAddressImplLocationLocationListServletInfo]
  implicit val ComAdobeCqAddressImplLocationLocationListServletInfoDecoder: EntityDecoder[ComAdobeCqAddressImplLocationLocationListServletInfo] = jsonOf[ComAdobeCqAddressImplLocationLocationListServletInfo]
  implicit val ComAdobeCqAddressImplLocationLocationListServletInfoEncoder: EntityEncoder[ComAdobeCqAddressImplLocationLocationListServletInfo] = jsonEncoderOf[ComAdobeCqAddressImplLocationLocationListServletInfo]
}
