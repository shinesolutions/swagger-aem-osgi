package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo._

case class ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties])

object ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoCodecJson: CodecJson[ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo] = CodecJson.derive[ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo]
  implicit val ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoDecoder: EntityDecoder[ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo] = jsonOf[ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo]
  implicit val ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoEncoder: EntityEncoder[ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo] = jsonEncoderOf[ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo]
}
