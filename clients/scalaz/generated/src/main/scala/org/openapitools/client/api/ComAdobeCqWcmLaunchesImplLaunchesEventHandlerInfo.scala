package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo._

case class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties])

object ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoCodecJson: CodecJson[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo] = CodecJson.derive[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo]
  implicit val ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoDecoder: EntityDecoder[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo] = jsonOf[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo]
  implicit val ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoEncoder: EntityEncoder[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo] = jsonEncoderOf[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo]
}
