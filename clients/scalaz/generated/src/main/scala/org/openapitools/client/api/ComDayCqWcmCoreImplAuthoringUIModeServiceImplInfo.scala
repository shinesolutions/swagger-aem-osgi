package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo._

case class ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoCodecJson: CodecJson[ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo] = CodecJson.derive[ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo]
  implicit val ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo] = jsonOf[ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo]
  implicit val ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo] = jsonEncoderOf[ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo]
}
