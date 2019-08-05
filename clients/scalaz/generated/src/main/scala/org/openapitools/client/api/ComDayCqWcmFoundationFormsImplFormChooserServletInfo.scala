package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmFoundationFormsImplFormChooserServletInfo._

case class ComDayCqWcmFoundationFormsImplFormChooserServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmFoundationFormsImplFormChooserServletProperties])

object ComDayCqWcmFoundationFormsImplFormChooserServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmFoundationFormsImplFormChooserServletInfoCodecJson: CodecJson[ComDayCqWcmFoundationFormsImplFormChooserServletInfo] = CodecJson.derive[ComDayCqWcmFoundationFormsImplFormChooserServletInfo]
  implicit val ComDayCqWcmFoundationFormsImplFormChooserServletInfoDecoder: EntityDecoder[ComDayCqWcmFoundationFormsImplFormChooserServletInfo] = jsonOf[ComDayCqWcmFoundationFormsImplFormChooserServletInfo]
  implicit val ComDayCqWcmFoundationFormsImplFormChooserServletInfoEncoder: EntityEncoder[ComDayCqWcmFoundationFormsImplFormChooserServletInfo] = jsonEncoderOf[ComDayCqWcmFoundationFormsImplFormChooserServletInfo]
}
