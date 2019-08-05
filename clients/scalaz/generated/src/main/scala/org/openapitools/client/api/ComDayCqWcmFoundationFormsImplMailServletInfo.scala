package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmFoundationFormsImplMailServletInfo._

case class ComDayCqWcmFoundationFormsImplMailServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmFoundationFormsImplMailServletProperties])

object ComDayCqWcmFoundationFormsImplMailServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmFoundationFormsImplMailServletInfoCodecJson: CodecJson[ComDayCqWcmFoundationFormsImplMailServletInfo] = CodecJson.derive[ComDayCqWcmFoundationFormsImplMailServletInfo]
  implicit val ComDayCqWcmFoundationFormsImplMailServletInfoDecoder: EntityDecoder[ComDayCqWcmFoundationFormsImplMailServletInfo] = jsonOf[ComDayCqWcmFoundationFormsImplMailServletInfo]
  implicit val ComDayCqWcmFoundationFormsImplMailServletInfoEncoder: EntityEncoder[ComDayCqWcmFoundationFormsImplMailServletInfo] = jsonEncoderOf[ComDayCqWcmFoundationFormsImplMailServletInfo]
}
