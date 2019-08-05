package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo._

case class ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties])

object ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoCodecJson: CodecJson[ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo] = CodecJson.derive[ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo]
  implicit val ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoDecoder: EntityDecoder[ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo] = jsonOf[ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo]
  implicit val ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoEncoder: EntityEncoder[ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo] = jsonEncoderOf[ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo]
}
