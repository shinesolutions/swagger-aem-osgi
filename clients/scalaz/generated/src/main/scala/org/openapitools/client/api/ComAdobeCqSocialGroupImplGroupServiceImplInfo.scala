package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialGroupImplGroupServiceImplInfo._

case class ComAdobeCqSocialGroupImplGroupServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialGroupImplGroupServiceImplProperties])

object ComAdobeCqSocialGroupImplGroupServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialGroupImplGroupServiceImplInfoCodecJson: CodecJson[ComAdobeCqSocialGroupImplGroupServiceImplInfo] = CodecJson.derive[ComAdobeCqSocialGroupImplGroupServiceImplInfo]
  implicit val ComAdobeCqSocialGroupImplGroupServiceImplInfoDecoder: EntityDecoder[ComAdobeCqSocialGroupImplGroupServiceImplInfo] = jsonOf[ComAdobeCqSocialGroupImplGroupServiceImplInfo]
  implicit val ComAdobeCqSocialGroupImplGroupServiceImplInfoEncoder: EntityEncoder[ComAdobeCqSocialGroupImplGroupServiceImplInfo] = jsonEncoderOf[ComAdobeCqSocialGroupImplGroupServiceImplInfo]
}
