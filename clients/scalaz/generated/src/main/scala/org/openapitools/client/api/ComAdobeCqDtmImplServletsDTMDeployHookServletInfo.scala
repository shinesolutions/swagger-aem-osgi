package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDtmImplServletsDTMDeployHookServletInfo._

case class ComAdobeCqDtmImplServletsDTMDeployHookServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDtmImplServletsDTMDeployHookServletProperties])

object ComAdobeCqDtmImplServletsDTMDeployHookServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDtmImplServletsDTMDeployHookServletInfoCodecJson: CodecJson[ComAdobeCqDtmImplServletsDTMDeployHookServletInfo] = CodecJson.derive[ComAdobeCqDtmImplServletsDTMDeployHookServletInfo]
  implicit val ComAdobeCqDtmImplServletsDTMDeployHookServletInfoDecoder: EntityDecoder[ComAdobeCqDtmImplServletsDTMDeployHookServletInfo] = jsonOf[ComAdobeCqDtmImplServletsDTMDeployHookServletInfo]
  implicit val ComAdobeCqDtmImplServletsDTMDeployHookServletInfoEncoder: EntityEncoder[ComAdobeCqDtmImplServletsDTMDeployHookServletInfo] = jsonEncoderOf[ComAdobeCqDtmImplServletsDTMDeployHookServletInfo]
}
