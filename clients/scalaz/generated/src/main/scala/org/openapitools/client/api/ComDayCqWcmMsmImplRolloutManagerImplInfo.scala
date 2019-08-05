package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplRolloutManagerImplInfo._

case class ComDayCqWcmMsmImplRolloutManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplRolloutManagerImplProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmMsmImplRolloutManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplRolloutManagerImplInfoCodecJson: CodecJson[ComDayCqWcmMsmImplRolloutManagerImplInfo] = CodecJson.derive[ComDayCqWcmMsmImplRolloutManagerImplInfo]
  implicit val ComDayCqWcmMsmImplRolloutManagerImplInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplRolloutManagerImplInfo] = jsonOf[ComDayCqWcmMsmImplRolloutManagerImplInfo]
  implicit val ComDayCqWcmMsmImplRolloutManagerImplInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplRolloutManagerImplInfo] = jsonEncoderOf[ComDayCqWcmMsmImplRolloutManagerImplInfo]
}
