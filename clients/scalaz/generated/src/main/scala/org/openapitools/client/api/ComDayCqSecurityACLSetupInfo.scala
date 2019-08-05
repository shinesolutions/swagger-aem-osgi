package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqSecurityACLSetupInfo._

case class ComDayCqSecurityACLSetupInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqSecurityACLSetupProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqSecurityACLSetupInfo {
  import DateTimeCodecs._

  implicit val ComDayCqSecurityACLSetupInfoCodecJson: CodecJson[ComDayCqSecurityACLSetupInfo] = CodecJson.derive[ComDayCqSecurityACLSetupInfo]
  implicit val ComDayCqSecurityACLSetupInfoDecoder: EntityDecoder[ComDayCqSecurityACLSetupInfo] = jsonOf[ComDayCqSecurityACLSetupInfo]
  implicit val ComDayCqSecurityACLSetupInfoEncoder: EntityEncoder[ComDayCqSecurityACLSetupInfo] = jsonEncoderOf[ComDayCqSecurityACLSetupInfo]
}
