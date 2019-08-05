package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo._

case class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties])

object ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoCodecJson: CodecJson[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo] = CodecJson.derive[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo]
  implicit val ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoDecoder: EntityDecoder[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo] = jsonOf[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo]
  implicit val ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoEncoder: EntityEncoder[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo] = jsonEncoderOf[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo]
}
