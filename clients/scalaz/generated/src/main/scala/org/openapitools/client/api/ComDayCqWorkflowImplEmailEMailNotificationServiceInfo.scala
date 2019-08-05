package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWorkflowImplEmailEMailNotificationServiceInfo._

case class ComDayCqWorkflowImplEmailEMailNotificationServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWorkflowImplEmailEMailNotificationServiceProperties])

object ComDayCqWorkflowImplEmailEMailNotificationServiceInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWorkflowImplEmailEMailNotificationServiceInfoCodecJson: CodecJson[ComDayCqWorkflowImplEmailEMailNotificationServiceInfo] = CodecJson.derive[ComDayCqWorkflowImplEmailEMailNotificationServiceInfo]
  implicit val ComDayCqWorkflowImplEmailEMailNotificationServiceInfoDecoder: EntityDecoder[ComDayCqWorkflowImplEmailEMailNotificationServiceInfo] = jsonOf[ComDayCqWorkflowImplEmailEMailNotificationServiceInfo]
  implicit val ComDayCqWorkflowImplEmailEMailNotificationServiceInfoEncoder: EntityEncoder[ComDayCqWorkflowImplEmailEMailNotificationServiceInfo] = jsonEncoderOf[ComDayCqWorkflowImplEmailEMailNotificationServiceInfo]
}
