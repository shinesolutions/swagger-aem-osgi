package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmScriptingImplBVPManagerInfo._

case class ComDayCqWcmScriptingImplBVPManagerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmScriptingImplBVPManagerProperties])

object ComDayCqWcmScriptingImplBVPManagerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmScriptingImplBVPManagerInfoCodecJson: CodecJson[ComDayCqWcmScriptingImplBVPManagerInfo] = CodecJson.derive[ComDayCqWcmScriptingImplBVPManagerInfo]
  implicit val ComDayCqWcmScriptingImplBVPManagerInfoDecoder: EntityDecoder[ComDayCqWcmScriptingImplBVPManagerInfo] = jsonOf[ComDayCqWcmScriptingImplBVPManagerInfo]
  implicit val ComDayCqWcmScriptingImplBVPManagerInfoEncoder: EntityEncoder[ComDayCqWcmScriptingImplBVPManagerInfo] = jsonEncoderOf[ComDayCqWcmScriptingImplBVPManagerInfo]
}
