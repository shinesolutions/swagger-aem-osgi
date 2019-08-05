package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo._

case class ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties])

object ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoCodecJson: CodecJson[ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo] = CodecJson.derive[ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo]
  implicit val ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoDecoder: EntityDecoder[ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo] = jsonOf[ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo]
  implicit val ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoEncoder: EntityEncoder[ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo] = jsonEncoderOf[ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo]
}
