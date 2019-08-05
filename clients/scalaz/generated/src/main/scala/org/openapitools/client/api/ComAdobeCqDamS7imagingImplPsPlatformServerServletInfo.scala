package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo._

case class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties])

object ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoCodecJson: CodecJson[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo] = CodecJson.derive[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo]
  implicit val ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoDecoder: EntityDecoder[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo] = jsonOf[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo]
  implicit val ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoEncoder: EntityEncoder[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo] = jsonEncoderOf[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo]
}
