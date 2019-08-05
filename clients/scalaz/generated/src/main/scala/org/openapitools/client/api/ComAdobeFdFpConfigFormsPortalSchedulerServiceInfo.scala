package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo._

case class ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties])

object ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo {
  import DateTimeCodecs._

  implicit val ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoCodecJson: CodecJson[ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo] = CodecJson.derive[ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo]
  implicit val ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoDecoder: EntityDecoder[ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo] = jsonOf[ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo]
  implicit val ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoEncoder: EntityEncoder[ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo] = jsonEncoderOf[ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo]
}
