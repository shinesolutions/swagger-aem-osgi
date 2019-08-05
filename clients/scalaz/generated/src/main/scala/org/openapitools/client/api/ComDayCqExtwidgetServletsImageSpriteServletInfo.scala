package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqExtwidgetServletsImageSpriteServletInfo._

case class ComDayCqExtwidgetServletsImageSpriteServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqExtwidgetServletsImageSpriteServletProperties])

object ComDayCqExtwidgetServletsImageSpriteServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqExtwidgetServletsImageSpriteServletInfoCodecJson: CodecJson[ComDayCqExtwidgetServletsImageSpriteServletInfo] = CodecJson.derive[ComDayCqExtwidgetServletsImageSpriteServletInfo]
  implicit val ComDayCqExtwidgetServletsImageSpriteServletInfoDecoder: EntityDecoder[ComDayCqExtwidgetServletsImageSpriteServletInfo] = jsonOf[ComDayCqExtwidgetServletsImageSpriteServletInfo]
  implicit val ComDayCqExtwidgetServletsImageSpriteServletInfoEncoder: EntityEncoder[ComDayCqExtwidgetServletsImageSpriteServletInfo] = jsonEncoderOf[ComDayCqExtwidgetServletsImageSpriteServletInfo]
}
