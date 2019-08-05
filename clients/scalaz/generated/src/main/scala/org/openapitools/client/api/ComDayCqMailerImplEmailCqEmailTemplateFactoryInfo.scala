package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo._

case class ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties])

object ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqMailerImplEmailCqEmailTemplateFactoryInfoCodecJson: CodecJson[ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo] = CodecJson.derive[ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo]
  implicit val ComDayCqMailerImplEmailCqEmailTemplateFactoryInfoDecoder: EntityDecoder[ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo] = jsonOf[ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo]
  implicit val ComDayCqMailerImplEmailCqEmailTemplateFactoryInfoEncoder: EntityEncoder[ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo] = jsonEncoderOf[ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo]
}
