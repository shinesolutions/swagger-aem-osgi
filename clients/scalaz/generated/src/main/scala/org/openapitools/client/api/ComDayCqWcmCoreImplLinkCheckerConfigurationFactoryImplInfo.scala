package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo._

case class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties])

object ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoCodecJson: CodecJson[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo] = CodecJson.derive[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo]
  implicit val ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo] = jsonOf[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo]
  implicit val ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo] = jsonEncoderOf[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo]
}