package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplLightboxLightboxServletInfo._

case class ComDayCqDamCoreImplLightboxLightboxServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplLightboxLightboxServletProperties])

object ComDayCqDamCoreImplLightboxLightboxServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplLightboxLightboxServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplLightboxLightboxServletInfo] = CodecJson.derive[ComDayCqDamCoreImplLightboxLightboxServletInfo]
  implicit val ComDayCqDamCoreImplLightboxLightboxServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplLightboxLightboxServletInfo] = jsonOf[ComDayCqDamCoreImplLightboxLightboxServletInfo]
  implicit val ComDayCqDamCoreImplLightboxLightboxServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplLightboxLightboxServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplLightboxLightboxServletInfo]
}
