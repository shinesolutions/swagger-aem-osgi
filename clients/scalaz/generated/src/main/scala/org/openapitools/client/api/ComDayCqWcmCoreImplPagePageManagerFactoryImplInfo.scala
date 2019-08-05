package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo._

case class ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties])

object ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoCodecJson: CodecJson[ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo] = CodecJson.derive[ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo]
  implicit val ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo] = jsonOf[ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo]
  implicit val ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo] = jsonEncoderOf[ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo]
}
