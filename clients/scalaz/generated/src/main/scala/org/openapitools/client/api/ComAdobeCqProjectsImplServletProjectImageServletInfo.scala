package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqProjectsImplServletProjectImageServletInfo._

case class ComAdobeCqProjectsImplServletProjectImageServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqProjectsImplServletProjectImageServletProperties])

object ComAdobeCqProjectsImplServletProjectImageServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqProjectsImplServletProjectImageServletInfoCodecJson: CodecJson[ComAdobeCqProjectsImplServletProjectImageServletInfo] = CodecJson.derive[ComAdobeCqProjectsImplServletProjectImageServletInfo]
  implicit val ComAdobeCqProjectsImplServletProjectImageServletInfoDecoder: EntityDecoder[ComAdobeCqProjectsImplServletProjectImageServletInfo] = jsonOf[ComAdobeCqProjectsImplServletProjectImageServletInfo]
  implicit val ComAdobeCqProjectsImplServletProjectImageServletInfoEncoder: EntityEncoder[ComAdobeCqProjectsImplServletProjectImageServletInfo] = jsonEncoderOf[ComAdobeCqProjectsImplServletProjectImageServletInfo]
}
