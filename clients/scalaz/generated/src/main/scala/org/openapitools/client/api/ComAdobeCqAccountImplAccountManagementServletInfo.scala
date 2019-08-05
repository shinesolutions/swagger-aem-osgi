package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqAccountImplAccountManagementServletInfo._

case class ComAdobeCqAccountImplAccountManagementServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqAccountImplAccountManagementServletProperties])

object ComAdobeCqAccountImplAccountManagementServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqAccountImplAccountManagementServletInfoCodecJson: CodecJson[ComAdobeCqAccountImplAccountManagementServletInfo] = CodecJson.derive[ComAdobeCqAccountImplAccountManagementServletInfo]
  implicit val ComAdobeCqAccountImplAccountManagementServletInfoDecoder: EntityDecoder[ComAdobeCqAccountImplAccountManagementServletInfo] = jsonOf[ComAdobeCqAccountImplAccountManagementServletInfo]
  implicit val ComAdobeCqAccountImplAccountManagementServletInfoEncoder: EntityEncoder[ComAdobeCqAccountImplAccountManagementServletInfo] = jsonEncoderOf[ComAdobeCqAccountImplAccountManagementServletInfo]
}
