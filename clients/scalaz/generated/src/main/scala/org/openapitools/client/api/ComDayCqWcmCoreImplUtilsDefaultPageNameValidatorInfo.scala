package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo._

case class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties])

object ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoCodecJson: CodecJson[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo] = CodecJson.derive[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo]
  implicit val ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo] = jsonOf[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo]
  implicit val ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo] = jsonEncoderOf[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo]
}
