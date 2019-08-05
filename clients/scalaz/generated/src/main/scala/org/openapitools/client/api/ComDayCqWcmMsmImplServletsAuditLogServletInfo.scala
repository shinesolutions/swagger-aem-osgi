package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmMsmImplServletsAuditLogServletInfo._

case class ComDayCqWcmMsmImplServletsAuditLogServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmMsmImplServletsAuditLogServletProperties])

object ComDayCqWcmMsmImplServletsAuditLogServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmMsmImplServletsAuditLogServletInfoCodecJson: CodecJson[ComDayCqWcmMsmImplServletsAuditLogServletInfo] = CodecJson.derive[ComDayCqWcmMsmImplServletsAuditLogServletInfo]
  implicit val ComDayCqWcmMsmImplServletsAuditLogServletInfoDecoder: EntityDecoder[ComDayCqWcmMsmImplServletsAuditLogServletInfo] = jsonOf[ComDayCqWcmMsmImplServletsAuditLogServletInfo]
  implicit val ComDayCqWcmMsmImplServletsAuditLogServletInfoEncoder: EntityEncoder[ComDayCqWcmMsmImplServletsAuditLogServletInfo] = jsonEncoderOf[ComDayCqWcmMsmImplServletsAuditLogServletInfo]
}
