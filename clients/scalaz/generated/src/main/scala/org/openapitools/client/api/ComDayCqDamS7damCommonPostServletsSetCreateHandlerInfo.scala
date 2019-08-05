package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo._

case class ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties])

object ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoCodecJson: CodecJson[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo] = CodecJson.derive[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo]
  implicit val ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoDecoder: EntityDecoder[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo] = jsonOf[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo]
  implicit val ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoEncoder: EntityEncoder[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo] = jsonEncoderOf[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo]
}
