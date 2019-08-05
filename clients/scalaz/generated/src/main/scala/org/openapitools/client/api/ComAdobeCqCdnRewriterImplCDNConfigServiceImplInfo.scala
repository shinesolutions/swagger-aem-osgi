package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo._

case class ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties])

object ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoCodecJson: CodecJson[ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo] = CodecJson.derive[ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo]
  implicit val ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoDecoder: EntityDecoder[ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo] = jsonOf[ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo]
  implicit val ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoEncoder: EntityEncoder[ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo] = jsonEncoderOf[ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo]
}
