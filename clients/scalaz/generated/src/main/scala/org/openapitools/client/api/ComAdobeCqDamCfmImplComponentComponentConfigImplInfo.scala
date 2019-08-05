package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamCfmImplComponentComponentConfigImplInfo._

case class ComAdobeCqDamCfmImplComponentComponentConfigImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamCfmImplComponentComponentConfigImplProperties])

object ComAdobeCqDamCfmImplComponentComponentConfigImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamCfmImplComponentComponentConfigImplInfoCodecJson: CodecJson[ComAdobeCqDamCfmImplComponentComponentConfigImplInfo] = CodecJson.derive[ComAdobeCqDamCfmImplComponentComponentConfigImplInfo]
  implicit val ComAdobeCqDamCfmImplComponentComponentConfigImplInfoDecoder: EntityDecoder[ComAdobeCqDamCfmImplComponentComponentConfigImplInfo] = jsonOf[ComAdobeCqDamCfmImplComponentComponentConfigImplInfo]
  implicit val ComAdobeCqDamCfmImplComponentComponentConfigImplInfoEncoder: EntityEncoder[ComAdobeCqDamCfmImplComponentComponentConfigImplInfo] = jsonEncoderOf[ComAdobeCqDamCfmImplComponentComponentConfigImplInfo]
}
