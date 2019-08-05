package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo._

case class ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties])

object ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo {
  import DateTimeCodecs._

  implicit val ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoCodecJson: CodecJson[ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo] = CodecJson.derive[ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo]
  implicit val ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoDecoder: EntityDecoder[ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo] = jsonOf[ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo]
  implicit val ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoEncoder: EntityEncoder[ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo] = jsonEncoderOf[ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo]
}
