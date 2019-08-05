package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqAuditPurgeDamInfo._

case class ComAdobeCqAuditPurgeDamInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqAuditPurgeDamProperties])

object ComAdobeCqAuditPurgeDamInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqAuditPurgeDamInfoCodecJson: CodecJson[ComAdobeCqAuditPurgeDamInfo] = CodecJson.derive[ComAdobeCqAuditPurgeDamInfo]
  implicit val ComAdobeCqAuditPurgeDamInfoDecoder: EntityDecoder[ComAdobeCqAuditPurgeDamInfo] = jsonOf[ComAdobeCqAuditPurgeDamInfo]
  implicit val ComAdobeCqAuditPurgeDamInfoEncoder: EntityEncoder[ComAdobeCqAuditPurgeDamInfo] = jsonEncoderOf[ComAdobeCqAuditPurgeDamInfo]
}
