package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamIdsImplIDSJobProcessorInfo._

case class ComDayCqDamIdsImplIDSJobProcessorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamIdsImplIDSJobProcessorProperties])

object ComDayCqDamIdsImplIDSJobProcessorInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamIdsImplIDSJobProcessorInfoCodecJson: CodecJson[ComDayCqDamIdsImplIDSJobProcessorInfo] = CodecJson.derive[ComDayCqDamIdsImplIDSJobProcessorInfo]
  implicit val ComDayCqDamIdsImplIDSJobProcessorInfoDecoder: EntityDecoder[ComDayCqDamIdsImplIDSJobProcessorInfo] = jsonOf[ComDayCqDamIdsImplIDSJobProcessorInfo]
  implicit val ComDayCqDamIdsImplIDSJobProcessorInfoEncoder: EntityEncoder[ComDayCqDamIdsImplIDSJobProcessorInfo] = jsonEncoderOf[ComDayCqDamIdsImplIDSJobProcessorInfo]
}
