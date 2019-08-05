package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo._

case class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties])

object ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoCodecJson: CodecJson[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo] = CodecJson.derive[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo]
  implicit val ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoDecoder: EntityDecoder[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo] = jsonOf[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo]
  implicit val ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoEncoder: EntityEncoder[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo] = jsonEncoderOf[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo]
}
