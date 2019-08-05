package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationContentStaticContentBuilderInfo._

case class ComDayCqReplicationContentStaticContentBuilderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReplicationContentStaticContentBuilderProperties])

object ComDayCqReplicationContentStaticContentBuilderInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationContentStaticContentBuilderInfoCodecJson: CodecJson[ComDayCqReplicationContentStaticContentBuilderInfo] = CodecJson.derive[ComDayCqReplicationContentStaticContentBuilderInfo]
  implicit val ComDayCqReplicationContentStaticContentBuilderInfoDecoder: EntityDecoder[ComDayCqReplicationContentStaticContentBuilderInfo] = jsonOf[ComDayCqReplicationContentStaticContentBuilderInfo]
  implicit val ComDayCqReplicationContentStaticContentBuilderInfoEncoder: EntityEncoder[ComDayCqReplicationContentStaticContentBuilderInfo] = jsonEncoderOf[ComDayCqReplicationContentStaticContentBuilderInfo]
}
