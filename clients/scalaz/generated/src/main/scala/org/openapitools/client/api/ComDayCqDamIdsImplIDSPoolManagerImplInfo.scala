package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamIdsImplIDSPoolManagerImplInfo._

case class ComDayCqDamIdsImplIDSPoolManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamIdsImplIDSPoolManagerImplProperties])

object ComDayCqDamIdsImplIDSPoolManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamIdsImplIDSPoolManagerImplInfoCodecJson: CodecJson[ComDayCqDamIdsImplIDSPoolManagerImplInfo] = CodecJson.derive[ComDayCqDamIdsImplIDSPoolManagerImplInfo]
  implicit val ComDayCqDamIdsImplIDSPoolManagerImplInfoDecoder: EntityDecoder[ComDayCqDamIdsImplIDSPoolManagerImplInfo] = jsonOf[ComDayCqDamIdsImplIDSPoolManagerImplInfo]
  implicit val ComDayCqDamIdsImplIDSPoolManagerImplInfoEncoder: EntityEncoder[ComDayCqDamIdsImplIDSPoolManagerImplInfo] = jsonEncoderOf[ComDayCqDamIdsImplIDSPoolManagerImplInfo]
}
