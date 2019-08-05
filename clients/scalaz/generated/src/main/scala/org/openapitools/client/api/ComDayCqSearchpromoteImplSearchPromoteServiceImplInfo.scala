package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo._

case class ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoCodecJson: CodecJson[ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo] = CodecJson.derive[ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo]
  implicit val ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoDecoder: EntityDecoder[ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo] = jsonOf[ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo]
  implicit val ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoEncoder: EntityEncoder[ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo] = jsonEncoderOf[ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo]
}
