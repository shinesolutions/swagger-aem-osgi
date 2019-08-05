package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletCollectionsServletInfo._

case class ComDayCqDamCoreImplServletCollectionsServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletCollectionsServletProperties])

object ComDayCqDamCoreImplServletCollectionsServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletCollectionsServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletCollectionsServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletCollectionsServletInfo]
  implicit val ComDayCqDamCoreImplServletCollectionsServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletCollectionsServletInfo] = jsonOf[ComDayCqDamCoreImplServletCollectionsServletInfo]
  implicit val ComDayCqDamCoreImplServletCollectionsServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletCollectionsServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletCollectionsServletInfo]
}
