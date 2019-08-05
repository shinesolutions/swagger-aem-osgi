package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamS7imagingImplIsImageServerComponentInfo._

case class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamS7imagingImplIsImageServerComponentProperties])

object ComAdobeCqDamS7imagingImplIsImageServerComponentInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamS7imagingImplIsImageServerComponentInfoCodecJson: CodecJson[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo] = CodecJson.derive[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo]
  implicit val ComAdobeCqDamS7imagingImplIsImageServerComponentInfoDecoder: EntityDecoder[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo] = jsonOf[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo]
  implicit val ComAdobeCqDamS7imagingImplIsImageServerComponentInfoEncoder: EntityEncoder[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo] = jsonEncoderOf[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo]
}
