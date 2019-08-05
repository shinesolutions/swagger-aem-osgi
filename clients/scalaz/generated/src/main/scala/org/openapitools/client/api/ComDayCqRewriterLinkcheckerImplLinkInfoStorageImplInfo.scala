package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo._

case class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoCodecJson: CodecJson[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo] = CodecJson.derive[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo]
  implicit val ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoDecoder: EntityDecoder[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo] = jsonOf[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo]
  implicit val ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoEncoder: EntityEncoder[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo] = jsonEncoderOf[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo]
}
