package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplServletsFindReplaceServletInfo._

case class ComDayCqWcmCoreImplServletsFindReplaceServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplServletsFindReplaceServletProperties])

object ComDayCqWcmCoreImplServletsFindReplaceServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplServletsFindReplaceServletInfoCodecJson: CodecJson[ComDayCqWcmCoreImplServletsFindReplaceServletInfo] = CodecJson.derive[ComDayCqWcmCoreImplServletsFindReplaceServletInfo]
  implicit val ComDayCqWcmCoreImplServletsFindReplaceServletInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplServletsFindReplaceServletInfo] = jsonOf[ComDayCqWcmCoreImplServletsFindReplaceServletInfo]
  implicit val ComDayCqWcmCoreImplServletsFindReplaceServletInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplServletsFindReplaceServletInfo] = jsonEncoderOf[ComDayCqWcmCoreImplServletsFindReplaceServletInfo]
}
