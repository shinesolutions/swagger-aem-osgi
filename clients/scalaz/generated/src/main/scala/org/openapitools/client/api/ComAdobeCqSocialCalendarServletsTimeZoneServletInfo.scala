package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialCalendarServletsTimeZoneServletInfo._

case class ComAdobeCqSocialCalendarServletsTimeZoneServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialCalendarServletsTimeZoneServletProperties])

object ComAdobeCqSocialCalendarServletsTimeZoneServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialCalendarServletsTimeZoneServletInfoCodecJson: CodecJson[ComAdobeCqSocialCalendarServletsTimeZoneServletInfo] = CodecJson.derive[ComAdobeCqSocialCalendarServletsTimeZoneServletInfo]
  implicit val ComAdobeCqSocialCalendarServletsTimeZoneServletInfoDecoder: EntityDecoder[ComAdobeCqSocialCalendarServletsTimeZoneServletInfo] = jsonOf[ComAdobeCqSocialCalendarServletsTimeZoneServletInfo]
  implicit val ComAdobeCqSocialCalendarServletsTimeZoneServletInfoEncoder: EntityEncoder[ComAdobeCqSocialCalendarServletsTimeZoneServletInfo] = jsonEncoderOf[ComAdobeCqSocialCalendarServletsTimeZoneServletInfo]
}
