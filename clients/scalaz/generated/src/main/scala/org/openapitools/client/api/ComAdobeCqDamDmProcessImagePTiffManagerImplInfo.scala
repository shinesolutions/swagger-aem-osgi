package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamDmProcessImagePTiffManagerImplInfo._

case class ComAdobeCqDamDmProcessImagePTiffManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamDmProcessImagePTiffManagerImplProperties])

object ComAdobeCqDamDmProcessImagePTiffManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamDmProcessImagePTiffManagerImplInfoCodecJson: CodecJson[ComAdobeCqDamDmProcessImagePTiffManagerImplInfo] = CodecJson.derive[ComAdobeCqDamDmProcessImagePTiffManagerImplInfo]
  implicit val ComAdobeCqDamDmProcessImagePTiffManagerImplInfoDecoder: EntityDecoder[ComAdobeCqDamDmProcessImagePTiffManagerImplInfo] = jsonOf[ComAdobeCqDamDmProcessImagePTiffManagerImplInfo]
  implicit val ComAdobeCqDamDmProcessImagePTiffManagerImplInfoEncoder: EntityEncoder[ComAdobeCqDamDmProcessImagePTiffManagerImplInfo] = jsonEncoderOf[ComAdobeCqDamDmProcessImagePTiffManagerImplInfo]
}
