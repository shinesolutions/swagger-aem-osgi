package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamScene7ImplScene7UploadServiceImplInfo._

case class ComDayCqDamScene7ImplScene7UploadServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamScene7ImplScene7UploadServiceImplProperties])

object ComDayCqDamScene7ImplScene7UploadServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamScene7ImplScene7UploadServiceImplInfoCodecJson: CodecJson[ComDayCqDamScene7ImplScene7UploadServiceImplInfo] = CodecJson.derive[ComDayCqDamScene7ImplScene7UploadServiceImplInfo]
  implicit val ComDayCqDamScene7ImplScene7UploadServiceImplInfoDecoder: EntityDecoder[ComDayCqDamScene7ImplScene7UploadServiceImplInfo] = jsonOf[ComDayCqDamScene7ImplScene7UploadServiceImplInfo]
  implicit val ComDayCqDamScene7ImplScene7UploadServiceImplInfoEncoder: EntityEncoder[ComDayCqDamScene7ImplScene7UploadServiceImplInfo] = jsonEncoderOf[ComDayCqDamScene7ImplScene7UploadServiceImplInfo]
}
