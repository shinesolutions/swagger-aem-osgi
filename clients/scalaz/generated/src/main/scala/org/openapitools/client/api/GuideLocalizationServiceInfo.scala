package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import GuideLocalizationServiceInfo._

case class GuideLocalizationServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[GuideLocalizationServiceProperties])

object GuideLocalizationServiceInfo {
  import DateTimeCodecs._

  implicit val GuideLocalizationServiceInfoCodecJson: CodecJson[GuideLocalizationServiceInfo] = CodecJson.derive[GuideLocalizationServiceInfo]
  implicit val GuideLocalizationServiceInfoDecoder: EntityDecoder[GuideLocalizationServiceInfo] = jsonOf[GuideLocalizationServiceInfo]
  implicit val GuideLocalizationServiceInfoEncoder: EntityEncoder[GuideLocalizationServiceInfo] = jsonEncoderOf[GuideLocalizationServiceInfo]
}
