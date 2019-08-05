package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo._

case class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties])

object ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo {
  import DateTimeCodecs._

  implicit val ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoCodecJson: CodecJson[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo] = CodecJson.derive[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo]
  implicit val ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoDecoder: EntityDecoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo] = jsonOf[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo]
  implicit val ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoEncoder: EntityEncoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo] = jsonEncoderOf[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo]
}
