package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo._

case class ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfoCodecJson: CodecJson[ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo] = CodecJson.derive[ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo]
  implicit val ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfoDecoder: EntityDecoder[ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo] = jsonOf[ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo]
  implicit val ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfoEncoder: EntityEncoder[ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo] = jsonEncoderOf[ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo]
}
