package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo._

case class ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties])

object ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoCodecJson: CodecJson[ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo] = CodecJson.derive[ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo]
  implicit val ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo] = jsonOf[ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo]
  implicit val ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo] = jsonEncoderOf[ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo]
}
