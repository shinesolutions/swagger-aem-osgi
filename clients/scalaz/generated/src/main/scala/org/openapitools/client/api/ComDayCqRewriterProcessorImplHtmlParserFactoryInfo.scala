package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqRewriterProcessorImplHtmlParserFactoryInfo._

case class ComDayCqRewriterProcessorImplHtmlParserFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqRewriterProcessorImplHtmlParserFactoryProperties])

object ComDayCqRewriterProcessorImplHtmlParserFactoryInfo {
  import DateTimeCodecs._

  implicit val ComDayCqRewriterProcessorImplHtmlParserFactoryInfoCodecJson: CodecJson[ComDayCqRewriterProcessorImplHtmlParserFactoryInfo] = CodecJson.derive[ComDayCqRewriterProcessorImplHtmlParserFactoryInfo]
  implicit val ComDayCqRewriterProcessorImplHtmlParserFactoryInfoDecoder: EntityDecoder[ComDayCqRewriterProcessorImplHtmlParserFactoryInfo] = jsonOf[ComDayCqRewriterProcessorImplHtmlParserFactoryInfo]
  implicit val ComDayCqRewriterProcessorImplHtmlParserFactoryInfoEncoder: EntityEncoder[ComDayCqRewriterProcessorImplHtmlParserFactoryInfo] = jsonEncoderOf[ComDayCqRewriterProcessorImplHtmlParserFactoryInfo]
}
