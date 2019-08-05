package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ApacheSlingHealthCheckResultHTMLSerializerInfo._

case class ApacheSlingHealthCheckResultHTMLSerializerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ApacheSlingHealthCheckResultHTMLSerializerProperties])

object ApacheSlingHealthCheckResultHTMLSerializerInfo {
  import DateTimeCodecs._

  implicit val ApacheSlingHealthCheckResultHTMLSerializerInfoCodecJson: CodecJson[ApacheSlingHealthCheckResultHTMLSerializerInfo] = CodecJson.derive[ApacheSlingHealthCheckResultHTMLSerializerInfo]
  implicit val ApacheSlingHealthCheckResultHTMLSerializerInfoDecoder: EntityDecoder[ApacheSlingHealthCheckResultHTMLSerializerInfo] = jsonOf[ApacheSlingHealthCheckResultHTMLSerializerInfo]
  implicit val ApacheSlingHealthCheckResultHTMLSerializerInfoEncoder: EntityEncoder[ApacheSlingHealthCheckResultHTMLSerializerInfo] = jsonEncoderOf[ApacheSlingHealthCheckResultHTMLSerializerInfo]
}
