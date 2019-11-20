package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo._

case class ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoCodecJson: CodecJson[ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo] = CodecJson.derive[ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo]
  implicit val ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoDecoder: EntityDecoder[ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo] = jsonOf[ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo]
  implicit val ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoEncoder: EntityEncoder[ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo] = jsonEncoderOf[ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo]
}