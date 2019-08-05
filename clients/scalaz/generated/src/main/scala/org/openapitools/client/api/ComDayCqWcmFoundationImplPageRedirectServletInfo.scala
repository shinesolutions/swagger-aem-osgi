package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmFoundationImplPageRedirectServletInfo._

case class ComDayCqWcmFoundationImplPageRedirectServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmFoundationImplPageRedirectServletProperties])

object ComDayCqWcmFoundationImplPageRedirectServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmFoundationImplPageRedirectServletInfoCodecJson: CodecJson[ComDayCqWcmFoundationImplPageRedirectServletInfo] = CodecJson.derive[ComDayCqWcmFoundationImplPageRedirectServletInfo]
  implicit val ComDayCqWcmFoundationImplPageRedirectServletInfoDecoder: EntityDecoder[ComDayCqWcmFoundationImplPageRedirectServletInfo] = jsonOf[ComDayCqWcmFoundationImplPageRedirectServletInfo]
  implicit val ComDayCqWcmFoundationImplPageRedirectServletInfoEncoder: EntityEncoder[ComDayCqWcmFoundationImplPageRedirectServletInfo] = jsonEncoderOf[ComDayCqWcmFoundationImplPageRedirectServletInfo]
}
