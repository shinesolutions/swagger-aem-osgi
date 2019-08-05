package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqScreensImplScreensChannelPostProcessorInfo._

case class ComAdobeCqScreensImplScreensChannelPostProcessorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqScreensImplScreensChannelPostProcessorProperties])

object ComAdobeCqScreensImplScreensChannelPostProcessorInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqScreensImplScreensChannelPostProcessorInfoCodecJson: CodecJson[ComAdobeCqScreensImplScreensChannelPostProcessorInfo] = CodecJson.derive[ComAdobeCqScreensImplScreensChannelPostProcessorInfo]
  implicit val ComAdobeCqScreensImplScreensChannelPostProcessorInfoDecoder: EntityDecoder[ComAdobeCqScreensImplScreensChannelPostProcessorInfo] = jsonOf[ComAdobeCqScreensImplScreensChannelPostProcessorInfo]
  implicit val ComAdobeCqScreensImplScreensChannelPostProcessorInfoEncoder: EntityEncoder[ComAdobeCqScreensImplScreensChannelPostProcessorInfo] = jsonEncoderOf[ComAdobeCqScreensImplScreensChannelPostProcessorInfo]
}
