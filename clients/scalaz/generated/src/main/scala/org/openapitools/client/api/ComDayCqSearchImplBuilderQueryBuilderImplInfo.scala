package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqSearchImplBuilderQueryBuilderImplInfo._

case class ComDayCqSearchImplBuilderQueryBuilderImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqSearchImplBuilderQueryBuilderImplProperties])

object ComDayCqSearchImplBuilderQueryBuilderImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqSearchImplBuilderQueryBuilderImplInfoCodecJson: CodecJson[ComDayCqSearchImplBuilderQueryBuilderImplInfo] = CodecJson.derive[ComDayCqSearchImplBuilderQueryBuilderImplInfo]
  implicit val ComDayCqSearchImplBuilderQueryBuilderImplInfoDecoder: EntityDecoder[ComDayCqSearchImplBuilderQueryBuilderImplInfo] = jsonOf[ComDayCqSearchImplBuilderQueryBuilderImplInfo]
  implicit val ComDayCqSearchImplBuilderQueryBuilderImplInfoEncoder: EntityEncoder[ComDayCqSearchImplBuilderQueryBuilderImplInfo] = jsonEncoderOf[ComDayCqSearchImplBuilderQueryBuilderImplInfo]
}
