package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqCommercePimImplPageEventListenerInfo._

case class ComAdobeCqCommercePimImplPageEventListenerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqCommercePimImplPageEventListenerProperties])

object ComAdobeCqCommercePimImplPageEventListenerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqCommercePimImplPageEventListenerInfoCodecJson: CodecJson[ComAdobeCqCommercePimImplPageEventListenerInfo] = CodecJson.derive[ComAdobeCqCommercePimImplPageEventListenerInfo]
  implicit val ComAdobeCqCommercePimImplPageEventListenerInfoDecoder: EntityDecoder[ComAdobeCqCommercePimImplPageEventListenerInfo] = jsonOf[ComAdobeCqCommercePimImplPageEventListenerInfo]
  implicit val ComAdobeCqCommercePimImplPageEventListenerInfoEncoder: EntityEncoder[ComAdobeCqCommercePimImplPageEventListenerInfo] = jsonEncoderOf[ComAdobeCqCommercePimImplPageEventListenerInfo]
}
