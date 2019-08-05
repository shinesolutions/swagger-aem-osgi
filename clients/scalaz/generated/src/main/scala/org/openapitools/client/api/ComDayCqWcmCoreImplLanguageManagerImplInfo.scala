package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplLanguageManagerImplInfo._

case class ComDayCqWcmCoreImplLanguageManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplLanguageManagerImplProperties])

object ComDayCqWcmCoreImplLanguageManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplLanguageManagerImplInfoCodecJson: CodecJson[ComDayCqWcmCoreImplLanguageManagerImplInfo] = CodecJson.derive[ComDayCqWcmCoreImplLanguageManagerImplInfo]
  implicit val ComDayCqWcmCoreImplLanguageManagerImplInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplLanguageManagerImplInfo] = jsonOf[ComDayCqWcmCoreImplLanguageManagerImplInfo]
  implicit val ComDayCqWcmCoreImplLanguageManagerImplInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplLanguageManagerImplInfo] = jsonEncoderOf[ComDayCqWcmCoreImplLanguageManagerImplInfo]
}
