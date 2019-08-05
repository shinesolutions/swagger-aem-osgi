package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletCollectionServletInfo._

case class ComDayCqDamCoreImplServletCollectionServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletCollectionServletProperties])

object ComDayCqDamCoreImplServletCollectionServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletCollectionServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletCollectionServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletCollectionServletInfo]
  implicit val ComDayCqDamCoreImplServletCollectionServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletCollectionServletInfo] = jsonOf[ComDayCqDamCoreImplServletCollectionServletInfo]
  implicit val ComDayCqDamCoreImplServletCollectionServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletCollectionServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletCollectionServletInfo]
}
