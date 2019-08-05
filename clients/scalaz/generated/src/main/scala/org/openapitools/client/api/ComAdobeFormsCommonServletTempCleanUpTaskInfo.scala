package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeFormsCommonServletTempCleanUpTaskInfo._

case class ComAdobeFormsCommonServletTempCleanUpTaskInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeFormsCommonServletTempCleanUpTaskProperties])

object ComAdobeFormsCommonServletTempCleanUpTaskInfo {
  import DateTimeCodecs._

  implicit val ComAdobeFormsCommonServletTempCleanUpTaskInfoCodecJson: CodecJson[ComAdobeFormsCommonServletTempCleanUpTaskInfo] = CodecJson.derive[ComAdobeFormsCommonServletTempCleanUpTaskInfo]
  implicit val ComAdobeFormsCommonServletTempCleanUpTaskInfoDecoder: EntityDecoder[ComAdobeFormsCommonServletTempCleanUpTaskInfo] = jsonOf[ComAdobeFormsCommonServletTempCleanUpTaskInfo]
  implicit val ComAdobeFormsCommonServletTempCleanUpTaskInfoEncoder: EntityEncoder[ComAdobeFormsCommonServletTempCleanUpTaskInfo] = jsonEncoderOf[ComAdobeFormsCommonServletTempCleanUpTaskInfo]
}
