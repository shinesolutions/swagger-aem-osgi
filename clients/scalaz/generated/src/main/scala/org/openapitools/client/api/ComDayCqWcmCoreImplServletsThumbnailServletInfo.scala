package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplServletsThumbnailServletInfo._

case class ComDayCqWcmCoreImplServletsThumbnailServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplServletsThumbnailServletProperties])

object ComDayCqWcmCoreImplServletsThumbnailServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplServletsThumbnailServletInfoCodecJson: CodecJson[ComDayCqWcmCoreImplServletsThumbnailServletInfo] = CodecJson.derive[ComDayCqWcmCoreImplServletsThumbnailServletInfo]
  implicit val ComDayCqWcmCoreImplServletsThumbnailServletInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplServletsThumbnailServletInfo] = jsonOf[ComDayCqWcmCoreImplServletsThumbnailServletInfo]
  implicit val ComDayCqWcmCoreImplServletsThumbnailServletInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplServletsThumbnailServletInfo] = jsonEncoderOf[ComDayCqWcmCoreImplServletsThumbnailServletInfo]
}
