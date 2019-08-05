package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo._

case class ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoCodecJson: CodecJson[ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo] = CodecJson.derive[ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo]
  implicit val ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoDecoder: EntityDecoder[ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo] = jsonOf[ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo]
  implicit val ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoEncoder: EntityEncoder[ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo] = jsonEncoderOf[ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo]
}
