package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamInddImplServletSnippetCreationServletInfo._

case class ComDayCqDamInddImplServletSnippetCreationServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamInddImplServletSnippetCreationServletProperties])

object ComDayCqDamInddImplServletSnippetCreationServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamInddImplServletSnippetCreationServletInfoCodecJson: CodecJson[ComDayCqDamInddImplServletSnippetCreationServletInfo] = CodecJson.derive[ComDayCqDamInddImplServletSnippetCreationServletInfo]
  implicit val ComDayCqDamInddImplServletSnippetCreationServletInfoDecoder: EntityDecoder[ComDayCqDamInddImplServletSnippetCreationServletInfo] = jsonOf[ComDayCqDamInddImplServletSnippetCreationServletInfo]
  implicit val ComDayCqDamInddImplServletSnippetCreationServletInfoEncoder: EntityEncoder[ComDayCqDamInddImplServletSnippetCreationServletInfo] = jsonEncoderOf[ComDayCqDamInddImplServletSnippetCreationServletInfo]
}
