package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmUndoUndoConfigInfo._

case class ComDayCqWcmUndoUndoConfigInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmUndoUndoConfigProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmUndoUndoConfigInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmUndoUndoConfigInfoCodecJson: CodecJson[ComDayCqWcmUndoUndoConfigInfo] = CodecJson.derive[ComDayCqWcmUndoUndoConfigInfo]
  implicit val ComDayCqWcmUndoUndoConfigInfoDecoder: EntityDecoder[ComDayCqWcmUndoUndoConfigInfo] = jsonOf[ComDayCqWcmUndoUndoConfigInfo]
  implicit val ComDayCqWcmUndoUndoConfigInfoEncoder: EntityEncoder[ComDayCqWcmUndoUndoConfigInfo] = jsonEncoderOf[ComDayCqWcmUndoUndoConfigInfo]
}
