package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo._

case class ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties])

object ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoCodecJson: CodecJson[ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo] = CodecJson.derive[ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo]
  implicit val ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoDecoder: EntityDecoder[ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo] = jsonOf[ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo]
  implicit val ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoEncoder: EntityEncoder[ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo] = jsonEncoderOf[ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo]
}
