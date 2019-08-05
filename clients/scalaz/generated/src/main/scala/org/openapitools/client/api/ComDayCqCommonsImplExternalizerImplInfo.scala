package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqCommonsImplExternalizerImplInfo._

case class ComDayCqCommonsImplExternalizerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqCommonsImplExternalizerImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqCommonsImplExternalizerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqCommonsImplExternalizerImplInfoCodecJson: CodecJson[ComDayCqCommonsImplExternalizerImplInfo] = CodecJson.derive[ComDayCqCommonsImplExternalizerImplInfo]
  implicit val ComDayCqCommonsImplExternalizerImplInfoDecoder: EntityDecoder[ComDayCqCommonsImplExternalizerImplInfo] = jsonOf[ComDayCqCommonsImplExternalizerImplInfo]
  implicit val ComDayCqCommonsImplExternalizerImplInfoEncoder: EntityEncoder[ComDayCqCommonsImplExternalizerImplInfo] = jsonEncoderOf[ComDayCqCommonsImplExternalizerImplInfo]
}
