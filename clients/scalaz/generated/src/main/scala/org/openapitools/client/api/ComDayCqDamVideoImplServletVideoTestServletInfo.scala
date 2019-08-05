package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamVideoImplServletVideoTestServletInfo._

case class ComDayCqDamVideoImplServletVideoTestServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamVideoImplServletVideoTestServletProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqDamVideoImplServletVideoTestServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamVideoImplServletVideoTestServletInfoCodecJson: CodecJson[ComDayCqDamVideoImplServletVideoTestServletInfo] = CodecJson.derive[ComDayCqDamVideoImplServletVideoTestServletInfo]
  implicit val ComDayCqDamVideoImplServletVideoTestServletInfoDecoder: EntityDecoder[ComDayCqDamVideoImplServletVideoTestServletInfo] = jsonOf[ComDayCqDamVideoImplServletVideoTestServletInfo]
  implicit val ComDayCqDamVideoImplServletVideoTestServletInfoEncoder: EntityEncoder[ComDayCqDamVideoImplServletVideoTestServletInfo] = jsonEncoderOf[ComDayCqDamVideoImplServletVideoTestServletInfo]
}
