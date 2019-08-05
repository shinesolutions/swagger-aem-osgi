package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo._

case class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoCodecJson: CodecJson[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo] = CodecJson.derive[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo]
  implicit val ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo] = jsonOf[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo]
  implicit val ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo] = jsonEncoderOf[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo]
}
