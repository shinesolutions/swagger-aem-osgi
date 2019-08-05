package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqCdnRewriterImplCDNRewriterInfo._

case class ComAdobeCqCdnRewriterImplCDNRewriterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqCdnRewriterImplCDNRewriterProperties])

object ComAdobeCqCdnRewriterImplCDNRewriterInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqCdnRewriterImplCDNRewriterInfoCodecJson: CodecJson[ComAdobeCqCdnRewriterImplCDNRewriterInfo] = CodecJson.derive[ComAdobeCqCdnRewriterImplCDNRewriterInfo]
  implicit val ComAdobeCqCdnRewriterImplCDNRewriterInfoDecoder: EntityDecoder[ComAdobeCqCdnRewriterImplCDNRewriterInfo] = jsonOf[ComAdobeCqCdnRewriterImplCDNRewriterInfo]
  implicit val ComAdobeCqCdnRewriterImplCDNRewriterInfoEncoder: EntityEncoder[ComAdobeCqCdnRewriterImplCDNRewriterInfo] = jsonEncoderOf[ComAdobeCqCdnRewriterImplCDNRewriterInfo]
}
