package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqMcmCampaignImplIntegrationConfigImplInfo._

case class ComDayCqMcmCampaignImplIntegrationConfigImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqMcmCampaignImplIntegrationConfigImplProperties])

object ComDayCqMcmCampaignImplIntegrationConfigImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqMcmCampaignImplIntegrationConfigImplInfoCodecJson: CodecJson[ComDayCqMcmCampaignImplIntegrationConfigImplInfo] = CodecJson.derive[ComDayCqMcmCampaignImplIntegrationConfigImplInfo]
  implicit val ComDayCqMcmCampaignImplIntegrationConfigImplInfoDecoder: EntityDecoder[ComDayCqMcmCampaignImplIntegrationConfigImplInfo] = jsonOf[ComDayCqMcmCampaignImplIntegrationConfigImplInfo]
  implicit val ComDayCqMcmCampaignImplIntegrationConfigImplInfoEncoder: EntityEncoder[ComDayCqMcmCampaignImplIntegrationConfigImplInfo] = jsonEncoderOf[ComDayCqMcmCampaignImplIntegrationConfigImplInfo]
}
